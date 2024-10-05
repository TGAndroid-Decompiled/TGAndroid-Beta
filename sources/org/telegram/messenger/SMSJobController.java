package org.telegram.messenger;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.telephony.SmsManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SMSJobController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_boolFalse;
import org.telegram.tgnet.TLRPC$TL_boolTrue;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TL_smsjobs$TL_smsJob;
import org.telegram.tgnet.TL_smsjobs$TL_smsjobs_eligibleToJoin;
import org.telegram.tgnet.TL_smsjobs$TL_smsjobs_finishJob;
import org.telegram.tgnet.TL_smsjobs$TL_smsjobs_getSmsJob;
import org.telegram.tgnet.TL_smsjobs$TL_smsjobs_join;
import org.telegram.tgnet.TL_smsjobs$TL_smsjobs_status;
import org.telegram.tgnet.TL_smsjobs$TL_smsjobs_updateSettings;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SMSSubscribeSheet;

public class SMSJobController implements NotificationCenter.NotificationCenterDelegate {
    public static final int STATE_ASKING_PERMISSION = 1;
    public static final int STATE_JOINED = 3;
    public static final int STATE_NONE = 0;
    public static final int STATE_NO_SIM = 2;
    private static HashMap<Integer, PendingSMS> pending;
    private static boolean readCachedPending;
    public boolean atStatisticsPage;
    public final int currentAccount;
    public int currentState;
    public TL_smsjobs$TL_smsjobs_status currentStatus;
    public TL_smsjobs$TL_smsjobs_eligibleToJoin isEligible;
    private SharedPreferences journalPrefs;
    private int lastErrorId;
    private boolean loadedIsEligible;
    private boolean loadedStatus;
    private boolean loadingIsEligible;
    private boolean loadingStatus;
    private int seenErrorId;
    public SIM selectedSimCard;
    private int updateSettingsReqId;
    private static volatile SMSJobController[] Instance = new SMSJobController[4];
    private static final Object[] lockObjects = new Object[4];
    private HashSet<String> completedJobs = new HashSet<>();
    private HashSet<String> loadingJobs = new HashSet<>();
    public ArrayList<JobEntry> journal = new ArrayList<>();

    public static class JobEntry {
        public String country;
        public int date;
        public String error;
        public String job_id;
        public int state;

        public static JobEntry fromString(String str) {
            String[] split = str.split(",");
            if (split.length != 4 && split.length != 5) {
                return null;
            }
            JobEntry jobEntry = new JobEntry();
            jobEntry.job_id = split[0];
            jobEntry.error = TextUtils.isEmpty(split[1]) ? null : split[1];
            jobEntry.date = Utilities.parseInt((CharSequence) split[2]).intValue();
            jobEntry.country = split[3];
            jobEntry.state = split.length >= 5 ? Utilities.parseInt((CharSequence) split[4]).intValue() : 0;
            return jobEntry;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.job_id);
            sb.append(",");
            String str = this.error;
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append(",");
            sb.append(this.date);
            sb.append(",");
            sb.append(this.country);
            sb.append(",");
            sb.append(this.state);
            return sb.toString();
        }
    }

    public static class PendingSMS extends TLObject {
        public int currentAccount;
        public boolean finished;
        public int id;
        public String jobId;
        public String phone;
        public final boolean[] received;
        public long sentTime;
        public int simId;
        public String text;
        private Runnable timerCallback;
        public int triesLeft;

        private PendingSMS() {
            this.received = new boolean[2];
            this.finished = false;
            this.triesLeft = 2;
            this.sentTime = System.currentTimeMillis();
        }

        public PendingSMS(int i, int i2, String str, SIM sim, String str2, String str3) {
            this.received = new boolean[2];
            this.finished = false;
            this.triesLeft = 2;
            this.sentTime = System.currentTimeMillis();
            this.id = i;
            this.currentAccount = i2;
            this.jobId = str;
            this.simId = sim == null ? -1 : sim.id;
            this.phone = str2;
            this.text = str3;
        }

        public void lambda$setup$0() {
            whenSent(false, "2MIN_TIMEOUT");
            SMSJobController.pending.remove(Integer.valueOf(this.id));
            SMSJobController.savePending();
        }

        @Override
        public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
            this.id = abstractSerializedData.readInt32(z);
            this.currentAccount = abstractSerializedData.readInt32(z);
            this.jobId = abstractSerializedData.readString(z);
            this.simId = abstractSerializedData.readInt32(z);
            this.phone = abstractSerializedData.readString(z);
            this.text = abstractSerializedData.readString(z);
            int readInt32 = abstractSerializedData.readInt32(z);
            boolean[] zArr = this.received;
            zArr[0] = (readInt32 & 1) != 0;
            zArr[1] = (readInt32 & 2) != 0;
            this.finished = (readInt32 & 4) != 0;
            this.triesLeft = abstractSerializedData.readInt32(z);
            this.sentTime = abstractSerializedData.readInt64(z);
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(137904659);
            abstractSerializedData.writeInt32(this.id);
            abstractSerializedData.writeInt32(this.currentAccount);
            abstractSerializedData.writeString(this.jobId);
            abstractSerializedData.writeInt32(this.simId);
            abstractSerializedData.writeString(this.phone);
            abstractSerializedData.writeString(this.text);
            boolean[] zArr = this.received;
            abstractSerializedData.writeInt32((zArr[1] ? 2 : 0) | (zArr[0] ? 1 : 0) | (this.finished ? 4 : 0));
            abstractSerializedData.writeInt32(this.triesLeft);
            abstractSerializedData.writeInt64(this.sentTime);
        }

        public void setup() {
            long currentTimeMillis = (this.sentTime + 120000) - System.currentTimeMillis();
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    SMSJobController.PendingSMS.this.lambda$setup$0();
                }
            };
            this.timerCallback = runnable;
            AndroidUtilities.runOnUIThread(runnable, Math.max(0L, currentTimeMillis));
        }

        public void whenDelivered(boolean z, String str) {
            boolean[] zArr = this.received;
            if (zArr[1]) {
                return;
            }
            zArr[1] = true;
            AndroidUtilities.cancelRunOnUIThread(this.timerCallback);
            FileLog.d("[smsjob] sms job " + this.jobId + " delivered callback: success=" + z + ", reason=" + str);
            if (this.finished) {
                return;
            }
            this.finished = true;
            SMSJobController sMSJobController = SMSJobController.getInstance(this.currentAccount);
            String str2 = this.jobId;
            String str3 = this.phone;
            if (z) {
                str = null;
            }
            sMSJobController.finishJob(str2, str3, str);
        }

        public void whenSent(boolean z, String str) {
            boolean[] zArr = this.received;
            if (zArr[0]) {
                return;
            }
            zArr[0] = true;
            AndroidUtilities.cancelRunOnUIThread(this.timerCallback);
            FileLog.d("[smsjob] sms job " + this.jobId + " sent callback: success=" + z + ", reason=" + str);
            if (this.finished) {
                return;
            }
            this.finished = true;
            SMSJobController sMSJobController = SMSJobController.getInstance(this.currentAccount);
            String str2 = this.jobId;
            String str3 = this.phone;
            if (z) {
                str = null;
            }
            sMSJobController.finishJob(str2, str3, str);
        }
    }

    public static class SIM {
        public final String carrier;
        public final String country;
        public final String iccId;
        public final int id;
        public final String name;
        public final String phone_number;
        public final int slot;

        public SIM(int i, int i2, String str) {
            this.id = i;
            this.slot = i2;
            this.name = "SIM" + (i2 + 1);
            this.iccId = null;
            this.country = str;
            this.carrier = null;
            this.phone_number = null;
        }

        public SIM(int i, int i2, String str, String str2) {
            this.id = i;
            this.slot = i2;
            this.name = str;
            this.iccId = null;
            this.country = str2;
            this.carrier = null;
            this.phone_number = null;
        }

        public SIM(int i, int i2, String str, String str2, String str3, String str4, String str5) {
            this.id = i;
            this.slot = i2;
            this.name = str;
            this.iccId = str2;
            this.country = str3;
            this.carrier = str4;
            this.phone_number = str5;
        }

        public static SIM from(SubscriptionManager subscriptionManager, SubscriptionInfo subscriptionInfo) {
            String number;
            int subscriptionId;
            int simSlotIndex;
            CharSequence displayName;
            CharSequence displayName2;
            String charSequence;
            String iccId;
            String countryIso;
            CharSequence carrierName;
            CharSequence carrierName2;
            int subscriptionId2;
            String str = null;
            if (subscriptionInfo == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                subscriptionId2 = subscriptionInfo.getSubscriptionId();
                number = subscriptionManager.getPhoneNumber(subscriptionId2);
            } else {
                number = subscriptionInfo.getNumber();
            }
            String str2 = number;
            subscriptionId = subscriptionInfo.getSubscriptionId();
            simSlotIndex = subscriptionInfo.getSimSlotIndex();
            displayName = subscriptionInfo.getDisplayName();
            if (displayName == null) {
                charSequence = "";
            } else {
                displayName2 = subscriptionInfo.getDisplayName();
                charSequence = displayName2.toString();
            }
            String str3 = charSequence;
            iccId = subscriptionInfo.getIccId();
            countryIso = subscriptionInfo.getCountryIso();
            carrierName = subscriptionInfo.getCarrierName();
            if (carrierName != null) {
                carrierName2 = subscriptionInfo.getCarrierName();
                str = carrierName2.toString();
            }
            return new SIM(subscriptionId, simSlotIndex, str3, iccId, countryIso, str, str2);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            String str2 = "";
            if (this.country != null) {
                str = "[" + this.country + "] ";
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(this.name);
            if (this.carrier != null) {
                str2 = " (" + this.carrier + ")";
            }
            sb.append(str2);
            return sb.toString();
        }
    }

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
        readCachedPending = false;
        pending = new HashMap<>();
    }

    private SMSJobController(int i) {
        this.currentAccount = i;
        this.journalPrefs = ApplicationLoader.applicationContext.getSharedPreferences("smsjobs_journal_" + i, 0);
        loadCacheStatus();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SMSJobController.this.lambda$new$0();
            }
        });
    }

    private void clearJournal() {
        this.journal.clear();
        this.journalPrefs.edit().clear().apply();
    }

    public void finishJob(final String str, final String str2, final String str3) {
        FileLog.d("[smsjob] finished sms job " + str + ", error=" + str3);
        TL_smsjobs$TL_smsjobs_finishJob tL_smsjobs$TL_smsjobs_finishJob = new TL_smsjobs$TL_smsjobs_finishJob();
        tL_smsjobs$TL_smsjobs_finishJob.job_id = str;
        if (str3 != null) {
            tL_smsjobs$TL_smsjobs_finishJob.flags |= 1;
            tL_smsjobs$TL_smsjobs_finishJob.error = str3;
        }
        this.completedJobs.add(str);
        this.loadingJobs.remove(str);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_smsjobs$TL_smsjobs_finishJob, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                SMSJobController.this.lambda$finishJob$10(str, str2, str3, tLObject, tLRPC$TL_error);
            }
        });
    }

    public static String getCountryFromPhoneNumber(Context context, String str) {
        BufferedReader bufferedReader;
        String readLine;
        String[] split;
        ?? r0 = 0;
        boolean z = false;
        BufferedReader bufferedReader2 = null;
        if (str == null) {
            return null;
        }
        String stripExceptNumbers = PhoneFormat.stripExceptNumbers(str);
        try {
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
                } catch (Exception e) {
                    FileLog.e(e);
                    return "";
                }
            } catch (Exception e2) {
                e = e2;
            }
            do {
                try {
                    readLine = bufferedReader.readLine();
                } catch (Exception e3) {
                    e = e3;
                    bufferedReader2 = bufferedReader;
                    FileLog.e(e);
                    if (bufferedReader2 == null) {
                        return "";
                    }
                    bufferedReader2.close();
                    r0 = bufferedReader2;
                    return "";
                } catch (Throwable th) {
                    th = th;
                    r0 = bufferedReader;
                    if (r0 != 0) {
                        try {
                            r0.close();
                        } catch (Exception e4) {
                            FileLog.e(e4);
                        }
                    }
                    throw th;
                }
                if (readLine == null) {
                    bufferedReader.close();
                    bufferedReader.close();
                    r0 = z;
                    return "";
                }
                split = readLine.split(";");
                z = stripExceptNumbers.startsWith(split[0]);
            } while (!z);
            String str2 = split[1];
            try {
                bufferedReader.close();
            } catch (Exception e5) {
                FileLog.e(e5);
            }
            return str2;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static SMSJobController getInstance(int i) {
        SMSJobController sMSJobController = Instance[i];
        if (sMSJobController == null) {
            synchronized (lockObjects[i]) {
                try {
                    sMSJobController = Instance[i];
                    if (sMSJobController == null) {
                        SMSJobController[] sMSJobControllerArr = Instance;
                        SMSJobController sMSJobController2 = new SMSJobController(i);
                        sMSJobControllerArr[i] = sMSJobController2;
                        sMSJobController = sMSJobController2;
                    }
                } finally {
                }
            }
        }
        return sMSJobController;
    }

    private static ArrayList<SIM> getSIMs(Context context) {
        SubscriptionManager from;
        ArrayList<SIM> arrayList = new ArrayList<>();
        int i = Build.VERSION.SDK_INT;
        if (i >= 22) {
            from = SubscriptionManager.from(context);
            List completeActiveSubscriptionInfoList = i >= 30 ? from.getCompleteActiveSubscriptionInfoList() : null;
            if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i >= 28) {
                completeActiveSubscriptionInfoList = from.getAccessibleSubscriptionInfoList();
            }
            if (completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) {
                completeActiveSubscriptionInfoList = from.getActiveSubscriptionInfoList();
            }
            if (completeActiveSubscriptionInfoList != null) {
                for (int i2 = 0; i2 < completeActiveSubscriptionInfoList.size(); i2++) {
                    SIM from2 = SIM.from(from, SMSJobController$$ExternalSyntheticApiModelOutline4.m(completeActiveSubscriptionInfoList.get(i2)));
                    if (from2 != null) {
                        arrayList.add(from2);
                    }
                }
            }
        } else {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager.getSimState() == 5) {
                arrayList.add(new SIM(0, 0, telephonyManager.getSimCountryIso()));
            }
        }
        return arrayList;
    }

    public void lambda$checkIsEligible$1(org.telegram.tgnet.TLObject r4, org.telegram.tgnet.TLRPC$TL_error r5, org.telegram.messenger.Utilities.Callback r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SMSJobController.lambda$checkIsEligible$1(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error, org.telegram.messenger.Utilities$Callback):void");
    }

    public void lambda$checkIsEligible$2(final Utilities.Callback callback, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SMSJobController.this.lambda$checkIsEligible$1(tLObject, tLRPC$TL_error, callback);
            }
        });
    }

    public void lambda$checkSelectedSIMCard$5(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error != null) {
            BulletinFactory.showError(tLRPC$TL_error);
            return;
        }
        if (tLObject instanceof TLRPC$TL_boolFalse) {
            BulletinFactory.global().createErrorBulletin(LocaleController.getString(2131696933)).show();
            return;
        }
        setState(3);
        loadStatus(true);
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        SMSSubscribeSheet.showSubscribed(context, null);
    }

    public void lambda$checkSelectedSIMCard$6(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SMSJobController.this.lambda$checkSelectedSIMCard$5(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$finishJob$10(final String str, final String str2, final String str3, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SMSJobController.this.lambda$finishJob$9(tLObject, str, tLRPC$TL_error, str2, str3);
            }
        });
    }

    public void lambda$finishJob$9(TLObject tLObject, String str, TLRPC$TL_error tLRPC$TL_error, String str2, String str3) {
        StringBuilder sb;
        String str4;
        if (tLObject instanceof TLRPC$TL_boolTrue) {
            sb = new StringBuilder();
            sb.append("[smsjob] finished sms job ");
            sb.append(str);
            str4 = ", received true";
        } else {
            if (!(tLObject instanceof TLRPC$TL_boolFalse)) {
                if (tLRPC$TL_error != null) {
                    sb = new StringBuilder();
                    sb.append("[smsjob] finished sms job ");
                    sb.append(str);
                    sb.append(", received error ");
                    sb.append(tLRPC$TL_error.code);
                    sb.append(" ");
                    str4 = tLRPC$TL_error.text;
                }
                pushToJournal(str, 0, str2, str3);
                invalidateStatus();
            }
            sb = new StringBuilder();
            sb.append("[smsjob] finished sms job ");
            sb.append(str);
            str4 = ", received false";
        }
        sb.append(str4);
        FileLog.d(sb.toString());
        pushToJournal(str, 0, str2, str3);
        invalidateStatus();
    }

    public void lambda$leave$11(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error != null) {
            BulletinFactory.showError(tLRPC$TL_error);
        } else if (tLObject instanceof TLRPC$TL_boolFalse) {
            BulletinFactory.global().createErrorBulletin(LocaleController.getString(2131696933)).show();
        } else {
            getInstance(this.currentAccount).loadStatus(true);
            getInstance(this.currentAccount).checkIsEligible(true, null);
        }
    }

    public void lambda$leave$12(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SMSJobController.this.lambda$leave$11(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$loadStatus$3(org.telegram.tgnet.TLObject r8, org.telegram.tgnet.TLRPC$TL_error r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SMSJobController.lambda$loadStatus$3(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public void lambda$loadStatus$4(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SMSJobController.this.lambda$loadStatus$3(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$new$0() {
        readPending();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.newSuggestionsAvailable);
    }

    public void lambda$processJobUpdate$7(TLObject tLObject, String str) {
        if (tLObject instanceof TL_smsjobs$TL_smsJob) {
            runJob((TL_smsjobs$TL_smsJob) tLObject);
            return;
        }
        FileLog.e("[smsjob] failed to fetch sms job by id " + str);
        this.loadingJobs.remove(str);
    }

    public void lambda$processJobUpdate$8(final String str, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SMSJobController.this.lambda$processJobUpdate$7(tLObject, str);
            }
        });
    }

    public static int lambda$readJournal$15(JobEntry jobEntry, JobEntry jobEntry2) {
        return jobEntry2.date - jobEntry.date;
    }

    public void lambda$toggleAllowInternational$13(int[] iArr, boolean z) {
        if (iArr[0] != this.updateSettingsReqId) {
            return;
        }
        this.updateSettingsReqId = 0;
        TL_smsjobs$TL_smsjobs_status tL_smsjobs$TL_smsjobs_status = this.currentStatus;
        if (tL_smsjobs$TL_smsjobs_status != null) {
            tL_smsjobs$TL_smsjobs_status.allow_international = z;
        }
    }

    public void lambda$toggleAllowInternational$14(final int[] iArr, final boolean z, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SMSJobController.this.lambda$toggleAllowInternational$13(iArr, z);
            }
        });
    }

    private void loadCacheStatus() {
        this.currentState = MessagesController.getMainSettings(this.currentAccount).getInt("smsjobs_state", 0);
        this.lastErrorId = MessagesController.getMainSettings(this.currentAccount).getInt("smsjobs_error", 0);
        this.seenErrorId = MessagesController.getMainSettings(this.currentAccount).getInt("smsjobs_seen_error", 0);
        String string = MessagesController.getMainSettings(this.currentAccount).getString("smsjobs_status", null);
        if (string != null) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                if (serializedData.readInt32(true) == 720277905) {
                    TL_smsjobs$TL_smsjobs_status tL_smsjobs$TL_smsjobs_status = new TL_smsjobs$TL_smsjobs_status();
                    this.currentStatus = tL_smsjobs$TL_smsjobs_status;
                    tL_smsjobs$TL_smsjobs_status.readParams(serializedData, true);
                }
            } catch (Exception e) {
                FileLog.e(e);
                this.currentStatus = null;
            }
        }
        readJournal();
    }

    private void pushToJournal(String str, int i, String str2, String str3) {
        JobEntry jobEntry;
        int i2 = 0;
        while (true) {
            if (i2 >= this.journal.size()) {
                jobEntry = null;
                break;
            } else {
                if (TextUtils.equals(this.journal.get(i2).job_id, str)) {
                    jobEntry = this.journal.get(i2);
                    break;
                }
                i2++;
            }
        }
        if (jobEntry == null) {
            ArrayList<JobEntry> arrayList = this.journal;
            JobEntry jobEntry2 = new JobEntry();
            arrayList.add(0, jobEntry2);
            jobEntry = jobEntry2;
        }
        jobEntry.state = i;
        jobEntry.job_id = str;
        jobEntry.error = str3;
        jobEntry.date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        jobEntry.country = getCountryFromPhoneNumber(ApplicationLoader.applicationContext, str2);
        this.journalPrefs.edit().putString(jobEntry.job_id, jobEntry.toString()).apply();
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.smsJobStatusUpdate, new Object[0]);
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        registerError();
    }

    private void readJournal() {
        JobEntry fromString;
        this.journal.clear();
        for (Object obj : this.journalPrefs.getAll().values()) {
            if ((obj instanceof String) && (fromString = JobEntry.fromString((String) obj)) != null) {
                this.journal.add(fromString);
            }
        }
        Collections.sort(this.journal, new Comparator() {
            @Override
            public final int compare(Object obj2, Object obj3) {
                int lambda$readJournal$15;
                lambda$readJournal$15 = SMSJobController.lambda$readJournal$15((SMSJobController.JobEntry) obj2, (SMSJobController.JobEntry) obj3);
                return lambda$readJournal$15;
            }
        });
        int i = 0;
        if (MessagesController.getMainSettings(this.currentAccount).getBoolean("smsjobs_checked_journal", false)) {
            return;
        }
        while (true) {
            if (i >= this.journal.size()) {
                break;
            }
            if (!TextUtils.isEmpty(this.journal.get(i).error)) {
                registerError();
                break;
            }
            i++;
        }
        MessagesController.getMainSettings(this.currentAccount).edit().putBoolean("smsjobs_checked_journal", true).apply();
    }

    private static void readPending() {
        if (readCachedPending) {
            return;
        }
        String string = MessagesController.getGlobalMainSettings().getString("smsjobs_pending", null);
        if (string != null) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                int readInt32 = serializedData.readInt32(true);
                for (int i = 0; i < readInt32; i++) {
                    int readInt322 = serializedData.readInt32(true);
                    if (readInt322 != 137904659) {
                        throw new RuntimeException("pending parse unknown magic " + readInt322);
                    }
                    PendingSMS pendingSMS = new PendingSMS();
                    pendingSMS.readParams(serializedData, true);
                    pendingSMS.setup();
                    pending.put(Integer.valueOf(pendingSMS.id), pendingSMS);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        readCachedPending = true;
    }

    public static void receivedSMSIntent(Intent intent, int i) {
        String str;
        boolean z;
        int i2;
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("tg_sms_id", 0);
        boolean booleanExtra = intent.getBooleanExtra("sent", false);
        boolean booleanExtra2 = intent.getBooleanExtra("delivered", false);
        PendingSMS pendingSMS = pending.get(Integer.valueOf(intExtra));
        if (pendingSMS == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[smsjob] received sms callback with id ");
            sb.append(intExtra);
            sb.append(", ");
            sb.append(booleanExtra ? "sent" : booleanExtra2 ? "delivered" : "null");
            sb.append(": not found");
            FileLog.d(sb.toString());
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[smsjob] received sms callback with id ");
        sb2.append(intExtra);
        sb2.append(", ");
        sb2.append(booleanExtra ? "sent" : booleanExtra2 ? "delivered" : "null");
        FileLog.d(sb2.toString());
        if (i == 101 && (i2 = pendingSMS.triesLeft) > 0) {
            pendingSMS.triesLeft = i2 - 1;
            resendPending(pendingSMS);
            return;
        }
        switch (i) {
            case -1:
                str = null;
                z = true;
                break;
            case 0:
                str = "RESULT_ERROR_NONE";
                z = false;
                break;
            case 1:
                str = "RESULT_ERROR_GENERIC_FAILURE";
                z = false;
                break;
            case 2:
                str = "RESULT_ERROR_RADIO_OFF";
                z = false;
                break;
            case 3:
                str = "RESULT_ERROR_NULL_PDU";
                z = false;
                break;
            case 4:
                str = "RESULT_ERROR_NO_SERVICE";
                z = false;
                break;
            case 5:
                str = "RESULT_ERROR_LIMIT_EXCEEDED";
                z = false;
                break;
            case 6:
                str = "RESULT_ERROR_FDN_CHECK_FAILURE";
                z = false;
                break;
            case 7:
                str = "RESULT_ERROR_SHORT_CODE_NOT_ALLOWED";
                z = false;
                break;
            case 8:
                str = "RESULT_ERROR_SHORT_CODE_NEVER_ALLOWED";
                z = false;
                break;
            case 9:
                str = "RESULT_RADIO_NOT_AVAILABLE";
                z = false;
                break;
            case 10:
                str = "RESULT_NETWORK_REJECT";
                z = false;
                break;
            case 11:
                str = "RESULT_INVALID_ARGUMENTS";
                z = false;
                break;
            case 12:
                str = "RESULT_INVALID_STATE";
                z = false;
                break;
            case 13:
                str = "RESULT_NO_MEMORY";
                z = false;
                break;
            case 14:
                str = "RESULT_INVALID_SMS_FORMAT";
                z = false;
                break;
            case 15:
                str = "RESULT_SYSTEM_ERROR";
                z = false;
                break;
            case 16:
                str = "RESULT_MODEM_ERROR";
                z = false;
                break;
            case 17:
                str = "RESULT_NETWORK_ERROR";
                z = false;
                break;
            case 18:
                str = "RESULT_ENCODING_ERROR";
                z = false;
                break;
            case 19:
                str = "RESULT_INVALID_SMSC_ADDRESS";
                z = false;
                break;
            case 20:
                str = "RESULT_OPERATION_NOT_ALLOWED";
                z = false;
                break;
            case 21:
                str = "RESULT_INTERNAL_ERROR";
                z = false;
                break;
            case 22:
                str = "RESULT_NO_RESOURCES";
                z = false;
                break;
            case 23:
                str = "RESULT_CANCELLED";
                z = false;
                break;
            case 24:
                str = "RESULT_REQUEST_NOT_SUPPORTED";
                z = false;
                break;
            case 25:
                str = "RESULT_NO_BLUETOOTH_SERVICE";
                z = false;
                break;
            case 26:
                str = "RESULT_INVALID_BLUETOOTH_ADDRESS";
                z = false;
                break;
            case 27:
                str = "RESULT_BLUETOOTH_DISCONNECTED";
                z = false;
                break;
            case 28:
                str = "RESULT_UNEXPECTED_EVENT_STOP_SENDING";
                z = false;
                break;
            case 29:
                str = "RESULT_SMS_BLOCKED_DURING_EMERGENCY";
                z = false;
                break;
            case 30:
                str = "RESULT_SMS_SEND_RETRY_FAILED";
                z = false;
                break;
            case 31:
                str = "RESULT_REMOTE_EXCEPTION";
                z = false;
                break;
            case 32:
                str = "RESULT_NO_DEFAULT_SMS_APP";
                z = false;
                break;
            case 33:
                str = "RESULT_USER_NOT_ALLOWED";
                z = false;
                break;
            default:
                switch (i) {
                    case 100:
                        str = "RESULT_RIL_RADIO_NOT_AVAILABLE";
                        break;
                    case 101:
                        str = "RESULT_RIL_SMS_SEND_FAIL_RETRY";
                        break;
                    case 102:
                        str = "RESULT_RIL_NETWORK_REJECT";
                        break;
                    case 103:
                        str = "RESULT_RIL_INVALID_STATE";
                        break;
                    case 104:
                        str = "RESULT_RIL_INVALID_ARGUMENTS";
                        break;
                    case 105:
                        str = "RESULT_RIL_NO_MEMORY";
                        break;
                    case 106:
                        str = "RESULT_RIL_REQUEST_RATE_LIMITED";
                        break;
                    case 107:
                        str = "RESULT_RIL_INVALID_SMS_FORMAT";
                        break;
                    case 108:
                        str = "RESULT_RIL_SYSTEM_ERR";
                        break;
                    case 109:
                        str = "RESULT_RIL_ENCODING_ERR";
                        break;
                    case 110:
                        str = "RESULT_RIL_INVALID_SMSC_ADDRESS";
                        break;
                    case 111:
                        str = "RESULT_RIL_MODEM_ERR";
                        break;
                    case 112:
                        str = "RESULT_RIL_NETWORK_ERR";
                        break;
                    case 113:
                        str = "RESULT_RIL_INTERNAL_ERR";
                        break;
                    case 114:
                        str = "RESULT_RIL_REQUEST_NOT_SUPPORTED";
                        break;
                    case 115:
                        str = "RESULT_RIL_INVALID_MODEM_STATE";
                        break;
                    case 116:
                        str = "RESULT_RIL_NETWORK_NOT_READY";
                        break;
                    case 117:
                        str = "RESULT_RIL_OPERATION_NOT_ALLOWED";
                        break;
                    case 118:
                        str = "RESULT_RIL_NO_RESOURCES";
                        break;
                    case 119:
                        str = "RESULT_RIL_CANCELLED";
                        break;
                    case 120:
                        str = "RESULT_RIL_SIM_ABSENT";
                        break;
                    case 121:
                        str = "RESULT_RIL_SIMULTANEOUS_SMS_AND_CALL_NOT_ALLOWED";
                        break;
                    case 122:
                        str = "RESULT_RIL_ACCESS_BARRED";
                        break;
                    case 123:
                        str = "RESULT_RIL_BLOCKED_DUE_TO_CALL";
                        break;
                    case 124:
                        str = "RESULT_RIL_GENERIC_ERROR";
                        break;
                    default:
                        switch (i) {
                            case 500:
                                str = "RESULT_RECEIVE_DISPATCH_FAILURE";
                                break;
                            case 501:
                                str = "RESULT_RECEIVE_INJECTED_NULL_PDU";
                                break;
                            case 502:
                                str = "RESULT_RECEIVE_RUNTIME_EXCEPTION";
                                break;
                            case 503:
                                str = "RESULT_RECEIVE_NULL_MESSAGE_FROM_RIL";
                                break;
                            case 504:
                                str = "RESULT_RECEIVE_WHILE_ENCRYPTED";
                                break;
                            case 505:
                                str = "RESULT_RECEIVE_SQL_EXCEPTION";
                                break;
                            case 506:
                                str = "RESULT_RECEIVE_URI_EXCEPTION";
                                break;
                            default:
                                str = "UNKNOWN_EXCEPTION_" + i;
                                break;
                        }
                }
                z = false;
                break;
        }
        int intExtra2 = intent.getIntExtra("errorCode", -1);
        if (intExtra2 != -1) {
            str = str + "_" + intExtra2;
        }
        if (booleanExtra) {
            pendingSMS.whenSent(z, str);
        } else if (booleanExtra2) {
            pendingSMS.whenDelivered(z, str);
        }
        boolean[] zArr = pendingSMS.received;
        if (zArr[0] || zArr[1]) {
            pending.remove(Integer.valueOf(intExtra));
            savePending();
        }
    }

    private static void resendPending(PendingSMS pendingSMS) {
        SmsManager smsManager;
        Object systemService;
        Context context = ApplicationLoader.applicationContext;
        if (context == null) {
            context = LaunchActivity.instance;
        }
        if (context == null) {
            FileLog.d("[smsjob] resending failed: no context; with id " + pendingSMS.id);
            pendingSMS.whenSent(false, "RESENDING_NULL_CONTEXT");
            return;
        }
        int i = pendingSMS.simId;
        if (i == -1 || Build.VERSION.SDK_INT < 31) {
            smsManager = (i == -1 || Build.VERSION.SDK_INT < 22) ? SmsManager.getDefault() : SmsManager.getSmsManagerForSubscriptionId(i);
        } else {
            systemService = context.getSystemService((Class<Object>) SmsManager.class);
            smsManager = ((SmsManager) systemService).createForSubscriptionId(pendingSMS.simId);
        }
        SmsManager smsManager2 = smsManager;
        Intent intent = new Intent(context, (Class<?>) SMSResultService.class);
        intent.putExtra("sent", true);
        intent.putExtra("tg_sms_id", pendingSMS.id);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 167772160);
        Intent intent2 = new Intent(context, (Class<?>) SMSResultService.class);
        intent2.putExtra("delivered", true);
        intent2.putExtra("tg_sms_id", pendingSMS.id);
        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent2, 167772160);
        FileLog.d("[smsjob] resending sms with id " + pendingSMS.id);
        try {
            smsManager2.sendTextMessage(pendingSMS.phone, null, pendingSMS.text, broadcast, broadcast2);
            FileLog.d("[smsjob] resent sms with id " + pendingSMS.id);
        } catch (Throwable th) {
            FileLog.e("[smsjob] failed to resend sms with id " + pendingSMS.id + ", caught error", th);
            pendingSMS.whenSent(false, th.getMessage());
        }
    }

    private void runJob(TL_smsjobs$TL_smsJob tL_smsjobs$TL_smsJob) {
        String str;
        String str2;
        String str3;
        checkSelectedSIMCard();
        if (tL_smsjobs$TL_smsJob.phone_number.startsWith("+")) {
            str = tL_smsjobs$TL_smsJob.phone_number;
        } else {
            str = "+" + tL_smsjobs$TL_smsJob.phone_number;
        }
        String str4 = str;
        StringBuilder sb = new StringBuilder();
        sb.append("[smsjob] running sms job ");
        sb.append(tL_smsjobs$TL_smsJob.job_id);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            str2 = ": " + tL_smsjobs$TL_smsJob.text + " to " + str4;
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append(", selected sim: ");
        if (this.selectedSimCard == null) {
            str3 = "null";
        } else {
            str3 = "{id=" + this.selectedSimCard.id + ", icc=" + this.selectedSimCard.iccId + ", name=" + this.selectedSimCard.name + ", slot=" + this.selectedSimCard.slot + "}";
        }
        sb.append(str3);
        FileLog.d(sb.toString());
        pushToJournal(tL_smsjobs$TL_smsJob.job_id, 1, str4, null);
        sendSMS(ApplicationLoader.applicationContext, this.currentAccount, tL_smsjobs$TL_smsJob.job_id, this.selectedSimCard, str4, tL_smsjobs$TL_smsJob.text);
    }

    private void saveCacheStatus() {
        SharedPreferences.Editor edit = MessagesController.getMainSettings(this.currentAccount).edit();
        TL_smsjobs$TL_smsjobs_status tL_smsjobs$TL_smsjobs_status = this.currentStatus;
        if (tL_smsjobs$TL_smsjobs_status == null) {
            edit.remove("smsjobs_status");
        } else {
            SerializedData serializedData = new SerializedData(tL_smsjobs$TL_smsjobs_status.getObjectSize());
            this.currentStatus.serializeToStream(serializedData);
            edit.putString("smsjobs_status", Utilities.bytesToHex(serializedData.toByteArray()));
        }
        edit.apply();
    }

    public static void savePending() {
        if (pending.isEmpty()) {
            MessagesController.getGlobalMainSettings().edit().remove("smsjobs_pending").apply();
            return;
        }
        try {
            int size = pending.size() * 8;
            Iterator<PendingSMS> it = pending.values().iterator();
            while (it.hasNext()) {
                size += it.next().getObjectSize();
            }
            SerializedData serializedData = new SerializedData(size);
            serializedData.writeInt32(pending.size());
            Iterator<PendingSMS> it2 = pending.values().iterator();
            while (it2.hasNext()) {
                it2.next().serializeToStream(serializedData);
            }
            MessagesController.getGlobalMainSettings().edit().putString("smsjobs_pending", Utilities.bytesToHex(serializedData.toByteArray())).apply();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private static void sendSMS(Context context, int i, String str, SIM sim, String str2, String str3) {
        SmsManager smsManager;
        Object systemService;
        if (sim == null || Build.VERSION.SDK_INT < 31) {
            smsManager = (sim == null || Build.VERSION.SDK_INT < 22) ? SmsManager.getDefault() : SmsManager.getSmsManagerForSubscriptionId(sim.id);
        } else {
            systemService = context.getSystemService((Class<Object>) SmsManager.class);
            smsManager = ((SmsManager) systemService).createForSubscriptionId(sim.id);
        }
        SmsManager smsManager2 = smsManager;
        int random = (int) (Math.random() * 1000000.0d);
        Intent intent = new Intent(context, (Class<?>) SMSResultService.class);
        intent.putExtra("sent", true);
        intent.putExtra("tg_sms_id", random);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 167772160);
        Intent intent2 = new Intent(context, (Class<?>) SMSResultService.class);
        intent2.putExtra("delivered", true);
        intent2.putExtra("tg_sms_id", random);
        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent2, 167772160);
        PendingSMS pendingSMS = new PendingSMS(random, i, str, sim, str2, str3);
        pendingSMS.setup();
        pending.put(Integer.valueOf(random), pendingSMS);
        savePending();
        FileLog.d("[smsjob] sending sms with id " + random);
        try {
            smsManager2.sendTextMessage(str2, null, str3, broadcast, broadcast2);
            FileLog.d("[smsjob] sent sms with id " + random);
        } catch (Throwable th) {
            FileLog.e("[smsjob] failed to send sms with id " + random + ", caught error", th);
            pendingSMS.whenSent(false, th.getMessage());
        }
    }

    public void checkIsEligible(boolean z, final Utilities.Callback<TL_smsjobs$TL_smsjobs_eligibleToJoin> callback) {
        if (!this.loadedIsEligible || z) {
            if (this.loadingIsEligible && callback == null) {
                return;
            }
            this.loadingIsEligible = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLObject() {
                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z2) {
                    if (i != -594852657) {
                        return null;
                    }
                    TL_smsjobs$TL_smsjobs_eligibleToJoin tL_smsjobs$TL_smsjobs_eligibleToJoin = new TL_smsjobs$TL_smsjobs_eligibleToJoin();
                    tL_smsjobs$TL_smsjobs_eligibleToJoin.readParams(abstractSerializedData, z2);
                    return tL_smsjobs$TL_smsjobs_eligibleToJoin;
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(249313744);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    SMSJobController.this.lambda$checkIsEligible$2(callback, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void checkSelectedSIMCard() {
        SIM sim;
        int i = MessagesController.getMainSettings(this.currentAccount).getInt("smsjobs_sim", -1);
        try {
            ArrayList<SIM> sIMs = getSIMs();
            if (!sIMs.isEmpty()) {
                if (i == -1) {
                    sim = sIMs.get(0);
                } else {
                    this.selectedSimCard = sIMs.get(0);
                    for (int i2 = 0; i2 < sIMs.size(); i2++) {
                        if (sIMs.get(i2).id == i) {
                            sim = sIMs.get(i2);
                        }
                    }
                }
                this.selectedSimCard = sim;
                break;
            }
            this.selectedSimCard = null;
        } catch (Exception e) {
            FileLog.e(e);
            this.selectedSimCard = null;
        }
        SIM sim2 = this.selectedSimCard;
        if (sim2 != null && sim2.id != i) {
            MessagesController.getMainSettings(this.currentAccount).edit().putInt("smsjobs_sim", this.selectedSimCard.id).apply();
        }
        if (this.currentState != 2 || this.selectedSimCard == null) {
            return;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_smsjobs$TL_smsjobs_join(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                SMSJobController.this.lambda$checkSelectedSIMCard$6(tLObject, tLRPC$TL_error);
            }
        });
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.newSuggestionsAvailable) {
            int i3 = this.currentState;
            if (i3 != 0 && i3 != 3) {
                checkIsEligible(true, null);
            }
            invalidateStatus();
        }
    }

    public ArrayList<SIM> getSIMs() {
        return getSIMs(ApplicationLoader.applicationContext);
    }

    public SIM getSelectedSIM() {
        return this.selectedSimCard;
    }

    public int getState() {
        return this.currentState;
    }

    public boolean hasError() {
        return this.lastErrorId > this.seenErrorId;
    }

    public void init() {
        loadStatus(false);
        checkSelectedSIMCard();
    }

    public void invalidateStatus() {
        this.loadedStatus = false;
        if (this.atStatisticsPage || ApplicationLoader.mainInterfacePaused) {
            loadStatus(false);
        }
    }

    public boolean isAvailable() {
        int i = this.currentState;
        if (i != 0 && i != 3) {
            checkIsEligible(false, null);
            loadStatus(false);
        }
        if (this.currentState != 0) {
            return (this.isEligible == null && this.currentStatus == null) ? false : true;
        }
        return false;
    }

    public boolean isEligible() {
        return this.isEligible != null || this.loadingIsEligible;
    }

    public void leave() {
        this.currentStatus = null;
        setState(0);
        clearJournal();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLObject() {
            @Override
            public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
                return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                abstractSerializedData.writeInt32(-1734824589);
            }
        }, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                SMSJobController.this.lambda$leave$12(tLObject, tLRPC$TL_error);
            }
        });
        SMSJobsNotification.check();
    }

    public void loadStatus(boolean z) {
        if (this.loadingStatus) {
            return;
        }
        if (!this.loadedStatus || z) {
            this.loadingStatus = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLObject() {
                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z2) {
                    if (i != 720277905) {
                        return null;
                    }
                    TL_smsjobs$TL_smsjobs_status tL_smsjobs$TL_smsjobs_status = new TL_smsjobs$TL_smsjobs_status();
                    tL_smsjobs$TL_smsjobs_status.readParams(abstractSerializedData, z2);
                    return tL_smsjobs$TL_smsjobs_status;
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(279353576);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    SMSJobController.this.lambda$loadStatus$4(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void processJobUpdate(final String str) {
        if (this.currentState != 3) {
            FileLog.d("[smsjob] received update on sms job " + str + ", but we did not join!!! currentState=" + this.currentState);
            return;
        }
        if (this.completedJobs.contains(str) || this.loadingJobs.contains(str)) {
            return;
        }
        this.loadingJobs.add(str);
        FileLog.d("[smsjob] received update on sms job " + str + ", fetching");
        TL_smsjobs$TL_smsjobs_getSmsJob tL_smsjobs$TL_smsjobs_getSmsJob = new TL_smsjobs$TL_smsjobs_getSmsJob();
        tL_smsjobs$TL_smsjobs_getSmsJob.job_id = str;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_smsjobs$TL_smsjobs_getSmsJob, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                SMSJobController.this.lambda$processJobUpdate$8(str, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void registerError() {
        boolean hasError = hasError();
        SharedPreferences.Editor edit = MessagesController.getMainSettings(this.currentAccount).edit();
        int i = this.lastErrorId + 1;
        this.lastErrorId = i;
        edit.putInt("smsjobs_error", i).apply();
        if (hasError() != hasError) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.smsJobStatusUpdate, new Object[0]);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumPromoUpdated, new Object[0]);
        }
    }

    public void seenError() {
        if (this.seenErrorId < this.lastErrorId) {
            boolean hasError = hasError();
            SharedPreferences.Editor edit = MessagesController.getMainSettings(this.currentAccount).edit();
            int i = this.lastErrorId;
            this.seenErrorId = i;
            edit.putInt("smsjobs_seen_error", i).apply();
            if (hasError() != hasError) {
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.smsJobStatusUpdate, new Object[0]);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumPromoUpdated, new Object[0]);
            }
        }
    }

    public void setSelectedSIM(SIM sim) {
        if (sim == null) {
            return;
        }
        this.selectedSimCard = sim;
        MessagesController.getMainSettings(this.currentAccount).edit().putInt("smsjobs_sim", this.selectedSimCard.id).apply();
    }

    public void setState(int i) {
        SharedPreferences.Editor edit = MessagesController.getMainSettings(this.currentAccount).edit();
        this.currentState = i;
        edit.putInt("smsjobs_state", i).apply();
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.smsJobStatusUpdate, new Object[0]);
        if (this.currentState == 3) {
            MessagesController.getInstance(this.currentAccount).removeSuggestion(0L, "PREMIUM_SMSJOBS");
        }
        SMSJobsNotification.check();
    }

    public int simsCount() {
        try {
            return getSIMs().size();
        } catch (Exception unused) {
            return 0;
        }
    }

    public void toggleAllowInternational(final boolean z) {
        if (this.currentStatus == null) {
            return;
        }
        if (this.updateSettingsReqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.updateSettingsReqId, true);
        }
        if (this.currentStatus.allow_international == z) {
            return;
        }
        TL_smsjobs$TL_smsjobs_updateSettings tL_smsjobs$TL_smsjobs_updateSettings = new TL_smsjobs$TL_smsjobs_updateSettings();
        tL_smsjobs$TL_smsjobs_updateSettings.allow_international = z;
        int sendRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_smsjobs$TL_smsjobs_updateSettings, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                SMSJobController.this.lambda$toggleAllowInternational$14(r2, z, tLObject, tLRPC$TL_error);
            }
        });
        final int[] iArr = {sendRequest};
        this.updateSettingsReqId = sendRequest;
    }
}

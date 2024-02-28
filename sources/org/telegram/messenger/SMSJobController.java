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
import java.util.List;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SMSJobController;
import org.telegram.messenger.Utilities;
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

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
        pending = new HashMap<>();
    }

    public static SMSJobController getInstance(int i) {
        SMSJobController sMSJobController = Instance[i];
        if (sMSJobController == null) {
            synchronized (lockObjects[i]) {
                sMSJobController = Instance[i];
                if (sMSJobController == null) {
                    SMSJobController[] sMSJobControllerArr = Instance;
                    SMSJobController sMSJobController2 = new SMSJobController(i);
                    sMSJobControllerArr[i] = sMSJobController2;
                    sMSJobController = sMSJobController2;
                }
            }
        }
        return sMSJobController;
    }

    public boolean isEligible() {
        return this.isEligible != null || this.loadingIsEligible;
    }

    private SMSJobController(int i) {
        this.currentAccount = i;
        Context context = ApplicationLoader.applicationContext;
        this.journalPrefs = context.getSharedPreferences("smsjobs_journal_" + i, 0);
        loadCacheStatus();
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.newSuggestionsAvailable);
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

    public void checkIsEligible(boolean z, final Utilities.Callback<TL_smsjobs$TL_smsjobs_eligibleToJoin> callback) {
        if (!this.loadedIsEligible || z) {
            if (this.loadingIsEligible && callback == null) {
                return;
            }
            this.loadingIsEligible = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLObject() {
                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z2) {
                    if (i == -594852657) {
                        TL_smsjobs$TL_smsjobs_eligibleToJoin tL_smsjobs$TL_smsjobs_eligibleToJoin = new TL_smsjobs$TL_smsjobs_eligibleToJoin();
                        tL_smsjobs$TL_smsjobs_eligibleToJoin.readParams(abstractSerializedData, z2);
                        return tL_smsjobs$TL_smsjobs_eligibleToJoin;
                    }
                    return null;
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(249313744);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    SMSJobController.this.lambda$checkIsEligible$1(callback, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$checkIsEligible$1(final Utilities.Callback callback, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SMSJobController.this.lambda$checkIsEligible$0(tLObject, tLRPC$TL_error, callback);
            }
        });
    }

    public void lambda$checkIsEligible$0(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error, Utilities.Callback callback) {
        this.loadingIsEligible = false;
        this.loadedIsEligible = true;
        if (tLObject instanceof TL_smsjobs$TL_smsjobs_eligibleToJoin) {
            this.isEligible = (TL_smsjobs$TL_smsjobs_eligibleToJoin) tLObject;
        } else if (tLRPC$TL_error != null && "NOT_ELIGIBLE".equals(tLRPC$TL_error.text)) {
            this.isEligible = null;
        } else if (tLRPC$TL_error != null && "ALREADY_JOINED".equals(tLRPC$TL_error.text)) {
            this.isEligible = null;
        } else if (tLRPC$TL_error != null) {
            BulletinFactory.showError(tLRPC$TL_error);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.smsJobStatusUpdate, new Object[0]);
        if (callback != null) {
            callback.run(this.isEligible);
        }
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
                    if (i == 720277905) {
                        TL_smsjobs$TL_smsjobs_status tL_smsjobs$TL_smsjobs_status = new TL_smsjobs$TL_smsjobs_status();
                        tL_smsjobs$TL_smsjobs_status.readParams(abstractSerializedData, z2);
                        return tL_smsjobs$TL_smsjobs_status;
                    }
                    return null;
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(279353576);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    SMSJobController.this.lambda$loadStatus$3(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$loadStatus$3(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SMSJobController.this.lambda$loadStatus$2(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadStatus$2(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        TL_smsjobs$TL_smsjobs_status tL_smsjobs$TL_smsjobs_status = this.currentStatus;
        TL_smsjobs$TL_smsjobs_eligibleToJoin tL_smsjobs$TL_smsjobs_eligibleToJoin = this.isEligible;
        int i = this.currentState;
        this.loadingStatus = false;
        this.loadedStatus = true;
        int i2 = 3;
        if (tLObject instanceof TL_smsjobs$TL_smsjobs_status) {
            this.currentStatus = (TL_smsjobs$TL_smsjobs_status) tLObject;
            saveCacheStatus();
        } else if (tLRPC$TL_error != null && "NOT_JOINED".equals(tLRPC$TL_error.text)) {
            i2 = i == 3 ? 0 : i;
            this.currentStatus = null;
            saveCacheStatus();
        } else if (tLRPC$TL_error != null && "NOT_ELIGIBLE".equals(tLRPC$TL_error.text)) {
            i2 = i == 3 ? 0 : i;
            this.currentStatus = null;
            this.isEligible = null;
            saveCacheStatus();
        } else {
            BulletinFactory.showError(tLRPC$TL_error);
            i2 = i;
        }
        if (tL_smsjobs$TL_smsjobs_status == this.currentStatus && tL_smsjobs$TL_smsjobs_eligibleToJoin == this.isEligible && i == i2) {
            return;
        }
        setState(i2);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.smsJobStatusUpdate, new Object[0]);
        SMSJobsNotification.check();
    }

    public void invalidateStatus() {
        this.loadedStatus = false;
        if (this.atStatisticsPage || ApplicationLoader.mainInterfacePaused) {
            loadStatus(false);
        }
    }

    public void init() {
        loadStatus(false);
        checkSelectedSIMCard();
    }

    public void checkSelectedSIMCard() {
        int i = MessagesController.getMainSettings(this.currentAccount).getInt("smsjobs_sim", -1);
        try {
            ArrayList<SIM> sIMs = getSIMs();
            if (sIMs.isEmpty()) {
                this.selectedSimCard = null;
            } else {
                if (i == -1) {
                    this.selectedSimCard = sIMs.get(0);
                } else {
                    this.selectedSimCard = sIMs.get(0);
                    for (int i2 = 0; i2 < sIMs.size(); i2++) {
                        if (sIMs.get(i2).id == i) {
                            this.selectedSimCard = sIMs.get(i2);
                            break;
                        }
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
            this.selectedSimCard = null;
        }
        SIM sim = this.selectedSimCard;
        if (sim != null && sim.id != i) {
            MessagesController.getMainSettings(this.currentAccount).edit().putInt("smsjobs_sim", this.selectedSimCard.id).apply();
        }
        if (this.currentState != 2 || this.selectedSimCard == null) {
            return;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_smsjobs$TL_smsjobs_join(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                SMSJobController.this.lambda$checkSelectedSIMCard$5(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$checkSelectedSIMCard$5(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SMSJobController.this.lambda$checkSelectedSIMCard$4(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$checkSelectedSIMCard$4(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error != null) {
            BulletinFactory.showError(tLRPC$TL_error);
        } else if (tLObject instanceof TLRPC$TL_boolFalse) {
            BulletinFactory.global().createErrorBulletin(LocaleController.getString((int) R.string.UnknownError)).show();
        } else {
            setState(3);
            loadStatus(true);
            Context context = LaunchActivity.instance;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            SMSSubscribeSheet.showSubscribed(context, null);
        }
    }

    public SIM getSelectedSIM() {
        return this.selectedSimCard;
    }

    public void setSelectedSIM(SIM sim) {
        if (sim == null) {
            return;
        }
        this.selectedSimCard = sim;
        MessagesController.getMainSettings(this.currentAccount).edit().putInt("smsjobs_sim", this.selectedSimCard.id).apply();
    }

    public int simsCount() {
        try {
            return getSIMs().size();
        } catch (Exception unused) {
            return 0;
        }
    }

    public ArrayList<SIM> getSIMs() {
        return getSIMs(ApplicationLoader.applicationContext);
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

    public int getState() {
        return this.currentState;
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

    public void processJobUpdate(final String str) {
        if (this.currentState != 3) {
            FileLog.d("[smsjob] received update on sms job " + str + ", but we did not join!!! currentState=" + this.currentState);
        } else if (this.completedJobs.contains(str) || this.loadingJobs.contains(str)) {
        } else {
            this.loadingJobs.add(str);
            FileLog.d("[smsjob] received update on sms job " + str + ", fetching");
            TL_smsjobs$TL_smsjobs_getSmsJob tL_smsjobs$TL_smsjobs_getSmsJob = new TL_smsjobs$TL_smsjobs_getSmsJob();
            tL_smsjobs$TL_smsjobs_getSmsJob.job_id = str;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_smsjobs$TL_smsjobs_getSmsJob, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    SMSJobController.this.lambda$processJobUpdate$7(str, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$processJobUpdate$7(final String str, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SMSJobController.this.lambda$processJobUpdate$6(tLObject, str);
            }
        });
    }

    public void lambda$processJobUpdate$6(TLObject tLObject, String str) {
        if (tLObject instanceof TL_smsjobs$TL_smsJob) {
            runJob((TL_smsjobs$TL_smsJob) tLObject);
            return;
        }
        FileLog.e("[smsjob] failed to fetch sms job by id " + str);
        this.loadingJobs.remove(str);
    }

    private void runJob(final TL_smsjobs$TL_smsJob tL_smsjobs$TL_smsJob) {
        String str;
        String str2;
        String str3;
        checkSelectedSIMCard();
        if (tL_smsjobs$TL_smsJob.phone_number.startsWith("+")) {
            str = tL_smsjobs$TL_smsJob.phone_number;
        } else {
            str = "+" + tL_smsjobs$TL_smsJob.phone_number;
        }
        final String str4 = str;
        StringBuilder sb = new StringBuilder();
        sb.append("[smsjob] running sms job ");
        sb.append(tL_smsjobs$TL_smsJob.job_id);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            str2 = ": " + tL_smsjobs$TL_smsJob.text + " to " + str4;
        } else {
            str2 = BuildConfig.APP_CENTER_HASH;
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
        final boolean[] zArr = new boolean[1];
        sendSMS(ApplicationLoader.applicationContext, this.selectedSimCard, str4, tL_smsjobs$TL_smsJob.text, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                SMSJobController.this.lambda$runJob$8(tL_smsjobs$TL_smsJob, zArr, str4, (Boolean) obj, (String) obj2);
            }
        }, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                SMSJobController.this.lambda$runJob$9(tL_smsjobs$TL_smsJob, zArr, str4, (Boolean) obj, (String) obj2);
            }
        });
    }

    public void lambda$runJob$8(TL_smsjobs$TL_smsJob tL_smsjobs$TL_smsJob, boolean[] zArr, String str, Boolean bool, String str2) {
        FileLog.d("[smsjob] sms job " + tL_smsjobs$TL_smsJob.job_id + " sent callback: success=" + bool + ", reason=" + str2);
        if (zArr[0] || bool.booleanValue()) {
            return;
        }
        zArr[0] = true;
        finishJob(tL_smsjobs$TL_smsJob.job_id, str, str2);
    }

    public void lambda$runJob$9(TL_smsjobs$TL_smsJob tL_smsjobs$TL_smsJob, boolean[] zArr, String str, Boolean bool, String str2) {
        FileLog.d("[smsjob] sms job " + tL_smsjobs$TL_smsJob.job_id + " delivered callback: success=" + bool + ", reason=" + str2);
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        String str3 = tL_smsjobs$TL_smsJob.job_id;
        if (bool.booleanValue()) {
            str2 = null;
        }
        finishJob(str3, str, str2);
    }

    private void finishJob(final String str, final String str2, final String str3) {
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
                SMSJobController.this.lambda$finishJob$11(str, str2, str3, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$finishJob$11(final String str, final String str2, final String str3, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SMSJobController.this.lambda$finishJob$10(tLObject, str, tLRPC$TL_error, str2, str3);
            }
        });
    }

    public void lambda$finishJob$10(TLObject tLObject, String str, TLRPC$TL_error tLRPC$TL_error, String str2, String str3) {
        if (tLObject instanceof TLRPC$TL_boolTrue) {
            FileLog.d("[smsjob] finished sms job " + str + ", received true");
        } else if (tLObject instanceof TLRPC$TL_boolFalse) {
            FileLog.d("[smsjob] finished sms job " + str + ", received false");
        } else if (tLRPC$TL_error != null) {
            FileLog.d("[smsjob] finished sms job " + str + ", received error " + tLRPC$TL_error.code + " " + tLRPC$TL_error.text);
        }
        pushToJournal(str, str2, str3);
        invalidateStatus();
    }

    public static class PendingSMS {
        public final int id;
        public final boolean[] received = new boolean[2];
        public final Utilities.Callback2<Boolean, String> whenDelivered;
        public final Utilities.Callback2<Boolean, String> whenSent;

        public PendingSMS(int i, Utilities.Callback2<Boolean, String> callback2, Utilities.Callback2<Boolean, String> callback22) {
            this.id = i;
            this.whenSent = callback2;
            this.whenDelivered = callback22;
        }
    }

    public static void receivedSMSIntent(Intent intent, int i) {
        boolean z;
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
        String str = null;
        switch (i) {
            case -1:
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
            case R.styleable.AppCompatTheme_actionModeTheme:
                str = "RESULT_SMS_SEND_RETRY_FAILED";
                z = false;
                break;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable:
                str = "RESULT_REMOTE_EXCEPTION";
                z = false;
                break;
            case 32:
                str = "RESULT_NO_DEFAULT_SMS_APP";
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
                    case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu:
                        str = "RESULT_RIL_NETWORK_REJECT";
                        break;
                    case R.styleable.AppCompatTheme_textAppearanceListItem:
                        str = "RESULT_RIL_INVALID_STATE";
                        break;
                    case R.styleable.AppCompatTheme_textAppearanceListItemSecondary:
                        str = "RESULT_RIL_INVALID_ARGUMENTS";
                        break;
                    case R.styleable.AppCompatTheme_textAppearanceListItemSmall:
                        str = "RESULT_RIL_NO_MEMORY";
                        break;
                    case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader:
                        str = "RESULT_RIL_REQUEST_RATE_LIMITED";
                        break;
                    case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle:
                        str = "RESULT_RIL_INVALID_SMS_FORMAT";
                        break;
                    case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle:
                        str = "RESULT_RIL_SYSTEM_ERR";
                        break;
                    case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu:
                        str = "RESULT_RIL_ENCODING_ERR";
                        break;
                    case R.styleable.AppCompatTheme_textColorAlertDialogListItem:
                        str = "RESULT_RIL_INVALID_SMSC_ADDRESS";
                        break;
                    case R.styleable.AppCompatTheme_textColorSearchUrl:
                        str = "RESULT_RIL_MODEM_ERR";
                        break;
                    case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle:
                        str = "RESULT_RIL_NETWORK_ERR";
                        break;
                    case R.styleable.AppCompatTheme_toolbarStyle:
                        str = "RESULT_RIL_INTERNAL_ERR";
                        break;
                    case R.styleable.AppCompatTheme_tooltipForegroundColor:
                        str = "RESULT_RIL_REQUEST_NOT_SUPPORTED";
                        break;
                    case R.styleable.AppCompatTheme_tooltipFrameBackground:
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
        if (booleanExtra && !pendingSMS.received[0]) {
            pendingSMS.whenSent.run(Boolean.valueOf(z), str);
            pendingSMS.received[0] = true;
        } else if (booleanExtra2 && !pendingSMS.received[1]) {
            pendingSMS.whenDelivered.run(Boolean.valueOf(z), str);
            pendingSMS.received[1] = true;
        }
        boolean[] zArr = pendingSMS.received;
        if (zArr[0] && zArr[1]) {
            pending.remove(Integer.valueOf(intExtra));
        }
    }

    private static void sendSMS(Context context, SIM sim, String str, String str2, Utilities.Callback2<Boolean, String> callback2, Utilities.Callback2<Boolean, String> callback22) {
        SmsManager smsManager;
        if (sim != null && Build.VERSION.SDK_INT >= 31) {
            smsManager = ((SmsManager) context.getSystemService(SmsManager.class)).createForSubscriptionId(sim.id);
        } else if (sim != null && Build.VERSION.SDK_INT >= 22) {
            smsManager = SmsManager.getSmsManagerForSubscriptionId(sim.id);
        } else {
            smsManager = SmsManager.getDefault();
        }
        SmsManager smsManager2 = smsManager;
        int random = (int) (Math.random() * 1000000.0d);
        Intent intent = new Intent(context, SMSResultService.class);
        intent.putExtra("sent", true);
        intent.putExtra("tg_sms_id", random);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 167772160);
        Intent intent2 = new Intent(context, SMSResultService.class);
        intent2.putExtra("delivered", true);
        intent2.putExtra("tg_sms_id", random);
        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent2, 167772160);
        pending.put(Integer.valueOf(random), new PendingSMS(random, callback2, callback22));
        FileLog.d("[smsjob] sending sms with id " + random);
        smsManager2.sendTextMessage(str, null, str2, broadcast, broadcast2);
    }

    public static class SIM {
        public final String carrier;
        public final String country;
        public final String iccId;
        public final int id;
        public final String name;
        public final String phone_number;
        public final int slot;

        public SIM(int i, int i2, String str, String str2) {
            this.id = i;
            this.slot = i2;
            this.name = str;
            this.iccId = null;
            this.country = str2;
            this.carrier = null;
            this.phone_number = null;
        }

        public SIM(int i, int i2, String str) {
            this.id = i;
            this.slot = i2;
            this.name = "SIM" + (i2 + 1);
            this.iccId = null;
            this.country = str;
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
            if (subscriptionInfo == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                number = subscriptionManager.getPhoneNumber(subscriptionInfo.getSubscriptionId());
            } else {
                number = subscriptionInfo.getNumber();
            }
            return new SIM(subscriptionInfo.getSubscriptionId(), subscriptionInfo.getSimSlotIndex(), subscriptionInfo.getDisplayName() == null ? BuildConfig.APP_CENTER_HASH : subscriptionInfo.getDisplayName().toString(), subscriptionInfo.getIccId(), subscriptionInfo.getCountryIso(), subscriptionInfo.getCarrierName() != null ? subscriptionInfo.getCarrierName().toString() : null, number);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            String str2 = this.country;
            String str3 = BuildConfig.APP_CENTER_HASH;
            if (str2 != null) {
                str = "[" + this.country + "] ";
            } else {
                str = BuildConfig.APP_CENTER_HASH;
            }
            sb.append(str);
            sb.append(this.name);
            if (this.carrier != null) {
                str3 = " (" + this.carrier + ")";
            }
            sb.append(str3);
            return sb.toString();
        }
    }

    private static ArrayList<SIM> getSIMs(Context context) {
        ArrayList<SIM> arrayList = new ArrayList<>();
        int i = Build.VERSION.SDK_INT;
        if (i >= 22) {
            SubscriptionManager from = SubscriptionManager.from(context);
            List<SubscriptionInfo> completeActiveSubscriptionInfoList = i >= 30 ? from.getCompleteActiveSubscriptionInfoList() : null;
            if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i >= 28) {
                completeActiveSubscriptionInfoList = from.getAccessibleSubscriptionInfoList();
            }
            if (completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) {
                completeActiveSubscriptionInfoList = from.getActiveSubscriptionInfoList();
            }
            if (completeActiveSubscriptionInfoList != null) {
                for (int i2 = 0; i2 < completeActiveSubscriptionInfoList.size(); i2++) {
                    SIM from2 = SIM.from(from, completeActiveSubscriptionInfoList.get(i2));
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
                SMSJobController.this.lambda$leave$13(tLObject, tLRPC$TL_error);
            }
        });
        SMSJobsNotification.check();
    }

    public void lambda$leave$13(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SMSJobController.this.lambda$leave$12(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$leave$12(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error != null) {
            BulletinFactory.showError(tLRPC$TL_error);
        } else if (tLObject instanceof TLRPC$TL_boolFalse) {
            BulletinFactory.global().createErrorBulletin(LocaleController.getString((int) R.string.UnknownError)).show();
        } else {
            getInstance(this.currentAccount).loadStatus(true);
            getInstance(this.currentAccount).checkIsEligible(true, null);
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
                SMSJobController.this.lambda$toggleAllowInternational$15(r2, z, tLObject, tLRPC$TL_error);
            }
        });
        final int[] iArr = {sendRequest};
        this.updateSettingsReqId = sendRequest;
    }

    public void lambda$toggleAllowInternational$15(final int[] iArr, final boolean z, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SMSJobController.this.lambda$toggleAllowInternational$14(iArr, z);
            }
        });
    }

    public void lambda$toggleAllowInternational$14(int[] iArr, boolean z) {
        if (iArr[0] != this.updateSettingsReqId) {
            return;
        }
        this.updateSettingsReqId = 0;
        TL_smsjobs$TL_smsjobs_status tL_smsjobs$TL_smsjobs_status = this.currentStatus;
        if (tL_smsjobs$TL_smsjobs_status != null) {
            tL_smsjobs$TL_smsjobs_status.allow_international = z;
        }
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
                int lambda$readJournal$16;
                lambda$readJournal$16 = SMSJobController.lambda$readJournal$16((SMSJobController.JobEntry) obj2, (SMSJobController.JobEntry) obj3);
                return lambda$readJournal$16;
            }
        });
        int i = 0;
        if (MessagesController.getMainSettings(this.currentAccount).getBoolean("smsjobs_checked_journal", false)) {
            return;
        }
        while (true) {
            if (i >= this.journal.size()) {
                break;
            } else if (!TextUtils.isEmpty(this.journal.get(i).error)) {
                registerError();
                break;
            } else {
                i++;
            }
        }
        MessagesController.getMainSettings(this.currentAccount).edit().putBoolean("smsjobs_checked_journal", true).apply();
    }

    public static int lambda$readJournal$16(JobEntry jobEntry, JobEntry jobEntry2) {
        return jobEntry2.date - jobEntry.date;
    }

    private void clearJournal() {
        this.journal.clear();
        this.journalPrefs.edit().clear().apply();
    }

    private void pushToJournal(String str, String str2, String str3) {
        JobEntry jobEntry = new JobEntry();
        jobEntry.job_id = str;
        jobEntry.error = str3;
        jobEntry.date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        jobEntry.country = getCountryFromPhoneNumber(ApplicationLoader.applicationContext, str2);
        this.journal.add(0, jobEntry);
        this.journalPrefs.edit().putString(jobEntry.job_id, jobEntry.toString()).apply();
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.smsJobStatusUpdate, new Object[0]);
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        registerError();
    }

    public static String getCountryFromPhoneNumber(Context context, String str) {
        BufferedReader bufferedReader;
        String readLine;
        String[] split;
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
                    e = e;
                }
                do {
                    try {
                        readLine = bufferedReader.readLine();
                    } catch (Exception e2) {
                        e = e2;
                        bufferedReader2 = bufferedReader;
                        FileLog.e(e);
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                            return BuildConfig.APP_CENTER_HASH;
                        }
                        return BuildConfig.APP_CENTER_HASH;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (Exception e3) {
                                FileLog.e(e3);
                            }
                        }
                        throw th;
                    }
                    if (readLine == null) {
                        bufferedReader.close();
                        bufferedReader.close();
                        return BuildConfig.APP_CENTER_HASH;
                    }
                    split = readLine.split(";");
                } while (!stripExceptNumbers.startsWith(split[0]));
                String str2 = split[1];
                try {
                    bufferedReader.close();
                } catch (Exception e4) {
                    FileLog.e(e4);
                }
                return str2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            FileLog.e(e5);
            return BuildConfig.APP_CENTER_HASH;
        }
    }

    public static class JobEntry {
        public String country;
        public int date;
        public String error;
        public String job_id;

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.job_id);
            sb.append(",");
            String str = this.error;
            if (str == null) {
                str = BuildConfig.APP_CENTER_HASH;
            }
            sb.append(str);
            sb.append(",");
            sb.append(this.date);
            sb.append(",");
            sb.append(this.country);
            return sb.toString();
        }

        public static JobEntry fromString(String str) {
            String[] split = str.split(",");
            if (split.length != 4) {
                return null;
            }
            JobEntry jobEntry = new JobEntry();
            jobEntry.job_id = split[0];
            jobEntry.error = TextUtils.isEmpty(split[1]) ? null : split[1];
            jobEntry.date = Utilities.parseInt((CharSequence) split[2]).intValue();
            jobEntry.country = split[3];
            return jobEntry;
        }
    }

    public boolean hasError() {
        return this.lastErrorId > this.seenErrorId;
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
}

package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public class BirthdayController {
    private static volatile BirthdayController[] Instance = new BirthdayController[4];
    private static final Object[] lockObjects = new Object[4];
    private final int currentAccount;
    private final Set<String> hiddenDays;
    private long lastCheckDate;
    private boolean loading;
    private BirthdayState state;

    public static class BirthdayState {
        public String todayKey;
        public String tomorrowKey;
        public String yesterdayKey;
        public final ArrayList<TLRPC.User> yesterday = new ArrayList<>();
        public final ArrayList<TLRPC.User> today = new ArrayList<>();
        public final ArrayList<TLRPC.User> tomorrow = new ArrayList<>();

        private BirthdayState(String str, String str2, String str3) {
            this.yesterdayKey = str;
            this.todayKey = str2;
            this.tomorrowKey = str3;
        }

        public static BirthdayState from(TL_account.contactBirthdays contactbirthdays) {
            ArrayList<TLRPC.User> arrayList;
            ArrayList<TL_account.TL_contactBirthday> arrayList2;
            int i10;
            Calendar calendar = Calendar.getInstance();
            int i11 = calendar.get(5);
            int i12 = calendar.get(2) + 1;
            int i13 = calendar.get(1);
            calendar.add(5, -1);
            int i14 = calendar.get(5);
            int i15 = calendar.get(2) + 1;
            int i16 = calendar.get(1);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(5, 1);
            int i17 = calendar2.get(5);
            int i18 = calendar2.get(2) + 1;
            String str = i14 + "_" + i15 + "_" + i16;
            String str2 = i11 + "_" + i12 + "_" + i13;
            BirthdayState birthdayState = new BirthdayState(str, str2, i17 + "_" + i18 + "_" + calendar2.get(1));
            ArrayList<TL_account.TL_contactBirthday> arrayList3 = contactbirthdays.contacts;
            int size = arrayList3.size();
            int i19 = 0;
            while (i19 < size) {
                TL_account.TL_contactBirthday tL_contactBirthday = arrayList3.get(i19);
                i19++;
                TL_account.TL_contactBirthday tL_contactBirthday2 = tL_contactBirthday;
                TL_account.TL_birthday tL_birthday = tL_contactBirthday2.birthday;
                int i20 = tL_birthday.day;
                TLRPC.User user = null;
                if (i20 == i11 && tL_birthday.month == i12) {
                    arrayList = birthdayState.today;
                } else if (i20 == i14 && tL_birthday.month == i15) {
                    arrayList = birthdayState.yesterday;
                } else {
                    arrayList = (i20 == i17 && tL_birthday.month == i18) ? birthdayState.tomorrow : null;
                }
                if (arrayList != null) {
                    int i21 = 0;
                    while (true) {
                        if (i21 >= contactbirthdays.users.size()) {
                            arrayList2 = arrayList3;
                            i10 = i17;
                            break;
                        }
                        arrayList2 = arrayList3;
                        i10 = i17;
                        if (contactbirthdays.users.get(i21).f22527id == tL_contactBirthday2.contact_id) {
                            user = contactbirthdays.users.get(i21);
                            break;
                        }
                        i21++;
                        i17 = i10;
                        arrayList3 = arrayList2;
                    }
                    if (user != null && !UserObject.isUserSelf(user)) {
                        arrayList.add(user);
                    }
                } else {
                    arrayList2 = arrayList3;
                    i10 = i17;
                }
                i17 = i10;
                arrayList3 = arrayList2;
            }
            return birthdayState;
        }

        public boolean contains(long j10) {
            ArrayList<TLRPC.User> arrayList = this.yesterday;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.User user = arrayList.get(i10);
                i10++;
                if (user.f22527id == j10) {
                    return true;
                }
            }
            ArrayList<TLRPC.User> arrayList2 = this.today;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                TLRPC.User user2 = arrayList2.get(i11);
                i11++;
                if (user2.f22527id == j10) {
                    return true;
                }
            }
            ArrayList<TLRPC.User> arrayList3 = this.tomorrow;
            int size3 = arrayList3.size();
            int i12 = 0;
            while (i12 < size3) {
                TLRPC.User user3 = arrayList3.get(i12);
                i12++;
                if (user3.f22527id == j10) {
                    return true;
                }
            }
            return false;
        }

        public boolean isTodayEmpty() {
            return this.today.isEmpty();
        }
    }

    public static class TL_birthdays extends TLObject {
        public static final int constructor = 290452237;
        public ArrayList<TL_account.TL_contactBirthday> contacts;

        private TL_birthdays() {
            this.contacts = new ArrayList<>();
        }

        public static TL_birthdays TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return (TL_birthdays) TLObject.TLdeserialize(TL_birthdays.class, i10 != 290452237 ? null : new TL_birthdays(), inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int int32 = inputSerializedData.readInt32(z10);
            if (int32 != 481674261) {
                if (z10) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(int32)));
                }
            } else {
                int int33 = inputSerializedData.readInt32(z10);
                for (int i10 = 0; i10 < int33; i10++) {
                    this.contacts.add(TL_account.TL_contactBirthday.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10));
                }
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(290452237);
            outputSerializedData.writeInt32(481674261);
            int size = this.contacts.size();
            outputSerializedData.writeInt32(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.contacts.get(i10).serializeToStream(outputSerializedData);
            }
        }
    }

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            lockObjects[i10] = new Object();
        }
    }

    private BirthdayController(int i10) {
        BirthdayController birthdayController;
        Exception exc;
        this.currentAccount = i10;
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
        this.lastCheckDate = mainSettings.getLong("bday_check", 0L);
        String string = mainSettings.getString("bday_contacts", null);
        if (string != null) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                TL_birthdays tL_birthdaysTLdeserialize = TL_birthdays.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (tL_birthdaysTLdeserialize == null || tL_birthdaysTLdeserialize.contacts.isEmpty()) {
                    birthdayController = this;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < tL_birthdaysTLdeserialize.contacts.size(); i11++) {
                        try {
                            arrayList.add(Long.valueOf(tL_birthdaysTLdeserialize.contacts.get(i11).contact_id));
                        } catch (Exception e9) {
                            exc = e9;
                            birthdayController = this;
                            FileLog.e(exc);
                            birthdayController.hiddenDays = mainSettings.getStringSet("bday_hidden", new HashSet());
                        }
                    }
                    birthdayController = this;
                    try {
                        MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new h0(birthdayController, i10, arrayList, tL_birthdaysTLdeserialize, 0));
                    } catch (Exception e10) {
                        e = e10;
                        exc = e;
                        FileLog.e(exc);
                    }
                }
            } catch (Exception e11) {
                e = e11;
                birthdayController = this;
            }
        } else {
            birthdayController = this;
        }
        birthdayController.hiddenDays = mainSettings.getStringSet("bday_hidden", new HashSet());
    }

    public static BirthdayController getInstance(int i10) {
        BirthdayController birthdayController;
        BirthdayController birthdayController2 = Instance[i10];
        if (birthdayController2 != null) {
            return birthdayController2;
        }
        synchronized (lockObjects[i10]) {
            try {
                birthdayController = Instance[i10];
                if (birthdayController == null) {
                    BirthdayController[] birthdayControllerArr = Instance;
                    BirthdayController birthdayController3 = new BirthdayController(i10);
                    birthdayControllerArr[i10] = birthdayController3;
                    birthdayController = birthdayController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return birthdayController;
    }

    public void lambda$check$2(TLObject tLObject) {
        if (tLObject instanceof TL_account.contactBirthdays) {
            this.lastCheckDate = System.currentTimeMillis();
            TL_account.contactBirthdays contactbirthdays = (TL_account.contactBirthdays) tLObject;
            this.state = BirthdayState.from(contactbirthdays);
            MessagesController.getInstance(this.currentAccount).putUsers(contactbirthdays.users, false);
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(contactbirthdays.users, null, true, true);
            SharedPreferences.Editor editorEdit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
            editorEdit.putLong("bday_check", this.lastCheckDate);
            TL_birthdays tL_birthdays = new TL_birthdays();
            tL_birthdays.contacts = contactbirthdays.contacts;
            SerializedData serializedData = new SerializedData(tL_birthdays.getObjectSize());
            tL_birthdays.serializeToStream(serializedData);
            editorEdit.putString("bday_contacts", Utilities.bytesToHex(serializedData.toByteArray()));
            editorEdit.apply();
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumPromoUpdated, new Object[0]);
            this.loading = false;
        }
    }

    public void lambda$check$3(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new e3(12, this, tLObject));
    }

    public void lambda$new$0(TL_birthdays tL_birthdays, ArrayList arrayList) {
        TL_account.contactBirthdays contactbirthdays = new TL_account.contactBirthdays();
        contactbirthdays.contacts = tL_birthdays.contacts;
        contactbirthdays.users = arrayList;
        this.state = BirthdayState.from(contactbirthdays);
    }

    public void lambda$new$1(int i10, ArrayList arrayList, TL_birthdays tL_birthdays) {
        AndroidUtilities.runOnUIThread(new f0(this, tL_birthdays, MessagesStorage.getInstance(i10).getUsers(arrayList), 0));
    }

    public void check() {
        if (this.loading) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.lastCheckDate;
        boolean z10 = j10 == 0;
        if (!z10) {
            z10 = jCurrentTimeMillis - j10 > ((long) (BuildVars.DEBUG_PRIVATE_VERSION ? 25000 : 43200000));
        }
        if (!z10) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.lastCheckDate);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(jCurrentTimeMillis);
            z10 = (calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1)) ? false : true;
        }
        if (z10) {
            this.loading = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getBirthdays(), new g0(this, 0));
        }
    }

    public boolean contains() {
        BirthdayState state = getState();
        return (state == null || state.isTodayEmpty()) ? false : true;
    }

    public BirthdayState getState() {
        BirthdayState birthdayState = this.state;
        if (birthdayState == null || this.hiddenDays.contains(birthdayState.todayKey)) {
            return null;
        }
        return this.state;
    }

    public void hide() {
        BirthdayState birthdayState = this.state;
        if (birthdayState == null || this.hiddenDays.contains(birthdayState.todayKey)) {
            return;
        }
        this.hiddenDays.add(this.state.todayKey);
        SharedPreferences.Editor editorEdit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        editorEdit.putStringSet("bday_hidden", this.hiddenDays);
        editorEdit.apply();
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumPromoUpdated, new Object[0]);
    }

    public boolean isToday(long j10) {
        BirthdayState birthdayState = this.state;
        if (birthdayState != null && birthdayState.contains(j10)) {
            return true;
        }
        TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(j10);
        return (userFull == null || !isToday(userFull.birthday) || UserObject.areGiftsDisabled(userFull)) ? false : true;
    }

    public boolean contains(long j10) {
        BirthdayState state = getState();
        return state != null && state.contains(j10);
    }

    public static boolean isToday(TLRPC.UserFull userFull) {
        return (userFull == null || !isToday(userFull.birthday) || UserObject.areGiftsDisabled(userFull)) ? false : true;
    }

    public static boolean isToday(TL_account.TL_birthday tL_birthday) {
        if (tL_birthday == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        return tL_birthday.day == calendar.get(5) && tL_birthday.month == calendar.get(2) + 1;
    }
}

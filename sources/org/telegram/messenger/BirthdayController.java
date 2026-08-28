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
            int i9;
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(5);
            int i11 = calendar.get(2) + 1;
            int i12 = calendar.get(1);
            calendar.add(5, -1);
            int i13 = calendar.get(5);
            int i14 = calendar.get(2) + 1;
            int i15 = calendar.get(1);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(5, 1);
            int i16 = calendar2.get(5);
            int i17 = calendar2.get(2) + 1;
            String str = i13 + "_" + i14 + "_" + i15;
            String str2 = i10 + "_" + i11 + "_" + i12;
            BirthdayState birthdayState = new BirthdayState(str, str2, i16 + "_" + i17 + "_" + calendar2.get(1));
            ArrayList<TL_account.TL_contactBirthday> arrayList3 = contactbirthdays.contacts;
            int size = arrayList3.size();
            int i18 = 0;
            while (i18 < size) {
                TL_account.TL_contactBirthday tL_contactBirthday = arrayList3.get(i18);
                i18++;
                TL_account.TL_contactBirthday tL_contactBirthday2 = tL_contactBirthday;
                TL_account.TL_birthday tL_birthday = tL_contactBirthday2.birthday;
                int i19 = tL_birthday.day;
                TLRPC.User user = null;
                if (i19 == i10 && tL_birthday.month == i11) {
                    arrayList = birthdayState.today;
                } else if (i19 == i13 && tL_birthday.month == i14) {
                    arrayList = birthdayState.yesterday;
                } else if (i19 == i16 && tL_birthday.month == i17) {
                    arrayList = birthdayState.tomorrow;
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    int i20 = 0;
                    while (true) {
                        if (i20 < contactbirthdays.users.size()) {
                            arrayList2 = arrayList3;
                            i9 = i16;
                            if (contactbirthdays.users.get(i20).f22527id == tL_contactBirthday2.contact_id) {
                                user = contactbirthdays.users.get(i20);
                                break;
                            }
                            i20++;
                            i16 = i9;
                            arrayList3 = arrayList2;
                        } else {
                            arrayList2 = arrayList3;
                            i9 = i16;
                            break;
                        }
                    }
                    if (user != null && !UserObject.isUserSelf(user)) {
                        arrayList.add(user);
                    }
                } else {
                    arrayList2 = arrayList3;
                    i9 = i16;
                }
                i16 = i9;
                arrayList3 = arrayList2;
            }
            return birthdayState;
        }

        public boolean contains(long j10) {
            ArrayList<TLRPC.User> arrayList = this.yesterday;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                TLRPC.User user = arrayList.get(i9);
                i9++;
                if (user.f22527id == j10) {
                    return true;
                }
            }
            ArrayList<TLRPC.User> arrayList2 = this.today;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                TLRPC.User user2 = arrayList2.get(i10);
                i10++;
                if (user2.f22527id == j10) {
                    return true;
                }
            }
            ArrayList<TLRPC.User> arrayList3 = this.tomorrow;
            int size3 = arrayList3.size();
            int i11 = 0;
            while (i11 < size3) {
                TLRPC.User user3 = arrayList3.get(i11);
                i11++;
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

        public static TL_birthdays TLdeserialize(InputSerializedData inputSerializedData, int i9, boolean z10) {
            TL_birthdays tL_birthdays;
            if (i9 != 290452237) {
                tL_birthdays = null;
            } else {
                tL_birthdays = new TL_birthdays();
            }
            return (TL_birthdays) TLObject.TLdeserialize(TL_birthdays.class, tL_birthdays, inputSerializedData, i9, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            if (readInt32 != 481674261) {
                if (z10) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                }
                return;
            }
            int readInt322 = inputSerializedData.readInt32(z10);
            for (int i9 = 0; i9 < readInt322; i9++) {
                this.contacts.add(TL_account.TL_contactBirthday.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10));
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(290452237);
            outputSerializedData.writeInt32(481674261);
            int size = this.contacts.size();
            outputSerializedData.writeInt32(size);
            for (int i9 = 0; i9 < size; i9++) {
                this.contacts.get(i9).serializeToStream(outputSerializedData);
            }
        }
    }

    static {
        for (int i9 = 0; i9 < 4; i9++) {
            lockObjects[i9] = new Object();
        }
    }

    private BirthdayController(int i9) {
        BirthdayController birthdayController;
        Exception exc;
        TL_birthdays TLdeserialize;
        this.currentAccount = i9;
        SharedPreferences mainSettings = MessagesController.getInstance(i9).getMainSettings();
        this.lastCheckDate = mainSettings.getLong("bday_check", 0L);
        String string = mainSettings.getString("bday_contacts", null);
        if (string != null) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                TLdeserialize = TL_birthdays.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            } catch (Exception e10) {
                e = e10;
                birthdayController = this;
            }
            if (TLdeserialize != null && !TLdeserialize.contacts.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < TLdeserialize.contacts.size(); i10++) {
                    try {
                        arrayList.add(Long.valueOf(TLdeserialize.contacts.get(i10).contact_id));
                    } catch (Exception e11) {
                        exc = e11;
                        birthdayController = this;
                        FileLog.e(exc);
                        birthdayController.hiddenDays = mainSettings.getStringSet("bday_hidden", new HashSet());
                    }
                }
                birthdayController = this;
                try {
                    MessagesStorage.getInstance(i9).getStorageQueue().postRunnable(new h0(birthdayController, i9, arrayList, TLdeserialize, 0));
                } catch (Exception e12) {
                    e = e12;
                    exc = e;
                    FileLog.e(exc);
                    birthdayController.hiddenDays = mainSettings.getStringSet("bday_hidden", new HashSet());
                }
                birthdayController.hiddenDays = mainSettings.getStringSet("bday_hidden", new HashSet());
            }
        }
        birthdayController = this;
        birthdayController.hiddenDays = mainSettings.getStringSet("bday_hidden", new HashSet());
    }

    public static BirthdayController getInstance(int i9) {
        BirthdayController birthdayController;
        BirthdayController birthdayController2 = Instance[i9];
        if (birthdayController2 == null) {
            synchronized (lockObjects[i9]) {
                try {
                    birthdayController = Instance[i9];
                    if (birthdayController == null) {
                        BirthdayController[] birthdayControllerArr = Instance;
                        BirthdayController birthdayController3 = new BirthdayController(i9);
                        birthdayControllerArr[i9] = birthdayController3;
                        birthdayController = birthdayController3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return birthdayController;
        }
        return birthdayController2;
    }

    public void lambda$check$2(TLObject tLObject) {
        if (tLObject instanceof TL_account.contactBirthdays) {
            this.lastCheckDate = System.currentTimeMillis();
            TL_account.contactBirthdays contactbirthdays = (TL_account.contactBirthdays) tLObject;
            this.state = BirthdayState.from(contactbirthdays);
            MessagesController.getInstance(this.currentAccount).putUsers(contactbirthdays.users, false);
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(contactbirthdays.users, null, true, true);
            SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
            edit.putLong("bday_check", this.lastCheckDate);
            TL_birthdays tL_birthdays = new TL_birthdays();
            tL_birthdays.contacts = contactbirthdays.contacts;
            SerializedData serializedData = new SerializedData(tL_birthdays.getObjectSize());
            tL_birthdays.serializeToStream(serializedData);
            edit.putString("bday_contacts", Utilities.bytesToHex(serializedData.toByteArray()));
            edit.apply();
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumPromoUpdated, new Object[0]);
            this.loading = false;
        }
    }

    public void lambda$check$3(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new c3(12, this, tLObject));
    }

    public void lambda$new$0(TL_birthdays tL_birthdays, ArrayList arrayList) {
        TL_account.contactBirthdays contactbirthdays = new TL_account.contactBirthdays();
        contactbirthdays.contacts = tL_birthdays.contacts;
        contactbirthdays.users = arrayList;
        this.state = BirthdayState.from(contactbirthdays);
    }

    public void lambda$new$1(int i9, ArrayList arrayList, TL_birthdays tL_birthdays) {
        AndroidUtilities.runOnUIThread(new f0(this, tL_birthdays, MessagesStorage.getInstance(i9).getUsers(arrayList), 0));
    }

    public void check() {
        boolean z10;
        int i9;
        if (!this.loading) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.lastCheckDate;
            boolean z11 = false;
            if (j10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                long j11 = currentTimeMillis - j10;
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    i9 = 25000;
                } else {
                    i9 = 43200000;
                }
                if (j11 > i9) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(this.lastCheckDate);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(currentTimeMillis);
                z10 = (calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1)) ? true : true;
            }
            if (!z10) {
                return;
            }
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
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        edit.putStringSet("bday_hidden", this.hiddenDays);
        edit.apply();
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumPromoUpdated, new Object[0]);
    }

    public boolean isToday(long j10) {
        BirthdayState birthdayState = this.state;
        if (birthdayState == null || !birthdayState.contains(j10)) {
            TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(j10);
            return (userFull == null || !isToday(userFull.birthday) || UserObject.areGiftsDisabled(userFull)) ? false : true;
        }
        return true;
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

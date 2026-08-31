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
                } else if (i20 == i17 && tL_birthday.month == i18) {
                    arrayList = birthdayState.tomorrow;
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    int i21 = 0;
                    while (true) {
                        if (i21 < contactbirthdays.users.size()) {
                            arrayList2 = arrayList3;
                            i10 = i17;
                            if (contactbirthdays.users.get(i21).f20990id == tL_contactBirthday2.contact_id) {
                                user = contactbirthdays.users.get(i21);
                                break;
                            }
                            i21++;
                            i17 = i10;
                            arrayList3 = arrayList2;
                        } else {
                            arrayList2 = arrayList3;
                            i10 = i17;
                            break;
                        }
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
                if (user.f20990id == j10) {
                    return true;
                }
            }
            ArrayList<TLRPC.User> arrayList2 = this.today;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                TLRPC.User user2 = arrayList2.get(i11);
                i11++;
                if (user2.f20990id == j10) {
                    return true;
                }
            }
            ArrayList<TLRPC.User> arrayList3 = this.tomorrow;
            int size3 = arrayList3.size();
            int i12 = 0;
            while (i12 < size3) {
                TLRPC.User user3 = arrayList3.get(i12);
                i12++;
                if (user3.f20990id == j10) {
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

        public static TL_birthdays TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
            TL_birthdays tL_birthdays;
            if (i10 != 290452237) {
                tL_birthdays = null;
            } else {
                tL_birthdays = new TL_birthdays();
            }
            return (TL_birthdays) TLObject.TLdeserialize(TL_birthdays.class, tL_birthdays, inputSerializedData, i10, z4);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            if (readInt32 != 481674261) {
                if (z4) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                }
                return;
            }
            int readInt322 = inputSerializedData.readInt32(z4);
            for (int i10 = 0; i10 < readInt322; i10++) {
                this.contacts.add(TL_account.TL_contactBirthday.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4));
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
        TL_birthdays TLdeserialize;
        this.currentAccount = i10;
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
        this.lastCheckDate = mainSettings.getLong("bday_check", 0L);
        String string = mainSettings.getString("bday_contacts", null);
        if (string != null) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                TLdeserialize = TL_birthdays.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            } catch (Exception e6) {
                e = e6;
                birthdayController = this;
            }
            if (TLdeserialize != null && !TLdeserialize.contacts.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < TLdeserialize.contacts.size(); i11++) {
                    try {
                        arrayList.add(Long.valueOf(TLdeserialize.contacts.get(i11).contact_id));
                    } catch (Exception e10) {
                        exc = e10;
                        birthdayController = this;
                        FileLog.e(exc);
                        birthdayController.hiddenDays = mainSettings.getStringSet("bday_hidden", new HashSet());
                    }
                }
                birthdayController = this;
                try {
                    MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new i0(birthdayController, i10, arrayList, TLdeserialize, 0));
                } catch (Exception e11) {
                    e = e11;
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

    public static BirthdayController getInstance(int i10) {
        BirthdayController birthdayController;
        BirthdayController birthdayController2 = Instance[i10];
        if (birthdayController2 == null) {
            synchronized (lockObjects[i10]) {
                try {
                    birthdayController = Instance[i10];
                    if (birthdayController == null) {
                        BirthdayController[] birthdayControllerArr = Instance;
                        BirthdayController birthdayController3 = new BirthdayController(i10);
                        birthdayControllerArr[i10] = birthdayController3;
                        birthdayController = birthdayController3;
                    }
                } catch (Throwable th2) {
                    throw th2;
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
        AndroidUtilities.runOnUIThread(new e3(12, this, tLObject));
    }

    public void lambda$new$0(TL_birthdays tL_birthdays, ArrayList arrayList) {
        TL_account.contactBirthdays contactbirthdays = new TL_account.contactBirthdays();
        contactbirthdays.contacts = tL_birthdays.contacts;
        contactbirthdays.users = arrayList;
        this.state = BirthdayState.from(contactbirthdays);
    }

    public void lambda$new$1(int i10, ArrayList arrayList, TL_birthdays tL_birthdays) {
        AndroidUtilities.runOnUIThread(new g0(this, tL_birthdays, MessagesStorage.getInstance(i10).getUsers(arrayList), 0));
    }

    public void check() {
        boolean z4;
        int i10;
        if (!this.loading) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.lastCheckDate;
            boolean z10 = false;
            if (j10 == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                long j11 = currentTimeMillis - j10;
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    i10 = 25000;
                } else {
                    i10 = 43200000;
                }
                if (j11 > i10) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            if (!z4) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(this.lastCheckDate);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(currentTimeMillis);
                z4 = (calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1)) ? true : true;
            }
            if (!z4) {
                return;
            }
            this.loading = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getBirthdays(), new h0(this, 0));
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

package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.RequestDelegate;
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

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
    }

    public static BirthdayController getInstance(int i) {
        BirthdayController birthdayController;
        BirthdayController birthdayController2 = Instance[i];
        if (birthdayController2 != null) {
            return birthdayController2;
        }
        synchronized (lockObjects[i]) {
            try {
                birthdayController = Instance[i];
                if (birthdayController == null) {
                    BirthdayController[] birthdayControllerArr = Instance;
                    BirthdayController birthdayController3 = new BirthdayController(i);
                    birthdayControllerArr[i] = birthdayController3;
                    birthdayController = birthdayController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return birthdayController;
    }

    private BirthdayController(final int i) {
        this.currentAccount = i;
        SharedPreferences mainSettings = MessagesController.getInstance(i).getMainSettings();
        this.lastCheckDate = mainSettings.getLong("bday_check", 0L);
        String string = mainSettings.getString("bday_contacts", null);
        if (string != null) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                final TL_birthdays tL_birthdaysTLdeserialize = TL_birthdays.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (tL_birthdaysTLdeserialize != null && !tL_birthdaysTLdeserialize.contacts.isEmpty()) {
                    final ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < tL_birthdaysTLdeserialize.contacts.size(); i2++) {
                        arrayList.add(Long.valueOf(tL_birthdaysTLdeserialize.contacts.get(i2).contact_id));
                    }
                    MessagesStorage.getInstance(i).getStorageQueue().postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            BirthdayController.$r8$lambda$GqYKVXZ4oUwEwNTXAqwEYzuVGyM(this.f$0, i, arrayList, tL_birthdaysTLdeserialize);
                        }
                    });
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.hiddenDays = mainSettings.getStringSet("bday_hidden", new HashSet());
    }

    public static void $r8$lambda$GqYKVXZ4oUwEwNTXAqwEYzuVGyM(final BirthdayController birthdayController, int i, ArrayList arrayList, final TL_birthdays tL_birthdays) {
        birthdayController.getClass();
        final ArrayList<TLRPC.User> users = MessagesStorage.getInstance(i).getUsers(arrayList);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BirthdayController.$r8$lambda$MaKtOYeIJDbDHwaJLuRzxAaPMbM(this.f$0, tL_birthdays, users);
            }
        });
    }

    public static void $r8$lambda$MaKtOYeIJDbDHwaJLuRzxAaPMbM(BirthdayController birthdayController, TL_birthdays tL_birthdays, ArrayList arrayList) {
        birthdayController.getClass();
        TL_account.contactBirthdays contactbirthdays = new TL_account.contactBirthdays();
        contactbirthdays.contacts = tL_birthdays.contacts;
        contactbirthdays.users = arrayList;
        birthdayController.state = BirthdayState.from(contactbirthdays);
    }

    public void check() {
        if (this.loading) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.lastCheckDate;
        boolean z = false;
        boolean z2 = j == 0;
        if (!z2) {
            z2 = jCurrentTimeMillis - j > ((long) (BuildVars.DEBUG_PRIVATE_VERSION ? 25000 : 43200000));
        }
        if (z2) {
            z = z2;
        } else {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.lastCheckDate);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(jCurrentTimeMillis);
            if (calendar.get(5) != calendar2.get(5) || calendar.get(2) != calendar2.get(2) || calendar.get(1) != calendar2.get(1)) {
                z = true;
            }
        }
        if (z) {
            this.loading = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getBirthdays(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    BirthdayController.$r8$lambda$VIi0fx2Yg8f7ukd1ZA85xPETL7s(this.f$0, tLObject, tL_error);
                }
            });
        }
    }

    public static void $r8$lambda$VIi0fx2Yg8f7ukd1ZA85xPETL7s(final BirthdayController birthdayController, final TLObject tLObject, TLRPC.TL_error tL_error) {
        birthdayController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BirthdayController.$r8$lambda$CKtlsFTDoX4m45QWj5cE85AeTkg(this.f$0, tLObject);
            }
        });
    }

    public static void $r8$lambda$CKtlsFTDoX4m45QWj5cE85AeTkg(BirthdayController birthdayController, TLObject tLObject) {
        birthdayController.getClass();
        if (tLObject instanceof TL_account.contactBirthdays) {
            birthdayController.lastCheckDate = System.currentTimeMillis();
            TL_account.contactBirthdays contactbirthdays = (TL_account.contactBirthdays) tLObject;
            birthdayController.state = BirthdayState.from(contactbirthdays);
            MessagesController.getInstance(birthdayController.currentAccount).putUsers(contactbirthdays.users, false);
            MessagesStorage.getInstance(birthdayController.currentAccount).putUsersAndChats(contactbirthdays.users, null, true, true);
            SharedPreferences.Editor editorEdit = MessagesController.getInstance(birthdayController.currentAccount).getMainSettings().edit();
            editorEdit.putLong("bday_check", birthdayController.lastCheckDate);
            TL_birthdays tL_birthdays = new TL_birthdays();
            tL_birthdays.contacts = contactbirthdays.contacts;
            SerializedData serializedData = new SerializedData(tL_birthdays.getObjectSize());
            tL_birthdays.serializeToStream(serializedData);
            editorEdit.putString("bday_contacts", Utilities.bytesToHex(serializedData.toByteArray()));
            editorEdit.apply();
            NotificationCenter.getInstance(birthdayController.currentAccount).postNotificationName(NotificationCenter.premiumPromoUpdated, new Object[0]);
            birthdayController.loading = false;
        }
    }

    public boolean contains() {
        BirthdayState state = getState();
        return (state == null || state.isTodayEmpty()) ? false : true;
    }

    public boolean contains(long j) {
        BirthdayState state = getState();
        return state != null && state.contains(j);
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
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.premiumPromoUpdated, new Object[0]);
    }

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
            int i;
            Calendar calendar = Calendar.getInstance();
            int i2 = calendar.get(5);
            int i3 = calendar.get(2) + 1;
            int i4 = calendar.get(1);
            calendar.add(5, -1);
            int i5 = calendar.get(5);
            int i6 = calendar.get(2) + 1;
            int i7 = calendar.get(1);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(5, 1);
            int i8 = calendar2.get(5);
            int i9 = calendar2.get(2) + 1;
            String str = i5 + "_" + i6 + "_" + i7;
            String str2 = i2 + "_" + i3 + "_" + i4;
            BirthdayState birthdayState = new BirthdayState(str, str2, i8 + "_" + i9 + "_" + calendar2.get(1));
            ArrayList<TL_account.TL_contactBirthday> arrayList3 = contactbirthdays.contacts;
            int size = arrayList3.size();
            int i10 = 0;
            while (i10 < size) {
                TL_account.TL_contactBirthday tL_contactBirthday = arrayList3.get(i10);
                i10++;
                TL_account.TL_contactBirthday tL_contactBirthday2 = tL_contactBirthday;
                TL_account.TL_birthday tL_birthday = tL_contactBirthday2.birthday;
                int i11 = tL_birthday.day;
                TLRPC.User user = null;
                if (i11 == i2 && tL_birthday.month == i3) {
                    arrayList = birthdayState.today;
                } else if (i11 == i5 && tL_birthday.month == i6) {
                    arrayList = birthdayState.yesterday;
                } else {
                    arrayList = (i11 == i8 && tL_birthday.month == i9) ? birthdayState.tomorrow : null;
                }
                if (arrayList != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= contactbirthdays.users.size()) {
                            arrayList2 = arrayList3;
                            i = i8;
                            break;
                        }
                        arrayList2 = arrayList3;
                        i = i8;
                        if (contactbirthdays.users.get(i12).id == tL_contactBirthday2.contact_id) {
                            user = contactbirthdays.users.get(i12);
                            break;
                        }
                        i12++;
                        i8 = i;
                        arrayList3 = arrayList2;
                    }
                    if (user != null && !UserObject.isUserSelf(user)) {
                        arrayList.add(user);
                    }
                } else {
                    arrayList2 = arrayList3;
                    i = i8;
                }
                i8 = i;
                arrayList3 = arrayList2;
            }
            return birthdayState;
        }

        public boolean isTodayEmpty() {
            return this.today.isEmpty();
        }

        public boolean contains(long j) {
            ArrayList<TLRPC.User> arrayList = this.yesterday;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TLRPC.User user = arrayList.get(i);
                i++;
                if (user.id == j) {
                    return true;
                }
            }
            ArrayList<TLRPC.User> arrayList2 = this.today;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                TLRPC.User user2 = arrayList2.get(i2);
                i2++;
                if (user2.id == j) {
                    return true;
                }
            }
            ArrayList<TLRPC.User> arrayList3 = this.tomorrow;
            int size3 = arrayList3.size();
            int i3 = 0;
            while (i3 < size3) {
                TLRPC.User user3 = arrayList3.get(i3);
                i3++;
                if (user3.id == j) {
                    return true;
                }
            }
            return false;
        }
    }

    static class TL_birthdays extends TLObject {
        public static final int constructor = 290452237;
        public ArrayList<TL_account.TL_contactBirthday> contacts;

        private TL_birthdays() {
            this.contacts = new ArrayList<>();
        }

        public static TL_birthdays TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (TL_birthdays) TLObject.TLdeserialize(TL_birthdays.class, i != 290452237 ? null : new TL_birthdays(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            if (int32 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(int32)));
                }
            } else {
                int int33 = inputSerializedData.readInt32(z);
                for (int i = 0; i < int33; i++) {
                    this.contacts.add(TL_account.TL_contactBirthday.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z));
                }
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(290452237);
            outputSerializedData.writeInt32(481674261);
            int size = this.contacts.size();
            outputSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                this.contacts.get(i).serializeToStream(outputSerializedData);
            }
        }
    }

    public boolean isToday(long j) {
        BirthdayState birthdayState = this.state;
        if (birthdayState != null && birthdayState.contains(j)) {
            return true;
        }
        TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(j);
        return (userFull == null || !isToday(userFull.birthday) || UserObject.areGiftsDisabled(userFull)) ? false : true;
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

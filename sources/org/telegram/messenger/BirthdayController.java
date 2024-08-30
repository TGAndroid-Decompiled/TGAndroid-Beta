package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_birthday;
import org.telegram.tgnet.TLRPC$TL_contactBirthday;
import org.telegram.tgnet.TLRPC$TL_contacts_contactBirthdays;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserFull;

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
        public final ArrayList<TLRPC$User> yesterday = new ArrayList<>();
        public final ArrayList<TLRPC$User> today = new ArrayList<>();
        public final ArrayList<TLRPC$User> tomorrow = new ArrayList<>();

        private BirthdayState(String str, String str2, String str3) {
            this.yesterdayKey = str;
            this.todayKey = str2;
            this.tomorrowKey = str3;
        }

        public static BirthdayState from(TLRPC$TL_contacts_contactBirthdays tLRPC$TL_contacts_contactBirthdays) {
            Iterator it;
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
            Iterator it2 = tLRPC$TL_contacts_contactBirthdays.contacts.iterator();
            while (it2.hasNext()) {
                TLRPC$TL_contactBirthday tLRPC$TL_contactBirthday = (TLRPC$TL_contactBirthday) it2.next();
                TLRPC$TL_birthday tLRPC$TL_birthday = tLRPC$TL_contactBirthday.birthday;
                int i10 = tLRPC$TL_birthday.day;
                TLRPC$User tLRPC$User = null;
                ArrayList<TLRPC$User> arrayList = (i10 == i2 && tLRPC$TL_birthday.month == i3) ? birthdayState.today : (i10 == i5 && tLRPC$TL_birthday.month == i6) ? birthdayState.yesterday : (i10 == i8 && tLRPC$TL_birthday.month == i9) ? birthdayState.tomorrow : null;
                if (arrayList != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= tLRPC$TL_contacts_contactBirthdays.users.size()) {
                            it = it2;
                            i = i8;
                            break;
                        }
                        it = it2;
                        i = i8;
                        if (((TLRPC$User) tLRPC$TL_contacts_contactBirthdays.users.get(i11)).id == tLRPC$TL_contactBirthday.contact_id) {
                            tLRPC$User = (TLRPC$User) tLRPC$TL_contacts_contactBirthdays.users.get(i11);
                            break;
                        }
                        i11++;
                        i8 = i;
                        it2 = it;
                    }
                    if (tLRPC$User != null && !UserObject.isUserSelf(tLRPC$User)) {
                        arrayList.add(tLRPC$User);
                    }
                    i8 = i;
                    it2 = it;
                }
            }
            return birthdayState;
        }

        public boolean contains(long j) {
            Iterator<TLRPC$User> it = this.yesterday.iterator();
            while (it.hasNext()) {
                if (it.next().id == j) {
                    return true;
                }
            }
            Iterator<TLRPC$User> it2 = this.today.iterator();
            while (it2.hasNext()) {
                if (it2.next().id == j) {
                    return true;
                }
            }
            Iterator<TLRPC$User> it3 = this.tomorrow.iterator();
            while (it3.hasNext()) {
                if (it3.next().id == j) {
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
        public ArrayList<TLRPC$TL_contactBirthday> contacts;

        private TL_birthdays() {
            this.contacts = new ArrayList<>();
        }

        public static TL_birthdays TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
            if (i != 290452237) {
                if (z) {
                    throw new RuntimeException(String.format("can't parse magic %x in TL_birthdays", Integer.valueOf(i)));
                }
                return null;
            }
            TL_birthdays tL_birthdays = new TL_birthdays();
            tL_birthdays.readParams(abstractSerializedData, z);
            return tL_birthdays;
        }

        @Override
        public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
            int readInt32 = abstractSerializedData.readInt32(z);
            if (readInt32 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                }
            } else {
                int readInt322 = abstractSerializedData.readInt32(z);
                for (int i = 0; i < readInt322; i++) {
                    this.contacts.add(TLRPC$TL_contactBirthday.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z));
                }
            }
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(290452237);
            abstractSerializedData.writeInt32(481674261);
            int size = this.contacts.size();
            abstractSerializedData.writeInt32(size);
            for (int i = 0; i < size; i++) {
                this.contacts.get(i).serializeToStream(abstractSerializedData);
            }
        }
    }

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
    }

    private BirthdayController(final int i) {
        this.currentAccount = i;
        SharedPreferences mainSettings = MessagesController.getInstance(i).getMainSettings();
        this.lastCheckDate = mainSettings.getLong("bday_check", 0L);
        String string = mainSettings.getString("bday_contacts", null);
        if (string != null) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                final TL_birthdays TLdeserialize = TL_birthdays.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                if (TLdeserialize != null && !TLdeserialize.contacts.isEmpty()) {
                    final ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < TLdeserialize.contacts.size(); i2++) {
                        arrayList.add(Long.valueOf(TLdeserialize.contacts.get(i2).contact_id));
                    }
                    MessagesStorage.getInstance(i).getStorageQueue().postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            BirthdayController.this.lambda$new$1(i, arrayList, TLdeserialize);
                        }
                    });
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.hiddenDays = mainSettings.getStringSet("bday_hidden", new HashSet());
    }

    public static BirthdayController getInstance(int i) {
        BirthdayController birthdayController = Instance[i];
        if (birthdayController == null) {
            synchronized (lockObjects[i]) {
                try {
                    birthdayController = Instance[i];
                    if (birthdayController == null) {
                        BirthdayController[] birthdayControllerArr = Instance;
                        BirthdayController birthdayController2 = new BirthdayController(i);
                        birthdayControllerArr[i] = birthdayController2;
                        birthdayController = birthdayController2;
                    }
                } finally {
                }
            }
        }
        return birthdayController;
    }

    public static boolean isToday(TLRPC$TL_birthday tLRPC$TL_birthday) {
        if (tLRPC$TL_birthday == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        return tLRPC$TL_birthday.day == calendar.get(5) && tLRPC$TL_birthday.month == calendar.get(2) + 1;
    }

    public static boolean isToday(TLRPC$UserFull tLRPC$UserFull) {
        if (tLRPC$UserFull == null) {
            return false;
        }
        return isToday(tLRPC$UserFull.birthday);
    }

    public void lambda$check$2(TLObject tLObject) {
        if (tLObject instanceof TLRPC$TL_contacts_contactBirthdays) {
            this.lastCheckDate = System.currentTimeMillis();
            TLRPC$TL_contacts_contactBirthdays tLRPC$TL_contacts_contactBirthdays = (TLRPC$TL_contacts_contactBirthdays) tLObject;
            this.state = BirthdayState.from(tLRPC$TL_contacts_contactBirthdays);
            MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$TL_contacts_contactBirthdays.users, false);
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(tLRPC$TL_contacts_contactBirthdays.users, null, true, true);
            SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
            edit.putLong("bday_check", this.lastCheckDate);
            TL_birthdays tL_birthdays = new TL_birthdays();
            tL_birthdays.contacts = tLRPC$TL_contacts_contactBirthdays.contacts;
            SerializedData serializedData = new SerializedData(tL_birthdays.getObjectSize());
            tL_birthdays.serializeToStream(serializedData);
            edit.putString("bday_contacts", Utilities.bytesToHex(serializedData.toByteArray()));
            edit.apply();
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumPromoUpdated, new Object[0]);
            this.loading = false;
        }
    }

    public void lambda$check$3(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BirthdayController.this.lambda$check$2(tLObject);
            }
        });
    }

    public void lambda$new$0(TL_birthdays tL_birthdays, ArrayList arrayList) {
        TLRPC$TL_contacts_contactBirthdays tLRPC$TL_contacts_contactBirthdays = new TLRPC$TL_contacts_contactBirthdays();
        tLRPC$TL_contacts_contactBirthdays.contacts = tL_birthdays.contacts;
        tLRPC$TL_contacts_contactBirthdays.users = arrayList;
        this.state = BirthdayState.from(tLRPC$TL_contacts_contactBirthdays);
    }

    public void lambda$new$1(int i, ArrayList arrayList, final TL_birthdays tL_birthdays) {
        final ArrayList<TLRPC$User> users = MessagesStorage.getInstance(i).getUsers(arrayList);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BirthdayController.this.lambda$new$0(tL_birthdays, users);
            }
        });
    }

    public void check() {
        if (this.loading) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.lastCheckDate;
        boolean z = false;
        boolean z2 = j == 0;
        if (!z2) {
            z2 = currentTimeMillis - j > ((long) (BuildVars.DEBUG_PRIVATE_VERSION ? 25000 : 43200000));
        }
        if (z2) {
            z = z2;
        } else {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.lastCheckDate);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(currentTimeMillis);
            if (calendar.get(5) != calendar2.get(5) || calendar.get(2) != calendar2.get(2) || calendar.get(1) != calendar2.get(1)) {
                z = true;
            }
        }
        if (z) {
            this.loading = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLObject() {
                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z3) {
                    return TLRPC$TL_contacts_contactBirthdays.TLdeserialize(abstractSerializedData, i, z3);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(-621959068);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    BirthdayController.this.lambda$check$3(tLObject, tLRPC$TL_error);
                }
            });
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
}

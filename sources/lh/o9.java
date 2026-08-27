package lh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class o9 {

    public final int f16489a;

    public final ArrayList f16490b;

    public final ArrayList f16491c;
    public final HashMap d;

    public final ArrayList f16492e;

    public final ArrayList f16493f;

    public o9(int i10, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.f16490b = arrayList2;
        this.f16491c = new ArrayList();
        this.d = new HashMap();
        this.f16492e = new ArrayList();
        this.f16493f = new ArrayList();
        int i11 = 0;
        if (a(arrayList, TLRPC.TL_privacyValueAllowAll.class) != null) {
            this.f16489a = 4;
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
            TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = (TLRPC.TL_privacyValueDisallowUsers) a(arrayList, TLRPC.TL_privacyValueDisallowUsers.class);
            if (tL_privacyValueDisallowUsers != null) {
                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                MessagesController messagesController = MessagesController.getInstance(i10);
                while (i11 < tL_privacyValueDisallowUsers.users.size()) {
                    Long l10 = tL_privacyValueDisallowUsers.users.get(i11);
                    TLRPC.InputUser inputUser = messagesController.getInputUser(l10.longValue());
                    if (!(inputUser instanceof TLRPC.TL_inputUserEmpty)) {
                        tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                        this.f16491c.add(l10);
                        this.f16492e.add(inputUser);
                    }
                    i11++;
                }
                this.f16490b.add(tL_inputPrivacyValueDisallowUsers);
                return;
            }
            return;
        }
        if (a(arrayList, TLRPC.TL_privacyValueAllowCloseFriends.class) != null) {
            this.f16489a = 1;
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
            return;
        }
        TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = (TLRPC.TL_privacyValueAllowUsers) a(arrayList, TLRPC.TL_privacyValueAllowUsers.class);
        if (tL_privacyValueAllowUsers != null) {
            this.f16489a = 3;
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
            MessagesController messagesController2 = MessagesController.getInstance(i10);
            while (i11 < tL_privacyValueAllowUsers.users.size()) {
                Long l11 = tL_privacyValueAllowUsers.users.get(i11);
                TLRPC.InputUser inputUser2 = messagesController2.getInputUser(l11.longValue());
                if (inputUser2 != null && !(inputUser2 instanceof TLRPC.TL_inputUserEmpty)) {
                    tL_inputPrivacyValueAllowUsers.users.add(inputUser2);
                    this.f16491c.add(l11);
                    this.f16492e.add(inputUser2);
                }
                i11++;
            }
            this.f16490b.add(tL_inputPrivacyValueAllowUsers);
            return;
        }
        if (a(arrayList, TLRPC.TL_privacyValueAllowContacts.class) == null) {
            this.f16489a = 4;
            return;
        }
        this.f16489a = 2;
        arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
        TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers2 = (TLRPC.TL_privacyValueDisallowUsers) a(arrayList, TLRPC.TL_privacyValueDisallowUsers.class);
        if (tL_privacyValueDisallowUsers2 != null) {
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers2 = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            MessagesController messagesController3 = MessagesController.getInstance(i10);
            while (i11 < tL_privacyValueDisallowUsers2.users.size()) {
                Long l12 = tL_privacyValueDisallowUsers2.users.get(i11);
                TLRPC.InputUser inputUser3 = messagesController3.getInputUser(l12.longValue());
                if (!(inputUser3 instanceof TLRPC.TL_inputUserEmpty)) {
                    tL_inputPrivacyValueDisallowUsers2.users.add(inputUser3);
                    this.f16491c.add(l12);
                    this.f16492e.add(inputUser3);
                }
                i11++;
            }
            this.f16490b.add(tL_inputPrivacyValueDisallowUsers2);
        }
    }

    public static TLRPC.PrivacyRule a(ArrayList arrayList, Class cls) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) arrayList.get(i10);
            if (cls.isInstance(privacyRule)) {
                return privacyRule;
            }
        }
        return null;
    }

    public final boolean b(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        ArrayList arrayList = this.f16491c;
        int i10 = this.f16489a;
        if (i10 == 4) {
            return !arrayList.contains(Long.valueOf(user.f22527id));
        }
        if (i10 == 2) {
            return !arrayList.contains(Long.valueOf(user.f22527id)) && user.contact;
        }
        if (i10 == 1) {
            return user.close_friend;
        }
        if (i10 == 3) {
            if (arrayList.contains(Long.valueOf(user.f22527id))) {
                return true;
            }
            Iterator it = this.d.values().iterator();
            while (it.hasNext()) {
                if (((ArrayList) it.next()).contains(Long.valueOf(user.f22527id))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        TLRPC.InputPrivacyRule inputPrivacyRule;
        int size;
        ArrayList arrayList = this.f16493f;
        if (!arrayList.isEmpty()) {
            return LocaleController.formatPluralString("StoryPrivacyRecipients", arrayList.size(), new Object[0]);
        }
        ArrayList arrayList2 = this.f16490b;
        if (arrayList2.isEmpty()) {
            return LocaleController.getString(R.string.StoryPrivacyNone);
        }
        TLRPC.InputPrivacyRule inputPrivacyRule2 = (TLRPC.InputPrivacyRule) arrayList2.get(0);
        int i10 = this.f16489a;
        if (i10 == 4) {
            inputPrivacyRule = arrayList2.size() >= 2 ? (TLRPC.InputPrivacyRule) arrayList2.get(1) : null;
            return (!(inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) || (size = ((TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule).users.size()) <= 0) ? LocaleController.getString(R.string.StoryPrivacyEveryone) : LocaleController.formatPluralString("StoryPrivacyEveryoneExclude", size, new Object[0]);
        }
        if (i10 == 1) {
            return LocaleController.getString(R.string.StoryPrivacyCloseFriends);
        }
        if (i10 == 3 && (inputPrivacyRule2 instanceof TLRPC.TL_inputPrivacyValueAllowUsers)) {
            return LocaleController.formatPluralString("StoryPrivacyContacts", ((TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule2).users.size(), new Object[0]);
        }
        if (i10 == 2) {
            inputPrivacyRule = arrayList2.size() >= 2 ? (TLRPC.InputPrivacyRule) arrayList2.get(1) : null;
            if (!(inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers)) {
                return LocaleController.getString(R.string.StoryPrivacyAllContacts);
            }
            int size2 = ((TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule).users.size();
            return size2 > 0 ? LocaleController.formatPluralString("StoryPrivacyContactsExclude", size2, new Object[0]) : LocaleController.getString(R.string.StoryPrivacyAllContacts);
        }
        if (i10 != 0) {
            return LocaleController.getString(R.string.StoryPrivacyNone);
        }
        if (!(inputPrivacyRule2 instanceof TLRPC.TL_inputPrivacyValueAllowUsers)) {
            return LocaleController.getString(R.string.StoryPrivacyNone);
        }
        int size3 = ((TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule2).users.size();
        return size3 <= 0 ? LocaleController.getString(R.string.StoryPrivacyNone) : LocaleController.formatPluralString("StoryPrivacyContacts", size3, new Object[0]);
    }

    public o9() {
        ArrayList arrayList = new ArrayList();
        this.f16490b = arrayList;
        this.f16491c = new ArrayList();
        this.d = new HashMap();
        this.f16492e = new ArrayList();
        this.f16493f = new ArrayList();
        this.f16489a = 4;
        arrayList.add(new TLRPC.TL_inputPrivacyValueAllowAll());
    }

    public o9(int i10, int i11, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.f16490b = arrayList2;
        this.f16491c = new ArrayList();
        this.d = new HashMap();
        this.f16492e = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.f16493f = arrayList3;
        this.f16489a = i10;
        int i12 = 0;
        if (i10 == 4) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
            if (i11 < 0 || arrayList == null || arrayList.isEmpty()) {
                return;
            }
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            while (i12 < arrayList.size()) {
                Long l10 = (Long) arrayList.get(i12);
                long jLongValue = l10.longValue();
                this.f16491c.add(l10);
                TLRPC.InputUser inputUser = MessagesController.getInstance(i11).getInputUser(jLongValue);
                if (inputUser != null && !(inputUser instanceof TLRPC.TL_inputUserEmpty)) {
                    tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                    this.f16492e.add(inputUser);
                }
                i12++;
            }
            this.f16490b.add(tL_inputPrivacyValueDisallowUsers);
            return;
        }
        if (i10 == 1) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
            return;
        }
        if (i10 == 2) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
            if (i11 < 0 || arrayList == null || arrayList.isEmpty()) {
                return;
            }
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers2 = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            while (i12 < arrayList.size()) {
                Long l11 = (Long) arrayList.get(i12);
                long jLongValue2 = l11.longValue();
                this.f16491c.add(l11);
                TLRPC.InputUser inputUser2 = MessagesController.getInstance(i11).getInputUser(jLongValue2);
                if (inputUser2 != null && !(inputUser2 instanceof TLRPC.TL_inputUserEmpty)) {
                    tL_inputPrivacyValueDisallowUsers2.users.add(inputUser2);
                    this.f16492e.add(inputUser2);
                }
                i12++;
            }
            this.f16490b.add(tL_inputPrivacyValueDisallowUsers2);
            return;
        }
        if (i10 != 3) {
            if (i10 != 5 || arrayList == null) {
                return;
            }
            arrayList3.addAll(arrayList);
            return;
        }
        TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
        if (i11 >= 0 && arrayList != null && !arrayList.isEmpty()) {
            while (i12 < arrayList.size()) {
                Long l12 = (Long) arrayList.get(i12);
                long jLongValue3 = l12.longValue();
                this.f16491c.add(l12);
                TLRPC.InputUser inputUser3 = MessagesController.getInstance(i11).getInputUser(jLongValue3);
                if (inputUser3 != null && !(inputUser3 instanceof TLRPC.TL_inputUserEmpty)) {
                    tL_inputPrivacyValueAllowUsers.users.add(inputUser3);
                    this.f16492e.add(inputUser3);
                }
                i12++;
            }
        }
        this.f16490b.add(tL_inputPrivacyValueAllowUsers);
    }

    public o9(int i10, ArrayList arrayList, int i11) {
        ArrayList arrayList2 = new ArrayList();
        this.f16490b = arrayList2;
        this.f16491c = new ArrayList();
        this.d = new HashMap();
        this.f16492e = new ArrayList();
        this.f16493f = new ArrayList();
        this.f16489a = i10;
        int i12 = 0;
        if (i10 == 4) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
            if (arrayList.isEmpty()) {
                return;
            }
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            while (i12 < arrayList.size()) {
                TLRPC.InputUser inputUser = (TLRPC.InputUser) arrayList.get(i12);
                if (inputUser != null) {
                    tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                    this.f16491c.add(Long.valueOf(inputUser.user_id));
                    this.f16492e.add(inputUser);
                }
                i12++;
            }
            this.f16490b.add(tL_inputPrivacyValueDisallowUsers);
            return;
        }
        if (i10 == 1) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
            return;
        }
        if (i10 == 2) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
            if (arrayList.isEmpty()) {
                return;
            }
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers2 = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            while (i12 < arrayList.size()) {
                TLRPC.InputUser inputUser2 = (TLRPC.InputUser) arrayList.get(i12);
                if (inputUser2 != null) {
                    tL_inputPrivacyValueDisallowUsers2.users.add(inputUser2);
                    this.f16491c.add(Long.valueOf(inputUser2.user_id));
                    this.f16492e.add(inputUser2);
                }
                i12++;
            }
            this.f16490b.add(tL_inputPrivacyValueDisallowUsers2);
            return;
        }
        if (i10 != 3) {
            if (i10 == 5) {
                while (i12 < arrayList.size()) {
                    TLRPC.InputUser inputUser3 = (TLRPC.InputUser) arrayList.get(i12);
                    if (inputUser3 != null) {
                        this.f16493f.add(Long.valueOf(inputUser3.user_id));
                    }
                    i12++;
                }
                return;
            }
            return;
        }
        TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
        if (!arrayList.isEmpty()) {
            while (i12 < arrayList.size()) {
                TLRPC.InputUser inputUser4 = (TLRPC.InputUser) arrayList.get(i12);
                if (inputUser4 != null) {
                    tL_inputPrivacyValueAllowUsers.users.add(inputUser4);
                    this.f16491c.add(Long.valueOf(inputUser4.user_id));
                    this.f16492e.add(inputUser4);
                }
                i12++;
            }
        }
        this.f16490b.add(tL_inputPrivacyValueAllowUsers);
    }
}

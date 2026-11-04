package gi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
public final class r8 {
    public final int f13526a;
    public final ArrayList f13527b;
    public final ArrayList f13528c;
    public final HashMap d;
    public final ArrayList f13529e;
    public final ArrayList f13530f;

    public r8(int i3, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.f13527b = arrayList2;
        this.f13528c = new ArrayList();
        this.d = new HashMap();
        this.f13529e = new ArrayList();
        this.f13530f = new ArrayList();
        int i10 = 0;
        if (a(arrayList, TLRPC.TL_privacyValueAllowAll.class) != null) {
            this.f13526a = 4;
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
            TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = (TLRPC.TL_privacyValueDisallowUsers) a(arrayList, TLRPC.TL_privacyValueDisallowUsers.class);
            if (tL_privacyValueDisallowUsers != null) {
                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                hp s12 = hp.s1(i3);
                while (i10 < tL_privacyValueDisallowUsers.users.size()) {
                    Long l10 = tL_privacyValueDisallowUsers.users.get(i10);
                    l10.getClass();
                    TLRPC.InputUser q12 = s12.q1(s12.a2(l10));
                    if (!(q12 instanceof TLRPC.TL_inputUserEmpty)) {
                        tL_inputPrivacyValueDisallowUsers.users.add(q12);
                        this.f13528c.add(l10);
                        this.f13529e.add(q12);
                    }
                    i10++;
                }
                this.f13527b.add(tL_inputPrivacyValueDisallowUsers);
            }
        } else if (a(arrayList, TLRPC.TL_privacyValueAllowCloseFriends.class) != null) {
            this.f13526a = 1;
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
        } else {
            TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = (TLRPC.TL_privacyValueAllowUsers) a(arrayList, TLRPC.TL_privacyValueAllowUsers.class);
            if (tL_privacyValueAllowUsers != null) {
                this.f13526a = 3;
                TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                hp s13 = hp.s1(i3);
                while (i10 < tL_privacyValueAllowUsers.users.size()) {
                    Long l11 = tL_privacyValueAllowUsers.users.get(i10);
                    l11.getClass();
                    TLRPC.InputUser q13 = s13.q1(s13.a2(l11));
                    if (!(q13 instanceof TLRPC.TL_inputUserEmpty)) {
                        tL_inputPrivacyValueAllowUsers.users.add(q13);
                        this.f13528c.add(l11);
                        this.f13529e.add(q13);
                    }
                    i10++;
                }
                this.f13527b.add(tL_inputPrivacyValueAllowUsers);
            } else if (a(arrayList, TLRPC.TL_privacyValueAllowContacts.class) != null) {
                this.f13526a = 2;
                arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers2 = (TLRPC.TL_privacyValueDisallowUsers) a(arrayList, TLRPC.TL_privacyValueDisallowUsers.class);
                if (tL_privacyValueDisallowUsers2 != null) {
                    TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers2 = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                    hp s14 = hp.s1(i3);
                    while (i10 < tL_privacyValueDisallowUsers2.users.size()) {
                        Long l12 = tL_privacyValueDisallowUsers2.users.get(i10);
                        l12.getClass();
                        TLRPC.InputUser q14 = s14.q1(s14.a2(l12));
                        if (!(q14 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueDisallowUsers2.users.add(q14);
                            this.f13528c.add(l12);
                            this.f13529e.add(q14);
                        }
                        i10++;
                    }
                    this.f13527b.add(tL_inputPrivacyValueDisallowUsers2);
                }
            } else {
                this.f13526a = 4;
            }
        }
    }

    public static TLRPC.PrivacyRule a(ArrayList arrayList, Class cls) {
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) arrayList.get(i3);
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
        ArrayList arrayList = this.f13528c;
        int i3 = this.f13526a;
        if (i3 == 4) {
            return !arrayList.contains(Long.valueOf(user.f27150id));
        }
        if (i3 == 2) {
            if (arrayList.contains(Long.valueOf(user.f27150id)) || !user.contact) {
                return false;
            }
            return true;
        } else if (i3 == 1) {
            return user.close_friend;
        } else {
            if (i3 == 3) {
                if (arrayList.contains(Long.valueOf(user.f27150id))) {
                    return true;
                }
                for (ArrayList arrayList2 : this.d.values()) {
                    if (arrayList2.contains(Long.valueOf(user.f27150id))) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public final String toString() {
        TLRPC.InputPrivacyRule inputPrivacyRule;
        TLRPC.InputPrivacyRule inputPrivacyRule2;
        int size;
        ArrayList arrayList = this.f13530f;
        if (!arrayList.isEmpty()) {
            return bd.G(arrayList.size(), "StoryPrivacyRecipients", new Object[0]);
        }
        ArrayList arrayList2 = this.f13527b;
        if (arrayList2.isEmpty()) {
            return bd.M0(2131744543, null);
        }
        TLRPC.InputPrivacyRule inputPrivacyRule3 = (TLRPC.InputPrivacyRule) arrayList2.get(0);
        int i3 = this.f13526a;
        if (i3 == 4) {
            if (arrayList2.size() >= 2) {
                inputPrivacyRule2 = (TLRPC.InputPrivacyRule) arrayList2.get(1);
            } else {
                inputPrivacyRule2 = null;
            }
            if ((inputPrivacyRule2 instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) && (size = ((TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule2).users.size()) > 0) {
                return bd.G(size, "StoryPrivacyEveryoneExclude", new Object[0]);
            }
            return bd.M0(2131744555, null);
        } else if (i3 == 1) {
            return bd.M0(2131744562, null);
        } else {
            if (i3 == 3 && (inputPrivacyRule3 instanceof TLRPC.TL_inputPrivacyValueAllowUsers)) {
                return bd.G(((TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule3).users.size(), "StoryPrivacyContacts", new Object[0]);
            }
            if (i3 == 2) {
                if (arrayList2.size() >= 2) {
                    inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList2.get(1);
                } else {
                    inputPrivacyRule = null;
                }
                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) {
                    int size2 = ((TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule).users.size();
                    if (size2 > 0) {
                        return bd.G(size2, "StoryPrivacyContactsExclude", new Object[0]);
                    }
                    return bd.M0(2131744570, null);
                }
                return bd.M0(2131744570, null);
            } else if (i3 == 0) {
                if (inputPrivacyRule3 instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                    int size3 = ((TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule3).users.size();
                    if (size3 <= 0) {
                        return bd.M0(2131744543, null);
                    }
                    return bd.G(size3, "StoryPrivacyContacts", new Object[0]);
                }
                return bd.M0(2131744543, null);
            } else {
                return bd.M0(2131744543, null);
            }
        }
    }

    public r8() {
        ArrayList arrayList = new ArrayList();
        this.f13527b = arrayList;
        this.f13528c = new ArrayList();
        this.d = new HashMap();
        this.f13529e = new ArrayList();
        this.f13530f = new ArrayList();
        this.f13526a = 4;
        arrayList.add(new TLRPC.TL_inputPrivacyValueAllowAll());
    }

    public r8(int i3, int i10, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.f13527b = arrayList2;
        this.f13528c = new ArrayList();
        this.d = new HashMap();
        this.f13529e = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.f13530f = arrayList3;
        this.f13526a = i3;
        int i11 = 0;
        if (i3 == 4) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
            if (i10 < 0 || arrayList == null || arrayList.isEmpty()) {
                return;
            }
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            while (i11 < arrayList.size()) {
                Long l10 = (Long) arrayList.get(i11);
                l10.longValue();
                this.f13528c.add(l10);
                hp s12 = hp.s1(i10);
                TLRPC.InputUser q12 = s12.q1(s12.a2(l10));
                if (!(q12 instanceof TLRPC.TL_inputUserEmpty)) {
                    tL_inputPrivacyValueDisallowUsers.users.add(q12);
                    this.f13529e.add(q12);
                }
                i11++;
            }
            this.f13527b.add(tL_inputPrivacyValueDisallowUsers);
        } else if (i3 == 1) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
        } else if (i3 == 2) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
            if (i10 < 0 || arrayList == null || arrayList.isEmpty()) {
                return;
            }
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers2 = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            while (i11 < arrayList.size()) {
                Long l11 = (Long) arrayList.get(i11);
                l11.longValue();
                this.f13528c.add(l11);
                hp s13 = hp.s1(i10);
                TLRPC.InputUser q13 = s13.q1(s13.a2(l11));
                if (!(q13 instanceof TLRPC.TL_inputUserEmpty)) {
                    tL_inputPrivacyValueDisallowUsers2.users.add(q13);
                    this.f13529e.add(q13);
                }
                i11++;
            }
            this.f13527b.add(tL_inputPrivacyValueDisallowUsers2);
        } else if (i3 != 3) {
            if (i3 != 5 || arrayList == null) {
                return;
            }
            arrayList3.addAll(arrayList);
        } else {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
            if (i10 >= 0 && arrayList != null && !arrayList.isEmpty()) {
                while (i11 < arrayList.size()) {
                    Long l12 = (Long) arrayList.get(i11);
                    l12.longValue();
                    this.f13528c.add(l12);
                    hp s14 = hp.s1(i10);
                    TLRPC.InputUser q14 = s14.q1(s14.a2(l12));
                    if (!(q14 instanceof TLRPC.TL_inputUserEmpty)) {
                        tL_inputPrivacyValueAllowUsers.users.add(q14);
                        this.f13529e.add(q14);
                    }
                    i11++;
                }
            }
            this.f13527b.add(tL_inputPrivacyValueAllowUsers);
        }
    }

    public r8(int i3, ArrayList arrayList, int i10) {
        ArrayList arrayList2 = new ArrayList();
        this.f13527b = arrayList2;
        this.f13528c = new ArrayList();
        this.d = new HashMap();
        this.f13529e = new ArrayList();
        this.f13530f = new ArrayList();
        this.f13526a = i3;
        int i11 = 0;
        if (i3 == 4) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
            if (arrayList.isEmpty()) {
                return;
            }
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            while (i11 < arrayList.size()) {
                TLRPC.InputUser inputUser = (TLRPC.InputUser) arrayList.get(i11);
                if (inputUser != null) {
                    tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                    this.f13528c.add(Long.valueOf(inputUser.user_id));
                    this.f13529e.add(inputUser);
                }
                i11++;
            }
            this.f13527b.add(tL_inputPrivacyValueDisallowUsers);
        } else if (i3 == 1) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
        } else if (i3 == 2) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
            if (arrayList.isEmpty()) {
                return;
            }
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers2 = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            while (i11 < arrayList.size()) {
                TLRPC.InputUser inputUser2 = (TLRPC.InputUser) arrayList.get(i11);
                if (inputUser2 != null) {
                    tL_inputPrivacyValueDisallowUsers2.users.add(inputUser2);
                    this.f13528c.add(Long.valueOf(inputUser2.user_id));
                    this.f13529e.add(inputUser2);
                }
                i11++;
            }
            this.f13527b.add(tL_inputPrivacyValueDisallowUsers2);
        } else if (i3 != 3) {
            if (i3 == 5) {
                while (i11 < arrayList.size()) {
                    TLRPC.InputUser inputUser3 = (TLRPC.InputUser) arrayList.get(i11);
                    if (inputUser3 != null) {
                        this.f13530f.add(Long.valueOf(inputUser3.user_id));
                    }
                    i11++;
                }
            }
        } else {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
            if (!arrayList.isEmpty()) {
                while (i11 < arrayList.size()) {
                    TLRPC.InputUser inputUser4 = (TLRPC.InputUser) arrayList.get(i11);
                    if (inputUser4 != null) {
                        tL_inputPrivacyValueAllowUsers.users.add(inputUser4);
                        this.f13528c.add(Long.valueOf(inputUser4.user_id));
                        this.f13529e.add(inputUser4);
                    }
                    i11++;
                }
            }
            this.f13527b.add(tL_inputPrivacyValueAllowUsers);
        }
    }
}

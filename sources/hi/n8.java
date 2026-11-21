package hi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
public final class n8 {
    public final int f15125a;
    public final ArrayList f15126b;
    public final ArrayList f15127c;
    public final HashMap d;
    public final ArrayList f15128e;
    public final ArrayList f15129f;

    public n8(int i7, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.f15126b = arrayList2;
        this.f15127c = new ArrayList();
        this.d = new HashMap();
        this.f15128e = new ArrayList();
        this.f15129f = new ArrayList();
        int i10 = 0;
        if (a(arrayList, TLRPC.TL_privacyValueAllowAll.class) != null) {
            this.f15125a = 4;
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
            TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = (TLRPC.TL_privacyValueDisallowUsers) a(arrayList, TLRPC.TL_privacyValueDisallowUsers.class);
            if (tL_privacyValueDisallowUsers != null) {
                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                mp u12 = mp.u1(i7);
                while (i10 < tL_privacyValueDisallowUsers.users.size()) {
                    Long l10 = tL_privacyValueDisallowUsers.users.get(i10);
                    l10.getClass();
                    TLRPC.InputUser s12 = u12.s1(u12.c2(l10));
                    if (!(s12 instanceof TLRPC.TL_inputUserEmpty)) {
                        tL_inputPrivacyValueDisallowUsers.users.add(s12);
                        this.f15127c.add(l10);
                        this.f15128e.add(s12);
                    }
                    i10++;
                }
                this.f15126b.add(tL_inputPrivacyValueDisallowUsers);
            }
        } else if (a(arrayList, TLRPC.TL_privacyValueAllowCloseFriends.class) != null) {
            this.f15125a = 1;
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
        } else {
            TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = (TLRPC.TL_privacyValueAllowUsers) a(arrayList, TLRPC.TL_privacyValueAllowUsers.class);
            if (tL_privacyValueAllowUsers != null) {
                this.f15125a = 3;
                TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                mp u13 = mp.u1(i7);
                while (i10 < tL_privacyValueAllowUsers.users.size()) {
                    Long l11 = tL_privacyValueAllowUsers.users.get(i10);
                    l11.getClass();
                    TLRPC.InputUser s13 = u13.s1(u13.c2(l11));
                    if (!(s13 instanceof TLRPC.TL_inputUserEmpty)) {
                        tL_inputPrivacyValueAllowUsers.users.add(s13);
                        this.f15127c.add(l11);
                        this.f15128e.add(s13);
                    }
                    i10++;
                }
                this.f15126b.add(tL_inputPrivacyValueAllowUsers);
            } else if (a(arrayList, TLRPC.TL_privacyValueAllowContacts.class) != null) {
                this.f15125a = 2;
                arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers2 = (TLRPC.TL_privacyValueDisallowUsers) a(arrayList, TLRPC.TL_privacyValueDisallowUsers.class);
                if (tL_privacyValueDisallowUsers2 != null) {
                    TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers2 = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                    mp u14 = mp.u1(i7);
                    while (i10 < tL_privacyValueDisallowUsers2.users.size()) {
                        Long l12 = tL_privacyValueDisallowUsers2.users.get(i10);
                        l12.getClass();
                        TLRPC.InputUser s14 = u14.s1(u14.c2(l12));
                        if (!(s14 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueDisallowUsers2.users.add(s14);
                            this.f15127c.add(l12);
                            this.f15128e.add(s14);
                        }
                        i10++;
                    }
                    this.f15126b.add(tL_inputPrivacyValueDisallowUsers2);
                }
            } else {
                this.f15125a = 4;
            }
        }
    }

    public static TLRPC.PrivacyRule a(ArrayList arrayList, Class cls) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) arrayList.get(i7);
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
        ArrayList arrayList = this.f15127c;
        int i7 = this.f15125a;
        if (i7 == 4) {
            return !arrayList.contains(Long.valueOf(user.f28580id));
        }
        if (i7 == 2) {
            if (arrayList.contains(Long.valueOf(user.f28580id)) || !user.contact) {
                return false;
            }
            return true;
        } else if (i7 == 1) {
            return user.close_friend;
        } else {
            if (i7 == 3) {
                if (arrayList.contains(Long.valueOf(user.f28580id))) {
                    return true;
                }
                for (ArrayList arrayList2 : this.d.values()) {
                    if (arrayList2.contains(Long.valueOf(user.f28580id))) {
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
        ArrayList arrayList = this.f15129f;
        if (!arrayList.isEmpty()) {
            return gd.G(arrayList.size(), "StoryPrivacyRecipients", new Object[0]);
        }
        ArrayList arrayList2 = this.f15126b;
        if (arrayList2.isEmpty()) {
            return gd.N0(2131744292, null);
        }
        TLRPC.InputPrivacyRule inputPrivacyRule3 = (TLRPC.InputPrivacyRule) arrayList2.get(0);
        int i7 = this.f15125a;
        if (i7 == 4) {
            if (arrayList2.size() >= 2) {
                inputPrivacyRule2 = (TLRPC.InputPrivacyRule) arrayList2.get(1);
            } else {
                inputPrivacyRule2 = null;
            }
            if ((inputPrivacyRule2 instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) && (size = ((TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule2).users.size()) > 0) {
                return gd.G(size, "StoryPrivacyEveryoneExclude", new Object[0]);
            }
            return gd.N0(2131744304, null);
        } else if (i7 == 1) {
            return gd.N0(2131744311, null);
        } else {
            if (i7 == 3 && (inputPrivacyRule3 instanceof TLRPC.TL_inputPrivacyValueAllowUsers)) {
                return gd.G(((TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule3).users.size(), "StoryPrivacyContacts", new Object[0]);
            }
            if (i7 == 2) {
                if (arrayList2.size() >= 2) {
                    inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList2.get(1);
                } else {
                    inputPrivacyRule = null;
                }
                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) {
                    int size2 = ((TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule).users.size();
                    if (size2 > 0) {
                        return gd.G(size2, "StoryPrivacyContactsExclude", new Object[0]);
                    }
                    return gd.N0(2131744319, null);
                }
                return gd.N0(2131744319, null);
            } else if (i7 == 0) {
                if (inputPrivacyRule3 instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                    int size3 = ((TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule3).users.size();
                    if (size3 <= 0) {
                        return gd.N0(2131744292, null);
                    }
                    return gd.G(size3, "StoryPrivacyContacts", new Object[0]);
                }
                return gd.N0(2131744292, null);
            } else {
                return gd.N0(2131744292, null);
            }
        }
    }

    public n8() {
        ArrayList arrayList = new ArrayList();
        this.f15126b = arrayList;
        this.f15127c = new ArrayList();
        this.d = new HashMap();
        this.f15128e = new ArrayList();
        this.f15129f = new ArrayList();
        this.f15125a = 4;
        arrayList.add(new TLRPC.TL_inputPrivacyValueAllowAll());
    }

    public n8(int i7, int i10, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.f15126b = arrayList2;
        this.f15127c = new ArrayList();
        this.d = new HashMap();
        this.f15128e = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.f15129f = arrayList3;
        this.f15125a = i7;
        int i11 = 0;
        if (i7 == 4) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
            if (i10 < 0 || arrayList == null || arrayList.isEmpty()) {
                return;
            }
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            while (i11 < arrayList.size()) {
                Long l10 = (Long) arrayList.get(i11);
                l10.longValue();
                this.f15127c.add(l10);
                mp u12 = mp.u1(i10);
                TLRPC.InputUser s12 = u12.s1(u12.c2(l10));
                if (!(s12 instanceof TLRPC.TL_inputUserEmpty)) {
                    tL_inputPrivacyValueDisallowUsers.users.add(s12);
                    this.f15128e.add(s12);
                }
                i11++;
            }
            this.f15126b.add(tL_inputPrivacyValueDisallowUsers);
        } else if (i7 == 1) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
        } else if (i7 == 2) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
            if (i10 < 0 || arrayList == null || arrayList.isEmpty()) {
                return;
            }
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers2 = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            while (i11 < arrayList.size()) {
                Long l11 = (Long) arrayList.get(i11);
                l11.longValue();
                this.f15127c.add(l11);
                mp u13 = mp.u1(i10);
                TLRPC.InputUser s13 = u13.s1(u13.c2(l11));
                if (!(s13 instanceof TLRPC.TL_inputUserEmpty)) {
                    tL_inputPrivacyValueDisallowUsers2.users.add(s13);
                    this.f15128e.add(s13);
                }
                i11++;
            }
            this.f15126b.add(tL_inputPrivacyValueDisallowUsers2);
        } else if (i7 != 3) {
            if (i7 != 5 || arrayList == null) {
                return;
            }
            arrayList3.addAll(arrayList);
        } else {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
            if (i10 >= 0 && arrayList != null && !arrayList.isEmpty()) {
                while (i11 < arrayList.size()) {
                    Long l12 = (Long) arrayList.get(i11);
                    l12.longValue();
                    this.f15127c.add(l12);
                    mp u14 = mp.u1(i10);
                    TLRPC.InputUser s14 = u14.s1(u14.c2(l12));
                    if (!(s14 instanceof TLRPC.TL_inputUserEmpty)) {
                        tL_inputPrivacyValueAllowUsers.users.add(s14);
                        this.f15128e.add(s14);
                    }
                    i11++;
                }
            }
            this.f15126b.add(tL_inputPrivacyValueAllowUsers);
        }
    }

    public n8(int i7, ArrayList arrayList, int i10) {
        ArrayList arrayList2 = new ArrayList();
        this.f15126b = arrayList2;
        this.f15127c = new ArrayList();
        this.d = new HashMap();
        this.f15128e = new ArrayList();
        this.f15129f = new ArrayList();
        this.f15125a = i7;
        int i11 = 0;
        if (i7 == 4) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
            if (arrayList.isEmpty()) {
                return;
            }
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            while (i11 < arrayList.size()) {
                TLRPC.InputUser inputUser = (TLRPC.InputUser) arrayList.get(i11);
                if (inputUser != null) {
                    tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                    this.f15127c.add(Long.valueOf(inputUser.user_id));
                    this.f15128e.add(inputUser);
                }
                i11++;
            }
            this.f15126b.add(tL_inputPrivacyValueDisallowUsers);
        } else if (i7 == 1) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
        } else if (i7 == 2) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
            if (arrayList.isEmpty()) {
                return;
            }
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers2 = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            while (i11 < arrayList.size()) {
                TLRPC.InputUser inputUser2 = (TLRPC.InputUser) arrayList.get(i11);
                if (inputUser2 != null) {
                    tL_inputPrivacyValueDisallowUsers2.users.add(inputUser2);
                    this.f15127c.add(Long.valueOf(inputUser2.user_id));
                    this.f15128e.add(inputUser2);
                }
                i11++;
            }
            this.f15126b.add(tL_inputPrivacyValueDisallowUsers2);
        } else if (i7 != 3) {
            if (i7 == 5) {
                while (i11 < arrayList.size()) {
                    TLRPC.InputUser inputUser3 = (TLRPC.InputUser) arrayList.get(i11);
                    if (inputUser3 != null) {
                        this.f15129f.add(Long.valueOf(inputUser3.user_id));
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
                        this.f15127c.add(Long.valueOf(inputUser4.user_id));
                        this.f15128e.add(inputUser4);
                    }
                    i11++;
                }
            }
            this.f15126b.add(tL_inputPrivacyValueAllowUsers);
        }
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class w5b {
    public final int a;
    public final ArrayList b;
    public final ArrayList c;
    public final HashMap d;
    public final ArrayList e;
    public final ArrayList f;

    public w5b(int i, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        this.c = new ArrayList();
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new ArrayList();
        int i2 = 0;
        if (a(arrayList, TLRPC.TL_privacyValueAllowAll.class) != null) {
            this.a = 4;
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
            TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = (TLRPC.TL_privacyValueDisallowUsers) a(arrayList, TLRPC.TL_privacyValueDisallowUsers.class);
            if (tL_privacyValueDisallowUsers != null) {
                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                na7 q1 = na7.q1(i);
                while (i2 < tL_privacyValueDisallowUsers.users.size()) {
                    Long l = tL_privacyValueDisallowUsers.users.get(i2);
                    l.getClass();
                    TLRPC.InputUser o1 = q1.o1(q1.V1(l));
                    if (!(o1 instanceof TLRPC.TL_inputUserEmpty)) {
                        tL_inputPrivacyValueDisallowUsers.users.add(o1);
                        this.c.add(l);
                        this.e.add(o1);
                    }
                    i2++;
                }
                this.b.add(tL_inputPrivacyValueDisallowUsers);
            }
        } else if (a(arrayList, TLRPC.TL_privacyValueAllowCloseFriends.class) != null) {
            this.a = 1;
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
        } else {
            TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = (TLRPC.TL_privacyValueAllowUsers) a(arrayList, TLRPC.TL_privacyValueAllowUsers.class);
            if (tL_privacyValueAllowUsers != null) {
                this.a = 3;
                TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                na7 q12 = na7.q1(i);
                while (i2 < tL_privacyValueAllowUsers.users.size()) {
                    Long l2 = tL_privacyValueAllowUsers.users.get(i2);
                    l2.getClass();
                    TLRPC.InputUser o12 = q12.o1(q12.V1(l2));
                    if (!(o12 instanceof TLRPC.TL_inputUserEmpty)) {
                        tL_inputPrivacyValueAllowUsers.users.add(o12);
                        this.c.add(l2);
                        this.e.add(o12);
                    }
                    i2++;
                }
                this.b.add(tL_inputPrivacyValueAllowUsers);
            } else if (a(arrayList, TLRPC.TL_privacyValueAllowContacts.class) != null) {
                this.a = 2;
                arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers2 = (TLRPC.TL_privacyValueDisallowUsers) a(arrayList, TLRPC.TL_privacyValueDisallowUsers.class);
                if (tL_privacyValueDisallowUsers2 != null) {
                    TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers2 = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                    na7 q13 = na7.q1(i);
                    while (i2 < tL_privacyValueDisallowUsers2.users.size()) {
                        Long l3 = tL_privacyValueDisallowUsers2.users.get(i2);
                        l3.getClass();
                        TLRPC.InputUser o13 = q13.o1(q13.V1(l3));
                        if (!(o13 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueDisallowUsers2.users.add(o13);
                            this.c.add(l3);
                            this.e.add(o13);
                        }
                        i2++;
                    }
                    this.b.add(tL_inputPrivacyValueDisallowUsers2);
                }
            } else {
                this.a = 4;
            }
        }
    }

    public static TLRPC.PrivacyRule a(ArrayList arrayList, Class cls) {
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) arrayList.get(i);
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
        ArrayList arrayList = this.c;
        int i = this.a;
        if (i == 4) {
            return !arrayList.contains(Long.valueOf(user.id));
        }
        if (i == 2) {
            if (arrayList.contains(Long.valueOf(user.id)) || !user.contact) {
                return false;
            }
            return true;
        } else if (i == 1) {
            return user.close_friend;
        } else {
            if (i == 3) {
                if (arrayList.contains(Long.valueOf(user.id))) {
                    return true;
                }
                for (ArrayList arrayList2 : this.d.values()) {
                    if (arrayList2.contains(Long.valueOf(user.id))) {
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
        ArrayList arrayList = this.f;
        if (!arrayList.isEmpty()) {
            return k96.G(arrayList.size(), "StoryPrivacyRecipients", new Object[0]);
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2.isEmpty()) {
            return k96.M0(2131744293, null);
        }
        TLRPC.InputPrivacyRule inputPrivacyRule3 = (TLRPC.InputPrivacyRule) arrayList2.get(0);
        int i = this.a;
        if (i == 4) {
            if (arrayList2.size() >= 2) {
                inputPrivacyRule2 = (TLRPC.InputPrivacyRule) arrayList2.get(1);
            } else {
                inputPrivacyRule2 = null;
            }
            if ((inputPrivacyRule2 instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) && (size = ((TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule2).users.size()) > 0) {
                return k96.G(size, "StoryPrivacyEveryoneExclude", new Object[0]);
            }
            return k96.M0(2131744305, null);
        } else if (i == 1) {
            return k96.M0(2131744312, null);
        } else {
            if (i == 3 && (inputPrivacyRule3 instanceof TLRPC.TL_inputPrivacyValueAllowUsers)) {
                return k96.G(((TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule3).users.size(), "StoryPrivacyContacts", new Object[0]);
            }
            if (i == 2) {
                if (arrayList2.size() >= 2) {
                    inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList2.get(1);
                } else {
                    inputPrivacyRule = null;
                }
                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) {
                    int size2 = ((TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule).users.size();
                    if (size2 > 0) {
                        return k96.G(size2, "StoryPrivacyContactsExclude", new Object[0]);
                    }
                    return k96.M0(2131744320, null);
                }
                return k96.M0(2131744320, null);
            } else if (i == 0) {
                if (inputPrivacyRule3 instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                    int size3 = ((TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule3).users.size();
                    if (size3 <= 0) {
                        return k96.M0(2131744293, null);
                    }
                    return k96.G(size3, "StoryPrivacyContacts", new Object[0]);
                }
                return k96.M0(2131744293, null);
            } else {
                return k96.M0(2131744293, null);
            }
        }
    }

    public w5b() {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = new ArrayList();
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.a = 4;
        arrayList.add(new TLRPC.TL_inputPrivacyValueAllowAll());
    }

    public w5b(int i, int i2, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        this.c = new ArrayList();
        this.d = new HashMap();
        this.e = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.f = arrayList3;
        this.a = i;
        int i3 = 0;
        if (i == 4) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
            if (i2 < 0 || arrayList == null || arrayList.isEmpty()) {
                return;
            }
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            while (i3 < arrayList.size()) {
                Long l = (Long) arrayList.get(i3);
                l.longValue();
                this.c.add(l);
                na7 q1 = na7.q1(i2);
                TLRPC.InputUser o1 = q1.o1(q1.V1(l));
                if (!(o1 instanceof TLRPC.TL_inputUserEmpty)) {
                    tL_inputPrivacyValueDisallowUsers.users.add(o1);
                    this.e.add(o1);
                }
                i3++;
            }
            this.b.add(tL_inputPrivacyValueDisallowUsers);
        } else if (i == 1) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
        } else if (i == 2) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
            if (i2 < 0 || arrayList == null || arrayList.isEmpty()) {
                return;
            }
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers2 = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            while (i3 < arrayList.size()) {
                Long l2 = (Long) arrayList.get(i3);
                l2.longValue();
                this.c.add(l2);
                na7 q12 = na7.q1(i2);
                TLRPC.InputUser o12 = q12.o1(q12.V1(l2));
                if (!(o12 instanceof TLRPC.TL_inputUserEmpty)) {
                    tL_inputPrivacyValueDisallowUsers2.users.add(o12);
                    this.e.add(o12);
                }
                i3++;
            }
            this.b.add(tL_inputPrivacyValueDisallowUsers2);
        } else if (i != 3) {
            if (i != 5 || arrayList == null) {
                return;
            }
            arrayList3.addAll(arrayList);
        } else {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
            if (i2 >= 0 && arrayList != null && !arrayList.isEmpty()) {
                while (i3 < arrayList.size()) {
                    Long l3 = (Long) arrayList.get(i3);
                    l3.longValue();
                    this.c.add(l3);
                    na7 q13 = na7.q1(i2);
                    TLRPC.InputUser o13 = q13.o1(q13.V1(l3));
                    if (!(o13 instanceof TLRPC.TL_inputUserEmpty)) {
                        tL_inputPrivacyValueAllowUsers.users.add(o13);
                        this.e.add(o13);
                    }
                    i3++;
                }
            }
            this.b.add(tL_inputPrivacyValueAllowUsers);
        }
    }

    public w5b(int i, ArrayList arrayList, int i2) {
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        this.c = new ArrayList();
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.a = i;
        int i3 = 0;
        if (i == 4) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
            if (arrayList.isEmpty()) {
                return;
            }
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            while (i3 < arrayList.size()) {
                TLRPC.InputUser inputUser = (TLRPC.InputUser) arrayList.get(i3);
                if (inputUser != null) {
                    tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                    this.c.add(Long.valueOf(inputUser.user_id));
                    this.e.add(inputUser);
                }
                i3++;
            }
            this.b.add(tL_inputPrivacyValueDisallowUsers);
        } else if (i == 1) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
        } else if (i == 2) {
            arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
            if (arrayList.isEmpty()) {
                return;
            }
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers2 = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            while (i3 < arrayList.size()) {
                TLRPC.InputUser inputUser2 = (TLRPC.InputUser) arrayList.get(i3);
                if (inputUser2 != null) {
                    tL_inputPrivacyValueDisallowUsers2.users.add(inputUser2);
                    this.c.add(Long.valueOf(inputUser2.user_id));
                    this.e.add(inputUser2);
                }
                i3++;
            }
            this.b.add(tL_inputPrivacyValueDisallowUsers2);
        } else if (i != 3) {
            if (i == 5) {
                while (i3 < arrayList.size()) {
                    TLRPC.InputUser inputUser3 = (TLRPC.InputUser) arrayList.get(i3);
                    if (inputUser3 != null) {
                        this.f.add(Long.valueOf(inputUser3.user_id));
                    }
                    i3++;
                }
            }
        } else {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
            if (!arrayList.isEmpty()) {
                while (i3 < arrayList.size()) {
                    TLRPC.InputUser inputUser4 = (TLRPC.InputUser) arrayList.get(i3);
                    if (inputUser4 != null) {
                        tL_inputPrivacyValueAllowUsers.users.add(inputUser4);
                        this.c.add(Long.valueOf(inputUser4.user_id));
                        this.e.add(inputUser4);
                    }
                    i3++;
                }
            }
            this.b.add(tL_inputPrivacyValueAllowUsers);
        }
    }
}

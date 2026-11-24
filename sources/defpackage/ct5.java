package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ct5 implements Runnable {
    public final byte a;
    public final et5 b;
    public final String c;

    public ct5(et5 et5Var, String str, byte b) {
        this.a = b;
        this.b = et5Var;
        this.c = str;
    }

    @Override
    public final void run() {
        boolean z;
        boolean z2;
        int i;
        String str;
        String K;
        int i2;
        ?? r4 = 0;
        switch (this.a) {
            case 0:
                et5 et5Var = this.b;
                String str2 = this.c;
                et5Var.getClass();
                gm.c3(new ct5(et5Var, str2, (byte) 1));
                return;
            case 1:
                et5 et5Var2 = this.b;
                String str3 = this.c;
                bu9 bu9Var = et5Var2.e;
                yu3 yu3Var = et5Var2.n.g2;
                if (yu3Var != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (yu3Var != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bu9Var.g(str3, true, z, true, z2, 0L, false, 0, 0);
                mp3 mp3Var = Utilities.g;
                ct5 ct5Var = new ct5(et5Var2, str3, (byte) 2);
                et5Var2.h = ct5Var;
                mp3Var.c(ct5Var);
                return;
            default:
                et5 et5Var3 = this.b;
                String str4 = this.c;
                ArrayList arrayList = et5Var3.n.Y1;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    gm.c3(new dt5(et5Var3, new ArrayList(), new ArrayList(), (byte) 0));
                    return;
                }
                String S0 = jb6.D0().S0(lowerCase, true, false);
                S0 = (lowerCase.equals(S0) || S0.length() == 0) ? null : null;
                if (S0 != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                int i3 = i + 1;
                String[] strArr = new String[i3];
                strArr[0] = lowerCase;
                if (S0 != null) {
                    strArr[1] = S0;
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int i4 = 0;
                while (i4 < arrayList.size()) {
                    TLObject tLObject = (TLObject) arrayList.get(i4);
                    boolean z3 = tLObject instanceof TLRPC.User;
                    if (z3) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        str = bw2.m(r4, user.first_name, user.last_name).toLowerCase();
                        K = m9c.p(user);
                    } else {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        str = chat.title;
                        K = sd2.K(chat, r4);
                    }
                    String S02 = jb6.D0().S0(str, true, r4);
                    if (str.equals(S02)) {
                        S02 = null;
                    }
                    int i5 = r4;
                    int i6 = i5;
                    while (true) {
                        if (i5 < i3) {
                            String str5 = strArr[i5];
                            if (!str.startsWith(str5) && !hg9.s(" ", str5, str) && (S02 == null || (!S02.startsWith(str5) && !hg9.s(" ", str5, S02)))) {
                                if (K != null && K.startsWith(str5)) {
                                    i2 = 2;
                                } else {
                                    i2 = i6;
                                }
                            } else {
                                i2 = 1;
                            }
                            if (i2 != 0) {
                                if (i2 == 1) {
                                    if (z3) {
                                        TLRPC.User user2 = (TLRPC.User) tLObject;
                                        arrayList3.add(gm.r0(user2.first_name, user2.last_name, str5));
                                    } else {
                                        arrayList3.add(gm.r0(((TLRPC.Chat) tLObject).title, null, str5));
                                    }
                                } else {
                                    arrayList3.add(gm.r0(b10.h("@", K), null, "@" + str5));
                                }
                                arrayList2.add(tLObject);
                            } else {
                                i5++;
                                i6 = i2;
                            }
                        }
                    }
                    i4++;
                    r4 = 0;
                }
                gm.c3(new dt5(et5Var3, arrayList2, arrayList3, (byte) 0));
                return;
        }
    }
}

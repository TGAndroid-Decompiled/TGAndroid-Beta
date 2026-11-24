package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kc5 implements Runnable {
    public final byte a;
    public final mc5 b;
    public final String c;

    public kc5(mc5 mc5Var, String str, byte b) {
        this.a = b;
        this.b = mc5Var;
        this.c = str;
    }

    @Override
    public final void run() {
        boolean z;
        int i;
        String K;
        String str;
        char c;
        ?? r3 = 0;
        switch (this.a) {
            case 0:
                mc5 mc5Var = this.b;
                String str2 = this.c;
                mc5Var.getClass();
                gm.c3(new kc5(mc5Var, str2, (byte) 1));
                return;
            case 1:
                mc5 mc5Var2 = this.b;
                String str3 = this.c;
                bu9 bu9Var = mc5Var2.f;
                oc5 oc5Var = mc5Var2.J;
                if (!oc5Var.P && !oc5Var.Q) {
                    z = false;
                } else {
                    z = true;
                }
                bu9Var.g(str3, true, z, true, false, 0L, false, 0, 0);
                mp3 mp3Var = Utilities.g;
                kc5 kc5Var = new kc5(mc5Var2, str3, (byte) 2);
                mc5Var2.h = kc5Var;
                mp3Var.c(kc5Var);
                return;
            default:
                mc5 mc5Var3 = this.b;
                String str4 = this.c;
                ArrayList arrayList = mc5Var3.r;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    gm.c3(new if4(mc5Var3, new ArrayList(), new ArrayList(), (byte) 21));
                    return;
                }
                String S0 = jb6.D0().S0(lowerCase, true, false);
                S0 = (lowerCase.equals(S0) || S0.isEmpty()) ? null : null;
                if (S0 != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                int i2 = i + 1;
                String[] strArr = new String[i2];
                strArr[0] = lowerCase;
                if (S0 != null) {
                    strArr[1] = S0;
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    TLObject tLObject = (TLObject) arrayList.get(i3);
                    boolean z2 = tLObject instanceof TLRPC.User;
                    if (z2) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        str = bw2.m(r3, user.first_name, user.last_name).toLowerCase();
                        K = m9c.p(user);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        String str5 = chat.title;
                        K = sd2.K(chat, r3);
                        str = str5;
                    } else {
                        i3++;
                        r3 = 0;
                    }
                    String S02 = jb6.D0().S0(str, true, r3);
                    if (str.equals(S02)) {
                        S02 = null;
                    }
                    char c2 = r3;
                    int i4 = r3;
                    while (true) {
                        if (i4 < i2) {
                            String str6 = strArr[i4];
                            if (!str.startsWith(str6) && !hg9.s(" ", str6, str) && (S02 == null || (!S02.startsWith(str6) && !hg9.s(" ", str6, S02)))) {
                                if (K != null && K.startsWith(str6)) {
                                    c = 2;
                                } else {
                                    c = c2;
                                }
                            } else {
                                c = 1;
                            }
                            if (c != 0) {
                                if (c == 1) {
                                    if (z2) {
                                        TLRPC.User user2 = (TLRPC.User) tLObject;
                                        arrayList3.add(gm.r0(user2.first_name, user2.last_name, str6));
                                    } else if (tLObject instanceof TLRPC.Chat) {
                                        arrayList3.add(gm.r0(((TLRPC.Chat) tLObject).title, null, str6));
                                    }
                                } else {
                                    arrayList3.add(gm.r0(b10.h("@", K), null, "@" + str6));
                                }
                                arrayList2.add(tLObject);
                            } else {
                                c2 = c;
                                i4++;
                            }
                        }
                    }
                    i3++;
                    r3 = 0;
                }
                gm.c3(new if4(mc5Var3, arrayList2, arrayList3, (byte) 21));
                return;
        }
    }
}

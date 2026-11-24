package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ma5 implements Runnable {
    public final byte a;
    public final oa5 b;
    public final String c;

    public ma5(oa5 oa5Var, String str, byte b) {
        this.a = b;
        this.b = oa5Var;
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
                oa5 oa5Var = this.b;
                String str2 = this.c;
                oa5Var.getClass();
                gl.c3(new ma5(oa5Var, str2, (byte) 1));
                return;
            case 1:
                oa5 oa5Var2 = this.b;
                String str3 = this.c;
                zr9 zr9Var = oa5Var2.f;
                qa5 qa5Var = oa5Var2.J;
                if (!qa5Var.P && !qa5Var.Q) {
                    z = false;
                } else {
                    z = true;
                }
                zr9Var.g(str3, true, z, true, false, 0L, false, 0, 0);
                co3 co3Var = Utilities.g;
                ma5 ma5Var = new ma5(oa5Var2, str3, (byte) 2);
                oa5Var2.h = ma5Var;
                co3Var.c(ma5Var);
                return;
            default:
                oa5 oa5Var3 = this.b;
                String str4 = this.c;
                ArrayList arrayList = oa5Var3.r;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    gl.c3(new jf4(oa5Var3, new ArrayList(), new ArrayList(), (byte) 19));
                    return;
                }
                String S0 = k96.D0().S0(lowerCase, true, false);
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
                        str = qu2.m(r3, user.first_name, user.last_name).toLowerCase();
                        K = l7c.p(user);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        String str5 = chat.title;
                        K = hc2.K(chat, r3);
                        str = str5;
                    } else {
                        i3++;
                        r3 = 0;
                    }
                    String S02 = k96.D0().S0(str, true, r3);
                    if (str.equals(S02)) {
                        S02 = null;
                    }
                    char c2 = r3;
                    int i4 = r3;
                    while (true) {
                        if (i4 < i2) {
                            String str6 = strArr[i4];
                            if (!str.startsWith(str6) && !de9.t(" ", str6, str) && (S02 == null || (!S02.startsWith(str6) && !de9.t(" ", str6, S02)))) {
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
                                        arrayList3.add(gl.r0(user2.first_name, user2.last_name, str6));
                                    } else if (tLObject instanceof TLRPC.Chat) {
                                        arrayList3.add(gl.r0(((TLRPC.Chat) tLObject).title, null, str6));
                                    }
                                } else {
                                    arrayList3.add(gl.r0(b00.h("@", K), null, "@" + str6));
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
                gl.c3(new jf4(oa5Var3, arrayList2, arrayList3, (byte) 19));
                return;
        }
    }
}

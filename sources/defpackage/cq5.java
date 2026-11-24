package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class cq5 implements Runnable {
    public final byte a;
    public final ox2 b;
    public final String c;

    public cq5(ox2 ox2Var, String str, byte b) {
        this.a = b;
        this.b = ox2Var;
        this.c = str;
    }

    @Override
    public final void run() {
        int i;
        switch (this.a) {
            case 0:
                Utilities.g.c(new cq5(this.b, this.c, (byte) 1));
                return;
            default:
                ox2 ox2Var = this.b;
                String str = this.c;
                dq5 dq5Var = (dq5) ox2Var.c;
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    dq5Var.getClass();
                    gl.c3(new jf4(dq5Var, arrayList, arrayList2, (byte) 24));
                    return;
                }
                ?? r5 = 0;
                String S0 = k96.D0().S0(lowerCase, true, false);
                if (lowerCase.equals(S0) || S0.isEmpty()) {
                    S0 = null;
                }
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
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i3 = 0;
                while (i3 < dq5Var.n.w.size()) {
                    nu2 nu2Var = (nu2) dq5Var.n.w.get(i3);
                    String lowerCase2 = qu2.m(r5, nu2Var.i, nu2Var.j).toLowerCase();
                    String S02 = k96.D0().S0(lowerCase2, true, r5);
                    if (lowerCase2.equals(S02)) {
                        S02 = null;
                    }
                    int i4 = r5;
                    int i5 = i4;
                    while (true) {
                        if (i4 < i2) {
                            String str2 = strArr[i4];
                            if (lowerCase2.startsWith(str2) || de9.t(" ", str2, lowerCase2) || (S02 != null && (S02.startsWith(str2) || de9.t(" ", str2, S02)))) {
                                i5 = 1;
                            }
                            if (i5 != 0) {
                                arrayList4.add(gl.r0(nu2Var.i, nu2Var.j, str2));
                                arrayList3.add(nu2Var);
                            } else {
                                i4++;
                            }
                        }
                    }
                    i3++;
                    r5 = 0;
                }
                gl.c3(new jf4(dq5Var, arrayList3, arrayList4, (byte) 24));
                return;
        }
    }
}

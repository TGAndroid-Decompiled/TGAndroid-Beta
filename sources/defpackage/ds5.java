package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class ds5 implements Runnable {
    public final byte a;
    public final iy2 b;
    public final String c;

    public ds5(iy2 iy2Var, String str, byte b) {
        this.a = b;
        this.b = iy2Var;
        this.c = str;
    }

    @Override
    public final void run() {
        int i;
        switch (this.a) {
            case 0:
                Utilities.g.c(new ds5(this.b, this.c, (byte) 1));
                return;
            default:
                iy2 iy2Var = this.b;
                String str = this.c;
                es5 es5Var = (es5) iy2Var.c;
                String lowerCase = str.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    es5Var.getClass();
                    hl.c3(new re4(es5Var, arrayList, arrayList2, (byte) 29));
                    return;
                }
                ?? r5 = 0;
                String S0 = ob6.D0().S0(lowerCase, true, false);
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
                while (i3 < es5Var.n.w.size()) {
                    iv2 iv2Var = (iv2) es5Var.n.w.get(i3);
                    String lowerCase2 = lv2.m(r5, iv2Var.i, iv2Var.j).toLowerCase();
                    String S02 = ob6.D0().S0(lowerCase2, true, r5);
                    if (lowerCase2.equals(S02)) {
                        S02 = null;
                    }
                    int i4 = r5;
                    int i5 = i4;
                    while (true) {
                        if (i4 < i2) {
                            String str2 = strArr[i4];
                            if (lowerCase2.startsWith(str2) || uh9.t(" ", str2, lowerCase2) || (S02 != null && (S02.startsWith(str2) || uh9.t(" ", str2, S02)))) {
                                i5 = 1;
                            }
                            if (i5 != 0) {
                                arrayList4.add(hl.r0(iv2Var.i, iv2Var.j, str2));
                                arrayList3.add(iv2Var);
                            } else {
                                i4++;
                            }
                        }
                    }
                    i3++;
                    r5 = 0;
                }
                hl.c3(new re4(es5Var, arrayList3, arrayList4, (byte) 29));
                return;
        }
    }
}

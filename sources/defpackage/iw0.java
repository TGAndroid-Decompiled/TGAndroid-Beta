package defpackage;

import java.util.Arrays;
import java.util.Iterator;
public final class iw0 implements ps3 {
    public final byte a;
    public final Object b;

    public iw0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(vpa vpaVar, boolean z, float f, float f2) {
        byte b = this.a;
        boolean z2 = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((pn) obj).e();
                return;
            case 1:
                v21 v21Var = (v21) obj;
                if (v21Var.d == vpaVar) {
                    v21Var.d = null;
                    return;
                }
                return;
            case 2:
                k11 k11Var = (k11) obj;
                if (!z) {
                    k11Var.run();
                    return;
                }
                return;
            case 3:
                la1 la1Var = (la1) obj;
                vpa vpaVar2 = la1Var.E;
                if (vpaVar2 != null) {
                    vpaVar2.d();
                    la1Var.E = null;
                    return;
                }
                return;
            case 4:
                h42 h42Var = (h42) obj;
                h42Var.m0 = null;
                h42Var.n0 = 1.0f;
                h42Var.l0();
                return;
            case 5:
                km7 km7Var = (km7) obj;
                km7Var.a = f;
                lm7 lm7Var = km7Var.d;
                km7 km7Var2 = lm7Var.U;
                if (!lm7Var.h) {
                    lm7Var.A0();
                    if (!km7Var2.b()) {
                        Iterator it = lm7Var.V.values().iterator();
                        while (it.hasNext()) {
                            km7 km7Var3 = (km7) it.next();
                            if (km7Var3.b()) {
                                z2 = true;
                            } else if (km7Var3.b == km7Var2.b) {
                                it.remove();
                            }
                        }
                        for (km7 km7Var4 : lm7Var.W.values()) {
                            z2 |= km7Var4.b();
                        }
                        if (!z2) {
                            Arrays.fill(lm7Var.X, (Object) null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                w28 w28Var = (w28) obj;
                if (vpaVar == w28Var.c) {
                    w28Var.c = null;
                    return;
                }
                return;
            case 7:
                ((tc8) obj).E();
                return;
            case 8:
                b8a b8aVar = (b8a) obj;
                b8aVar.q = false;
                b8aVar.dismiss();
                return;
            case 9:
                c8a c8aVar = (c8a) obj;
                c8aVar.s = false;
                c8aVar.r = false;
                if (!z) {
                    vpaVar.d();
                }
                if (vpaVar == c8aVar.f) {
                    c8aVar.f = null;
                    return;
                }
                return;
            case 10:
                kea keaVar = (kea) obj;
                keaVar.z1.setVisibility(8);
                keaVar.u2.setVisibility(8);
                iea ieaVar = keaVar.G1;
                ieaVar.f = null;
                ieaVar.f();
                keaVar.w2 = null;
                keaVar.H2 = false;
                return;
            case 11:
                kea keaVar2 = ((tda) obj).d;
                keaVar2.A1.setVisibility(8);
                keaVar2.B1.setVisibility(8);
                keaVar2.t2.setVisibility(8);
                keaVar2.w2 = null;
                return;
            case 12:
                ((nea) obj).c.setTag(2131296665, null);
                return;
            case 13:
                ((yrc) obj).f(z, f);
                return;
            default:
                euc eucVar = (euc) obj;
                eucVar.b0 = null;
                eucVar.c0 = 1.0f;
                eucVar.G0();
                return;
        }
    }
}

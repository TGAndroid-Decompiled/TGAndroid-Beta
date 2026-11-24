package defpackage;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dp2 implements jac {
    public final byte a;
    public final pp2 b;

    public dp2(pp2 pp2Var, byte b) {
        this.a = b;
        this.b = pp2Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String G;
        String str;
        boolean z;
        byte b = this.a;
        boolean z2 = true;
        int i = 0;
        pp2 pp2Var = this.b;
        switch (b) {
            case 0:
                l7c l7cVar = (l7c) obj2;
                pp2Var.E0((ArrayList) obj, true);
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    wi8.u((FrameLayout) pp2Var.b, pp2Var.J0, tL_error, false);
                    return;
                }
                return;
            case 2:
                ArrayList arrayList = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                pp2Var.r1.setLoading(false);
                if (tL_error2 != null) {
                    wi8.u((FrameLayout) pp2Var.b, pp2Var.J0, tL_error2, false);
                    return;
                } else if (arrayList != null) {
                    pp2Var.K1 = arrayList;
                    if (arrayList.isEmpty()) {
                        ts2.u(null, 2131751842, new c41((FrameLayout) pp2Var.b, pp2Var.J0), 2131624068, 36);
                        return;
                    }
                    pp2Var.w1.d.g3.O(false);
                    pp2Var.n1.E(2);
                    return;
                } else {
                    return;
                }
            case 3:
                l7c l7cVar2 = (l7c) obj2;
                int i2 = pp2.P1;
                pp2Var.E0((ArrayList) obj, false);
                return;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj;
                l7c l7cVar3 = (l7c) obj2;
                int i3 = pp2.P1;
                arrayList2.add(c6c.E(99, Math.min(gm.L(176.0f) + gm.m, (int) (gm.q.y * 0.25f))));
                arrayList2.add(c6c.E(0, gm.L(56.0f)));
                String M0 = jb6.M0(2131751786, null);
                c6c c6cVar = new c6c(39);
                c6cVar.d = 101;
                c6cVar.m = M0;
                c6cVar.A = 0;
                c6cVar.L(pp2Var.q1);
                arrayList2.add(c6cVar);
                arrayList2.add(c6c.B(2, jb6.M0(2131751785, null)));
                xp2 xp2Var = pp2Var.G1;
                if (xp2Var.n && xp2Var.l == 1 && xp2Var.j.size() == 1) {
                    arrayList2.add(c6c.t(3, jb6.M0(2131751841, null)));
                    xp2Var.c(arrayList2);
                    arrayList2.add(c6c.E(5, gm.L(14.33f)));
                } else {
                    int i4 = xp2Var.l;
                    if (i4 > 0) {
                        int i5 = xp2Var.p;
                        if (i4 == i5) {
                            G = jb6.M0(2131751832, null);
                        } else {
                            G = jb6.G(i4, "CommunityPendingRequestsRow", new Object[0]);
                        }
                        if (i5 > 0) {
                            str = Integer.toString(i5);
                        } else {
                            str = null;
                        }
                        int i6 = bp2.b;
                        c6c K = c6c.K(bp2.class);
                        K.d = 100;
                        K.k = 2131231170;
                        K.m = G;
                        K.o = str;
                        K.C = -66560164762966547L;
                        K.r = true;
                        arrayList2.add(K);
                        arrayList2.add(c6c.E(5, gm.L(14.33f)));
                    }
                }
                xvc u = oc7.r1(pp2Var.a).u(pp2Var.o1);
                ArrayList arrayList3 = (ArrayList) u.e;
                ArrayList arrayList4 = (ArrayList) u.d;
                ArrayList arrayList5 = (ArrayList) u.c;
                ArrayList arrayList6 = (ArrayList) u.b;
                if (!arrayList6.isEmpty()) {
                    arrayList2.add(c6c.t(21, jb6.M0(2131751815, null)));
                    int size = arrayList6.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj3 = arrayList6.get(i7);
                        i7++;
                        arrayList2.add(tp2.i((tb7) obj3, pp2Var));
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (!arrayList5.isEmpty()) {
                    if (z) {
                        arrayList2.add(c6c.E(22, gm.L(12.0f)));
                    }
                    arrayList2.add(c6c.t(23, jb6.M0(2131751812, null)));
                    int size2 = arrayList5.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        Object obj4 = arrayList5.get(i8);
                        i8++;
                        arrayList2.add(tp2.i((tb7) obj4, pp2Var));
                    }
                    z = true;
                }
                if (!arrayList4.isEmpty()) {
                    if (z) {
                        arrayList2.add(c6c.E(24, gm.L(12.0f)));
                    }
                    arrayList2.add(c6c.t(25, jb6.M0(2131751813, null)));
                    int size3 = arrayList4.size();
                    int i9 = 0;
                    while (i9 < size3) {
                        Object obj5 = arrayList4.get(i9);
                        i9++;
                        arrayList2.add(tp2.i((tb7) obj5, pp2Var));
                    }
                } else {
                    z2 = z;
                }
                if (!arrayList3.isEmpty()) {
                    if (z2) {
                        arrayList2.add(c6c.E(26, gm.L(12.0f)));
                    }
                    arrayList2.add(c6c.t(27, jb6.M0(2131751810, null)));
                    int size4 = arrayList3.size();
                    while (i < size4) {
                        Object obj6 = arrayList3.get(i);
                        i++;
                        arrayList2.add(tp2.i((tb7) obj6, pp2Var));
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList7 = (ArrayList) obj;
                l7c l7cVar4 = (l7c) obj2;
                int i10 = pp2.P1;
                xp2 xp2Var2 = pp2Var.G1;
                arrayList7.add(c6c.E(99, (int) (gm.q.y * 0.35f)));
                arrayList7.add(c6c.E(0, gm.L(48.0f)));
                if (sd2.w(2, pp2Var.p1)) {
                    arrayList7.add(c6c.B(1, gm.D2(gm.N2(jb6.M0(2131751831, null), -1, 0, new fp2(pp2Var, (byte) 2), null), true)));
                } else {
                    arrayList7.add(c6c.B(1, jb6.M0(2131751830, null)));
                }
                arrayList7.add(c6c.j(2, pp2Var.F1));
                arrayList7.add(c6c.t(3, jb6.G(xp2Var2.l, "CommunityPendingRequestsSuggestedHeader", new Object[0])));
                xp2Var2.c(arrayList7);
                return;
        }
    }
}

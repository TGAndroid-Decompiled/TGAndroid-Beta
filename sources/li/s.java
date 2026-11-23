package li;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.qo;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.n41;
public final class s implements p10 {
    public final int f20095a;
    public final c0 f20096b;

    public s(c0 c0Var, int i7) {
        this.f20095a = i7;
        this.f20096b = c0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String G;
        String str;
        boolean z10;
        ArrayList arrayList;
        int i7 = this.f20095a;
        boolean z11 = true;
        int i10 = 0;
        c0 c0Var = this.f20096b;
        switch (i7) {
            case 0:
                b51 b51Var = (b51) obj2;
                c0Var.K0((ArrayList) obj, true);
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    org.telegram.ui.Cells.c0.t((FrameLayout) c0Var.f30226b, c0Var.J0, tL_error, false);
                    return;
                } else {
                    c0Var.getClass();
                    return;
                }
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                c0Var.f20000s1.setLoading(false);
                if (tL_error2 != null) {
                    org.telegram.ui.Cells.c0.t((FrameLayout) c0Var.f30226b, c0Var.J0, tL_error2, false);
                    return;
                } else if (arrayList2 != null) {
                    c0Var.L1 = arrayList2;
                    if (arrayList2.isEmpty()) {
                        f3.n(null, 2131751893, new kc((FrameLayout) c0Var.f30226b, c0Var.J0), 2131624068, 36);
                        return;
                    }
                    c0Var.f20005x1.d.f35323g3.O(false);
                    c0Var.f19996o1.C(2);
                    return;
                } else {
                    return;
                }
            case 3:
                b51 b51Var2 = (b51) obj2;
                int i11 = c0.Q1;
                c0Var.K0((ArrayList) obj, false);
                return;
            case 4:
                ArrayList arrayList3 = (ArrayList) obj;
                b51 b51Var3 = (b51) obj2;
                int i12 = c0.Q1;
                arrayList3.add(n41.E(99, Math.min(org.telegram.messenger.g0.L(176.0f) + org.telegram.messenger.g0.f24220m, (int) (org.telegram.messenger.g0.f24226q.y * 0.25f))));
                arrayList3.add(n41.E(0, org.telegram.messenger.g0.L(56.0f)));
                String N0 = gd.N0(2131751837, null);
                n41 n41Var = new n41(39);
                n41Var.d = 101;
                n41Var.f37655m = N0;
                n41Var.A = 0;
                n41Var.L(c0Var.f19999r1);
                arrayList3.add(n41Var);
                arrayList3.add(n41.B(2, gd.N0(2131751836, null)));
                j0 j0Var = c0Var.H1;
                if (j0Var.f20053n && j0Var.f20051l == 1 && (arrayList = j0Var.f20049j) != null && arrayList.size() == 1) {
                    arrayList3.add(n41.t(3, gd.N0(2131751892, null)));
                    j0Var.c(arrayList3);
                    arrayList3.add(n41.E(5, org.telegram.messenger.g0.L(14.33f)));
                } else {
                    int i13 = j0Var.f20051l;
                    if (i13 > 0) {
                        int i14 = j0Var.f20055p;
                        if (i13 == i14) {
                            G = gd.N0(2131751883, null);
                        } else {
                            G = gd.G(i13, "CommunityPendingRequestsRow", new Object[0]);
                        }
                        if (i14 > 0) {
                            str = Integer.toString(i14);
                        } else {
                            str = null;
                        }
                        int i15 = mi.i.f21126b;
                        n41 K = n41.K(mi.i.class);
                        K.d = 100;
                        K.f37653k = 2131231169;
                        K.f37655m = G;
                        K.f37657o = str;
                        K.C = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                        K.f37660r = true;
                        arrayList3.add(K);
                        arrayList3.add(n41.E(5, org.telegram.messenger.g0.L(14.33f)));
                    }
                }
                ab.c0 x10 = mp.u1(c0Var.f30223a).x(c0Var.f19997p1);
                ArrayList arrayList4 = (ArrayList) x10.f910e;
                ArrayList arrayList5 = (ArrayList) x10.d;
                ArrayList arrayList6 = (ArrayList) x10.f909c;
                ArrayList arrayList7 = (ArrayList) x10.f908b;
                if (!arrayList7.isEmpty()) {
                    arrayList3.add(n41.t(21, gd.N0(2131751866, null)));
                    int size = arrayList7.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj3 = arrayList7.get(i16);
                        i16++;
                        arrayList3.add(g0.i((qo) obj3, c0Var));
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!arrayList6.isEmpty()) {
                    if (z10) {
                        arrayList3.add(n41.E(22, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(n41.t(23, gd.N0(2131751863, null)));
                    int size2 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        Object obj4 = arrayList6.get(i17);
                        i17++;
                        arrayList3.add(g0.i((qo) obj4, c0Var));
                    }
                    z10 = true;
                }
                if (!arrayList5.isEmpty()) {
                    if (z10) {
                        arrayList3.add(n41.E(24, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(n41.t(25, gd.N0(2131751864, null)));
                    int size3 = arrayList5.size();
                    int i18 = 0;
                    while (i18 < size3) {
                        Object obj5 = arrayList5.get(i18);
                        i18++;
                        arrayList3.add(g0.i((qo) obj5, c0Var));
                    }
                } else {
                    z11 = z10;
                }
                if (!arrayList4.isEmpty()) {
                    if (z11) {
                        arrayList3.add(n41.E(26, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(n41.t(27, gd.N0(2131751861, null)));
                    int size4 = arrayList4.size();
                    while (i10 < size4) {
                        Object obj6 = arrayList4.get(i10);
                        i10++;
                        arrayList3.add(g0.i((qo) obj6, c0Var));
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList8 = (ArrayList) obj;
                b51 b51Var4 = (b51) obj2;
                j0 j0Var2 = c0Var.H1;
                arrayList8.add(n41.E(99, (int) (org.telegram.messenger.g0.f24226q.y * 0.35f)));
                arrayList8.add(n41.E(0, org.telegram.messenger.g0.L(48.0f)));
                if (v3.w(2, c0Var.f19998q1)) {
                    arrayList8.add(n41.B(1, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(gd.N0(2131751882, null), new u(c0Var, 2)), true)));
                } else {
                    arrayList8.add(n41.B(1, gd.N0(2131751881, null)));
                }
                arrayList8.add(n41.j(2, c0Var.G1));
                arrayList8.add(n41.t(3, gd.G(j0Var2.f20051l, "CommunityPendingRequestsSuggestedHeader", new Object[0])));
                j0Var2.c(arrayList8);
                return;
        }
    }
}

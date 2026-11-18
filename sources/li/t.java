package li;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.qo;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.z41;
public final class t implements q10 {
    public final int f20001a;
    public final d0 f20002b;

    public t(d0 d0Var, int i7) {
        this.f20001a = i7;
        this.f20002b = d0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String G;
        String str;
        boolean z10;
        ArrayList arrayList;
        int i7 = this.f20001a;
        boolean z11 = true;
        int i10 = 0;
        d0 d0Var = this.f20002b;
        switch (i7) {
            case 0:
                z41 z41Var = (z41) obj2;
                d0Var.K0((ArrayList) obj, true);
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    org.telegram.ui.Cells.c0.t((FrameLayout) d0Var.f30190b, d0Var.J0, tL_error, false);
                    return;
                } else {
                    d0Var.getClass();
                    return;
                }
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                d0Var.f19906s1.setLoading(false);
                if (tL_error2 != null) {
                    org.telegram.ui.Cells.c0.t((FrameLayout) d0Var.f30190b, d0Var.J0, tL_error2, false);
                    return;
                } else if (arrayList2 != null) {
                    d0Var.L1 = arrayList2;
                    if (arrayList2.isEmpty()) {
                        f3.n(null, 2131751894, new lc((FrameLayout) d0Var.f30190b, d0Var.J0), 2131624068, 36);
                        return;
                    }
                    d0Var.f19911x1.d.f34607g3.O(false);
                    d0Var.f19902o1.A(2);
                    return;
                } else {
                    return;
                }
            case 3:
                z41 z41Var2 = (z41) obj2;
                int i11 = d0.Q1;
                d0Var.K0((ArrayList) obj, false);
                return;
            case 4:
                ArrayList arrayList3 = (ArrayList) obj;
                z41 z41Var3 = (z41) obj2;
                int i12 = d0.Q1;
                arrayList3.add(l41.E(99, Math.min(org.telegram.messenger.g0.L(176.0f) + org.telegram.messenger.g0.f24112m, (int) (org.telegram.messenger.g0.f24118q.y * 0.25f))));
                arrayList3.add(l41.E(0, org.telegram.messenger.g0.L(56.0f)));
                String M0 = gd.M0(2131751838, null);
                l41 l41Var = new l41(39);
                l41Var.d = 101;
                l41Var.f37018m = M0;
                l41Var.A = 0;
                l41Var.L(d0Var.f19905r1);
                arrayList3.add(l41Var);
                arrayList3.add(l41.B(2, gd.M0(2131751837, null)));
                k0 k0Var = d0Var.H1;
                if (k0Var.f19959n && k0Var.f19957l == 1 && (arrayList = k0Var.f19955j) != null && arrayList.size() == 1) {
                    arrayList3.add(l41.t(3, gd.M0(2131751893, null)));
                    k0Var.c(arrayList3);
                    arrayList3.add(l41.E(5, org.telegram.messenger.g0.L(14.33f)));
                } else {
                    int i13 = k0Var.f19957l;
                    if (i13 > 0) {
                        int i14 = k0Var.f19961p;
                        if (i13 == i14) {
                            G = gd.M0(2131751884, null);
                        } else {
                            G = gd.G(i13, "CommunityPendingRequestsRow", new Object[0]);
                        }
                        if (i14 > 0) {
                            str = Integer.toString(i14);
                        } else {
                            str = null;
                        }
                        int i15 = mi.i.f21033b;
                        l41 K = l41.K(mi.i.class);
                        K.d = 100;
                        K.f37016k = 2131231167;
                        K.f37018m = G;
                        K.f37020o = str;
                        K.C = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                        K.f37023r = true;
                        arrayList3.add(K);
                        arrayList3.add(l41.E(5, org.telegram.messenger.g0.L(14.33f)));
                    }
                }
                ab.c0 x10 = mp.u1(d0Var.f30187a).x(d0Var.f19903p1);
                ArrayList arrayList4 = (ArrayList) x10.f910e;
                ArrayList arrayList5 = (ArrayList) x10.d;
                ArrayList arrayList6 = (ArrayList) x10.f909c;
                ArrayList arrayList7 = (ArrayList) x10.f908b;
                if (!arrayList7.isEmpty()) {
                    arrayList3.add(l41.t(21, gd.M0(2131751867, null)));
                    int size = arrayList7.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj3 = arrayList7.get(i16);
                        i16++;
                        arrayList3.add(h0.i((qo) obj3, d0Var));
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!arrayList6.isEmpty()) {
                    if (z10) {
                        arrayList3.add(l41.E(22, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(l41.t(23, gd.M0(2131751864, null)));
                    int size2 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        Object obj4 = arrayList6.get(i17);
                        i17++;
                        arrayList3.add(h0.i((qo) obj4, d0Var));
                    }
                    z10 = true;
                }
                if (!arrayList5.isEmpty()) {
                    if (z10) {
                        arrayList3.add(l41.E(24, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(l41.t(25, gd.M0(2131751865, null)));
                    int size3 = arrayList5.size();
                    int i18 = 0;
                    while (i18 < size3) {
                        Object obj5 = arrayList5.get(i18);
                        i18++;
                        arrayList3.add(h0.i((qo) obj5, d0Var));
                    }
                } else {
                    z11 = z10;
                }
                if (!arrayList4.isEmpty()) {
                    if (z11) {
                        arrayList3.add(l41.E(26, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(l41.t(27, gd.M0(2131751862, null)));
                    int size4 = arrayList4.size();
                    while (i10 < size4) {
                        Object obj6 = arrayList4.get(i10);
                        i10++;
                        arrayList3.add(h0.i((qo) obj6, d0Var));
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList8 = (ArrayList) obj;
                z41 z41Var4 = (z41) obj2;
                k0 k0Var2 = d0Var.H1;
                arrayList8.add(l41.E(99, (int) (org.telegram.messenger.g0.f24118q.y * 0.35f)));
                arrayList8.add(l41.E(0, org.telegram.messenger.g0.L(48.0f)));
                if (v3.w(2, d0Var.f19904q1)) {
                    arrayList8.add(l41.B(1, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(gd.M0(2131751883, null), new v(d0Var, 2)), true)));
                } else {
                    arrayList8.add(l41.B(1, gd.M0(2131751882, null)));
                }
                arrayList8.add(l41.j(2, d0Var.G1));
                arrayList8.add(l41.t(3, gd.G(k0Var2.f19957l, "CommunityPendingRequestsSuggestedHeader", new Object[0])));
                k0Var2.c(arrayList8);
                return;
        }
    }
}

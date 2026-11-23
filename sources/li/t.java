package li;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.f3;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.messenger.ro;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.o41;
public final class t implements r10 {
    public final int f19998a;
    public final d0 f19999b;

    public t(d0 d0Var, int i7) {
        this.f19998a = i7;
        this.f19999b = d0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String G;
        String str;
        boolean z10;
        ArrayList arrayList;
        int i7 = this.f19998a;
        boolean z11 = true;
        int i10 = 0;
        d0 d0Var = this.f19999b;
        switch (i7) {
            case 0:
                c51 c51Var = (c51) obj2;
                d0Var.K0((ArrayList) obj, true);
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    org.telegram.ui.Cells.c0.t((FrameLayout) d0Var.f30142b, d0Var.J0, tL_error, false);
                    return;
                } else {
                    d0Var.getClass();
                    return;
                }
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                d0Var.f19903s1.setLoading(false);
                if (tL_error2 != null) {
                    org.telegram.ui.Cells.c0.t((FrameLayout) d0Var.f30142b, d0Var.J0, tL_error2, false);
                    return;
                } else if (arrayList2 != null) {
                    d0Var.L1 = arrayList2;
                    if (arrayList2.isEmpty()) {
                        f3.n(null, 2131751893, new lc((FrameLayout) d0Var.f30142b, d0Var.J0), 2131624068, 36);
                        return;
                    }
                    d0Var.f19908x1.d.f35742g3.O(false);
                    d0Var.f19899o1.A(2);
                    return;
                } else {
                    return;
                }
            case 3:
                c51 c51Var2 = (c51) obj2;
                int i11 = d0.Q1;
                d0Var.K0((ArrayList) obj, false);
                return;
            case 4:
                ArrayList arrayList3 = (ArrayList) obj;
                c51 c51Var3 = (c51) obj2;
                int i12 = d0.Q1;
                arrayList3.add(o41.E(99, Math.min(org.telegram.messenger.g0.L(176.0f) + org.telegram.messenger.g0.f24004m, (int) (org.telegram.messenger.g0.f24010q.y * 0.25f))));
                arrayList3.add(o41.E(0, org.telegram.messenger.g0.L(56.0f)));
                String N0 = hd.N0(2131751837, null);
                o41 o41Var = new o41(39);
                o41Var.d = 101;
                o41Var.f38058m = N0;
                o41Var.A = 0;
                o41Var.L(d0Var.f19902r1);
                arrayList3.add(o41Var);
                arrayList3.add(o41.B(2, hd.N0(2131751836, null)));
                k0 k0Var = d0Var.H1;
                if (k0Var.f19956n && k0Var.f19954l == 1 && (arrayList = k0Var.f19952j) != null && arrayList.size() == 1) {
                    arrayList3.add(o41.t(3, hd.N0(2131751892, null)));
                    k0Var.c(arrayList3);
                    arrayList3.add(o41.E(5, org.telegram.messenger.g0.L(14.33f)));
                } else {
                    int i13 = k0Var.f19954l;
                    if (i13 > 0) {
                        int i14 = k0Var.f19958p;
                        if (i13 == i14) {
                            G = hd.N0(2131751883, null);
                        } else {
                            G = hd.G(i13, "CommunityPendingRequestsRow", new Object[0]);
                        }
                        if (i14 > 0) {
                            str = Integer.toString(i14);
                        } else {
                            str = null;
                        }
                        int i15 = mi.i.f21030b;
                        o41 K = o41.K(mi.i.class);
                        K.d = 100;
                        K.f38056k = 2131231167;
                        K.f38058m = G;
                        K.f38060o = str;
                        K.C = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                        K.f38063r = true;
                        arrayList3.add(K);
                        arrayList3.add(o41.E(5, org.telegram.messenger.g0.L(14.33f)));
                    }
                }
                ab.c0 x10 = np.u1(d0Var.f30139a).x(d0Var.f19900p1);
                ArrayList arrayList4 = (ArrayList) x10.f910e;
                ArrayList arrayList5 = (ArrayList) x10.d;
                ArrayList arrayList6 = (ArrayList) x10.f909c;
                ArrayList arrayList7 = (ArrayList) x10.f908b;
                if (!arrayList7.isEmpty()) {
                    arrayList3.add(o41.t(21, hd.N0(2131751866, null)));
                    int size = arrayList7.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj3 = arrayList7.get(i16);
                        i16++;
                        arrayList3.add(h0.i((ro) obj3, d0Var));
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!arrayList6.isEmpty()) {
                    if (z10) {
                        arrayList3.add(o41.E(22, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(o41.t(23, hd.N0(2131751863, null)));
                    int size2 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        Object obj4 = arrayList6.get(i17);
                        i17++;
                        arrayList3.add(h0.i((ro) obj4, d0Var));
                    }
                    z10 = true;
                }
                if (!arrayList5.isEmpty()) {
                    if (z10) {
                        arrayList3.add(o41.E(24, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(o41.t(25, hd.N0(2131751864, null)));
                    int size3 = arrayList5.size();
                    int i18 = 0;
                    while (i18 < size3) {
                        Object obj5 = arrayList5.get(i18);
                        i18++;
                        arrayList3.add(h0.i((ro) obj5, d0Var));
                    }
                } else {
                    z11 = z10;
                }
                if (!arrayList4.isEmpty()) {
                    if (z11) {
                        arrayList3.add(o41.E(26, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(o41.t(27, hd.N0(2131751861, null)));
                    int size4 = arrayList4.size();
                    while (i10 < size4) {
                        Object obj6 = arrayList4.get(i10);
                        i10++;
                        arrayList3.add(h0.i((ro) obj6, d0Var));
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList8 = (ArrayList) obj;
                c51 c51Var4 = (c51) obj2;
                k0 k0Var2 = d0Var.H1;
                arrayList8.add(o41.E(99, (int) (org.telegram.messenger.g0.f24010q.y * 0.35f)));
                arrayList8.add(o41.E(0, org.telegram.messenger.g0.L(48.0f)));
                if (v3.w(2, d0Var.f19901q1)) {
                    arrayList8.add(o41.B(1, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(hd.N0(2131751882, null), new v(d0Var, 2)), true)));
                } else {
                    arrayList8.add(o41.B(1, hd.N0(2131751881, null)));
                }
                arrayList8.add(o41.j(2, d0Var.G1));
                arrayList8.add(o41.t(3, hd.G(k0Var2.f19954l, "CommunityPendingRequestsSuggestedHeader", new Object[0])));
                k0Var2.c(arrayList8);
                return;
        }
    }
}

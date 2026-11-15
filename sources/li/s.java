package li;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.np;
import org.telegram.messenger.ro;
import org.telegram.messenger.s10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.y0;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.p41;
public final class s implements s10 {
    public final int f19634a;
    public final d0 f19635b;

    public s(d0 d0Var, int i7) {
        this.f19634a = i7;
        this.f19635b = d0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String G;
        String str;
        boolean z10;
        ArrayList arrayList;
        int i7 = this.f19634a;
        boolean z11 = true;
        int i10 = 0;
        d0 d0Var = this.f19635b;
        switch (i7) {
            case 0:
                p41 p41Var = (p41) obj2;
                d0Var.J0((ArrayList) obj, true);
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    y0.q((FrameLayout) d0Var.f29682b, d0Var.J0, tL_error, false);
                    return;
                } else {
                    d0Var.getClass();
                    return;
                }
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                d0Var.f19545s1.setLoading(false);
                if (tL_error2 != null) {
                    y0.q((FrameLayout) d0Var.f29682b, d0Var.J0, tL_error2, false);
                    return;
                } else if (arrayList2 != null) {
                    d0Var.L1 = arrayList2;
                    if (arrayList2.isEmpty()) {
                        k5.n(null, 2131751905, new cc((FrameLayout) d0Var.f29682b, d0Var.J0), 2131624068, 36);
                        return;
                    }
                    d0Var.f19550x1.d.f39895g3.O(false);
                    d0Var.f19541o1.C(2);
                    return;
                } else {
                    return;
                }
            case 3:
                p41 p41Var2 = (p41) obj2;
                int i11 = d0.Q1;
                d0Var.J0((ArrayList) obj, false);
                return;
            case 4:
                ArrayList arrayList3 = (ArrayList) obj;
                p41 p41Var3 = (p41) obj2;
                int i12 = d0.Q1;
                arrayList3.add(b41.E(99, Math.min(org.telegram.messenger.g0.L(176.0f) + org.telegram.messenger.g0.f23603m, (int) (org.telegram.messenger.g0.f23609q.y * 0.25f))));
                arrayList3.add(b41.E(0, org.telegram.messenger.g0.L(56.0f)));
                String M0 = hd.M0(2131751849, null);
                b41 b41Var = new b41(39);
                b41Var.d = 101;
                b41Var.f33181l = M0;
                b41Var.f33194z = 0;
                b41Var.L(d0Var.f19544r1);
                arrayList3.add(b41Var);
                arrayList3.add(b41.B(2, hd.M0(2131751848, null)));
                k0 k0Var = d0Var.H1;
                if (k0Var.f19602n && k0Var.f19600l == 1 && (arrayList = k0Var.f19598j) != null && arrayList.size() == 1) {
                    arrayList3.add(b41.t(3, hd.M0(2131751904, null)));
                    k0Var.c(arrayList3);
                    arrayList3.add(b41.E(5, org.telegram.messenger.g0.L(14.33f)));
                } else {
                    int i13 = k0Var.f19600l;
                    if (i13 > 0) {
                        int i14 = k0Var.f19604p;
                        if (i13 == i14) {
                            G = hd.M0(2131751895, null);
                        } else {
                            G = hd.G(i13, "CommunityPendingRequestsRow", new Object[0]);
                        }
                        if (i14 > 0) {
                            str = Integer.toString(i14);
                        } else {
                            str = null;
                        }
                        int i15 = mi.i.f20672b;
                        b41 K = b41.K(mi.i.class);
                        K.d = 100;
                        K.f33180k = 2131231167;
                        K.f33181l = G;
                        K.f33183n = str;
                        K.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                        K.f33186q = true;
                        arrayList3.add(K);
                        arrayList3.add(b41.E(5, org.telegram.messenger.g0.L(14.33f)));
                    }
                }
                ab.c0 x10 = np.s1(d0Var.f29679a).x(d0Var.f19542p1);
                ArrayList arrayList4 = (ArrayList) x10.f911e;
                ArrayList arrayList5 = (ArrayList) x10.d;
                ArrayList arrayList6 = (ArrayList) x10.f910c;
                ArrayList arrayList7 = (ArrayList) x10.f909b;
                if (!arrayList7.isEmpty()) {
                    arrayList3.add(b41.t(21, hd.M0(2131751878, null)));
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
                        arrayList3.add(b41.E(22, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(b41.t(23, hd.M0(2131751875, null)));
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
                        arrayList3.add(b41.E(24, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(b41.t(25, hd.M0(2131751876, null)));
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
                        arrayList3.add(b41.E(26, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(b41.t(27, hd.M0(2131751873, null)));
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
                p41 p41Var4 = (p41) obj2;
                k0 k0Var2 = d0Var.H1;
                arrayList8.add(b41.E(99, (int) (org.telegram.messenger.g0.f23609q.y * 0.35f)));
                arrayList8.add(b41.E(0, org.telegram.messenger.g0.L(48.0f)));
                if (t3.w(2, d0Var.f19543q1)) {
                    arrayList8.add(b41.B(1, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(hd.M0(2131751894, null), new u(d0Var, 2)), true)));
                } else {
                    arrayList8.add(b41.B(1, hd.M0(2131751893, null)));
                }
                arrayList8.add(b41.j(2, d0Var.G1));
                arrayList8.add(b41.t(3, hd.G(k0Var2.f19600l, "CommunityPendingRequestsSuggestedHeader", new Object[0])));
                k0Var2.c(arrayList8);
                return;
        }
    }
}

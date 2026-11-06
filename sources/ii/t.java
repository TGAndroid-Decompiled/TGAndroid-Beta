package ii;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.messenger.uo;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.x31;
public final class t implements v10 {
    public final int f15604a;
    public final d0 f15605b;

    public t(d0 d0Var, int i7) {
        this.f15604a = i7;
        this.f15605b = d0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String G;
        String str;
        boolean z9;
        ArrayList arrayList;
        int i7 = this.f15604a;
        boolean z10 = true;
        int i10 = 0;
        d0 d0Var = this.f15605b;
        switch (i7) {
            case 0:
                l41 l41Var = (l41) obj2;
                d0Var.J0((ArrayList) obj, true);
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    f1.r((FrameLayout) d0Var.f28616b, d0Var.I0, tL_error, false);
                    return;
                } else {
                    d0Var.getClass();
                    return;
                }
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                d0Var.f15504o1.setLoading(false);
                if (tL_error2 != null) {
                    f1.r((FrameLayout) d0Var.f28616b, d0Var.I0, tL_error2, false);
                    return;
                } else if (arrayList2 != null) {
                    d0Var.H1 = arrayList2;
                    if (arrayList2.isEmpty()) {
                        k5.o(null, 2131751905, new hc((FrameLayout) d0Var.f28616b, d0Var.I0), 2131624067, 36);
                        return;
                    }
                    d0Var.f15509t1.d.f37160f3.O(false);
                    d0Var.f15502k1.E(2);
                    return;
                } else {
                    return;
                }
            case 3:
                l41 l41Var2 = (l41) obj2;
                int i11 = d0.M1;
                d0Var.J0((ArrayList) obj, false);
                return;
            case 4:
                ArrayList arrayList3 = (ArrayList) obj;
                l41 l41Var3 = (l41) obj2;
                int i12 = d0.M1;
                arrayList3.add(x31.E(99, Math.min(org.telegram.messenger.g0.L(176.0f) + org.telegram.messenger.g0.f22538m, (int) (org.telegram.messenger.g0.f22544q.y * 0.25f))));
                arrayList3.add(x31.E(0, org.telegram.messenger.g0.L(56.0f)));
                String M0 = hd.M0(2131751849, null);
                x31 x31Var = new x31(39);
                x31Var.d = 101;
                x31Var.f40159l = M0;
                x31Var.f40172z = 0;
                x31Var.L(d0Var.n1);
                arrayList3.add(x31Var);
                arrayList3.add(x31.B(2, hd.M0(2131751848, null)));
                l0 l0Var = d0Var.D1;
                if (l0Var.f15569n && l0Var.f15567l == 1 && (arrayList = l0Var.f15565j) != null && arrayList.size() == 1) {
                    arrayList3.add(x31.t(3, hd.M0(2131751904, null)));
                    l0Var.c(arrayList3);
                    arrayList3.add(x31.E(5, org.telegram.messenger.g0.L(14.33f)));
                } else {
                    int i13 = l0Var.f15567l;
                    if (i13 > 0) {
                        int i14 = l0Var.f15571p;
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
                        int i15 = ji.i.f17095b;
                        x31 K = x31.K(ji.i.class);
                        K.d = 100;
                        K.f40158k = 2131231167;
                        K.f40159l = G;
                        K.f40161n = str;
                        K.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                        K.f40164q = true;
                        arrayList3.add(K);
                        arrayList3.add(x31.E(5, org.telegram.messenger.g0.L(14.33f)));
                    }
                }
                ui.e x10 = qp.s1(d0Var.f28613a).x(d0Var.l1);
                ArrayList arrayList4 = (ArrayList) x10.f56840e;
                ArrayList arrayList5 = (ArrayList) x10.d;
                ArrayList arrayList6 = (ArrayList) x10.f56839c;
                ArrayList arrayList7 = (ArrayList) x10.f56838b;
                if (!arrayList7.isEmpty()) {
                    arrayList3.add(x31.t(21, hd.M0(2131751878, null)));
                    int size = arrayList7.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj3 = arrayList7.get(i16);
                        i16++;
                        arrayList3.add(i0.i((uo) obj3, d0Var));
                    }
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!arrayList6.isEmpty()) {
                    if (z9) {
                        arrayList3.add(x31.E(22, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(x31.t(23, hd.M0(2131751875, null)));
                    int size2 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        Object obj4 = arrayList6.get(i17);
                        i17++;
                        arrayList3.add(i0.i((uo) obj4, d0Var));
                    }
                    z9 = true;
                }
                if (!arrayList5.isEmpty()) {
                    if (z9) {
                        arrayList3.add(x31.E(24, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(x31.t(25, hd.M0(2131751876, null)));
                    int size3 = arrayList5.size();
                    int i18 = 0;
                    while (i18 < size3) {
                        Object obj5 = arrayList5.get(i18);
                        i18++;
                        arrayList3.add(i0.i((uo) obj5, d0Var));
                    }
                } else {
                    z10 = z9;
                }
                if (!arrayList4.isEmpty()) {
                    if (z10) {
                        arrayList3.add(x31.E(26, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(x31.t(27, hd.M0(2131751873, null)));
                    int size4 = arrayList4.size();
                    while (i10 < size4) {
                        Object obj6 = arrayList4.get(i10);
                        i10++;
                        arrayList3.add(i0.i((uo) obj6, d0Var));
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList8 = (ArrayList) obj;
                l41 l41Var4 = (l41) obj2;
                l0 l0Var2 = d0Var.D1;
                arrayList8.add(x31.E(99, (int) (org.telegram.messenger.g0.f22544q.y * 0.35f)));
                arrayList8.add(x31.E(0, org.telegram.messenger.g0.L(48.0f)));
                if (t3.w(2, d0Var.f15503m1)) {
                    arrayList8.add(x31.B(1, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(hd.M0(2131751894, null), new v(d0Var, 2)), true)));
                } else {
                    arrayList8.add(x31.B(1, hd.M0(2131751893, null)));
                }
                arrayList8.add(x31.j(2, d0Var.C1));
                arrayList8.add(x31.t(3, hd.G(l0Var2.f15567l, "CommunityPendingRequestsSuggestedHeader", new Object[0])));
                l0Var2.c(arrayList8);
                return;
        }
    }
}

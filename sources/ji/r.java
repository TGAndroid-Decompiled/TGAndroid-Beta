package ji;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.k5;
import org.telegram.messenger.lo;
import org.telegram.messenger.n10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.r31;
public final class r implements n10 {
    public final int f16366a;
    public final b0 f16367b;

    public r(b0 b0Var, int i3) {
        this.f16366a = i3;
        this.f16367b = b0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String G;
        String str;
        boolean z10;
        ArrayList arrayList;
        int i3 = this.f16366a;
        boolean z11 = true;
        int i10 = 0;
        b0 b0Var = this.f16367b;
        switch (i3) {
            case 0:
                f41 f41Var = (f41) obj2;
                b0Var.J0((ArrayList) obj, true);
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    f1.v((FrameLayout) b0Var.f28586b, b0Var.J0, tL_error, false);
                    return;
                } else {
                    b0Var.getClass();
                    return;
                }
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                b0Var.f16268p1.setLoading(false);
                if (tL_error2 != null) {
                    f1.v((FrameLayout) b0Var.f28586b, b0Var.J0, tL_error2, false);
                    return;
                } else if (arrayList2 != null) {
                    b0Var.I1 = arrayList2;
                    if (arrayList2.isEmpty()) {
                        k5.o(null, 2131751905, new fc((FrameLayout) b0Var.f28586b, b0Var.J0), 2131624067, 36);
                        return;
                    }
                    b0Var.f16273u1.d.f35594g3.O(false);
                    b0Var.f16265l1.D(2);
                    return;
                } else {
                    return;
                }
            case 3:
                f41 f41Var2 = (f41) obj2;
                int i11 = b0.N1;
                b0Var.J0((ArrayList) obj, false);
                return;
            case 4:
                ArrayList arrayList3 = (ArrayList) obj;
                f41 f41Var3 = (f41) obj2;
                int i12 = b0.N1;
                arrayList3.add(r31.E(99, Math.min(org.telegram.messenger.g0.L(176.0f) + org.telegram.messenger.g0.f22602m, (int) (org.telegram.messenger.g0.f22608q.y * 0.25f))));
                arrayList3.add(r31.E(0, org.telegram.messenger.g0.L(56.0f)));
                String M0 = bd.M0(2131751849, null);
                r31 r31Var = new r31(39);
                r31Var.d = 101;
                r31Var.f37627l = M0;
                r31Var.f37640z = 0;
                r31Var.L(b0Var.f16267o1);
                arrayList3.add(r31Var);
                arrayList3.add(r31.B(2, bd.M0(2131751848, null)));
                i0 i0Var = b0Var.E1;
                if (i0Var.f16324n && i0Var.f16322l == 1 && (arrayList = i0Var.f16320j) != null && arrayList.size() == 1) {
                    arrayList3.add(r31.t(3, bd.M0(2131751904, null)));
                    i0Var.c(arrayList3);
                    arrayList3.add(r31.E(5, org.telegram.messenger.g0.L(14.33f)));
                } else {
                    int i13 = i0Var.f16322l;
                    if (i13 > 0) {
                        int i14 = i0Var.f16326p;
                        if (i13 == i14) {
                            G = bd.M0(2131751895, null);
                        } else {
                            G = bd.G(i13, "CommunityPendingRequestsRow", new Object[0]);
                        }
                        if (i14 > 0) {
                            str = Integer.toString(i14);
                        } else {
                            str = null;
                        }
                        int i15 = ki.i.f17340b;
                        r31 K = r31.K(ki.i.class);
                        K.d = 100;
                        K.f37626k = 2131231167;
                        K.f37627l = G;
                        K.f37629n = str;
                        K.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                        K.f37632q = true;
                        arrayList3.add(K);
                        arrayList3.add(r31.E(5, org.telegram.messenger.g0.L(14.33f)));
                    }
                }
                ui.f x10 = hp.s1(b0Var.f28583a).x(b0Var.m1);
                ArrayList arrayList4 = (ArrayList) x10.f56392e;
                ArrayList arrayList5 = (ArrayList) x10.d;
                ArrayList arrayList6 = (ArrayList) x10.f56391c;
                ArrayList arrayList7 = (ArrayList) x10.f56390b;
                if (!arrayList7.isEmpty()) {
                    arrayList3.add(r31.t(21, bd.M0(2131751878, null)));
                    int size = arrayList7.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj3 = arrayList7.get(i16);
                        i16++;
                        arrayList3.add(f0.i((lo) obj3, b0Var));
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!arrayList6.isEmpty()) {
                    if (z10) {
                        arrayList3.add(r31.E(22, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(r31.t(23, bd.M0(2131751875, null)));
                    int size2 = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        Object obj4 = arrayList6.get(i17);
                        i17++;
                        arrayList3.add(f0.i((lo) obj4, b0Var));
                    }
                    z10 = true;
                }
                if (!arrayList5.isEmpty()) {
                    if (z10) {
                        arrayList3.add(r31.E(24, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(r31.t(25, bd.M0(2131751876, null)));
                    int size3 = arrayList5.size();
                    int i18 = 0;
                    while (i18 < size3) {
                        Object obj5 = arrayList5.get(i18);
                        i18++;
                        arrayList3.add(f0.i((lo) obj5, b0Var));
                    }
                } else {
                    z11 = z10;
                }
                if (!arrayList4.isEmpty()) {
                    if (z11) {
                        arrayList3.add(r31.E(26, org.telegram.messenger.g0.L(12.0f)));
                    }
                    arrayList3.add(r31.t(27, bd.M0(2131751873, null)));
                    int size4 = arrayList4.size();
                    while (i10 < size4) {
                        Object obj6 = arrayList4.get(i10);
                        i10++;
                        arrayList3.add(f0.i((lo) obj6, b0Var));
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList8 = (ArrayList) obj;
                f41 f41Var4 = (f41) obj2;
                i0 i0Var2 = b0Var.E1;
                arrayList8.add(r31.E(99, (int) (org.telegram.messenger.g0.f22608q.y * 0.35f)));
                arrayList8.add(r31.E(0, org.telegram.messenger.g0.L(48.0f)));
                if (t3.w(2, b0Var.f16266n1)) {
                    arrayList8.add(r31.B(1, org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(bd.M0(2131751894, null), new t(b0Var, 2)), true)));
                } else {
                    arrayList8.add(r31.B(1, bd.M0(2131751893, null)));
                }
                arrayList8.add(r31.j(2, b0Var.D1));
                arrayList8.add(r31.t(3, bd.G(i0Var2.f16322l, "CommunityPendingRequestsSuggestedHeader", new Object[0])));
                i0Var2.c(arrayList8);
                return;
        }
    }
}

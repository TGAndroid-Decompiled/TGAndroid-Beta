package ag;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.gp;
import org.telegram.messenger.o5;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.u70;
import org.telegram.ui.b50;
import org.telegram.ui.dd1;
import org.telegram.ui.f40;
import org.telegram.ui.i00;
import org.telegram.ui.mk;
import org.telegram.ui.un;
import org.telegram.ui.y6;
import th.e5;
import th.m5;
public final class w0 implements dd1, m4.h1, e2.j, nh.m, org.telegram.ui.ActionBar.u1, rf.l, gp, m5 {
    public final int f768a;
    public final boolean f769b;
    public final Object f770c;

    public w0(int i10, Object obj, boolean z10) {
        this.f768a = i10;
        this.f770c = obj;
        this.f769b = z10;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        u70 u70Var = (u70) this.f770c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            u70Var.setOnDismissListener(new o70(0, u70Var, this.f769b));
        }
        u70Var.dismiss();
        return false;
    }

    @Override
    public void accept(Object obj) {
        ((m4.n1) obj).N0((b2.f) this.f770c, this.f769b);
    }

    @Override
    public void c(boolean z10) {
        th.m mVar = (th.m) this.f770c;
        if (!this.f769b && z10) {
            boolean z11 = true;
            if (mVar.f49197b != 1) {
                z11 = false;
            }
            e5 e5Var = mVar.f49218s;
            if (z11) {
                if (!e5Var.f48925z) {
                    return;
                }
            } else if (!e5Var.f48916p) {
                return;
            }
            e5Var.T(z11);
        }
    }

    @Override
    public void e(int i10, ArrayList arrayList) {
        switch (this.f768a) {
            case 0:
                x0 x0Var = (x0) this.f770c;
                ArrayList arrayList2 = x0Var.f790k;
                ArrayList arrayList3 = x0Var.f789j;
                int i11 = 0;
                if (this.f769b) {
                    x0Var.f786f = i10;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i11 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i11));
                        i11++;
                    }
                } else {
                    x0Var.f787g = i10;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    while (i11 < arrayList2.size()) {
                        arrayList3.remove(arrayList2.get(i11));
                        i11++;
                    }
                }
                x0Var.e.run();
                return;
            default:
                i00 i00Var = (i00) this.f770c;
                LongSparseIntArray longSparseIntArray = i00Var.H;
                i00Var.D = i10;
                if (this.f769b) {
                    i00Var.t0(i00Var.F, arrayList, true);
                    i00Var.F = arrayList;
                    for (int i12 = 0; i12 < i00Var.F.size(); i12++) {
                        i00Var.G.remove(i00Var.F.get(i12));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        long keyAt = longSparseIntArray.keyAt(i13);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!o5.C(keyAt) && !i00Var.F.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i14)).longValue());
                    }
                } else {
                    i00Var.t0(i00Var.G, arrayList, false);
                    i00Var.G = arrayList;
                    for (int i15 = 0; i15 < i00Var.G.size(); i15++) {
                        Long l4 = (Long) i00Var.G.get(i15);
                        i00Var.F.remove(l4);
                        longSparseIntArray.delete(l4.longValue());
                    }
                }
                i00Var.o0();
                i00Var.n0(false);
                i00Var.B0();
                return;
        }
    }

    @Override
    public Object f(m4.f0 f0Var, m4.w wVar, int i10) {
        int m0;
        long M0;
        int m02;
        long M02;
        switch (this.f768a) {
            case 1:
                e9.x1 y3 = e9.n0.y((b2.p0) this.f770c);
                boolean z10 = this.f769b;
                if (z10) {
                    m0 = -1;
                } else {
                    m0 = f0Var.f12754t.m0();
                }
                int i11 = m0;
                if (z10) {
                    M0 = -9223372036854775807L;
                } else {
                    M0 = f0Var.f12754t.M0();
                }
                return f0Var.q(wVar, y3, i11, M0);
            default:
                List list = (List) this.f770c;
                boolean z11 = this.f769b;
                if (z11) {
                    m02 = -1;
                } else {
                    m02 = f0Var.f12754t.m0();
                }
                int i12 = m02;
                if (z11) {
                    M02 = -9223372036854775807L;
                } else {
                    M02 = f0Var.f12754t.M0();
                }
                return f0Var.q(wVar, list, i12, M02);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11;
        switch (this.f768a) {
            case 5:
                y6.c0((y6) this.f770c, this.f769b);
                return;
            case 6:
            default:
                b50 b50Var = ((f40) this.f770c).f37176b;
                b50Var.R2.A(0, null);
                UndoView m12 = b50Var.m1();
                if (this.f769b) {
                    i11 = 101;
                } else {
                    i11 = 40;
                }
                m12.j(i11, 0L, null);
                return;
            case 7:
                un unVar = (un) this.f770c;
                mk mkVar = unVar.Z;
                if (mkVar != null) {
                    if (this.f769b) {
                        unVar.finishFragment();
                        return;
                    } else {
                        mkVar.x();
                        return;
                    }
                }
                return;
            case 8:
                Activity activity = (Activity) this.f770c;
                if (activity != null) {
                    if (this.f769b && mf.b.a(activity) == -2) {
                        try {
                            activity.startActivity(new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS", Uri.parse("package:" + activity.getPackageName())));
                            return;
                        } catch (Exception e) {
                            f8.g(e, true);
                        }
                    }
                    try {
                        activity.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + activity.getPackageName())));
                        return;
                    } catch (Exception e7) {
                        f8.g(e7, true);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void l(long j10) {
        e6 e6Var = ((org.telegram.ui.Cells.w1) this.f770c).f23352a.f22778x3;
        if (e6Var != null) {
            e6Var.t(cd.M((int) j10, this.f769b), true, true);
        }
    }

    @Override
    public void m(nh.i iVar, float f7, float f10) {
        nh.p pVar = (nh.p) this.f770c;
        if (!pVar.d && !pVar.e && !pVar.f13890f && this.f769b) {
            pVar.c(f7, f10);
        }
    }
}

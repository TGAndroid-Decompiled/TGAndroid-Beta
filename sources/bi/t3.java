package bi;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.pa;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.bv;
import org.telegram.ui.cv;
import org.telegram.ui.fe;
import org.telegram.ui.ig0;
import org.telegram.ui.mo0;
import org.telegram.ui.ns;
import org.telegram.ui.un;
import org.telegram.ui.zx;
public final class t3 extends s4.s0 {
    public final int f3363a;
    public final Object f3364b;
    public final Object f3365c;

    public t3(int i10, Object obj, Object obj2) {
        this.f3363a = i10;
        this.f3365c = obj;
        this.f3364b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f3363a) {
            case 0:
                if (i10 == 0) {
                    ((d4) this.f3365c).f2950u3.V();
                    return;
                }
                return;
            case 2:
                ((s4.s0) this.f3364b).a(recyclerView, i10);
                ((o90) this.f3365c).D.getClass();
                return;
            case 7:
                cv cvVar = (cv) this.f3365c;
                bv[] bvVarArr = cvVar.f36418f;
                ((s4.s0) this.f3364b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i11 = (int) (-cv.m0(cvVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 < currentActionBarHeight / 2) {
                            int i12 = -i11;
                            bvVarArr[0].d.w0(0, i12, null);
                            ag.b1 b1Var = bvVarArr[0].e;
                            if (b1Var != null) {
                                b1Var.w0(0, i12, null);
                                return;
                            }
                            return;
                        }
                        int i13 = currentActionBarHeight - i11;
                        bvVarArr[0].d.w0(0, i13, null);
                        ag.b1 b1Var2 = bvVarArr[0].e;
                        if (b1Var2 != null) {
                            b1Var2.w0(0, i13, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                mo0 mo0Var = (mo0) this.f3365c;
                org.telegram.ui.ActionBar.h5[] h5VarArr = mo0Var.f39589n;
                ((s4.s0) this.f3364b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i14 = (int) (-mo0.j0(mo0Var).getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 < currentActionBarHeight2 / 2) {
                            ((uk0) h5VarArr[0].f20382f).w0(0, -i14, null);
                            return;
                        } else {
                            ((uk0) h5VarArr[0].f20382f).w0(0, currentActionBarHeight2 - i14, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        View F;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList;
        switch (this.f3363a) {
            case 0:
                d4 d4Var = (d4) this.f3365c;
                ((b4) this.f3364b).E(i11);
                d4Var.f2950u3.G();
                n1 n1Var = d4Var.S3;
                if (n1Var != null && (F = d4Var.F(n1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= d4Var.getHeight()) {
                        d4Var.S3 = null;
                        n1Var.clearFocus();
                        org.telegram.messenger.i0.v1(d4Var);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ih.r rVar = (ih.r) this.f3365c;
                ih.q qVar = (ih.q) this.f3364b;
                if (!qVar.h && !qVar.f8573i) {
                    if ((rVar.f8577c.f31183f3.D.size() - 1) - rVar.f8577c.f31182e3.M0() < 5) {
                        qVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((s4.s0) this.f3364b).b(recyclerView, i10, i11);
                ((o90) this.f3365c).D.b(recyclerView, i10, i11);
                return;
            case 3:
                v51 v51Var = ((fe) this.f3365c).f37112a;
                if (v51Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < v51Var.getChildCount(); i15++) {
                        if (!(v51Var.getChildAt(i15) instanceof zz)) {
                        }
                    }
                    return;
                }
                ((ag.d3) this.f3364b).run();
                return;
            case 4:
                un unVar = (un) this.f3365c;
                if (recyclerView.getScrollState() == 1) {
                    org.telegram.messenger.i0.v1(unVar.l1);
                }
                int N0 = ((s4.a0) this.f3364b).N0();
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0 && N0 > unVar.f41992a4.h - 5) {
                    if (unVar.f42059f4 == 7) {
                        if (!unVar.W6 && !unVar.S6[0]) {
                            unVar.W6 = true;
                            unVar.f42284x6.add(Integer.valueOf(unVar.f42132l6));
                            i13 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                            pa a2 = pa.a(i13);
                            String str = unVar.I3;
                            i14 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
                            int i16 = unVar.f42021c4;
                            int i17 = unVar.f42132l6;
                            unVar.f42132l6 = i17 + 1;
                            a2.e(i14, i16, str, i17);
                            return;
                        }
                        return;
                    }
                    unVar.getMediaDataController().O0();
                    return;
                }
                return;
            case 5:
                zx zxVar = (zx) this.f3364b;
                cg0 cg0Var = (cg0) this.f3365c;
                v51 v51Var2 = cg0Var.f25108c;
                if (TextUtils.isEmpty(cg0Var.f25114x)) {
                    arrayList = cg0Var.e;
                } else {
                    arrayList = cg0Var.f25110n;
                }
                if (!arrayList.isEmpty()) {
                    if (v51Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < v51Var2.getChildCount(); i18++) {
                            if (!(v51Var2.getChildAt(i18) instanceof zz)) {
                            }
                        }
                    }
                    cg0Var.a(false);
                }
                if (v51Var2.I1 && !cg0Var.Q && zxVar.getParentActivity() != null) {
                    org.telegram.messenger.i0.v1(zxVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 6:
                if (((ns) this.f3365c).W.I1) {
                    org.telegram.messenger.i0.v1((FrameLayout) this.f3364b);
                    return;
                }
                return;
            case 7:
                ((s4.s0) this.f3364b).b(recyclerView, i10, i11);
                cv cvVar = (cv) this.f3365c;
                bv bvVar = cvVar.f36418f[0];
                if (recyclerView == bvVar.d || recyclerView == bvVar.e) {
                    float translationY = cv.n0(cvVar).getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        cv.o0(cvVar, f7);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ig0 ig0Var = (ig0) this.f3365c;
                if (ig0Var.f38029b0 && !ig0Var.W) {
                    if (ig0Var.X - ((dh.f) this.f3364b).N0() < 10) {
                        ig0Var.j0(true);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((s4.s0) this.f3364b).b(recyclerView, i10, i11);
                mo0 mo0Var = (mo0) this.f3365c;
                if (recyclerView == ((uk0) mo0Var.f39589n[0].f20382f)) {
                    float translationY2 = mo0.k0(mo0Var).getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        mo0.l0(mo0Var, f10);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ph.f2 f2Var = (ph.f2) this.f3365c;
                ii iiVar = f2Var.f45056f;
                if (f2Var.isAttachedToWindow()) {
                    if (iiVar.canScrollVertically(1)) {
                        for (int i19 = 0; i19 < iiVar.getChildCount(); i19++) {
                            if (!(iiVar.getChildAt(i19) instanceof zz)) {
                            }
                        }
                    }
                    f2Var.e.b();
                }
                ((wq0) this.f3364b).p();
                return;
            default:
                qh.q qVar2 = (qh.q) this.f3364b;
                float translationY3 = qVar2.getTranslationY();
                float f11 = ((qh.i0) this.f3365c).f45659d0;
                if (translationY3 != f11) {
                    qVar2.setTranslationY(f11);
                    qVar2.invalidate();
                    return;
                }
                return;
        }
    }
}

package bi;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.na;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.du;
import org.telegram.ui.eu;
import org.telegram.ui.ff0;
import org.telegram.ui.fn0;
import org.telegram.ui.qr;
import org.telegram.ui.rd;
public final class g6 extends v4.u0 {
    public final int f3686a;
    public final Object f3687b;
    public final Object f3688c;

    public g6(int i7, Object obj, Object obj2) {
        this.f3686a = i7;
        this.f3688c = obj;
        this.f3687b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.f3686a) {
            case 2:
                if (i7 == 0) {
                    ((oi.t3) this.f3688c).f22440v3.V();
                    return;
                }
                return;
            case 7:
                eu euVar = (eu) this.f3688c;
                du[] duVarArr = euVar.f47388f;
                ((v4.u0) this.f3687b).a(recyclerView, i7);
                if (i7 != 1) {
                    int i10 = (int) (-eu.m0(euVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i10 != 0 && i10 != currentActionBarHeight) {
                        if (i10 < currentActionBarHeight / 2) {
                            int i11 = -i10;
                            duVarArr[0].d.w0(0, i11, null);
                            di.b1 b1Var = duVarArr[0].f47043e;
                            if (b1Var != null) {
                                b1Var.w0(0, i11, null);
                                return;
                            }
                            return;
                        }
                        int i12 = currentActionBarHeight - i10;
                        duVarArr[0].d.w0(0, i12, null);
                        di.b1 b1Var2 = duVarArr[0].f47043e;
                        if (b1Var2 != null) {
                            b1Var2.w0(0, i12, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                fn0 fn0Var = (fn0) this.f3688c;
                org.telegram.ui.ActionBar.y4[] y4VarArr = fn0Var.f47799n;
                ((v4.u0) this.f3687b).a(recyclerView, i7);
                if (i7 != 1) {
                    int i13 = (int) (-fn0.j0(fn0Var).getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i13 != 0 && i13 != currentActionBarHeight2) {
                        if (i13 < currentActionBarHeight2 / 2) {
                            ((ek0) y4VarArr[0].f30306f).w0(0, -i13, null);
                            return;
                        } else {
                            ((ek0) y4VarArr[0].f30306f).w0(0, currentActionBarHeight2 - i13, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 11:
                ((v4.u0) this.f3687b).a(recyclerView, i7);
                ((l90) this.f3688c).D.getClass();
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        View F;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList;
        switch (this.f3686a) {
            case 0:
                m6 m6Var = (m6) this.f3688c;
                f6 f6Var = m6Var.f3901f;
                if (m6Var.isAttachedToWindow()) {
                    if (f6Var.canScrollVertically(1)) {
                        for (int i14 = 0; i14 < f6Var.getChildCount(); i14++) {
                            if (!(f6Var.getChildAt(i14) instanceof yz)) {
                            }
                        }
                    }
                    m6Var.f3900e.a();
                }
                ((gq0) this.f3687b).p();
                return;
            case 1:
                ci.r rVar = (ci.r) this.f3687b;
                float translationY = rVar.getTranslationY();
                float f10 = ((ci.j0) this.f3688c).f5710e0;
                if (translationY != f10) {
                    rVar.setTranslationY(f10);
                    rVar.invalidate();
                    return;
                }
                return;
            case 2:
                oi.t3 t3Var = (oi.t3) this.f3688c;
                ((oi.r3) this.f3687b).b0(i10);
                t3Var.f22440v3.G();
                oi.f1 f1Var = t3Var.T3;
                if (f1Var != null && (F = t3Var.F(f1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= t3Var.getHeight()) {
                        t3Var.T3 = null;
                        f1Var.clearFocus();
                        org.telegram.messenger.g0.v1(t3Var);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                h51 h51Var = ((rd) this.f3688c).f51557a;
                if (h51Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < h51Var.getChildCount(); i15++) {
                        if (!(h51Var.getChildAt(i15) instanceof yz)) {
                        }
                    }
                    return;
                }
                ((ai.c1) this.f3687b).run();
                return;
            case 4:
                bn bnVar = (bn) this.f3688c;
                if (recyclerView.getScrollState() == 1) {
                    org.telegram.messenger.g0.v1(bnVar.f46111m1);
                }
                int N0 = ((v4.c0) this.f3687b).N0();
                if (N0 == -1) {
                    i11 = 0;
                } else {
                    i11 = N0;
                }
                if (i11 > 0 && N0 > bnVar.f45969b4.h - 5) {
                    if (bnVar.f46036g4 == 7) {
                        if (!bnVar.Y6 && !bnVar.U6[0]) {
                            bnVar.Y6 = true;
                            bnVar.f46281z6.add(Integer.valueOf(bnVar.f46127n6));
                            i12 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                            na a10 = na.a(i12);
                            String str = bnVar.J3;
                            i13 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
                            int i16 = bnVar.f45996d4;
                            int i17 = bnVar.f46127n6;
                            bnVar.f46127n6 = i17 + 1;
                            a10.e(i13, i16, i17, str);
                            return;
                        }
                        return;
                    }
                    bnVar.getMediaDataController().R0();
                    return;
                }
                return;
            case 5:
                cx cxVar = (cx) this.f3687b;
                of0 of0Var = (of0) this.f3688c;
                h51 h51Var2 = of0Var.f38179c;
                if (TextUtils.isEmpty(of0Var.f38186x)) {
                    arrayList = of0Var.f38180e;
                } else {
                    arrayList = of0Var.f38182n;
                }
                if (!arrayList.isEmpty()) {
                    if (h51Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < h51Var2.getChildCount(); i18++) {
                            if (!(h51Var2.getChildAt(i18) instanceof yz)) {
                            }
                        }
                    }
                    of0Var.a(false);
                }
                if (h51Var2.J1 && !of0Var.R && cxVar.getParentActivity() != null) {
                    org.telegram.messenger.g0.v1(cxVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 6:
                if (((qr) this.f3688c).X.J1) {
                    org.telegram.messenger.g0.v1((FrameLayout) this.f3687b);
                    return;
                }
                return;
            case 7:
                ((v4.u0) this.f3687b).b(recyclerView, i7, i10);
                eu euVar = (eu) this.f3688c;
                du duVar = euVar.f47388f[0];
                if (recyclerView == duVar.d || recyclerView == duVar.f47043e) {
                    float translationY2 = eu.n0(euVar).getTranslationY();
                    float f11 = translationY2 - i10;
                    if (f11 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY2) {
                        eu.o0(euVar, f11);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ff0 ff0Var = (ff0) this.f3688c;
                if (ff0Var.f47694c0 && !ff0Var.X) {
                    if (ff0Var.Y - ((jg.b0) this.f3687b).N0() < 10) {
                        ff0Var.j0(true);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((v4.u0) this.f3687b).b(recyclerView, i7, i10);
                fn0 fn0Var = (fn0) this.f3688c;
                if (recyclerView == ((ek0) fn0Var.f47799n[0].f30306f)) {
                    float translationY3 = fn0.k0(fn0Var).getTranslationY();
                    float f12 = translationY3 - i10;
                    if (f12 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f12 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f12 > 0.0f) {
                        f12 = 0.0f;
                    }
                    if (f12 != translationY3) {
                        fn0.l0(fn0Var, f12);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                sh.n nVar = (sh.n) this.f3688c;
                sh.m mVar = (sh.m) this.f3687b;
                if (!mVar.h && !mVar.f57513i) {
                    if ((nVar.f57517c.f35790g3.E.size() - 1) - nVar.f57517c.f35789f3.M0() < 5) {
                        mVar.a();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((v4.u0) this.f3687b).b(recyclerView, i7, i10);
                ((l90) this.f3688c).D.b(recyclerView, i7, i10);
                return;
        }
    }
}

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
public final class j6 extends v4.t0 {
    public final int f3726a;
    public final Object f3727b;
    public final Object f3728c;

    public j6(int i7, Object obj, Object obj2) {
        this.f3726a = i7;
        this.f3728c = obj;
        this.f3727b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.f3726a) {
            case 2:
                if (i7 == 0) {
                    ((oi.s3) this.f3728c).f22377v3.V();
                    return;
                }
                return;
            case 7:
                eu euVar = (eu) this.f3728c;
                du[] duVarArr = euVar.f47345f;
                ((v4.t0) this.f3727b).a(recyclerView, i7);
                if (i7 != 1) {
                    int i10 = (int) (-eu.m0(euVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i10 != 0 && i10 != currentActionBarHeight) {
                        if (i10 < currentActionBarHeight / 2) {
                            int i11 = -i10;
                            duVarArr[0].d.w0(0, i11, null);
                            di.b1 b1Var = duVarArr[0].f47016e;
                            if (b1Var != null) {
                                b1Var.w0(0, i11, null);
                                return;
                            }
                            return;
                        }
                        int i12 = currentActionBarHeight - i10;
                        duVarArr[0].d.w0(0, i12, null);
                        di.b1 b1Var2 = duVarArr[0].f47016e;
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
                fn0 fn0Var = (fn0) this.f3728c;
                org.telegram.ui.ActionBar.y4[] y4VarArr = fn0Var.f47767n;
                ((v4.t0) this.f3727b).a(recyclerView, i7);
                if (i7 != 1) {
                    int i13 = (int) (-fn0.j0(fn0Var).getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i13 != 0 && i13 != currentActionBarHeight2) {
                        if (i13 < currentActionBarHeight2 / 2) {
                            ((ek0) y4VarArr[0].f30272f).w0(0, -i13, null);
                            return;
                        } else {
                            ((ek0) y4VarArr[0].f30272f).w0(0, currentActionBarHeight2 - i13, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 11:
                ((v4.t0) this.f3727b).a(recyclerView, i7);
                ((l90) this.f3728c).D.getClass();
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
        switch (this.f3726a) {
            case 0:
                p6 p6Var = (p6) this.f3728c;
                i6 i6Var = p6Var.f3970f;
                if (p6Var.isAttachedToWindow()) {
                    if (i6Var.canScrollVertically(1)) {
                        for (int i14 = 0; i14 < i6Var.getChildCount(); i14++) {
                            if (!(i6Var.getChildAt(i14) instanceof yz)) {
                            }
                        }
                    }
                    p6Var.f3969e.a();
                }
                ((gq0) this.f3727b).p();
                return;
            case 1:
                ci.r rVar = (ci.r) this.f3727b;
                float translationY = rVar.getTranslationY();
                float f10 = ((ci.j0) this.f3728c).f5673e0;
                if (translationY != f10) {
                    rVar.setTranslationY(f10);
                    rVar.invalidate();
                    return;
                }
                return;
            case 2:
                oi.s3 s3Var = (oi.s3) this.f3728c;
                ((oi.q3) this.f3727b).b0(i10);
                s3Var.f22377v3.G();
                oi.e1 e1Var = s3Var.T3;
                if (e1Var != null && (F = s3Var.F(e1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= s3Var.getHeight()) {
                        s3Var.T3 = null;
                        e1Var.clearFocus();
                        org.telegram.messenger.g0.v1(s3Var);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                h51 h51Var = ((rd) this.f3728c).f51588a;
                if (h51Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < h51Var.getChildCount(); i15++) {
                        if (!(h51Var.getChildAt(i15) instanceof yz)) {
                        }
                    }
                    return;
                }
                ((ai.t0) this.f3727b).run();
                return;
            case 4:
                bn bnVar = (bn) this.f3728c;
                if (recyclerView.getScrollState() == 1) {
                    org.telegram.messenger.g0.v1(bnVar.f46064m1);
                }
                int N0 = ((v4.b0) this.f3727b).N0();
                if (N0 == -1) {
                    i11 = 0;
                } else {
                    i11 = N0;
                }
                if (i11 > 0 && N0 > bnVar.f45922b4.h - 5) {
                    if (bnVar.f45989g4 == 7) {
                        if (!bnVar.Y6 && !bnVar.U6[0]) {
                            bnVar.Y6 = true;
                            bnVar.f46234z6.add(Integer.valueOf(bnVar.f46080n6));
                            i12 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                            na a10 = na.a(i12);
                            String str = bnVar.J3;
                            i13 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
                            int i16 = bnVar.f45949d4;
                            int i17 = bnVar.f46080n6;
                            bnVar.f46080n6 = i17 + 1;
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
                cx cxVar = (cx) this.f3727b;
                of0 of0Var = (of0) this.f3728c;
                h51 h51Var2 = of0Var.f38146c;
                if (TextUtils.isEmpty(of0Var.f38153x)) {
                    arrayList = of0Var.f38147e;
                } else {
                    arrayList = of0Var.f38149n;
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
                if (((qr) this.f3728c).X.J1) {
                    org.telegram.messenger.g0.v1((FrameLayout) this.f3727b);
                    return;
                }
                return;
            case 7:
                ((v4.t0) this.f3727b).b(recyclerView, i7, i10);
                eu euVar = (eu) this.f3728c;
                du duVar = euVar.f47345f[0];
                if (recyclerView == duVar.d || recyclerView == duVar.f47016e) {
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
                ff0 ff0Var = (ff0) this.f3728c;
                if (ff0Var.f47661c0 && !ff0Var.X) {
                    if (ff0Var.Y - ((jg.b0) this.f3727b).N0() < 10) {
                        ff0Var.j0(true);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((v4.t0) this.f3727b).b(recyclerView, i7, i10);
                fn0 fn0Var = (fn0) this.f3728c;
                if (recyclerView == ((ek0) fn0Var.f47767n[0].f30272f)) {
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
                sh.n nVar = (sh.n) this.f3728c;
                sh.m mVar = (sh.m) this.f3727b;
                if (!mVar.h && !mVar.f57478i) {
                    if ((nVar.f57482c.f35742g3.E.size() - 1) - nVar.f57482c.f35741f3.M0() < 5) {
                        mVar.a();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((v4.t0) this.f3727b).b(recyclerView, i7, i10);
                ((l90) this.f3728c).D.b(recyclerView, i7, i10);
                return;
        }
    }
}

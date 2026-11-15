package bi;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.na;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.an;
import org.telegram.ui.bn0;
import org.telegram.ui.bu;
import org.telegram.ui.cu;
import org.telegram.ui.pr;
import org.telegram.ui.rd;
import org.telegram.ui.yw;
public final class w3 extends v4.t0 {
    public final int f3954a;
    public final Object f3955b;
    public final Object f3956c;

    public w3(int i7, Object obj, Object obj2) {
        this.f3954a = i7;
        this.f3956c = obj;
        this.f3955b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.f3954a) {
            case 2:
                if (i7 == 0) {
                    ((oi.q3) this.f3956c).f21943v3.V();
                    return;
                }
                return;
            case 7:
                cu cuVar = (cu) this.f3956c;
                bu[] buVarArr = cuVar.f46249f;
                ((v4.t0) this.f3955b).a(recyclerView, i7);
                if (i7 != 1) {
                    int i10 = (int) (-cu.m0(cuVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i10 != 0 && i10 != currentActionBarHeight) {
                        if (i10 < currentActionBarHeight / 2) {
                            int i11 = -i10;
                            buVarArr[0].d.w0(0, i11, null);
                            di.c1 c1Var = buVarArr[0].f45836e;
                            if (c1Var != null) {
                                c1Var.w0(0, i11, null);
                                return;
                            }
                            return;
                        }
                        int i12 = currentActionBarHeight - i10;
                        buVarArr[0].d.w0(0, i12, null);
                        di.c1 c1Var2 = buVarArr[0].f45836e;
                        if (c1Var2 != null) {
                            c1Var2.w0(0, i12, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                bn0 bn0Var = (bn0) this.f3956c;
                org.telegram.ui.ActionBar.v4[] v4VarArr = bn0Var.f45795n;
                ((v4.t0) this.f3955b).a(recyclerView, i7);
                if (i7 != 1) {
                    int i13 = (int) (-bn0.j0(bn0Var).getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i13 != 0 && i13 != currentActionBarHeight2) {
                        if (i13 < currentActionBarHeight2 / 2) {
                            ((uj0) v4VarArr[0].f29758f).w0(0, -i13, null);
                            return;
                        } else {
                            ((uj0) v4VarArr[0].f29758f).w0(0, currentActionBarHeight2 - i13, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 11:
                ((v4.t0) this.f3955b).a(recyclerView, i7);
                ((y80) this.f3956c).D.getClass();
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
        switch (this.f3954a) {
            case 0:
                c4 c4Var = (c4) this.f3956c;
                v3 v3Var = c4Var.f3413f;
                if (c4Var.isAttachedToWindow()) {
                    if (v3Var.canScrollVertically(1)) {
                        for (int i14 = 0; i14 < v3Var.getChildCount(); i14++) {
                            if (!(v3Var.getChildAt(i14) instanceof pz)) {
                            }
                        }
                    }
                    c4Var.f3412e.a();
                }
                ((wp0) this.f3955b).p();
                return;
            case 1:
                ci.r rVar = (ci.r) this.f3955b;
                float translationY = rVar.getTranslationY();
                float f10 = ((ci.i0) this.f3956c).f5392e0;
                if (translationY != f10) {
                    rVar.setTranslationY(f10);
                    rVar.invalidate();
                    return;
                }
                return;
            case 2:
                oi.q3 q3Var = (oi.q3) this.f3956c;
                ((oi.o3) this.f3955b).O(i10);
                q3Var.f21943v3.G();
                oi.e1 e1Var = q3Var.T3;
                if (e1Var != null && (F = q3Var.F(e1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= q3Var.getHeight()) {
                        q3Var.T3 = null;
                        e1Var.clearFocus();
                        org.telegram.messenger.g0.v1(q3Var);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                u41 u41Var = ((rd) this.f3956c).f50928a;
                if (u41Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < u41Var.getChildCount(); i15++) {
                        if (!(u41Var.getChildAt(i15) instanceof pz)) {
                        }
                    }
                    return;
                }
                ((ai.v0) this.f3955b).run();
                return;
            case 4:
                an anVar = (an) this.f3956c;
                if (recyclerView.getScrollState() == 1) {
                    org.telegram.messenger.g0.v1(anVar.f45278m1);
                }
                int N0 = ((v4.b0) this.f3955b).N0();
                if (N0 == -1) {
                    i11 = 0;
                } else {
                    i11 = N0;
                }
                if (i11 > 0 && N0 > anVar.f45137b4.h - 5) {
                    if (anVar.f45204g4 == 7) {
                        if (!anVar.X6 && !anVar.T6[0]) {
                            anVar.X6 = true;
                            anVar.f45436y6.add(Integer.valueOf(anVar.f45283m6));
                            i12 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                            na a10 = na.a(i12);
                            String str = anVar.J3;
                            i13 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
                            int i16 = anVar.f45164d4;
                            int i17 = anVar.f45283m6;
                            anVar.f45283m6 = i17 + 1;
                            a10.e(i13, i16, i17, str);
                            return;
                        }
                        return;
                    }
                    anVar.getMediaDataController().O0();
                    return;
                }
                return;
            case 5:
                yw ywVar = (yw) this.f3955b;
                cf0 cf0Var = (cf0) this.f3956c;
                u41 u41Var2 = cf0Var.f33546c;
                if (TextUtils.isEmpty(cf0Var.f33553x)) {
                    arrayList = cf0Var.f33547e;
                } else {
                    arrayList = cf0Var.f33549n;
                }
                if (!arrayList.isEmpty()) {
                    if (u41Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < u41Var2.getChildCount(); i18++) {
                            if (!(u41Var2.getChildAt(i18) instanceof pz)) {
                            }
                        }
                    }
                    cf0Var.a(false);
                }
                if (u41Var2.J1 && !cf0Var.R && ywVar.getParentActivity() != null) {
                    org.telegram.messenger.g0.v1(ywVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 6:
                if (((pr) this.f3956c).X.J1) {
                    org.telegram.messenger.g0.v1((FrameLayout) this.f3955b);
                    return;
                }
                return;
            case 7:
                ((v4.t0) this.f3955b).b(recyclerView, i7, i10);
                cu cuVar = (cu) this.f3956c;
                bu buVar = cuVar.f46249f[0];
                if (recyclerView == buVar.d || recyclerView == buVar.f45836e) {
                    float translationY2 = cu.n0(cuVar).getTranslationY();
                    float f11 = translationY2 - i10;
                    if (f11 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY2) {
                        cu.o0(cuVar, f11);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                org.telegram.ui.cf0 cf0Var2 = (org.telegram.ui.cf0) this.f3956c;
                if (cf0Var2.f46129c0 && !cf0Var2.X) {
                    if (cf0Var2.Y - ((jg.b0) this.f3955b).N0() < 10) {
                        cf0Var2.j0(true);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((v4.t0) this.f3955b).b(recyclerView, i7, i10);
                bn0 bn0Var = (bn0) this.f3956c;
                if (recyclerView == ((uj0) bn0Var.f45795n[0].f29758f)) {
                    float translationY3 = bn0.k0(bn0Var).getTranslationY();
                    float f12 = translationY3 - i10;
                    if (f12 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f12 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f12 > 0.0f) {
                        f12 = 0.0f;
                    }
                    if (f12 != translationY3) {
                        bn0.l0(bn0Var, f12);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                sh.n nVar = (sh.n) this.f3956c;
                sh.m mVar = (sh.m) this.f3955b;
                if (!mVar.h && !mVar.f56894i) {
                    if ((nVar.f56898c.f39895g3.E.size() - 1) - nVar.f56898c.f39894f3.M0() < 5) {
                        mVar.a();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((v4.t0) this.f3955b).b(recyclerView, i7, i10);
                ((y80) this.f3956c).D.b(recyclerView, i7, i10);
                return;
        }
    }
}

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
import org.telegram.ui.Components.z80;
import org.telegram.ui.an;
import org.telegram.ui.bu;
import org.telegram.ui.cn0;
import org.telegram.ui.cu;
import org.telegram.ui.pr;
import org.telegram.ui.rd;
import org.telegram.ui.yw;
public final class w3 extends v4.t0 {
    public final int f3957a;
    public final Object f3958b;
    public final Object f3959c;

    public w3(int i7, Object obj, Object obj2) {
        this.f3957a = i7;
        this.f3959c = obj;
        this.f3958b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.f3957a) {
            case 2:
                if (i7 == 0) {
                    ((oi.q3) this.f3959c).f21943v3.V();
                    return;
                }
                return;
            case 7:
                cu cuVar = (cu) this.f3959c;
                bu[] buVarArr = cuVar.f46221f;
                ((v4.t0) this.f3958b).a(recyclerView, i7);
                if (i7 != 1) {
                    int i10 = (int) (-cu.m0(cuVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i10 != 0 && i10 != currentActionBarHeight) {
                        if (i10 < currentActionBarHeight / 2) {
                            int i11 = -i10;
                            buVarArr[0].d.w0(0, i11, null);
                            di.c1 c1Var = buVarArr[0].f45825e;
                            if (c1Var != null) {
                                c1Var.w0(0, i11, null);
                                return;
                            }
                            return;
                        }
                        int i12 = currentActionBarHeight - i10;
                        buVarArr[0].d.w0(0, i12, null);
                        di.c1 c1Var2 = buVarArr[0].f45825e;
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
                cn0 cn0Var = (cn0) this.f3959c;
                org.telegram.ui.ActionBar.v4[] v4VarArr = cn0Var.f46188n;
                ((v4.t0) this.f3958b).a(recyclerView, i7);
                if (i7 != 1) {
                    int i13 = (int) (-cn0.j0(cn0Var).getTranslationY());
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
                ((v4.t0) this.f3958b).a(recyclerView, i7);
                ((z80) this.f3959c).D.getClass();
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
        switch (this.f3957a) {
            case 0:
                c4 c4Var = (c4) this.f3959c;
                v3 v3Var = c4Var.f3416f;
                if (c4Var.isAttachedToWindow()) {
                    if (v3Var.canScrollVertically(1)) {
                        for (int i14 = 0; i14 < v3Var.getChildCount(); i14++) {
                            if (!(v3Var.getChildAt(i14) instanceof pz)) {
                            }
                        }
                    }
                    c4Var.f3415e.a();
                }
                ((wp0) this.f3958b).p();
                return;
            case 1:
                ci.r rVar = (ci.r) this.f3958b;
                float translationY = rVar.getTranslationY();
                float f10 = ((ci.i0) this.f3959c).f5395e0;
                if (translationY != f10) {
                    rVar.setTranslationY(f10);
                    rVar.invalidate();
                    return;
                }
                return;
            case 2:
                oi.q3 q3Var = (oi.q3) this.f3959c;
                ((oi.o3) this.f3958b).O(i10);
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
                u41 u41Var = ((rd) this.f3959c).f50927a;
                if (u41Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < u41Var.getChildCount(); i15++) {
                        if (!(u41Var.getChildAt(i15) instanceof pz)) {
                        }
                    }
                    return;
                }
                ((ai.w0) this.f3958b).run();
                return;
            case 4:
                an anVar = (an) this.f3959c;
                if (recyclerView.getScrollState() == 1) {
                    org.telegram.messenger.g0.v1(anVar.f45277m1);
                }
                int N0 = ((v4.b0) this.f3958b).N0();
                if (N0 == -1) {
                    i11 = 0;
                } else {
                    i11 = N0;
                }
                if (i11 > 0 && N0 > anVar.f45136b4.h - 5) {
                    if (anVar.f45203g4 == 7) {
                        if (!anVar.X6 && !anVar.T6[0]) {
                            anVar.X6 = true;
                            anVar.f45435y6.add(Integer.valueOf(anVar.f45282m6));
                            i12 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                            na a10 = na.a(i12);
                            String str = anVar.J3;
                            i13 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
                            int i16 = anVar.f45163d4;
                            int i17 = anVar.f45282m6;
                            anVar.f45282m6 = i17 + 1;
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
                yw ywVar = (yw) this.f3958b;
                cf0 cf0Var = (cf0) this.f3959c;
                u41 u41Var2 = cf0Var.f33548c;
                if (TextUtils.isEmpty(cf0Var.f33555x)) {
                    arrayList = cf0Var.f33549e;
                } else {
                    arrayList = cf0Var.f33551n;
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
                if (((pr) this.f3959c).X.J1) {
                    org.telegram.messenger.g0.v1((FrameLayout) this.f3958b);
                    return;
                }
                return;
            case 7:
                ((v4.t0) this.f3958b).b(recyclerView, i7, i10);
                cu cuVar = (cu) this.f3959c;
                bu buVar = cuVar.f46221f[0];
                if (recyclerView == buVar.d || recyclerView == buVar.f45825e) {
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
                org.telegram.ui.cf0 cf0Var2 = (org.telegram.ui.cf0) this.f3959c;
                if (cf0Var2.f46118c0 && !cf0Var2.X) {
                    if (cf0Var2.Y - ((jg.b0) this.f3958b).N0() < 10) {
                        cf0Var2.j0(true);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((v4.t0) this.f3958b).b(recyclerView, i7, i10);
                cn0 cn0Var = (cn0) this.f3959c;
                if (recyclerView == ((uj0) cn0Var.f46188n[0].f29758f)) {
                    float translationY3 = cn0.k0(cn0Var).getTranslationY();
                    float f12 = translationY3 - i10;
                    if (f12 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f12 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f12 > 0.0f) {
                        f12 = 0.0f;
                    }
                    if (f12 != translationY3) {
                        cn0.l0(cn0Var, f12);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                sh.n nVar = (sh.n) this.f3959c;
                sh.m mVar = (sh.m) this.f3958b;
                if (!mVar.h && !mVar.f56894i) {
                    if ((nVar.f56898c.f39892g3.E.size() - 1) - nVar.f56898c.f39891f3.M0() < 5) {
                        mVar.a();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((v4.t0) this.f3958b).b(recyclerView, i7, i10);
                ((z80) this.f3959c).D.b(recyclerView, i7, i10);
                return;
        }
    }
}

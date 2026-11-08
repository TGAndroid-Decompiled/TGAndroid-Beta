package ai;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.q1;
import fi.w3;
import java.util.ArrayList;
import li.r3;
import li.t3;
import org.telegram.messenger.oa;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.x4;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.an;
import org.telegram.ui.an0;
import org.telegram.ui.au;
import org.telegram.ui.cf0;
import org.telegram.ui.nr;
import org.telegram.ui.td;
import org.telegram.ui.ww;
import org.telegram.ui.zt;
import zh.z1;
public final class o0 extends v4.s0 {
    public final int f1592a;
    public final Object f1593b;
    public final Object f1594c;

    public o0(int i7, Object obj, Object obj2) {
        this.f1592a = i7;
        this.f1594c = obj;
        this.f1593b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.f1592a) {
            case 1:
                if (i7 == 0) {
                    ((t3) this.f1594c).f18901u3.V();
                    return;
                }
                return;
            case 6:
                au auVar = (au) this.f1594c;
                zt[] ztVarArr = auVar.f44099f;
                ((v4.s0) this.f1593b).a(recyclerView, i7);
                if (i7 != 1) {
                    int i10 = (int) (-au.m0(auVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i10 != 0 && i10 != currentActionBarHeight) {
                        if (i10 < currentActionBarHeight / 2) {
                            int i11 = -i10;
                            ztVarArr[0].d.w0(0, i11, null);
                            q1 q1Var = ztVarArr[0].f52679e;
                            if (q1Var != null) {
                                q1Var.w0(0, i11, null);
                                return;
                            }
                            return;
                        }
                        int i12 = currentActionBarHeight - i10;
                        ztVarArr[0].d.w0(0, i12, null);
                        q1 q1Var2 = ztVarArr[0].f52679e;
                        if (q1Var2 != null) {
                            q1Var2.w0(0, i12, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 8:
                an0 an0Var = (an0) this.f1594c;
                x4[] x4VarArr = an0Var.f44060n;
                ((v4.s0) this.f1593b).a(recyclerView, i7);
                if (i7 != 1) {
                    int i13 = (int) (-an0.j0(an0Var).getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i13 != 0 && i13 != currentActionBarHeight2) {
                        if (i13 < currentActionBarHeight2 / 2) {
                            ((pj0) x4VarArr[0].f28752f).w0(0, -i13, null);
                            return;
                        } else {
                            ((pj0) x4VarArr[0].f28752f).w0(0, currentActionBarHeight2 - i13, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 10:
                ((v4.s0) this.f1593b).a(recyclerView, i7);
                ((w80) this.f1594c).D.getClass();
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
        switch (this.f1592a) {
            case 0:
                w wVar = (w) this.f1593b;
                float translationY = wVar.getTranslationY();
                float f10 = ((s0) this.f1594c).f1619d0;
                if (translationY != f10) {
                    wVar.setTranslationY(f10);
                    wVar.invalidate();
                    return;
                }
                return;
            case 1:
                t3 t3Var = (t3) this.f1594c;
                ((r3) this.f1593b).y(i10);
                t3Var.f18901u3.G();
                li.g1 g1Var = t3Var.S3;
                if (g1Var != null && (F = t3Var.F(g1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= t3Var.getHeight()) {
                        t3Var.S3 = null;
                        g1Var.clearFocus();
                        org.telegram.messenger.g0.v1(t3Var);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                q41 q41Var = ((td) this.f1594c).f50027a;
                if (q41Var.canScrollVertically(1)) {
                    for (int i14 = 0; i14 < q41Var.getChildCount(); i14++) {
                        if (!(q41Var.getChildAt(i14) instanceof mz)) {
                        }
                    }
                    return;
                }
                ((bg.m0) this.f1593b).run();
                return;
            case 3:
                an anVar = (an) this.f1594c;
                if (recyclerView.getScrollState() == 1) {
                    org.telegram.messenger.g0.v1(anVar.l1);
                }
                int N0 = ((v4.b0) this.f1593b).N0();
                if (N0 == -1) {
                    i11 = 0;
                } else {
                    i11 = N0;
                }
                if (i11 > 0 && N0 > anVar.f43726a4.h - 5) {
                    if (anVar.f43796f4 == 7) {
                        if (!anVar.W6 && !anVar.S6[0]) {
                            anVar.W6 = true;
                            anVar.f44024x6.add(Integer.valueOf(anVar.f43872l6));
                            i12 = ((f2) anVar).currentAccount;
                            oa a10 = oa.a(i12);
                            String str = anVar.I3;
                            i13 = ((f2) anVar).classGuid;
                            int i15 = anVar.f43755c4;
                            int i16 = anVar.f43872l6;
                            anVar.f43872l6 = i16 + 1;
                            a10.e(i13, i15, i16, str);
                            return;
                        }
                        return;
                    }
                    anVar.getMediaDataController().O0();
                    return;
                }
                return;
            case 4:
                ww wwVar = (ww) this.f1593b;
                ze0 ze0Var = (ze0) this.f1594c;
                q41 q41Var2 = ze0Var.f40964c;
                if (TextUtils.isEmpty(ze0Var.f40971x)) {
                    arrayList = ze0Var.f40965e;
                } else {
                    arrayList = ze0Var.f40967n;
                }
                if (!arrayList.isEmpty()) {
                    if (q41Var2.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < q41Var2.getChildCount(); i17++) {
                            if (!(q41Var2.getChildAt(i17) instanceof mz)) {
                            }
                        }
                    }
                    ze0Var.a(false);
                }
                if (q41Var2.I1 && !ze0Var.Q && wwVar.getParentActivity() != null) {
                    org.telegram.messenger.g0.v1(wwVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 5:
                if (((nr) this.f1594c).W.I1) {
                    org.telegram.messenger.g0.v1((FrameLayout) this.f1593b);
                    return;
                }
                return;
            case 6:
                ((v4.s0) this.f1593b).b(recyclerView, i7, i10);
                au auVar = (au) this.f1594c;
                zt ztVar = auVar.f44099f[0];
                if (recyclerView == ztVar.d || recyclerView == ztVar.f52679e) {
                    float translationY2 = au.n0(auVar).getTranslationY();
                    float f11 = translationY2 - i10;
                    if (f11 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY2) {
                        au.o0(auVar, f11);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                cf0 cf0Var = (cf0) this.f1594c;
                if (cf0Var.f44800b0 && !cf0Var.W) {
                    if (cf0Var.X - ((jg.b0) this.f1593b).N0() < 10) {
                        cf0Var.j0(true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((v4.s0) this.f1593b).b(recyclerView, i7, i10);
                an0 an0Var = (an0) this.f1594c;
                if (recyclerView == ((pj0) an0Var.f44060n[0].f28752f)) {
                    float translationY3 = an0.k0(an0Var).getTranslationY();
                    float f12 = translationY3 - i10;
                    if (f12 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f12 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f12 > 0.0f) {
                        f12 = 0.0f;
                    }
                    if (f12 != translationY3) {
                        an0.l0(an0Var, f12);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                sh.n nVar = (sh.n) this.f1594c;
                sh.m mVar = (sh.m) this.f1593b;
                if (!mVar.h && !mVar.f55329i) {
                    if ((nVar.f55333c.f37190f3.D.size() - 1) - nVar.f55333c.f37189e3.M0() < 5) {
                        mVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((v4.s0) this.f1593b).b(recyclerView, i7, i10);
                ((w80) this.f1594c).D.b(recyclerView, i7, i10);
                return;
            default:
                z1 z1Var = (z1) this.f1594c;
                w3 w3Var = z1Var.f60625f;
                if (z1Var.isAttachedToWindow()) {
                    if (w3Var.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < w3Var.getChildCount(); i18++) {
                            if (!(w3Var.getChildAt(i18) instanceof mz)) {
                            }
                        }
                    }
                    z1Var.f60624e.a();
                }
                ((up0) this.f1593b).p();
                return;
        }
    }
}

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
import org.telegram.ui.ActionBar.y4;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.cn;
import org.telegram.ui.cu;
import org.telegram.ui.dn0;
import org.telegram.ui.du;
import org.telegram.ui.ff0;
import org.telegram.ui.qr;
import org.telegram.ui.td;
import org.telegram.ui.zw;
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
                    ((t3) this.f1594c).f18904u3.V();
                    return;
                }
                return;
            case 6:
                du duVar = (du) this.f1594c;
                cu[] cuVarArr = duVar.f45054f;
                ((v4.s0) this.f1593b).a(recyclerView, i7);
                if (i7 != 1) {
                    int i10 = (int) (-du.m0(duVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    if (i10 != 0 && i10 != currentActionBarHeight) {
                        if (i10 < currentActionBarHeight / 2) {
                            int i11 = -i10;
                            cuVarArr[0].d.w0(0, i11, null);
                            q1 q1Var = cuVarArr[0].f44810e;
                            if (q1Var != null) {
                                q1Var.w0(0, i11, null);
                                return;
                            }
                            return;
                        }
                        int i12 = currentActionBarHeight - i10;
                        cuVarArr[0].d.w0(0, i12, null);
                        q1 q1Var2 = cuVarArr[0].f44810e;
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
                dn0 dn0Var = (dn0) this.f1594c;
                y4[] y4VarArr = dn0Var.f45019n;
                ((v4.s0) this.f1593b).a(recyclerView, i7);
                if (i7 != 1) {
                    int i13 = (int) (-dn0.j0(dn0Var).getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    if (i13 != 0 && i13 != currentActionBarHeight2) {
                        if (i13 < currentActionBarHeight2 / 2) {
                            ((pj0) y4VarArr[0].f28794f).w0(0, -i13, null);
                            return;
                        } else {
                            ((pj0) y4VarArr[0].f28794f).w0(0, currentActionBarHeight2 - i13, null);
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
                t3Var.f18904u3.G();
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
                r41 r41Var = ((td) this.f1594c).f50245a;
                if (r41Var.canScrollVertically(1)) {
                    for (int i14 = 0; i14 < r41Var.getChildCount(); i14++) {
                        if (!(r41Var.getChildAt(i14) instanceof lz)) {
                        }
                    }
                    return;
                }
                ((bg.m0) this.f1593b).run();
                return;
            case 3:
                cn cnVar = (cn) this.f1594c;
                if (recyclerView.getScrollState() == 1) {
                    org.telegram.messenger.g0.v1(cnVar.l1);
                }
                int N0 = ((v4.b0) this.f1593b).N0();
                if (N0 == -1) {
                    i11 = 0;
                } else {
                    i11 = N0;
                }
                if (i11 > 0 && N0 > cnVar.f44422a4.h - 5) {
                    if (cnVar.f44492f4 == 7) {
                        if (!cnVar.W6 && !cnVar.S6[0]) {
                            cnVar.W6 = true;
                            cnVar.f44722x6.add(Integer.valueOf(cnVar.f44570l6));
                            i12 = ((f2) cnVar).currentAccount;
                            oa a10 = oa.a(i12);
                            String str = cnVar.I3;
                            i13 = ((f2) cnVar).classGuid;
                            int i15 = cnVar.f44451c4;
                            int i16 = cnVar.f44570l6;
                            cnVar.f44570l6 = i16 + 1;
                            a10.e(i13, i15, i16, str);
                            return;
                        }
                        return;
                    }
                    cnVar.getMediaDataController().O0();
                    return;
                }
                return;
            case 4:
                zw zwVar = (zw) this.f1593b;
                ze0 ze0Var = (ze0) this.f1594c;
                r41 r41Var2 = ze0Var.f40923c;
                if (TextUtils.isEmpty(ze0Var.f40930x)) {
                    arrayList = ze0Var.f40924e;
                } else {
                    arrayList = ze0Var.f40926n;
                }
                if (!arrayList.isEmpty()) {
                    if (r41Var2.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < r41Var2.getChildCount(); i17++) {
                            if (!(r41Var2.getChildAt(i17) instanceof lz)) {
                            }
                        }
                    }
                    ze0Var.a(false);
                }
                if (r41Var2.I1 && !ze0Var.Q && zwVar.getParentActivity() != null) {
                    org.telegram.messenger.g0.v1(zwVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 5:
                if (((qr) this.f1594c).W.I1) {
                    org.telegram.messenger.g0.v1((FrameLayout) this.f1593b);
                    return;
                }
                return;
            case 6:
                ((v4.s0) this.f1593b).b(recyclerView, i7, i10);
                du duVar = (du) this.f1594c;
                cu cuVar = duVar.f45054f[0];
                if (recyclerView == cuVar.d || recyclerView == cuVar.f44810e) {
                    float translationY2 = du.n0(duVar).getTranslationY();
                    float f11 = translationY2 - i10;
                    if (f11 < (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY2) {
                        du.o0(duVar, f11);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ff0 ff0Var = (ff0) this.f1594c;
                if (ff0Var.f45732b0 && !ff0Var.W) {
                    if (ff0Var.X - ((jg.b0) this.f1593b).N0() < 10) {
                        ff0Var.j0(true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((v4.s0) this.f1593b).b(recyclerView, i7, i10);
                dn0 dn0Var = (dn0) this.f1594c;
                if (recyclerView == ((pj0) dn0Var.f45019n[0].f28794f)) {
                    float translationY3 = dn0.k0(dn0Var).getTranslationY();
                    float f12 = translationY3 - i10;
                    if (f12 < (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())) {
                        f12 = -org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    } else if (f12 > 0.0f) {
                        f12 = 0.0f;
                    }
                    if (f12 != translationY3) {
                        dn0.l0(dn0Var, f12);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                sh.o oVar = (sh.o) this.f1594c;
                sh.n nVar = (sh.n) this.f1593b;
                if (!nVar.h && !nVar.f55341i) {
                    if ((oVar.f55345c.f37496f3.D.size() - 1) - oVar.f55345c.f37495e3.M0() < 5) {
                        nVar.a();
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
                w3 w3Var = z1Var.f60655f;
                if (z1Var.isAttachedToWindow()) {
                    if (w3Var.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < w3Var.getChildCount(); i18++) {
                            if (!(w3Var.getChildAt(i18) instanceof lz)) {
                            }
                        }
                    }
                    z1Var.f60654e.a();
                }
                ((up0) this.f1593b).p();
                return;
        }
    }
}

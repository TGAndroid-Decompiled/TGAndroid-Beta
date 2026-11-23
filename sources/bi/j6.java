package bi;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ma;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.cu;
import org.telegram.ui.dn0;
import org.telegram.ui.du;
import org.telegram.ui.ef0;
import org.telegram.ui.qr;
import org.telegram.ui.rd;
public final class j6 extends v4.u0 {
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
                    ((oi.t3) this.f3728c).f22507v3.V();
                    return;
                }
                return;
            case 7:
                du duVar = (du) this.f3728c;
                cu[] cuVarArr = duVar.f47231f;
                ((v4.u0) this.f3727b).a(recyclerView, i7);
                if (i7 != 1) {
                    int i10 = (int) (-du.m0(duVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i10 != 0 && i10 != currentActionBarHeight) {
                        if (i10 < currentActionBarHeight / 2) {
                            int i11 = -i10;
                            cuVarArr[0].d.w0(0, i11, null);
                            di.b1 b1Var = cuVarArr[0].f46876e;
                            if (b1Var != null) {
                                b1Var.w0(0, i11, null);
                                return;
                            }
                            return;
                        }
                        int i12 = currentActionBarHeight - i10;
                        cuVarArr[0].d.w0(0, i12, null);
                        di.b1 b1Var2 = cuVarArr[0].f46876e;
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
                dn0 dn0Var = (dn0) this.f3728c;
                org.telegram.ui.ActionBar.y4[] y4VarArr = dn0Var.f47200n;
                ((v4.u0) this.f3727b).a(recyclerView, i7);
                if (i7 != 1) {
                    int i13 = (int) (-dn0.j0(dn0Var).getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i13 != 0 && i13 != currentActionBarHeight2) {
                        if (i13 < currentActionBarHeight2 / 2) {
                            ((ek0) y4VarArr[0].f30363f).w0(0, -i13, null);
                            return;
                        } else {
                            ((ek0) y4VarArr[0].f30363f).w0(0, currentActionBarHeight2 - i13, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 11:
                ((v4.u0) this.f3727b).a(recyclerView, i7);
                ((i90) this.f3728c).D.getClass();
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
                            if (!(i6Var.getChildAt(i14) instanceof vz)) {
                            }
                        }
                    }
                    p6Var.f3969e.a();
                }
                ((fq0) this.f3727b).p();
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
                oi.t3 t3Var = (oi.t3) this.f3728c;
                ((oi.r3) this.f3727b).S(i10);
                t3Var.f22507v3.G();
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
                g51 g51Var = ((rd) this.f3728c).f51703a;
                if (g51Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < g51Var.getChildCount(); i15++) {
                        if (!(g51Var.getChildAt(i15) instanceof vz)) {
                        }
                    }
                    return;
                }
                ((ai.u0) this.f3727b).run();
                return;
            case 4:
                bn bnVar = (bn) this.f3728c;
                if (recyclerView.getScrollState() == 1) {
                    org.telegram.messenger.g0.v1(bnVar.f46279m1);
                }
                int N0 = ((v4.c0) this.f3727b).N0();
                if (N0 == -1) {
                    i11 = 0;
                } else {
                    i11 = N0;
                }
                if (i11 > 0 && N0 > bnVar.f46137b4.h - 5) {
                    if (bnVar.f46204g4 == 7) {
                        if (!bnVar.Y6 && !bnVar.U6[0]) {
                            bnVar.Y6 = true;
                            bnVar.f46449z6.add(Integer.valueOf(bnVar.f46295n6));
                            i12 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                            ma a10 = ma.a(i12);
                            String str = bnVar.J3;
                            i13 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
                            int i16 = bnVar.f46164d4;
                            int i17 = bnVar.f46295n6;
                            bnVar.f46295n6 = i17 + 1;
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
                bx bxVar = (bx) this.f3727b;
                nf0 nf0Var = (nf0) this.f3728c;
                g51 g51Var2 = nf0Var.f37773c;
                if (TextUtils.isEmpty(nf0Var.f37780x)) {
                    arrayList = nf0Var.f37774e;
                } else {
                    arrayList = nf0Var.f37776n;
                }
                if (!arrayList.isEmpty()) {
                    if (g51Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < g51Var2.getChildCount(); i18++) {
                            if (!(g51Var2.getChildAt(i18) instanceof vz)) {
                            }
                        }
                    }
                    nf0Var.a(false);
                }
                if (g51Var2.J1 && !nf0Var.R && bxVar.getParentActivity() != null) {
                    org.telegram.messenger.g0.v1(bxVar.getParentActivity().getCurrentFocus());
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
                ((v4.u0) this.f3727b).b(recyclerView, i7, i10);
                du duVar = (du) this.f3728c;
                cu cuVar = duVar.f47231f[0];
                if (recyclerView == cuVar.d || recyclerView == cuVar.f46876e) {
                    float translationY2 = du.n0(duVar).getTranslationY();
                    float f11 = translationY2 - i10;
                    if (f11 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
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
            case 8:
                ef0 ef0Var = (ef0) this.f3728c;
                if (ef0Var.f47521c0 && !ef0Var.X) {
                    if (ef0Var.Y - ((jg.b0) this.f3727b).N0() < 10) {
                        ef0Var.j0(true);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((v4.u0) this.f3727b).b(recyclerView, i7, i10);
                dn0 dn0Var = (dn0) this.f3728c;
                if (recyclerView == ((ek0) dn0Var.f47200n[0].f30363f)) {
                    float translationY3 = dn0.k0(dn0Var).getTranslationY();
                    float f12 = translationY3 - i10;
                    if (f12 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f12 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
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
            case 10:
                sh.n nVar = (sh.n) this.f3728c;
                sh.m mVar = (sh.m) this.f3727b;
                if (!mVar.h && !mVar.f57589i) {
                    if ((nVar.f57593c.f35323g3.E.size() - 1) - nVar.f57593c.f35322f3.M0() < 5) {
                        mVar.a();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((v4.u0) this.f3727b).b(recyclerView, i7, i10);
                ((i90) this.f3728c).D.b(recyclerView, i7, i10);
                return;
        }
    }
}

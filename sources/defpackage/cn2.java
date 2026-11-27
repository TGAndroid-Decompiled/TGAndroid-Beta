package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class cn2 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;

    public cn2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z;
        rt1 rt1Var;
        byte b = this.a;
        float f = 0.0f;
        Object obj = this.b;
        switch (b) {
            case 0:
                dn2 dn2Var = (dn2) obj;
                dn2Var.h = 1.0f;
                dn2Var.invalidate();
                return;
            case 1:
                dy2 dy2Var = (dy2) obj;
                dy2Var.l = 1.0f;
                dy2Var.o = null;
                dy2Var.p = null;
                dy2Var.q = null;
                View view = dy2Var.G;
                if (view != null) {
                    if (dy2Var.h == 0 && dy2Var.F) {
                        view.setVisibility(8);
                    }
                    dy2Var.G.invalidate();
                }
                dy2Var.c = -1;
                return;
            case 2:
                ((CropAreaView) obj).d0 = null;
                return;
            case 3:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) obj;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 4:
                AnimatorSet[] animatorSetArr2 = ((n63) obj).n;
                if (animator.equals(animatorSetArr2[0])) {
                    animatorSetArr2[0] = null;
                    return;
                }
                return;
            case 5:
                zf3 zf3Var = (zf3) obj;
                bg3 bg3Var = zf3Var.n;
                bg3Var.h = null;
                boolean z2 = bg3Var.s;
                ag3[] ag3VarArr = bg3Var.f;
                if (z2) {
                    ag3VarArr[1].setVisibility(8);
                } else {
                    ag3 ag3Var = ag3VarArr[0];
                    ag3VarArr[0] = ag3VarArr[1];
                    ag3VarArr[1] = ag3Var;
                    ag3Var.setVisibility(8);
                    if (bg3Var.f[0].f == bg3Var.e.getFirstTabId()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bg3Var.x = z;
                    bg3Var.e.i(1.0f, bg3Var.f[0].f);
                }
                bg3Var.n = false;
                zf3Var.c = false;
                zf3Var.b = false;
                bg3.b0(bg3Var).setEnabled(true);
                bg3Var.e.setEnabled(true);
                return;
            case 6:
                super.onAnimationEnd(animator);
                ((og3) obj).P.p = false;
                return;
            case 7:
                uh3 uh3Var = (uh3) obj;
                uh3Var.M.a5(uh3Var.L, 0.0f);
                return;
            case 8:
                uj3 uj3Var = (uj3) obj;
                boolean z3 = uj3Var.H0;
                if (z3) {
                    f = 1.0f;
                }
                uj3Var.I0 = f;
                if (!z3) {
                    uj3Var.F0.setVisibility(8);
                }
                View view2 = uj3Var.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 9:
                uj3 uj3Var2 = ((nj3) obj).o0;
                uj3Var2.i3 = null;
                if (!uj3Var2.m3) {
                    tj3[] tj3VarArr = uj3Var2.f0;
                    tj3 tj3Var = tj3VarArr[0];
                    tj3 tj3Var2 = tj3VarArr[1];
                    tj3VarArr[0] = tj3Var2;
                    tj3VarArr[1] = tj3Var;
                    uj3Var2.A0.j(1.0f, tj3Var2.h);
                    uj3Var2.p5(false);
                    uj3Var2.F5(-1, true);
                    uj3Var2.f0[0].d.getClass();
                    uj3Var2.f0[1].d.getClass();
                }
                uj3Var2.f0[1].setVisibility(8);
                uj3Var2.j5(true);
                uj3Var2.j3 = false;
                uj3Var2.p3 = false;
                uj3.i1(uj3Var2).setEnabled(true);
                uj3Var2.A0.setEnabled(true);
                uj3Var2.M2(uj3Var2.f0[0]);
                return;
            case 10:
                super.onAnimationEnd(animator);
                ((qj3) obj).setScrollEnabled(true);
                return;
            case 11:
                int i = zl3.L;
                ((zl3) ((yl3) obj).b).c();
                return;
            case 12:
                zl3 zl3Var = (zl3) obj;
                zl3Var.d = null;
                zl3Var.e();
                return;
            case 13:
                bn3 bn3Var = (bn3) obj;
                if (bn3Var.G0 <= 0.0f && (rt1Var = bn3Var.F0) != null && bn3Var.H0 == animator) {
                    rt1Var.s0(bn3Var.I0);
                    bn3Var.F0 = null;
                    return;
                }
                return;
            case 14:
                iu3 iu3Var = (iu3) obj;
                iu3Var.P = false;
                iu3Var.d.setTranslationY(0.0f);
                iu3Var.d.setAlpha(0.0f);
                iu3Var.c(0.0f);
                iu3Var.S = 0.0f;
                iu3Var.j();
                return;
            case 15:
                ((fv3) obj).a.I1 = false;
                return;
            case 16:
                super.onAnimationEnd(animator);
                ((ey3) obj).d = null;
                return;
            case 17:
                ((o24) obj).a0 = null;
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((x14) obj).n = null;
                return;
            case 19:
                g34 g34Var = (g34) obj;
                if (g34Var.w == animator) {
                    g34Var.w = null;
                    return;
                }
                return;
            case 20:
                ae4 ae4Var = (ae4) obj;
                FrameLayout frameLayout = ae4Var.b;
                a81 a81Var = (a81) ae4Var.c;
                if (a81Var.getParent() != null) {
                    frameLayout.removeView(a81Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((gb) ae4Var.d);
                return;
            case 21:
                ((dg4) obj).a();
                return;
            case 22:
                mn4 mn4Var = (mn4) obj;
                mn4Var.w = 1.0f;
                mn4Var.invalidate();
                return;
            case 23:
                super.onAnimationEnd(animator);
                it4 it4Var = ((dt4) obj).b;
                it4Var.b.d = 0.0f;
                it4Var.e0 = null;
                it4Var.j(it4Var.M);
                return;
            case 24:
                wt4 wt4Var = (wt4) ((cm0) obj).c;
                wt4Var.G.setVisibility(8);
                wt4Var.d.setVisibility(8);
                return;
            case 25:
                ((ew4) obj).b.v1.setVisibility(8);
                return;
            case 26:
                j95 j95Var = ((o85) obj).o;
                j95 j95Var2 = j95.s5;
                j95Var.S0();
                j95Var.b.invalidate();
                j95Var.J1.invalidate();
                if (j95Var.l2) {
                    j95Var.l2 = false;
                    j95Var.E0(true);
                    return;
                }
                return;
            case 27:
                super.onAnimationEnd(animator);
                z85 z85Var = (z85) obj;
                z85Var.G = null;
                j95 j95Var3 = z85Var.L;
                j95Var3.J1.invalidate();
                j95Var3.T3.invalidate();
                j95Var3.b.invalidate();
                j95Var3.G1();
                z85Var.H.clear();
                z85Var.I.clear();
                return;
            case 28:
                ka5 ka5Var = ((ga5) obj).t0;
                if (ka5Var.x0.getParent() != null) {
                    ka5Var.a.removeView(ka5Var.x0);
                    return;
                }
                return;
            default:
                za5 za5Var = (za5) obj;
                za5Var.s = null;
                za5Var.r = 1.0f;
                za5Var.a();
                za5Var.d();
                return;
        }
    }
}

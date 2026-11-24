package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class im2 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;

    public im2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z;
        a aVar;
        et1 et1Var;
        byte b = this.a;
        float f = 0.0f;
        Object obj = this.b;
        switch (b) {
            case 0:
                jm2 jm2Var = (jm2) obj;
                jm2Var.h = 1.0f;
                jm2Var.invalidate();
                return;
            case 1:
                jx2 jx2Var = (jx2) obj;
                jx2Var.l = 1.0f;
                jx2Var.o = null;
                jx2Var.p = null;
                jx2Var.q = null;
                View view = jx2Var.G;
                if (view != null) {
                    if (jx2Var.h == 0 && jx2Var.F) {
                        view.setVisibility(8);
                    }
                    jx2Var.G.invalidate();
                }
                jx2Var.c = -1;
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
                AnimatorSet[] animatorSetArr2 = ((v53) obj).n;
                if (animator.equals(animatorSetArr2[0])) {
                    animatorSetArr2[0] = null;
                    return;
                }
                return;
            case 5:
                ff3 ff3Var = (ff3) obj;
                hf3 hf3Var = ff3Var.n;
                hf3Var.h = null;
                boolean z2 = hf3Var.s;
                gf3[] gf3VarArr = hf3Var.f;
                if (z2) {
                    gf3VarArr[1].setVisibility(8);
                } else {
                    gf3 gf3Var = gf3VarArr[0];
                    gf3VarArr[0] = gf3VarArr[1];
                    gf3VarArr[1] = gf3Var;
                    gf3Var.setVisibility(8);
                    if (hf3Var.f[0].f == hf3Var.e.getFirstTabId()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hf3Var.x = z;
                    hf3Var.e.i(1.0f, hf3Var.f[0].f);
                }
                hf3Var.n = false;
                ff3Var.c = false;
                ff3Var.b = false;
                hf3.i0(hf3Var).setEnabled(true);
                hf3Var.e.setEnabled(true);
                return;
            case 6:
                super.onAnimationEnd(animator);
                ((uf3) obj).P.p = false;
                return;
            case 7:
                ah3 ah3Var = (ah3) obj;
                ah3Var.M.W4(ah3Var.L, 0.0f);
                return;
            case 8:
                cj3 cj3Var = (cj3) obj;
                boolean z3 = cj3Var.H0;
                if (z3) {
                    f = 1.0f;
                }
                cj3Var.I0 = f;
                if (!z3) {
                    cj3Var.F0.setVisibility(8);
                }
                View view2 = cj3Var.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 9:
                cj3 cj3Var2 = ((vi3) obj).u0;
                cj3Var2.i3 = null;
                if (!cj3Var2.m3) {
                    bj3[] bj3VarArr = cj3Var2.f0;
                    bj3 bj3Var = bj3VarArr[0];
                    bj3 bj3Var2 = bj3VarArr[1];
                    bj3VarArr[0] = bj3Var2;
                    bj3VarArr[1] = bj3Var;
                    cj3Var2.A0.h(1.0f, bj3Var2.h);
                    cj3Var2.l5(false);
                    cj3Var2.B5(-1, true);
                    cj3Var2.f0[0].d.getClass();
                    cj3Var2.f0[1].d.getClass();
                }
                cj3Var2.f0[1].setVisibility(8);
                cj3Var2.f5(true);
                cj3Var2.j3 = false;
                cj3Var2.p3 = false;
                aVar = ((d) cj3Var2).actionBar;
                aVar.setEnabled(true);
                cj3Var2.A0.setEnabled(true);
                cj3Var2.K2(cj3Var2.f0[0]);
                return;
            case 10:
                super.onAnimationEnd(animator);
                ((yi3) obj).setScrollEnabled(true);
                return;
            case 11:
                int i = hl3.L;
                ((hl3) ((gl3) obj).b).c();
                return;
            case 12:
                hl3 hl3Var = (hl3) obj;
                hl3Var.d = null;
                hl3Var.e();
                return;
            case 13:
                jm3 jm3Var = (jm3) obj;
                if (jm3Var.F0 <= 0.0f && (et1Var = jm3Var.E0) != null && jm3Var.G0 == animator) {
                    et1Var.r0(jm3Var.H0);
                    jm3Var.E0 = null;
                    return;
                }
                return;
            case 14:
                rt3 rt3Var = (rt3) obj;
                rt3Var.P = false;
                rt3Var.d.setTranslationY(0.0f);
                rt3Var.d.setAlpha(0.0f);
                rt3Var.c(0.0f);
                rt3Var.S = 0.0f;
                rt3Var.j();
                return;
            case 15:
                ((lu3) obj).a.I1 = false;
                return;
            case 16:
                super.onAnimationEnd(animator);
                ((ix3) obj).d = null;
                return;
            case 17:
                ((t14) obj).a0 = null;
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((c14) obj).n = null;
                return;
            case 19:
                l24 l24Var = (l24) obj;
                if (l24Var.w == animator) {
                    l24Var.w = null;
                    return;
                }
                return;
            case 20:
                dc4 dc4Var = (dc4) obj;
                FrameLayout frameLayout = dc4Var.b;
                s71 s71Var = (s71) dc4Var.c;
                if (s71Var.getParent() != null) {
                    frameLayout.removeView(s71Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((fb) dc4Var.d);
                return;
            case 21:
                ((fe4) obj).a();
                return;
            case 22:
                ((sj4) obj).v = null;
                return;
            case 23:
                hl4 hl4Var = (hl4) obj;
                hl4Var.w = 1.0f;
                hl4Var.invalidate();
                return;
            case 24:
                super.onAnimationEnd(animator);
                er4 er4Var = ((zq4) obj).b;
                er4Var.b.d = 0.0f;
                er4Var.e0 = null;
                er4Var.j(er4Var.M);
                return;
            case 25:
                sr4 sr4Var = (sr4) ((cm0) obj).c;
                sr4Var.G.setVisibility(8);
                sr4Var.d.setVisibility(8);
                return;
            case 26:
                ((au4) obj).b.v1.setVisibility(8);
                return;
            case 27:
                h75 h75Var = ((m65) obj).o;
                h75 h75Var2 = h75.s5;
                h75Var.R0();
                h75Var.b.invalidate();
                h75Var.J1.invalidate();
                if (h75Var.l2) {
                    h75Var.l2 = false;
                    h75Var.D0(true);
                    return;
                }
                return;
            case 28:
                super.onAnimationEnd(animator);
                x65 x65Var = (x65) obj;
                x65Var.G = null;
                h75 h75Var3 = x65Var.L;
                h75Var3.J1.invalidate();
                h75Var3.T3.invalidate();
                h75Var3.b.invalidate();
                h75Var3.F1();
                x65Var.H.clear();
                x65Var.I.clear();
                return;
            default:
                h85 h85Var = ((d85) obj).t0;
                if (h85Var.x0.getParent() != null) {
                    h85Var.a.removeView(h85Var.x0);
                    return;
                }
                return;
        }
    }
}

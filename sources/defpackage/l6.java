package defpackage;

import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b;
import org.telegram.ui.ActionBar.d;
public final class l6 implements Runnable {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final ActionBarLayout d;

    public l6(ActionBarLayout actionBarLayout, boolean z, boolean z2, boolean z3) {
        this.d = actionBarLayout;
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override
    public final void run() {
        float f;
        Integer num;
        float interpolation;
        ActionBarLayout actionBarLayout = this.d;
        if (actionBarLayout.K0 != this) {
            return;
        }
        Integer num2 = null;
        actionBarLayout.K0 = null;
        boolean z = this.a;
        if (z) {
            actionBarLayout.C0 = System.currentTimeMillis();
        }
        long nanoTime = System.nanoTime() / 1000000;
        long j = nanoTime - actionBarLayout.M0;
        if (j > 40 && z) {
            j = 0;
        } else if (j > 18) {
            j = 18;
        }
        actionBarLayout.M0 = nanoTime;
        boolean z2 = this.c;
        boolean z3 = this.b;
        if (z3 && z2) {
            f = 190.0f;
        } else {
            f = 150.0f;
        }
        float f2 = actionBarLayout.L0 + (((float) j) / f);
        actionBarLayout.L0 = f2;
        if (f2 > 1.0f) {
            actionBarLayout.L0 = 1.0f;
            f2 = 1.0f;
        }
        d dVar = actionBarLayout.I;
        if (dVar != null) {
            dVar.onTransitionAnimationProgress(true, f2);
        }
        d dVar2 = actionBarLayout.J;
        if (dVar2 != null) {
            dVar2.onTransitionAnimationProgress(false, actionBarLayout.L0);
        }
        d dVar3 = actionBarLayout.J;
        if (dVar3 != null) {
            num = Integer.valueOf(dVar3.getNavigationBarColor());
        } else {
            num = null;
        }
        d dVar4 = actionBarLayout.I;
        if (dVar4 != null) {
            num2 = Integer.valueOf(dVar4.getNavigationBarColor());
        }
        d dVar5 = actionBarLayout.J;
        if (dVar5 != null && dVar5.isSupportEdgeToEdge() && num2 != null) {
            num = num2;
        }
        d dVar6 = actionBarLayout.I;
        if (dVar6 != null && dVar6.isSupportEdgeToEdge() && num != null) {
            num2 = num;
        }
        if (actionBarLayout.I != null && num != null && num2 != null) {
            int f3 = on2.f(pqe.a(actionBarLayout.L0 * 4.0f, 0.0f, 1.0f), num.intValue(), num2.intValue());
            k6 k6Var = actionBarLayout.H;
            if (k6Var != null && k6Var.sheetsStack != null) {
                for (int i = 0; i < actionBarLayout.H.sheetsStack.size(); i++) {
                    ah0 ah0Var = actionBarLayout.H.sheetsStack.get(i);
                    if (ah0Var.y()) {
                        f3 = ah0Var.e(f3);
                    }
                }
            }
            actionBarLayout.I.setNavigationBarColor(f3);
        }
        if (z3) {
            if (z2) {
                interpolation = actionBarLayout.N.getInterpolation(actionBarLayout.L0);
            } else {
                interpolation = d53.h.getInterpolation(actionBarLayout.L0);
            }
        } else {
            interpolation = actionBarLayout.M.getInterpolation(actionBarLayout.L0);
        }
        if (z2) {
            float a = pqe.a(interpolation, 0.0f, 1.0f);
            actionBarLayout.s.setAlpha(a);
            b bVar = actionBarLayout.s;
            if (z3) {
                float f4 = (0.3f * interpolation) + 0.7f;
                bVar.setScaleX(f4);
                actionBarLayout.s.setScaleY(f4);
                if (actionBarLayout.K != null) {
                    float f5 = 1.0f - interpolation;
                    actionBarLayout.s.setTranslationY(gm.L(40.0f) * f5);
                    actionBarLayout.K.setTranslationY((-gm.L(70.0f)) * f5);
                    float f6 = (interpolation * 0.05f) + 0.95f;
                    actionBarLayout.K.setScaleX(f6);
                    actionBarLayout.K.setScaleY(f6);
                }
                actionBarLayout.r.setAlpha((int) (46.0f * a));
                cmb.r0.setAlpha((int) (a * 255.0f));
                actionBarLayout.s.invalidate();
                actionBarLayout.invalidate();
            } else {
                bVar.setTranslationX((1.0f - interpolation) * gm.L(48.0f));
            }
        } else {
            float f7 = 1.0f - interpolation;
            float a2 = pqe.a(f7, 0.0f, 1.0f);
            actionBarLayout.w.setAlpha(a2);
            b bVar2 = actionBarLayout.w;
            if (z3) {
                float f8 = (f7 * 0.1f) + 0.9f;
                bVar2.setScaleX(f8);
                actionBarLayout.w.setScaleY(f8);
                actionBarLayout.r.setAlpha((int) (46.0f * a2));
                if (actionBarLayout.K == null) {
                    cmb.r0.setAlpha((int) (a2 * 255.0f));
                }
                actionBarLayout.s.invalidate();
                actionBarLayout.invalidate();
            } else {
                bVar2.setTranslationX(gm.L(48.0f) * interpolation);
            }
        }
        if (actionBarLayout.L0 < 1.0f) {
            actionBarLayout.g0(z2, false, z3);
        } else {
            actionBarLayout.F(false);
        }
    }
}

package defpackage;

import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b;
import org.telegram.ui.ActionBar.e;
public final class m6 implements Runnable {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final ActionBarLayout d;

    public m6(ActionBarLayout actionBarLayout, boolean z, boolean z2, boolean z3) {
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
        float f2 = (((float) j) / f) + actionBarLayout.L0;
        actionBarLayout.L0 = f2;
        if (f2 > 1.0f) {
            actionBarLayout.L0 = 1.0f;
            f2 = 1.0f;
        }
        e eVar = actionBarLayout.I;
        if (eVar != null) {
            eVar.onTransitionAnimationProgress(true, f2);
        }
        e eVar2 = actionBarLayout.J;
        if (eVar2 != null) {
            eVar2.onTransitionAnimationProgress(false, actionBarLayout.L0);
        }
        e eVar3 = actionBarLayout.J;
        if (eVar3 != null) {
            num = Integer.valueOf(eVar3.getNavigationBarColor());
        } else {
            num = null;
        }
        e eVar4 = actionBarLayout.I;
        if (eVar4 != null) {
            num2 = Integer.valueOf(eVar4.getNavigationBarColor());
        }
        e eVar5 = actionBarLayout.J;
        if (eVar5 != null && eVar5.isSupportEdgeToEdge() && num2 != null) {
            num = num2;
        }
        e eVar6 = actionBarLayout.I;
        if (eVar6 != null && eVar6.isSupportEdgeToEdge() && num != null) {
            num2 = num;
        }
        if (actionBarLayout.I != null && num != null && num2 != null) {
            int f3 = vm2.f(ete.a(actionBarLayout.L0 * 4.0f, 0.0f, 1.0f), num.intValue(), num2.intValue());
            l6 l6Var = actionBarLayout.H;
            if (l6Var != null && l6Var.sheetsStack != null) {
                for (int i = 0; i < actionBarLayout.H.sheetsStack.size(); i++) {
                    ag0 ag0Var = actionBarLayout.H.sheetsStack.get(i);
                    if (ag0Var.z()) {
                        f3 = ag0Var.e(f3);
                    }
                }
            }
            actionBarLayout.I.setNavigationBarColor(f3);
        }
        if (z3) {
            if (z2) {
                interpolation = actionBarLayout.N.getInterpolation(actionBarLayout.L0);
            } else {
                interpolation = k43.h.getInterpolation(actionBarLayout.L0);
            }
        } else {
            interpolation = actionBarLayout.M.getInterpolation(actionBarLayout.L0);
        }
        if (z2) {
            float a = ete.a(interpolation, 0.0f, 1.0f);
            actionBarLayout.s.setAlpha(a);
            b bVar = actionBarLayout.s;
            if (z3) {
                float f4 = (0.3f * interpolation) + 0.7f;
                bVar.setScaleX(f4);
                actionBarLayout.s.setScaleY(f4);
                if (actionBarLayout.K != null) {
                    float f5 = 1.0f - interpolation;
                    actionBarLayout.s.setTranslationY(hl.L(40.0f) * f5);
                    actionBarLayout.K.setTranslationY((-hl.L(70.0f)) * f5);
                    float f6 = (interpolation * 0.05f) + 0.95f;
                    actionBarLayout.K.setScaleX(f6);
                    actionBarLayout.K.setScaleY(f6);
                }
                actionBarLayout.r.setAlpha((int) (46.0f * a));
                aob.r0.setAlpha((int) (a * 255.0f));
                actionBarLayout.s.invalidate();
                actionBarLayout.invalidate();
            } else {
                bVar.setTranslationX((1.0f - interpolation) * hl.L(48.0f));
            }
        } else {
            float f7 = 1.0f - interpolation;
            float a2 = ete.a(f7, 0.0f, 1.0f);
            actionBarLayout.w.setAlpha(a2);
            b bVar2 = actionBarLayout.w;
            if (z3) {
                float f8 = (f7 * 0.1f) + 0.9f;
                bVar2.setScaleX(f8);
                actionBarLayout.w.setScaleY(f8);
                actionBarLayout.r.setAlpha((int) (46.0f * a2));
                if (actionBarLayout.K == null) {
                    aob.r0.setAlpha((int) (a2 * 255.0f));
                }
                actionBarLayout.s.invalidate();
                actionBarLayout.invalidate();
            } else {
                bVar2.setTranslationX(hl.L(48.0f) * interpolation);
            }
        }
        if (actionBarLayout.L0 < 1.0f) {
            actionBarLayout.g0(z2, false, z3);
        } else {
            actionBarLayout.F(false);
        }
    }
}

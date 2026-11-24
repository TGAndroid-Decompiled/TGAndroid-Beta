package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class du5 implements Animator.AnimatorListener {
    public final int E;
    public final u69 F;
    public final hu5 G;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final u69 e;
    public final byte f;
    public final ValueAnimator h;
    public boolean n;
    public float r;
    public float s;
    public boolean w = false;
    public boolean x = false;
    public float y;

    public du5(hu5 hu5Var, u69 u69Var, int i, float f, float f2, float f3, float f4, int i2, u69 u69Var2) {
        this.G = hu5Var;
        this.E = i2;
        this.F = u69Var2;
        this.f = i;
        this.e = u69Var;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new af0(this, (byte) 7));
        ofFloat.setTarget(u69Var.a);
        ofFloat.addListener(this);
        this.y = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.x) {
            this.e.q(true);
        }
        this.x = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.y = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.w) {
            int i = this.E;
            u69 u69Var = this.F;
            hu5 hu5Var = this.G;
            if (i <= 0) {
                hu5Var.y.a(hu5Var.I, u69Var);
            } else {
                hu5Var.a.add(u69Var.a);
                this.n = true;
                if (i > 0) {
                    hu5Var.I.post(new us4(hu5Var, this, i));
                }
            }
            View view = hu5Var.N;
            View view2 = u69Var.a;
            if (view == view2 && view2 == view) {
                hu5Var.N = null;
            }
        }
    }

    @Override
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }
}

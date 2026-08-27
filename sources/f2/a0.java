package f2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

public final class a0 implements Animator.AnimatorListener {
    public final o1 A;
    public final f0 B;

    public final float f5614a;

    public final float f5615b;

    public final float f5616c;
    public final float d;

    public final o1 f5617e;

    public final int f5618f;
    public final ValueAnimator h;

    public boolean f5619n;

    public float f5620r;

    public float f5621s;
    public boolean v = false;

    public boolean f5622w = false;

    public float f5623x;

    public final int f5624y;

    public a0(f0 f0Var, o1 o1Var, int i10, float f10, float f11, float f12, float f13, int i11, o1 o1Var2) {
        this.B = f0Var;
        this.f5624y = i11;
        this.A = o1Var2;
        this.f5618f = i10;
        this.f5617e = o1Var;
        this.f5614a = f10;
        this.f5615b = f11;
        this.f5616c = f12;
        this.d = f13;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ag.q1(this, 2));
        valueAnimatorOfFloat.setTarget(o1Var.f5789a);
        valueAnimatorOfFloat.addListener(this);
        this.f5623x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f5622w) {
            this.f5617e.q(true);
        }
        this.f5622w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f5623x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (this.v) {
            return;
        }
        int i10 = this.f5624y;
        o1 o1Var = this.A;
        f0 f0Var = this.B;
        if (i10 <= 0) {
            f0Var.f5665x.a(f0Var.D, o1Var);
        } else {
            f0Var.f5656a.add(o1Var.f5789a);
            this.f5619n = true;
            if (i10 > 0) {
                f0Var.D.post(new a9.o(f0Var, this, i10));
            }
        }
        View view = f0Var.I;
        View view2 = o1Var.f5789a;
        if (view == view2) {
            f0Var.o(view2);
        }
    }

    @Override
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }
}

package f2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class z implements Animator.AnimatorListener {
    public final n1 A;
    public final e0 B;
    public final float f6513a;
    public final float f6514b;
    public final float f6515c;
    public final float d;
    public final n1 f6516e;
    public final int f6517f;
    public final ValueAnimator h;
    public boolean f6518n;
    public float f6519r;
    public float f6520s;
    public boolean v = false;
    public boolean f6521w = false;
    public float f6522x;
    public final int f6523y;

    public z(e0 e0Var, n1 n1Var, int i10, float f9, float f10, float f11, float f12, int i11, n1 n1Var2) {
        this.B = e0Var;
        this.f6523y = i11;
        this.A = n1Var2;
        this.f6517f = i10;
        this.f6516e = n1Var;
        this.f6513a = f9;
        this.f6514b = f10;
        this.f6515c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new cg.c1(this, 2));
        ofFloat.setTarget(n1Var.f6432a);
        ofFloat.addListener(this);
        this.f6522x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f6521w) {
            this.f6516e.q(true);
        }
        this.f6521w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f6522x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f6523y;
            n1 n1Var = this.A;
            e0 e0Var = this.B;
            if (i10 <= 0) {
                e0Var.f6308x.a(e0Var.D, n1Var);
            } else {
                e0Var.f6299a.add(n1Var.f6432a);
                this.f6518n = true;
                if (i10 > 0) {
                    e0Var.D.post(new ab.o(e0Var, this, i10));
                }
            }
            View view = e0Var.I;
            View view2 = n1Var.f6432a;
            if (view == view2) {
                e0Var.o(view2);
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

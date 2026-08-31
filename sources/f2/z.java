package f2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class z implements Animator.AnimatorListener {
    public final m1 B;
    public final f0 C;
    public final float f5957a;
    public final float f5958b;
    public final float f5959c;
    public final float d;
    public final m1 f5960e;
    public final int f5961f;
    public final ValueAnimator h;
    public boolean f5962n;
    public float f5963r;
    public float f5964s;
    public boolean v = false;
    public boolean f5965w = false;
    public float f5966x;
    public final int f5967y;

    public z(f0 f0Var, m1 m1Var, int i10, float f10, float f11, float f12, float f13, int i11, m1 m1Var2) {
        this.C = f0Var;
        this.f5967y = i11;
        this.B = m1Var2;
        this.f5961f = i10;
        this.f5960e = m1Var;
        this.f5957a = f10;
        this.f5958b = f11;
        this.f5959c = f12;
        this.d = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new d0(this, 0));
        ofFloat.setTarget(m1Var.f5875a);
        ofFloat.addListener(this);
        this.f5966x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f5965w) {
            this.f5960e.q(true);
        }
        this.f5965w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f5966x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f5967y;
            m1 m1Var = this.B;
            f0 f0Var = this.C;
            if (i10 <= 0) {
                f0Var.f5766x.a(f0Var.E, m1Var);
            } else {
                f0Var.f5757a.add(m1Var.f5875a);
                this.f5962n = true;
                if (i10 > 0) {
                    f0Var.E.post(new androidx.biometric.k(f0Var, this, i10));
                }
            }
            View view = f0Var.J;
            View view2 = m1Var.f5875a;
            if (view == view2) {
                f0Var.o(view2);
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

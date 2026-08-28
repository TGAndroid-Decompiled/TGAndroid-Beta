package f2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class b0 implements Animator.AnimatorListener {
    public final q1 A;
    public final h0 B;
    public final float f5321a;
    public final float f5322b;
    public final float f5323c;
    public final float d;
    public final q1 f5324e;
    public final int f5325f;
    public final ValueAnimator h;
    public boolean f5326n;
    public float f5327r;
    public float f5328s;
    public boolean v = false;
    public boolean f5329w = false;
    public float f5330x;
    public final int f5331y;

    public b0(h0 h0Var, q1 q1Var, int i9, float f10, float f11, float f12, float f13, int i10, q1 q1Var2) {
        this.B = h0Var;
        this.f5331y = i10;
        this.A = q1Var2;
        this.f5325f = i9;
        this.f5324e = q1Var;
        this.f5321a = f10;
        this.f5322b = f11;
        this.f5323c = f12;
        this.d = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new f0(this, 0));
        ofFloat.setTarget(q1Var.f5501a);
        ofFloat.addListener(this);
        this.f5330x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f5329w) {
            this.f5324e.q(true);
        }
        this.f5329w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f5330x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i9 = this.f5331y;
            q1 q1Var = this.A;
            h0 h0Var = this.B;
            if (i9 <= 0) {
                h0Var.f5377x.a(h0Var.D, q1Var);
            } else {
                h0Var.f5368a.add(q1Var.f5501a);
                this.f5326n = true;
                if (i9 > 0) {
                    h0Var.D.post(new androidx.biometric.j(h0Var, this, i9));
                }
            }
            View view = h0Var.I;
            View view2 = q1Var.f5501a;
            if (view == view2) {
                h0Var.o(view2);
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

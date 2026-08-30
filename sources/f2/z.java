package f2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
public final class z implements Animator.AnimatorListener {
    public final l1 B;
    public final e0 C;
    public final float f5863a;
    public final float f5864b;
    public final float f5865c;
    public final float d;
    public final l1 e;
    public final int f5866f;
    public final ValueAnimator h;
    public boolean f5867n;
    public float f5868r;
    public float f5869s;
    public boolean v = false;
    public boolean f5870w = false;
    public float f5871x;
    public final int f5872y;

    public z(e0 e0Var, l1 l1Var, int i10, float f10, float f11, float f12, float f13, int i11, l1 l1Var2) {
        this.C = e0Var;
        this.f5872y = i11;
        this.B = l1Var2;
        this.f5866f = i10;
        this.e = l1Var;
        this.f5863a = f10;
        this.f5864b = f11;
        this.f5865c = f12;
        this.d = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new eg.b1(this, 2));
        ofFloat.setTarget(l1Var.f5785a);
        ofFloat.addListener(this);
        this.f5871x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f5870w) {
            this.e.q(true);
        }
        this.f5870w = true;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f5871x = 1.0f;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.v) {
            int i10 = this.f5872y;
            l1 l1Var = this.B;
            e0 e0Var = this.C;
            if (i10 <= 0) {
                e0Var.f5689x.a(e0Var.E, l1Var);
            } else {
                e0Var.f5681a.add(l1Var.f5785a);
                this.f5867n = true;
                if (i10 > 0) {
                    e0Var.E.post(new androidx.biometric.k(e0Var, this, i10));
                }
            }
            View view = e0Var.J;
            View view2 = l1Var.f5785a;
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

package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class s04 extends ggc {
    public final e34 x0;

    public s04(e34 e34Var, Context context) {
        super(context);
        this.x0 = e34Var;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.x0.f) {
            return false;
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override
    public final void x(int i, boolean z) {
        boolean z2;
        e34 e34Var = this.x0;
        j14 j14Var = e34Var.J;
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        e34Var.Q(z2);
        if (i == getCurrentItem()) {
            if (i == 0) {
                e34Var.R0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(j14Var, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(d53.h);
                ofFloat.start();
                e34Var.E(1, 0);
                if (j14Var != null) {
                    j14Var.j(0, true);
                    return;
                }
                return;
            } else if (i == 1) {
                e34Var.i0.z0(0);
                return;
            } else {
                e34Var.E0.z0(1);
                return;
            }
        }
        super.x(i, z);
    }
}

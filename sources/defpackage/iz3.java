package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class iz3 extends gec {
    public final t14 x0;

    public iz3(t14 t14Var, Context context) {
        super(context);
        this.x0 = t14Var;
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
        t14 t14Var = this.x0;
        yz3 yz3Var = t14Var.J;
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        t14Var.R(z2);
        if (i == getCurrentItem()) {
            if (i == 0) {
                t14Var.R0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(yz3Var, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(s33.h);
                ofFloat.start();
                t14Var.E(1, 0);
                if (yz3Var != null) {
                    yz3Var.j(0, true);
                    return;
                }
                return;
            } else if (i == 1) {
                t14Var.i0.z0(0);
                return;
            } else {
                t14Var.E0.z0(1);
                return;
            }
        }
        super.x(i, z);
    }
}

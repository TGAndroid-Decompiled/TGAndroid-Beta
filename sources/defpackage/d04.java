package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class d04 extends fic {
    public final o24 x0;

    public d04(o24 o24Var, Context context) {
        super(context);
        this.x0 = o24Var;
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
        o24 o24Var = this.x0;
        t04 t04Var = o24Var.J;
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        o24Var.Q(z2);
        if (i == getCurrentItem()) {
            if (i == 0) {
                o24Var.R0[1] = 0;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t04Var, ViewGroup.TRANSLATION_Y, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(k43.h);
                ofFloat.start();
                o24Var.E(1, 0);
                if (t04Var != null) {
                    t04Var.j(0, true);
                    return;
                }
                return;
            } else if (i == 1) {
                o24Var.i0.A0(0);
                return;
            } else {
                o24Var.E0.A0(1);
                return;
            }
        }
        super.x(i, z);
    }
}

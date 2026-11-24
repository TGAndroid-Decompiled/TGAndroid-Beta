package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class zq4 implements GestureDetector.OnGestureListener {
    public final byte a;
    public final er4 b;

    public zq4(er4 er4Var, int i) {
        this.b = er4Var;
        this.a = i;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        er4 er4Var = this.b;
        ValueAnimator valueAnimator = er4Var.d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            er4Var.d0.cancel();
            er4Var.d0 = null;
        }
        AnimatorSet animatorSet = er4Var.e0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            er4Var.e0.cancel();
            er4Var.e0 = null;
        }
        gl.r(er4Var.f0);
        er4Var.a = true;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        this.b.g();
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        uq4 uq4Var = this.b.b;
        if (this.a == 4) {
            uq4Var.d -= f * 0.5f;
            uq4Var.i -= f2 * 0.05f;
            return true;
        }
        uq4Var.d = (f * 0.5f) + uq4Var.d;
        uq4Var.i = (f2 * 0.05f) + uq4Var.i;
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.b.getMeasuredWidth() / 2.0f;
        SecureRandom secureRandom = Utilities.b;
        gl.d3(new yq4(this, ((measuredWidth - motionEvent.getX()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, (byte) 0), 16L);
        return true;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

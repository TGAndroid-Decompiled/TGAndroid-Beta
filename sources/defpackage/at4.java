package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class at4 implements GestureDetector.OnGestureListener {
    public final byte a;
    public final ft4 b;

    public at4(ft4 ft4Var, int i) {
        this.b = ft4Var;
        this.a = i;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        ft4 ft4Var = this.b;
        ValueAnimator valueAnimator = ft4Var.d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ft4Var.d0.cancel();
            ft4Var.d0 = null;
        }
        AnimatorSet animatorSet = ft4Var.e0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            ft4Var.e0.cancel();
            ft4Var.e0 = null;
        }
        gm.r(ft4Var.f0);
        ft4Var.a = true;
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
        vs4 vs4Var = this.b.b;
        if (this.a == 4) {
            vs4Var.d -= f * 0.5f;
            vs4Var.i -= f2 * 0.05f;
            return true;
        }
        vs4Var.d = (f * 0.5f) + vs4Var.d;
        vs4Var.i = (f2 * 0.05f) + vs4Var.i;
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.b.getMeasuredWidth() / 2.0f;
        SecureRandom secureRandom = Utilities.b;
        gm.d3(new zs4(this, ((measuredWidth - motionEvent.getX()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, (byte) 0), 16L);
        return true;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

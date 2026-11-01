package lg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.i0;
public final class l implements GestureDetector.OnGestureListener {
    public final int f11907a;
    public final q f11908b;

    public l(q qVar, int i10) {
        this.f11908b = qVar;
        this.f11907a = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        q qVar = this.f11908b;
        ValueAnimator valueAnimator = qVar.f11923c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            qVar.f11923c0.cancel();
            qVar.f11923c0 = null;
        }
        AnimatorSet animatorSet = qVar.f11924d0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            qVar.f11924d0.cancel();
            qVar.f11924d0 = null;
        }
        i0.r(qVar.f11925e0);
        qVar.f11918a = true;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        this.f11908b.h();
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        int i10 = this.f11907a;
        q qVar = this.f11908b;
        if (i10 == 4) {
            h hVar = qVar.f11920b;
            hVar.d -= f7 * 0.5f;
            hVar.f11882i -= f10 * 0.05f;
            return true;
        }
        h hVar2 = qVar.f11920b;
        hVar2.d = (f7 * 0.5f) + hVar2.d;
        hVar2.f11882i = (f10 * 0.05f) + hVar2.f11882i;
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.f11908b.getMeasuredWidth() / 2.0f;
        SecureRandom secureRandom = Utilities.f14520b;
        i0.h3(new k(this, ((measuredWidth - motionEvent.getX()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, 0), 16L);
        return true;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

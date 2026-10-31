package lg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.i0;
public final class l implements GestureDetector.OnGestureListener {
    public final int f11906a;
    public final q f11907b;

    public l(q qVar, int i10) {
        this.f11907b = qVar;
        this.f11906a = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        q qVar = this.f11907b;
        ValueAnimator valueAnimator = qVar.f11922c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            qVar.f11922c0.cancel();
            qVar.f11922c0 = null;
        }
        AnimatorSet animatorSet = qVar.f11923d0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            qVar.f11923d0.cancel();
            qVar.f11923d0 = null;
        }
        i0.r(qVar.f11924e0);
        qVar.f11917a = true;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        this.f11907b.h();
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        int i10 = this.f11906a;
        q qVar = this.f11907b;
        if (i10 == 4) {
            h hVar = qVar.f11919b;
            hVar.d -= f7 * 0.5f;
            hVar.f11881i -= f10 * 0.05f;
            return true;
        }
        h hVar2 = qVar.f11919b;
        hVar2.d = (f7 * 0.5f) + hVar2.d;
        hVar2.f11881i = (f10 * 0.05f) + hVar2.f11881i;
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float measuredWidth = this.f11907b.getMeasuredWidth() / 2.0f;
        SecureRandom secureRandom = Utilities.f14519b;
        i0.h3(new k(this, ((measuredWidth - motionEvent.getX()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, ((measuredWidth - motionEvent.getY()) * (secureRandom.nextInt(30) + 40)) / measuredWidth, 0), 16L);
        return true;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

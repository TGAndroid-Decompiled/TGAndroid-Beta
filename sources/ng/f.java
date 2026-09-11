package ng;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f16732a;
    public float f16733b;
    public final i f16734c;

    public f(i iVar) {
        this.f16734c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f16734c;
        if (iVar.f16747f && !iVar.f16748n) {
            l lVar = iVar.f16745c.f16825u;
            if ((f7 / 7.0f) + ((float) lVar.f16832i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f16832i = i.a(displayMetrics, f11);
            iVar.d.f16825u.f16832i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f16825u.f16832i));
            iVar.f16745c.f();
            iVar.d.f();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f16734c;
        int i10 = iVar.F;
        if (!iVar.f16748n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f16749r);
        }
        if (!iVar.f16747f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f16732a = (float) iVar.f16745c.f16825u.f16832i;
            this.f16733b = (float) iVar.d.f16825u.f16832i;
            iVar.f16747f = true;
        }
        if (iVar.f16747f && !iVar.f16748n) {
            iVar.f16745c.f16825u.f16832i = (motionEvent2.getRawX() + this.f16732a) - motionEvent.getRawX();
            iVar.d.f16825u.f16832i = (motionEvent2.getRawY() + this.f16733b) - motionEvent.getRawY();
            iVar.f16745c.f();
            iVar.d.f();
        }
        return iVar.f16747f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f16734c;
        if (!iVar.f16748n && !iVar.f16750s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}

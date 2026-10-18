package ng;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f17454a;
    public float f17455b;
    public final i f17456c;

    public f(i iVar) {
        this.f17456c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f17456c;
        if (iVar.f17466f && !iVar.f17467n) {
            l lVar = iVar.f17465c.f17558u;
            if ((f7 / 7.0f) + ((float) lVar.f17564i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f17564i = i.a(displayMetrics, f11);
            iVar.d.f17558u.f17564i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f17558u.f17564i));
            iVar.f17465c.h();
            iVar.d.h();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f17456c;
        int i10 = iVar.F;
        if (!iVar.f17467n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f17468r);
        }
        if (!iVar.f17466f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f17454a = (float) iVar.f17465c.f17558u.f17564i;
            this.f17455b = (float) iVar.d.f17558u.f17564i;
            iVar.f17466f = true;
        }
        if (iVar.f17466f && !iVar.f17467n) {
            iVar.f17465c.f17558u.f17564i = (motionEvent2.getRawX() + this.f17454a) - motionEvent.getRawX();
            iVar.d.f17558u.f17564i = (motionEvent2.getRawY() + this.f17455b) - motionEvent.getRawY();
            iVar.f17465c.h();
            iVar.d.h();
        }
        return iVar.f17466f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f17456c;
        if (!iVar.f17467n && !iVar.f17469s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}

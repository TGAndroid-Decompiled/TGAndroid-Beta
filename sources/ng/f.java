package ng;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f16759a;
    public float f16760b;
    public final i f16761c;

    public f(i iVar) {
        this.f16761c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f16761c;
        if (iVar.f16774f && !iVar.f16775n) {
            l lVar = iVar.f16772c.f16852u;
            if ((f7 / 7.0f) + ((float) lVar.f16859i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f16859i = i.a(displayMetrics, f11);
            iVar.d.f16852u.f16859i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f16852u.f16859i));
            iVar.f16772c.f();
            iVar.d.f();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f16761c;
        int i10 = iVar.F;
        if (!iVar.f16775n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f16776r);
        }
        if (!iVar.f16774f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f16759a = (float) iVar.f16772c.f16852u.f16859i;
            this.f16760b = (float) iVar.d.f16852u.f16859i;
            iVar.f16774f = true;
        }
        if (iVar.f16774f && !iVar.f16775n) {
            iVar.f16772c.f16852u.f16859i = (motionEvent2.getRawX() + this.f16759a) - motionEvent.getRawX();
            iVar.d.f16852u.f16859i = (motionEvent2.getRawY() + this.f16760b) - motionEvent.getRawY();
            iVar.f16772c.f();
            iVar.d.f();
        }
        return iVar.f16774f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f16761c;
        if (!iVar.f16775n && !iVar.f16777s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}

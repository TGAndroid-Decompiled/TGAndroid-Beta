package ng;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f17451a;
    public float f17452b;
    public final i f17453c;

    public f(i iVar) {
        this.f17453c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f17453c;
        if (iVar.f17463f && !iVar.f17464n) {
            l lVar = iVar.f17462c.f17555u;
            if ((f7 / 7.0f) + ((float) lVar.f17561i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f17561i = i.a(displayMetrics, f11);
            iVar.d.f17555u.f17561i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f17555u.f17561i));
            iVar.f17462c.h();
            iVar.d.h();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f17453c;
        int i10 = iVar.F;
        if (!iVar.f17464n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f17465r);
        }
        if (!iVar.f17463f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f17451a = (float) iVar.f17462c.f17555u.f17561i;
            this.f17452b = (float) iVar.d.f17555u.f17561i;
            iVar.f17463f = true;
        }
        if (iVar.f17463f && !iVar.f17464n) {
            iVar.f17462c.f17555u.f17561i = (motionEvent2.getRawX() + this.f17451a) - motionEvent.getRawX();
            iVar.d.f17555u.f17561i = (motionEvent2.getRawY() + this.f17452b) - motionEvent.getRawY();
            iVar.f17462c.h();
            iVar.d.h();
        }
        return iVar.f17463f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f17453c;
        if (!iVar.f17464n && !iVar.f17466s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}

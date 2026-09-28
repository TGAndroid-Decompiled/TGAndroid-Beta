package mg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f15040a;
    public float f15041b;
    public final i f15042c;

    public f(i iVar) {
        this.f15042c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f15042c;
        if (iVar.f15052f && !iVar.f15053n) {
            l lVar = iVar.f15051c.f15533u;
            if ((f7 / 7.0f) + ((float) lVar.f15539i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f15539i = i.a(displayMetrics, f11);
            iVar.d.f15533u.f15539i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f15533u.f15539i));
            iVar.f15051c.f();
            iVar.d.f();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f15042c;
        int i10 = iVar.F;
        if (!iVar.f15053n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f15054r);
        }
        if (!iVar.f15052f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f15040a = (float) iVar.f15051c.f15533u.f15539i;
            this.f15041b = (float) iVar.d.f15533u.f15539i;
            iVar.f15052f = true;
        }
        if (iVar.f15052f && !iVar.f15053n) {
            iVar.f15051c.f15533u.f15539i = (motionEvent2.getRawX() + this.f15040a) - motionEvent.getRawX();
            iVar.d.f15533u.f15539i = (motionEvent2.getRawY() + this.f15041b) - motionEvent.getRawY();
            iVar.f15051c.f();
            iVar.d.f();
        }
        return iVar.f15052f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f15042c;
        if (!iVar.f15053n && !iVar.f15055s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}

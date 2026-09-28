package mg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f15041a;
    public float f15042b;
    public final i f15043c;

    public f(i iVar) {
        this.f15043c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f15043c;
        if (iVar.f15053f && !iVar.f15054n) {
            l lVar = iVar.f15052c.f15534u;
            if ((f7 / 7.0f) + ((float) lVar.f15540i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f15540i = i.a(displayMetrics, f11);
            iVar.d.f15534u.f15540i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f15534u.f15540i));
            iVar.f15052c.f();
            iVar.d.f();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f15043c;
        int i10 = iVar.F;
        if (!iVar.f15054n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f15055r);
        }
        if (!iVar.f15053f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f15041a = (float) iVar.f15052c.f15534u.f15540i;
            this.f15042b = (float) iVar.d.f15534u.f15540i;
            iVar.f15053f = true;
        }
        if (iVar.f15053f && !iVar.f15054n) {
            iVar.f15052c.f15534u.f15540i = (motionEvent2.getRawX() + this.f15041a) - motionEvent.getRawX();
            iVar.d.f15534u.f15540i = (motionEvent2.getRawY() + this.f15042b) - motionEvent.getRawY();
            iVar.f15052c.f();
            iVar.d.f();
        }
        return iVar.f15053f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f15043c;
        if (!iVar.f15054n && !iVar.f15056s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}

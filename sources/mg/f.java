package mg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f15036a;
    public float f15037b;
    public final i f15038c;

    public f(i iVar) {
        this.f15038c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f15038c;
        if (iVar.f15048f && !iVar.f15049n) {
            l lVar = iVar.f15047c.f15522u;
            if ((f7 / 7.0f) + ((float) lVar.f15528i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f15528i = i.a(displayMetrics, f11);
            iVar.d.f15522u.f15528i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f15522u.f15528i));
            iVar.f15047c.f();
            iVar.d.f();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f15038c;
        int i10 = iVar.F;
        if (!iVar.f15049n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f15050r);
        }
        if (!iVar.f15048f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f15036a = (float) iVar.f15047c.f15522u.f15528i;
            this.f15037b = (float) iVar.d.f15522u.f15528i;
            iVar.f15048f = true;
        }
        if (iVar.f15048f && !iVar.f15049n) {
            iVar.f15047c.f15522u.f15528i = (motionEvent2.getRawX() + this.f15036a) - motionEvent.getRawX();
            iVar.d.f15522u.f15528i = (motionEvent2.getRawY() + this.f15037b) - motionEvent.getRawY();
            iVar.f15047c.f();
            iVar.d.f();
        }
        return iVar.f15048f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f15038c;
        if (!iVar.f15049n && !iVar.f15051s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}

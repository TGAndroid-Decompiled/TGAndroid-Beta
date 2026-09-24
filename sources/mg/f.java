package mg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f15025a;
    public float f15026b;
    public final i f15027c;

    public f(i iVar) {
        this.f15027c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f15027c;
        if (iVar.f15037f && !iVar.f15038n) {
            l lVar = iVar.f15036c.f15518u;
            if ((f7 / 7.0f) + ((float) lVar.f15524i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f15524i = i.a(displayMetrics, f11);
            iVar.d.f15518u.f15524i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f15518u.f15524i));
            iVar.f15036c.f();
            iVar.d.f();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f15027c;
        int i10 = iVar.F;
        if (!iVar.f15038n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f15039r);
        }
        if (!iVar.f15037f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f15025a = (float) iVar.f15036c.f15518u.f15524i;
            this.f15026b = (float) iVar.d.f15518u.f15524i;
            iVar.f15037f = true;
        }
        if (iVar.f15037f && !iVar.f15038n) {
            iVar.f15036c.f15518u.f15524i = (motionEvent2.getRawX() + this.f15025a) - motionEvent.getRawX();
            iVar.d.f15518u.f15524i = (motionEvent2.getRawY() + this.f15026b) - motionEvent.getRawY();
            iVar.f15036c.f();
            iVar.d.f();
        }
        return iVar.f15037f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f15027c;
        if (!iVar.f15038n && !iVar.f15040s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}

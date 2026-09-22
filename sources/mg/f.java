package mg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f14813a;
    public float f14814b;
    public final i f14815c;

    public f(i iVar) {
        this.f14815c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f14815c;
        if (iVar.f14825f && !iVar.f14826n) {
            l lVar = iVar.f14824c.f15349u;
            if ((f7 / 7.0f) + ((float) lVar.f15355i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f15355i = i.a(displayMetrics, f11);
            iVar.d.f15349u.f15355i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f15349u.f15355i));
            iVar.f14824c.f();
            iVar.d.f();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f14815c;
        int i10 = iVar.F;
        if (!iVar.f14826n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f14827r);
        }
        if (!iVar.f14825f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f14813a = (float) iVar.f14824c.f15349u.f15355i;
            this.f14814b = (float) iVar.d.f15349u.f15355i;
            iVar.f14825f = true;
        }
        if (iVar.f14825f && !iVar.f14826n) {
            iVar.f14824c.f15349u.f15355i = (motionEvent2.getRawX() + this.f14813a) - motionEvent.getRawX();
            iVar.d.f15349u.f15355i = (motionEvent2.getRawY() + this.f14814b) - motionEvent.getRawY();
            iVar.f14824c.f();
            iVar.d.f();
        }
        return iVar.f14825f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f14815c;
        if (!iVar.f14826n && !iVar.f14828s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}

package mg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f14825a;
    public float f14826b;
    public final i f14827c;

    public f(i iVar) {
        this.f14827c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f14827c;
        if (iVar.f14837f && !iVar.f14838n) {
            l lVar = iVar.f14836c.f15361u;
            if ((f7 / 7.0f) + ((float) lVar.f15367i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f15367i = i.a(displayMetrics, f11);
            iVar.d.f15361u.f15367i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f15361u.f15367i));
            iVar.f14836c.f();
            iVar.d.f();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f14827c;
        int i10 = iVar.F;
        if (!iVar.f14838n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f14839r);
        }
        if (!iVar.f14837f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f14825a = (float) iVar.f14836c.f15361u.f15367i;
            this.f14826b = (float) iVar.d.f15361u.f15367i;
            iVar.f14837f = true;
        }
        if (iVar.f14837f && !iVar.f14838n) {
            iVar.f14836c.f15361u.f15367i = (motionEvent2.getRawX() + this.f14825a) - motionEvent.getRawX();
            iVar.d.f15361u.f15367i = (motionEvent2.getRawY() + this.f14826b) - motionEvent.getRawY();
            iVar.f14836c.f();
            iVar.d.f();
        }
        return iVar.f14837f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f14827c;
        if (!iVar.f14838n && !iVar.f14840s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}

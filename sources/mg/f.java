package mg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f15056a;
    public float f15057b;
    public final i f15058c;

    public f(i iVar) {
        this.f15058c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f15058c;
        if (iVar.f15068f && !iVar.f15069n) {
            l lVar = iVar.f15067c.f15549u;
            if ((f7 / 7.0f) + ((float) lVar.f15555i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f15555i = i.a(displayMetrics, f11);
            iVar.d.f15549u.f15555i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f15549u.f15555i));
            iVar.f15067c.f();
            iVar.d.f();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f15058c;
        int i10 = iVar.F;
        if (!iVar.f15069n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f15070r);
        }
        if (!iVar.f15068f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f15056a = (float) iVar.f15067c.f15549u.f15555i;
            this.f15057b = (float) iVar.d.f15549u.f15555i;
            iVar.f15068f = true;
        }
        if (iVar.f15068f && !iVar.f15069n) {
            iVar.f15067c.f15549u.f15555i = (motionEvent2.getRawX() + this.f15056a) - motionEvent.getRawX();
            iVar.d.f15549u.f15555i = (motionEvent2.getRawY() + this.f15057b) - motionEvent.getRawY();
            iVar.f15067c.f();
            iVar.d.f();
        }
        return iVar.f15068f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f15058c;
        if (!iVar.f15069n && !iVar.f15071s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}

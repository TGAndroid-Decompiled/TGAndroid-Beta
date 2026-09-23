package mg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f14790a;
    public float f14791b;
    public final i f14792c;

    public f(i iVar) {
        this.f14792c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f14792c;
        if (iVar.f14802f && !iVar.f14803n) {
            l lVar = iVar.f14801c.f15326u;
            if ((f7 / 7.0f) + ((float) lVar.f15332i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f15332i = i.a(displayMetrics, f11);
            iVar.d.f15326u.f15332i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f15326u.f15332i));
            iVar.f14801c.f();
            iVar.d.f();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f14792c;
        int i10 = iVar.F;
        if (!iVar.f14803n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f14804r);
        }
        if (!iVar.f14802f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f14790a = (float) iVar.f14801c.f15326u.f15332i;
            this.f14791b = (float) iVar.d.f15326u.f15332i;
            iVar.f14802f = true;
        }
        if (iVar.f14802f && !iVar.f14803n) {
            iVar.f14801c.f15326u.f15332i = (motionEvent2.getRawX() + this.f14790a) - motionEvent.getRawX();
            iVar.d.f15326u.f15332i = (motionEvent2.getRawY() + this.f14791b) - motionEvent.getRawY();
            iVar.f14801c.f();
            iVar.d.f();
        }
        return iVar.f14802f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f14792c;
        if (!iVar.f14803n && !iVar.f14805s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}

package mg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f15051a;
    public float f15052b;
    public final i f15053c;

    public f(i iVar) {
        this.f15053c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f15053c;
        if (iVar.f15063f && !iVar.f15064n) {
            l lVar = iVar.f15062c.f15537u;
            if ((f7 / 7.0f) + ((float) lVar.f15543i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f15543i = i.a(displayMetrics, f11);
            iVar.d.f15537u.f15543i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f15537u.f15543i));
            iVar.f15062c.f();
            iVar.d.f();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f15053c;
        int i10 = iVar.F;
        if (!iVar.f15064n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f15065r);
        }
        if (!iVar.f15063f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f15051a = (float) iVar.f15062c.f15537u.f15543i;
            this.f15052b = (float) iVar.d.f15537u.f15543i;
            iVar.f15063f = true;
        }
        if (iVar.f15063f && !iVar.f15064n) {
            iVar.f15062c.f15537u.f15543i = (motionEvent2.getRawX() + this.f15051a) - motionEvent.getRawX();
            iVar.d.f15537u.f15543i = (motionEvent2.getRawY() + this.f15052b) - motionEvent.getRawY();
            iVar.f15062c.f();
            iVar.d.f();
        }
        return iVar.f15063f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f15053c;
        if (!iVar.f15064n && !iVar.f15066s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}

package mg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f14815a;
    public float f14816b;
    public final i f14817c;

    public f(i iVar) {
        this.f14817c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f14817c;
        if (iVar.f14827f && !iVar.f14828n) {
            l lVar = iVar.f14826c.f15351u;
            if ((f7 / 7.0f) + ((float) lVar.f15357i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f15357i = i.a(displayMetrics, f11);
            iVar.d.f15351u.f15357i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f15351u.f15357i));
            iVar.f14826c.f();
            iVar.d.f();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f14817c;
        int i10 = iVar.F;
        if (!iVar.f14828n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f14829r);
        }
        if (!iVar.f14827f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f14815a = (float) iVar.f14826c.f15351u.f15357i;
            this.f14816b = (float) iVar.d.f15351u.f15357i;
            iVar.f14827f = true;
        }
        if (iVar.f14827f && !iVar.f14828n) {
            iVar.f14826c.f15351u.f15357i = (motionEvent2.getRawX() + this.f14815a) - motionEvent.getRawX();
            iVar.d.f15351u.f15357i = (motionEvent2.getRawY() + this.f14816b) - motionEvent.getRawY();
            iVar.f14826c.f();
            iVar.d.f();
        }
        return iVar.f14827f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f14817c;
        if (!iVar.f14828n && !iVar.f14830s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}

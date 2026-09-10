package lg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f12944a;
    public float f12945b;
    public final i f12946c;

    public f(i iVar) {
        this.f12946c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f12946c;
        if (iVar.f12956f && !iVar.f12957n) {
            l lVar = iVar.f12955c.f14134u;
            if ((f7 / 7.0f) + ((float) lVar.f14140i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f14140i = i.a(displayMetrics, f11);
            iVar.d.f14134u.f14140i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f14134u.f14140i));
            iVar.f12955c.f();
            iVar.d.f();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f12946c;
        int i10 = iVar.F;
        if (!iVar.f12957n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f12958r);
        }
        if (!iVar.f12956f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f12944a = (float) iVar.f12955c.f14134u.f14140i;
            this.f12945b = (float) iVar.d.f14134u.f14140i;
            iVar.f12956f = true;
        }
        if (iVar.f12956f && !iVar.f12957n) {
            iVar.f12955c.f14134u.f14140i = (motionEvent2.getRawX() + this.f12944a) - motionEvent.getRawX();
            iVar.d.f14134u.f14140i = (motionEvent2.getRawY() + this.f12945b) - motionEvent.getRawY();
            iVar.f12955c.f();
            iVar.d.f();
        }
        return iVar.f12956f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f12946c;
        if (!iVar.f12957n && !iVar.f12959s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}

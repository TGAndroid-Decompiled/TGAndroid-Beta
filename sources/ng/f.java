package ng;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f17455a;
    public float f17456b;
    public final i f17457c;

    public f(i iVar) {
        this.f17457c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f17457c;
        if (iVar.f17467f && !iVar.f17468n) {
            l lVar = iVar.f17466c.f17559u;
            if ((f7 / 7.0f) + ((float) lVar.f17565i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f17565i = i.a(displayMetrics, f11);
            iVar.d.f17559u.f17565i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f17559u.f17565i));
            iVar.f17466c.h();
            iVar.d.h();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f17457c;
        int i10 = iVar.F;
        if (!iVar.f17468n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f17469r);
        }
        if (!iVar.f17467f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f17455a = (float) iVar.f17466c.f17559u.f17565i;
            this.f17456b = (float) iVar.d.f17559u.f17565i;
            iVar.f17467f = true;
        }
        if (iVar.f17467f && !iVar.f17468n) {
            iVar.f17466c.f17559u.f17565i = (motionEvent2.getRawX() + this.f17455a) - motionEvent.getRawX();
            iVar.d.f17559u.f17565i = (motionEvent2.getRawY() + this.f17456b) - motionEvent.getRawY();
            iVar.f17466c.h();
            iVar.d.h();
        }
        return iVar.f17467f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f17457c;
        if (!iVar.f17468n && !iVar.f17470s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}

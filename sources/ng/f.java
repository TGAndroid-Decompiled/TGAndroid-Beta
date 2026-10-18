package ng;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f17458a;
    public float f17459b;
    public final i f17460c;

    public f(i iVar) {
        this.f17460c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f17460c;
        if (iVar.f17470f && !iVar.f17471n) {
            l lVar = iVar.f17469c.f17562u;
            if ((f7 / 7.0f) + ((float) lVar.f17568i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f17568i = i.a(displayMetrics, f11);
            iVar.d.f17562u.f17568i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f17562u.f17568i));
            iVar.f17469c.h();
            iVar.d.h();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f17460c;
        int i10 = iVar.F;
        if (!iVar.f17471n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f17472r);
        }
        if (!iVar.f17470f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f17458a = (float) iVar.f17469c.f17562u.f17568i;
            this.f17459b = (float) iVar.d.f17562u.f17568i;
            iVar.f17470f = true;
        }
        if (iVar.f17470f && !iVar.f17471n) {
            iVar.f17469c.f17562u.f17568i = (motionEvent2.getRawX() + this.f17458a) - motionEvent.getRawX();
            iVar.d.f17562u.f17568i = (motionEvent2.getRawY() + this.f17459b) - motionEvent.getRawY();
            iVar.f17469c.h();
            iVar.d.h();
        }
        return iVar.f17470f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f17460c;
        if (!iVar.f17471n && !iVar.f17473s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}

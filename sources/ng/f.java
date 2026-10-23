package ng;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f17518a;
    public float f17519b;
    public final i f17520c;

    public f(i iVar) {
        this.f17520c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f17520c;
        if (iVar.f17530f && !iVar.f17531n) {
            l lVar = iVar.f17529c.f17622u;
            if ((f7 / 7.0f) + ((float) lVar.f17628i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f17628i = i.a(displayMetrics, f11);
            iVar.d.f17622u.f17628i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f17622u.f17628i));
            iVar.f17529c.h();
            iVar.d.h();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f17520c;
        int i10 = iVar.F;
        if (!iVar.f17531n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f17532r);
        }
        if (!iVar.f17530f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f17518a = (float) iVar.f17529c.f17622u.f17628i;
            this.f17519b = (float) iVar.d.f17622u.f17628i;
            iVar.f17530f = true;
        }
        if (iVar.f17530f && !iVar.f17531n) {
            iVar.f17529c.f17622u.f17628i = (motionEvent2.getRawX() + this.f17518a) - motionEvent.getRawX();
            iVar.d.f17622u.f17628i = (motionEvent2.getRawY() + this.f17519b) - motionEvent.getRawY();
            iVar.f17529c.h();
            iVar.d.h();
        }
        return iVar.f17530f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f17520c;
        if (!iVar.f17531n && !iVar.f17533s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}

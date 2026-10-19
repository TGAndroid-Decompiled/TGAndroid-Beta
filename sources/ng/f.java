package ng;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f17457a;
    public float f17458b;
    public final i f17459c;

    public f(i iVar) {
        this.f17459c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f17459c;
        if (iVar.f17469f && !iVar.f17470n) {
            l lVar = iVar.f17468c.f17561u;
            if ((f7 / 7.0f) + ((float) lVar.f17567i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f17567i = i.a(displayMetrics, f11);
            iVar.d.f17561u.f17567i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f17561u.f17567i));
            iVar.f17468c.h();
            iVar.d.h();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f17459c;
        int i10 = iVar.F;
        if (!iVar.f17470n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f17471r);
        }
        if (!iVar.f17469f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f17457a = (float) iVar.f17468c.f17561u.f17567i;
            this.f17458b = (float) iVar.d.f17561u.f17567i;
            iVar.f17469f = true;
        }
        if (iVar.f17469f && !iVar.f17470n) {
            iVar.f17468c.f17561u.f17567i = (motionEvent2.getRawX() + this.f17457a) - motionEvent.getRawX();
            iVar.d.f17561u.f17567i = (motionEvent2.getRawY() + this.f17458b) - motionEvent.getRawY();
            iVar.f17468c.h();
            iVar.d.h();
        }
        return iVar.f17469f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f17459c;
        if (!iVar.f17470n && !iVar.f17472s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}

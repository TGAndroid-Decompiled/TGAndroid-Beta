package mg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f16171a;
    public float f16172b;
    public final i f16173c;

    public f(i iVar) {
        this.f16173c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f16173c;
        if (iVar.f16186f && !iVar.f16187n) {
            l lVar = iVar.f16184c.f16691u;
            if ((f7 / 7.0f) + ((float) lVar.f16698i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f16698i = i.a(displayMetrics, f11);
            iVar.d.f16691u.f16698i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f16691u.f16698i));
            iVar.f16184c.h();
            iVar.d.h();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f16173c;
        int i10 = iVar.F;
        if (!iVar.f16187n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f16188r);
        }
        if (!iVar.f16186f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f16171a = (float) iVar.f16184c.f16691u.f16698i;
            this.f16172b = (float) iVar.d.f16691u.f16698i;
            iVar.f16186f = true;
        }
        if (iVar.f16186f && !iVar.f16187n) {
            iVar.f16184c.f16691u.f16698i = (motionEvent2.getRawX() + this.f16171a) - motionEvent.getRawX();
            iVar.d.f16691u.f16698i = (motionEvent2.getRawY() + this.f16172b) - motionEvent.getRawY();
            iVar.f16184c.h();
            iVar.d.h();
        }
        return iVar.f16186f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f16173c;
        if (!iVar.f16187n && !iVar.f16189s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}

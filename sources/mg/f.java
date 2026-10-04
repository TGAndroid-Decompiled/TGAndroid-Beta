package mg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f16409a;
    public float f16410b;
    public final i f16411c;

    public f(i iVar) {
        this.f16411c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f16411c;
        if (iVar.f16424f && !iVar.f16425n) {
            l lVar = iVar.f16422c.f16984u;
            if ((f7 / 7.0f) + ((float) lVar.f16991i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f16991i = i.a(displayMetrics, f11);
            iVar.d.f16984u.f16991i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f16984u.f16991i));
            iVar.f16422c.f();
            iVar.d.f();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f16411c;
        int i10 = iVar.F;
        if (!iVar.f16425n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f16426r);
        }
        if (!iVar.f16424f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f16409a = (float) iVar.f16422c.f16984u.f16991i;
            this.f16410b = (float) iVar.d.f16984u.f16991i;
            iVar.f16424f = true;
        }
        if (iVar.f16424f && !iVar.f16425n) {
            iVar.f16422c.f16984u.f16991i = (motionEvent2.getRawX() + this.f16409a) - motionEvent.getRawX();
            iVar.d.f16984u.f16991i = (motionEvent2.getRawY() + this.f16410b) - motionEvent.getRawY();
            iVar.f16422c.f();
            iVar.d.f();
        }
        return iVar.f16424f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f16411c;
        if (!iVar.f16425n && !iVar.f16427s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}

package mg;

import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
public final class f extends GestureDetector.SimpleOnGestureListener {
    public float f16408a;
    public float f16409b;
    public final i f16410c;

    public f(i iVar) {
        this.f16410c = iVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        DisplayMetrics displayMetrics;
        float f11;
        i iVar = this.f16410c;
        if (iVar.f16423f && !iVar.f16424n) {
            l lVar = iVar.f16421c.f16983u;
            if ((f7 / 7.0f) + ((float) lVar.f16990i) >= iVar.getWidth() / 2.0f) {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = 2.1474836E9f;
            } else {
                displayMetrics = iVar.getResources().getDisplayMetrics();
                f11 = -2.1474836E9f;
            }
            lVar.f16990i = i.a(displayMetrics, f11);
            iVar.d.f16983u.f16990i = i.b(iVar.getResources().getDisplayMetrics(), (f10 / 10.0f) + ((float) iVar.d.f16983u.f16990i));
            iVar.f16421c.f();
            iVar.d.f();
            iVar.h = true;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        i iVar = this.f16410c;
        int i10 = iVar.F;
        if (!iVar.f16424n) {
            AndroidUtilities.cancelRunOnUIThread(iVar.f16425r);
        }
        if (!iVar.f16423f && (Math.abs(f7) >= i10 || Math.abs(f10) >= i10)) {
            this.f16408a = (float) iVar.f16421c.f16983u.f16990i;
            this.f16409b = (float) iVar.d.f16983u.f16990i;
            iVar.f16423f = true;
        }
        if (iVar.f16423f && !iVar.f16424n) {
            iVar.f16421c.f16983u.f16990i = (motionEvent2.getRawX() + this.f16408a) - motionEvent.getRawX();
            iVar.d.f16983u.f16990i = (motionEvent2.getRawY() + this.f16409b) - motionEvent.getRawY();
            iVar.f16421c.f();
            iVar.d.f();
        }
        return iVar.f16423f;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f16410c;
        if (!iVar.f16424n && !iVar.f16426s) {
            iVar.c(true);
            return true;
        }
        return false;
    }
}

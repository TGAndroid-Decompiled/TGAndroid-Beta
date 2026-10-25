package di;

import a8.ee;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pw0;
public final class k1 extends GestureDetector.SimpleOnGestureListener {
    public float f8707a;
    public float f8708b;
    public final int f8709c;

    public k1(int i10) {
        pw0 pw0Var = o1.X;
        this.f8709c = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        o1 o1Var = o1.Z;
        if (o1Var.H) {
            for (int i10 = 1; i10 < o1Var.e.getChildCount(); i10++) {
                View childAt = o1Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    o1Var.G = childAt;
                    return true;
                }
            }
        }
        this.f8707a = o1Var.N;
        this.f8708b = o1Var.O;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        o1 o1Var = o1.Z;
        if (o1Var.E && !o1Var.F) {
            o1.j jVar = o1Var.P;
            jVar.f18960a = f7;
            float f12 = o1Var.N;
            jVar.f18961b = f12;
            jVar.f18962c = true;
            o1.k kVar = jVar.f18969u;
            int i10 = o1Var.J;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            kVar.f18975i = dp;
            o1Var.P.h();
            o1.j jVar2 = o1Var.Q;
            jVar2.f18960a = f7;
            jVar2.f18961b = o1Var.O;
            jVar2.f18962c = true;
            jVar2.f18969u.f18975i = ee.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - o1Var.K) - AndroidUtilities.dp(16.0f));
            o1Var.Q.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        o1 o1Var = o1.Z;
        if (!o1Var.E && o1Var.I == null && !o1Var.F) {
            float abs = Math.abs(f7);
            float f11 = this.f8709c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                o1Var.E = true;
                o1Var.P.c();
                o1Var.Q.c();
            }
        }
        if (o1Var.E) {
            WindowManager.LayoutParams layoutParams = o1Var.f8859c;
            float rawX = (motionEvent2.getRawX() + this.f8707a) - motionEvent.getRawX();
            o1Var.N = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = o1Var.f8859c;
            float rawY = (motionEvent2.getRawY() + this.f8708b) - motionEvent.getRawY();
            o1Var.O = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(o1Var.f8858b, o1Var.d, o1Var.f8859c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        o1 o1Var = o1.Z;
        bi.u6 u6Var = o1Var.U;
        if (o1Var.I == null) {
            if (o1Var.T) {
                AndroidUtilities.cancelRunOnUIThread(u6Var);
                o1Var.T = false;
            }
            boolean z10 = !o1Var.H;
            o1Var.H = z10;
            o1Var.o(z10);
            if (o1Var.H && !o1Var.T) {
                AndroidUtilities.runOnUIThread(u6Var, 2500L);
                o1Var.T = true;
            }
        }
        return true;
    }
}

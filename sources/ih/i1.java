package ih;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pu0;
public final class i1 extends GestureDetector.SimpleOnGestureListener {
    public float f11524a;
    public float f11525b;
    public final int f11526c;

    public i1(int i9) {
        pu0 pu0Var = k1.T;
        this.f11526c = i9;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        k1 k1Var = k1.V;
        if (k1Var.D) {
            for (int i9 = 1; i9 < k1Var.f11659e.getChildCount(); i9++) {
                View childAt = k1Var.f11659e.getChildAt(i9);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    k1Var.C = childAt;
                    return true;
                }
            }
        }
        this.f11524a = k1Var.J;
        this.f11525b = k1Var.K;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float dp;
        float f12;
        k1 k1Var = k1.V;
        if (k1Var.A && !k1Var.B) {
            o1.j jVar = k1Var.L;
            jVar.f18790a = f10;
            float f13 = k1Var.J;
            jVar.f18791b = f13;
            jVar.f18792c = true;
            o1.k kVar = jVar.f18800u;
            int i9 = k1Var.F;
            float f14 = (f10 / 7.0f) + (i9 / 2.0f) + f13;
            int i10 = AndroidUtilities.displaySize.x;
            if (f14 >= i10 / 2.0f) {
                dp = (i10 - i9) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            kVar.f18807i = dp;
            k1Var.L.f();
            o1.j jVar2 = k1Var.M;
            jVar2.f18790a = f10;
            jVar2.f18791b = k1Var.K;
            jVar2.f18792c = true;
            jVar2.f18800u.f18807i = g7.n.a((f11 / 10.0f) + f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - k1Var.G) - AndroidUtilities.dp(16.0f));
            k1Var.M.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        k1 k1Var = k1.V;
        if (!k1Var.A && k1Var.E == null && !k1Var.B) {
            float abs = Math.abs(f10);
            float f12 = this.f11526c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                k1Var.A = true;
                k1Var.L.c();
                k1Var.M.c();
            }
        }
        if (k1Var.A) {
            WindowManager.LayoutParams layoutParams = k1Var.f11658c;
            float rawX = (motionEvent2.getRawX() + this.f11524a) - motionEvent.getRawX();
            k1Var.J = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = k1Var.f11658c;
            float rawY = (motionEvent2.getRawY() + this.f11525b) - motionEvent.getRawY();
            k1Var.K = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(k1Var.f11657b, k1Var.d, k1Var.f11658c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        k1 k1Var = k1.V;
        g gVar = k1Var.Q;
        if (k1Var.E == null) {
            if (k1Var.P) {
                AndroidUtilities.cancelRunOnUIThread(gVar);
                k1Var.P = false;
            }
            boolean z10 = !k1Var.D;
            k1Var.D = z10;
            k1Var.p(z10);
            if (k1Var.D && !k1Var.P) {
                AndroidUtilities.runOnUIThread(gVar, 2500L);
                k1Var.P = true;
            }
        }
        return true;
    }
}

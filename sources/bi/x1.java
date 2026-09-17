package bi;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hv0;
public final class x1 extends GestureDetector.SimpleOnGestureListener {
    public float f4000a;
    public float f4001b;
    public final int f4002c;

    public x1(int i10) {
        hv0 hv0Var = a2.X;
        this.f4002c = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        a2 a2Var = a2.Z;
        if (a2Var.H) {
            for (int i10 = 1; i10 < a2Var.f2767e.getChildCount(); i10++) {
                View childAt = a2Var.f2767e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    a2Var.G = childAt;
                    return true;
                }
            }
        }
        this.f4000a = a2Var.N;
        this.f4001b = a2Var.O;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        a2 a2Var = a2.Z;
        if (a2Var.E && !a2Var.F) {
            o1.k kVar = a2Var.P;
            kVar.f16841a = f7;
            float f12 = a2Var.N;
            kVar.f16842b = f12;
            kVar.f16843c = true;
            o1.l lVar = kVar.f16852u;
            int i10 = a2Var.J;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f16859i = dp;
            a2Var.P.f();
            o1.k kVar2 = a2Var.Q;
            kVar2.f16841a = f7;
            kVar2.f16842b = a2Var.O;
            kVar2.f16843c = true;
            kVar2.f16852u.f16859i = w7.p.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - a2Var.K) - AndroidUtilities.dp(16.0f));
            a2Var.Q.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        a2 a2Var = a2.Z;
        if (!a2Var.E && a2Var.I == null && !a2Var.F) {
            float abs = Math.abs(f7);
            float f11 = this.f4002c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                a2Var.E = true;
                a2Var.P.c();
                a2Var.Q.c();
            }
        }
        if (a2Var.E) {
            WindowManager.LayoutParams layoutParams = a2Var.f2766c;
            float rawX = (motionEvent2.getRawX() + this.f4000a) - motionEvent.getRawX();
            a2Var.N = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = a2Var.f2766c;
            float rawY = (motionEvent2.getRawY() + this.f4001b) - motionEvent.getRawY();
            a2Var.O = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(a2Var.f2765b, a2Var.d, a2Var.f2766c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        a2 a2Var = a2.Z;
        a3.d dVar = a2Var.U;
        if (a2Var.I == null) {
            if (a2Var.T) {
                AndroidUtilities.cancelRunOnUIThread(dVar);
                a2Var.T = false;
            }
            boolean z10 = !a2Var.H;
            a2Var.H = z10;
            a2Var.p(z10);
            if (a2Var.H && !a2Var.T) {
                AndroidUtilities.runOnUIThread(dVar, 2500L);
                a2Var.T = true;
            }
        }
        return true;
    }
}

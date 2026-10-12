package ai;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rw0;
public final class i2 extends GestureDetector.SimpleOnGestureListener {
    public float f1125a;
    public float f1126b;
    public final int f1127c;

    public i2(int i10) {
        rw0 rw0Var = n2.X;
        this.f1127c = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        n2 n2Var = n2.Z;
        if (n2Var.H) {
            for (int i10 = 1; i10 < n2Var.f1447e.getChildCount(); i10++) {
                View childAt = n2Var.f1447e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    n2Var.G = childAt;
                    return true;
                }
            }
        }
        this.f1125a = n2Var.N;
        this.f1126b = n2Var.O;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        n2 n2Var = n2.Z;
        if (n2Var.E && !n2Var.F) {
            o1.k kVar = n2Var.P;
            kVar.f16679a = f7;
            float f12 = n2Var.N;
            kVar.f16680b = f12;
            kVar.f16681c = true;
            o1.l lVar = kVar.f16690u;
            int i10 = n2Var.J;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f16697i = dp;
            n2Var.P.h();
            o1.k kVar2 = n2Var.Q;
            kVar2.f16679a = f7;
            kVar2.f16680b = n2Var.O;
            kVar2.f16681c = true;
            kVar2.f16690u.f16697i = w7.n.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - n2Var.K) - AndroidUtilities.dp(16.0f));
            n2Var.Q.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        n2 n2Var = n2.Z;
        if (!n2Var.E && n2Var.I == null && !n2Var.F) {
            float abs = Math.abs(f7);
            float f11 = this.f1127c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                n2Var.E = true;
                n2Var.P.c();
                n2Var.Q.c();
            }
        }
        if (n2Var.E) {
            WindowManager.LayoutParams layoutParams = n2Var.f1446c;
            float rawX = (motionEvent2.getRawX() + this.f1125a) - motionEvent.getRawX();
            n2Var.N = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = n2Var.f1446c;
            float rawY = (motionEvent2.getRawY() + this.f1126b) - motionEvent.getRawY();
            n2Var.O = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(n2Var.f1445b, n2Var.d, n2Var.f1446c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        n2 n2Var = n2.Z;
        a3.d dVar = n2Var.U;
        if (n2Var.I == null) {
            if (n2Var.T) {
                AndroidUtilities.cancelRunOnUIThread(dVar);
                n2Var.T = false;
            }
            boolean z10 = !n2Var.H;
            n2Var.H = z10;
            n2Var.o(z10);
            if (n2Var.H && !n2Var.T) {
                AndroidUtilities.runOnUIThread(dVar, 2500L);
                n2Var.T = true;
            }
        }
        return true;
    }
}

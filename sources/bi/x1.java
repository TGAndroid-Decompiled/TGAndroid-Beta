package bi;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hw0;
public final class x1 extends GestureDetector.SimpleOnGestureListener {
    public float f3947a;
    public float f3948b;
    public final int f3949c;

    public x1(int i10) {
        hw0 hw0Var = b2.X;
        this.f3949c = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        b2 b2Var = b2.Z;
        if (b2Var.H) {
            for (int i10 = 1; i10 < b2Var.e.getChildCount(); i10++) {
                View childAt = b2Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    b2Var.G = childAt;
                    return true;
                }
            }
        }
        this.f3947a = b2Var.N;
        this.f3948b = b2Var.O;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        b2 b2Var = b2.Z;
        if (b2Var.E && !b2Var.F) {
            o1.k kVar = b2Var.P;
            kVar.f16151a = f7;
            float f12 = b2Var.N;
            kVar.f16152b = f12;
            kVar.f16153c = true;
            o1.l lVar = kVar.f16161u;
            int i10 = b2Var.J;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f16167i = dp;
            b2Var.P.h();
            o1.k kVar2 = b2Var.Q;
            kVar2.f16151a = f7;
            kVar2.f16152b = b2Var.O;
            kVar2.f16153c = true;
            kVar2.f16161u.f16167i = w7.r.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - b2Var.K) - AndroidUtilities.dp(16.0f));
            b2Var.Q.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        b2 b2Var = b2.Z;
        if (!b2Var.E && b2Var.I == null && !b2Var.F) {
            float abs = Math.abs(f7);
            float f11 = this.f3949c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                b2Var.E = true;
                b2Var.P.c();
                b2Var.Q.c();
            }
        }
        if (b2Var.E) {
            WindowManager.LayoutParams layoutParams = b2Var.f2859c;
            float rawX = (motionEvent2.getRawX() + this.f3947a) - motionEvent.getRawX();
            b2Var.N = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = b2Var.f2859c;
            float rawY = (motionEvent2.getRawY() + this.f3948b) - motionEvent.getRawY();
            b2Var.O = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(b2Var.f2858b, b2Var.d, b2Var.f2859c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        b2 b2Var = b2.Z;
        a3.d dVar = b2Var.U;
        if (b2Var.I == null) {
            if (b2Var.T) {
                AndroidUtilities.cancelRunOnUIThread(dVar);
                b2Var.T = false;
            }
            boolean z10 = !b2Var.H;
            b2Var.H = z10;
            b2Var.o(z10);
            if (b2Var.H && !b2Var.T) {
                AndroidUtilities.runOnUIThread(dVar, 2500L);
                b2Var.T = true;
            }
        }
        return true;
    }
}

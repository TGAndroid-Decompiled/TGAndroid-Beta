package ci;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dw0;
public final class l1 extends GestureDetector.SimpleOnGestureListener {
    public float f5577a;
    public float f5578b;
    public final int f5579c;

    public l1(int i10) {
        dw0 dw0Var = p1.X;
        this.f5579c = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        p1 p1Var = p1.Z;
        if (p1Var.H) {
            for (int i10 = 1; i10 < p1Var.e.getChildCount(); i10++) {
                View childAt = p1Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    p1Var.G = childAt;
                    return true;
                }
            }
        }
        this.f5577a = p1Var.N;
        this.f5578b = p1Var.O;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        p1 p1Var = p1.Z;
        if (p1Var.E && !p1Var.F) {
            o1.k kVar = p1Var.P;
            kVar.f17551a = f7;
            float f12 = p1Var.N;
            kVar.f17552b = f12;
            kVar.f17553c = true;
            o1.l lVar = kVar.f17561u;
            int i10 = p1Var.J;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f17567i = dp;
            p1Var.P.h();
            o1.k kVar2 = p1Var.Q;
            kVar2.f17551a = f7;
            kVar2.f17552b = p1Var.O;
            kVar2.f17553c = true;
            kVar2.f17561u.f17567i = w7.r.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - p1Var.K) - AndroidUtilities.dp(16.0f));
            p1Var.Q.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        p1 p1Var = p1.Z;
        if (!p1Var.E && p1Var.I == null && !p1Var.F) {
            float abs = Math.abs(f7);
            float f11 = this.f5579c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                p1Var.E = true;
                p1Var.P.c();
                p1Var.Q.c();
            }
        }
        if (p1Var.E) {
            WindowManager.LayoutParams layoutParams = p1Var.f5715c;
            float rawX = (motionEvent2.getRawX() + this.f5577a) - motionEvent.getRawX();
            p1Var.N = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = p1Var.f5715c;
            float rawY = (motionEvent2.getRawY() + this.f5578b) - motionEvent.getRawY();
            p1Var.O = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(p1Var.f5714b, p1Var.d, p1Var.f5715c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        p1 p1Var = p1.Z;
        androidx.fragment.app.d dVar = p1Var.U;
        if (p1Var.I == null) {
            if (p1Var.T) {
                AndroidUtilities.cancelRunOnUIThread(dVar);
                p1Var.T = false;
            }
            boolean z10 = !p1Var.H;
            p1Var.H = z10;
            p1Var.o(z10);
            if (p1Var.H && !p1Var.T) {
                AndroidUtilities.runOnUIThread(dVar, 2500L);
                p1Var.T = true;
            }
        }
        return true;
    }
}

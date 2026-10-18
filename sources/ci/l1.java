package ci;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cw0;
public final class l1 extends GestureDetector.SimpleOnGestureListener {
    public float f5578a;
    public float f5579b;
    public final int f5580c;

    public l1(int i10) {
        cw0 cw0Var = p1.X;
        this.f5580c = i10;
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
        this.f5578a = p1Var.N;
        this.f5579b = p1Var.O;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        p1 p1Var = p1.Z;
        if (p1Var.E && !p1Var.F) {
            o1.k kVar = p1Var.P;
            kVar.f17552a = f7;
            float f12 = p1Var.N;
            kVar.f17553b = f12;
            kVar.f17554c = true;
            o1.l lVar = kVar.f17562u;
            int i10 = p1Var.J;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f17568i = dp;
            p1Var.P.h();
            o1.k kVar2 = p1Var.Q;
            kVar2.f17552a = f7;
            kVar2.f17553b = p1Var.O;
            kVar2.f17554c = true;
            kVar2.f17562u.f17568i = w7.r.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - p1Var.K) - AndroidUtilities.dp(16.0f));
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
            float f11 = this.f5580c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                p1Var.E = true;
                p1Var.P.c();
                p1Var.Q.c();
            }
        }
        if (p1Var.E) {
            WindowManager.LayoutParams layoutParams = p1Var.f5716c;
            float rawX = (motionEvent2.getRawX() + this.f5578a) - motionEvent.getRawX();
            p1Var.N = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = p1Var.f5716c;
            float rawY = (motionEvent2.getRawY() + this.f5579b) - motionEvent.getRawY();
            p1Var.O = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(p1Var.f5715b, p1Var.d, p1Var.f5716c);
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

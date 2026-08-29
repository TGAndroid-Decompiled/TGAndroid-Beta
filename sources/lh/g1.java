package lh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.av0;
public final class g1 extends GestureDetector.SimpleOnGestureListener {
    public float f15614a;
    public float f15615b;
    public final int f15616c;

    public g1(int i10) {
        av0 av0Var = i1.T;
        this.f15616c = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        i1 i1Var = i1.V;
        if (i1Var.D) {
            for (int i10 = 1; i10 < i1Var.f15701e.getChildCount(); i10++) {
                View childAt = i1Var.f15701e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    i1Var.C = childAt;
                    return true;
                }
            }
        }
        this.f15614a = i1Var.J;
        this.f15615b = i1Var.K;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        float dp;
        float f11;
        i1 i1Var = i1.V;
        if (i1Var.A && !i1Var.B) {
            o1.k kVar = i1Var.L;
            kVar.f19035a = f9;
            float f12 = i1Var.J;
            kVar.f19036b = f12;
            kVar.f19037c = true;
            o1.l lVar = kVar.f19045u;
            int i10 = i1Var.F;
            float f13 = (f9 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f19052i = dp;
            i1Var.L.f();
            o1.k kVar2 = i1Var.M;
            kVar2.f19035a = f9;
            kVar2.f19036b = i1Var.K;
            kVar2.f19037c = true;
            kVar2.f19045u.f19052i = i7.w.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - i1Var.G) - AndroidUtilities.dp(16.0f));
            i1Var.M.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        i1 i1Var = i1.V;
        if (!i1Var.A && i1Var.E == null && !i1Var.B) {
            float abs = Math.abs(f9);
            float f11 = this.f15616c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                i1Var.A = true;
                i1Var.L.c();
                i1Var.M.c();
            }
        }
        if (i1Var.A) {
            WindowManager.LayoutParams layoutParams = i1Var.f15700c;
            float rawX = (motionEvent2.getRawX() + this.f15614a) - motionEvent.getRawX();
            i1Var.J = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = i1Var.f15700c;
            float rawY = (motionEvent2.getRawY() + this.f15615b) - motionEvent.getRawY();
            i1Var.K = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(i1Var.f15699b, i1Var.d, i1Var.f15700c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i1 i1Var = i1.V;
        jh.o oVar = i1Var.Q;
        if (i1Var.E == null) {
            if (i1Var.P) {
                AndroidUtilities.cancelRunOnUIThread(oVar);
                i1Var.P = false;
            }
            boolean z10 = !i1Var.D;
            i1Var.D = z10;
            i1Var.p(z10);
            if (i1Var.D && !i1Var.P) {
                AndroidUtilities.runOnUIThread(oVar, 2500L);
                i1Var.P = true;
            }
        }
        return true;
    }
}

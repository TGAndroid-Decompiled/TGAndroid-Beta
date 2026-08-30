package nh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.iv0;
public final class h1 extends GestureDetector.SimpleOnGestureListener {
    public float f15372a;
    public float f15373b;
    public final int f15374c;

    public h1(int i10) {
        iv0 iv0Var = j1.U;
        this.f15374c = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        j1 j1Var = j1.W;
        if (j1Var.E) {
            for (int i10 = 1; i10 < j1Var.e.getChildCount(); i10++) {
                View childAt = j1Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    j1Var.D = childAt;
                    return true;
                }
            }
        }
        this.f15372a = j1Var.K;
        this.f15373b = j1Var.L;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float dp;
        float f12;
        j1 j1Var = j1.W;
        if (j1Var.B && !j1Var.C) {
            o1.j jVar = j1Var.M;
            jVar.f16189a = f10;
            float f13 = j1Var.K;
            jVar.f16190b = f13;
            jVar.f16191c = true;
            o1.k kVar = jVar.f16198u;
            int i10 = j1Var.G;
            float f14 = (f10 / 7.0f) + (i10 / 2.0f) + f13;
            int i11 = AndroidUtilities.displaySize.x;
            if (f14 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            kVar.f16204i = dp;
            j1Var.M.f();
            o1.j jVar2 = j1Var.N;
            jVar2.f16189a = f10;
            jVar2.f16190b = j1Var.L;
            jVar2.f16191c = true;
            jVar2.f16198u.f16204i = k7.n.a((f11 / 10.0f) + f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - j1Var.H) - AndroidUtilities.dp(16.0f));
            j1Var.N.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        j1 j1Var = j1.W;
        if (!j1Var.B && j1Var.F == null && !j1Var.C) {
            float abs = Math.abs(f10);
            float f12 = this.f15374c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                j1Var.B = true;
                j1Var.M.c();
                j1Var.N.c();
            }
        }
        if (j1Var.B) {
            WindowManager.LayoutParams layoutParams = j1Var.f15504c;
            float rawX = (motionEvent2.getRawX() + this.f15372a) - motionEvent.getRawX();
            j1Var.K = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = j1Var.f15504c;
            float rawY = (motionEvent2.getRawY() + this.f15373b) - motionEvent.getRawY();
            j1Var.L = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(j1Var.f15503b, j1Var.d, j1Var.f15504c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        j1 j1Var = j1.W;
        lh.b bVar = j1Var.R;
        if (j1Var.F == null) {
            if (j1Var.Q) {
                AndroidUtilities.cancelRunOnUIThread(bVar);
                j1Var.Q = false;
            }
            boolean z4 = !j1Var.E;
            j1Var.E = z4;
            j1Var.p(z4);
            if (j1Var.E && !j1Var.Q) {
                AndroidUtilities.runOnUIThread(bVar, 2500L);
                j1Var.Q = true;
            }
        }
        return true;
    }
}

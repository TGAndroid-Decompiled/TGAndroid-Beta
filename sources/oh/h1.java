package oh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jv0;
public final class h1 extends GestureDetector.SimpleOnGestureListener {
    public float f17171a;
    public float f17172b;
    public final int f17173c;

    public h1(int i10) {
        jv0 jv0Var = j1.U;
        this.f17173c = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        j1 j1Var = j1.W;
        if (j1Var.E) {
            for (int i10 = 1; i10 < j1Var.f17314e.getChildCount(); i10++) {
                View childAt = j1Var.f17314e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    j1Var.D = childAt;
                    return true;
                }
            }
        }
        this.f17171a = j1Var.K;
        this.f17172b = j1Var.L;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float dp;
        float f12;
        j1 j1Var = j1.W;
        if (j1Var.B && !j1Var.C) {
            o1.j jVar = j1Var.M;
            jVar.f16326a = f10;
            float f13 = j1Var.K;
            jVar.f16327b = f13;
            jVar.f16328c = true;
            o1.k kVar = jVar.f16336u;
            int i10 = j1Var.G;
            float f14 = (f10 / 7.0f) + (i10 / 2.0f) + f13;
            int i11 = AndroidUtilities.displaySize.x;
            if (f14 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            kVar.f16343i = dp;
            j1Var.M.f();
            o1.j jVar2 = j1Var.N;
            jVar2.f16326a = f10;
            jVar2.f16327b = j1Var.L;
            jVar2.f16328c = true;
            jVar2.f16336u.f16343i = k7.o.a((f11 / 10.0f) + f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - j1Var.H) - AndroidUtilities.dp(16.0f));
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
            float f12 = this.f17173c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                j1Var.B = true;
                j1Var.M.c();
                j1Var.N.c();
            }
        }
        if (j1Var.B) {
            WindowManager.LayoutParams layoutParams = j1Var.f17313c;
            float rawX = (motionEvent2.getRawX() + this.f17171a) - motionEvent.getRawX();
            j1Var.K = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = j1Var.f17313c;
            float rawY = (motionEvent2.getRawY() + this.f17172b) - motionEvent.getRawY();
            j1Var.L = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(j1Var.f17312b, j1Var.d, j1Var.f17313c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        j1 j1Var = j1.W;
        lh.c3 c3Var = j1Var.R;
        if (j1Var.F == null) {
            if (j1Var.Q) {
                AndroidUtilities.cancelRunOnUIThread(c3Var);
                j1Var.Q = false;
            }
            boolean z4 = !j1Var.E;
            j1Var.E = z4;
            j1Var.p(z4);
            if (j1Var.E && !j1Var.Q) {
                AndroidUtilities.runOnUIThread(c3Var, 2500L);
                j1Var.Q = true;
            }
        }
        return true;
    }
}

package ai;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tv0;
public final class i2 extends GestureDetector.SimpleOnGestureListener {
    public float f981a;
    public float f982b;
    public final int f983c;

    public i2(int i10) {
        tv0 tv0Var = m2.X;
        this.f983c = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        m2 m2Var = m2.Z;
        if (m2Var.H) {
            for (int i10 = 1; i10 < m2Var.e.getChildCount(); i10++) {
                View childAt = m2Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    m2Var.G = childAt;
                    return true;
                }
            }
        }
        this.f981a = m2Var.N;
        this.f982b = m2Var.O;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        m2 m2Var = m2.Z;
        if (m2Var.E && !m2Var.F) {
            o1.k kVar = m2Var.P;
            kVar.f15523a = f7;
            float f12 = m2Var.N;
            kVar.f15524b = f12;
            kVar.f15525c = true;
            o1.l lVar = kVar.f15533u;
            int i10 = m2Var.J;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f15539i = dp;
            m2Var.P.f();
            o1.k kVar2 = m2Var.Q;
            kVar2.f15523a = f7;
            kVar2.f15524b = m2Var.O;
            kVar2.f15525c = true;
            kVar2.f15533u.f15539i = w7.q.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - m2Var.K) - AndroidUtilities.dp(16.0f));
            m2Var.Q.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        m2 m2Var = m2.Z;
        if (!m2Var.E && m2Var.I == null && !m2Var.F) {
            float abs = Math.abs(f7);
            float f11 = this.f983c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                m2Var.E = true;
                m2Var.P.c();
                m2Var.Q.c();
            }
        }
        if (m2Var.E) {
            WindowManager.LayoutParams layoutParams = m2Var.f1233c;
            float rawX = (motionEvent2.getRawX() + this.f981a) - motionEvent.getRawX();
            m2Var.N = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = m2Var.f1233c;
            float rawY = (motionEvent2.getRawY() + this.f982b) - motionEvent.getRawY();
            m2Var.O = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(m2Var.f1232b, m2Var.d, m2Var.f1233c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        m2 m2Var = m2.Z;
        a3.d dVar = m2Var.U;
        if (m2Var.I == null) {
            if (m2Var.T) {
                AndroidUtilities.cancelRunOnUIThread(dVar);
                m2Var.T = false;
            }
            boolean z10 = !m2Var.H;
            m2Var.H = z10;
            m2Var.p(z10);
            if (m2Var.H && !m2Var.T) {
                AndroidUtilities.runOnUIThread(dVar, 2500L);
                m2Var.T = true;
            }
        }
        return true;
    }
}

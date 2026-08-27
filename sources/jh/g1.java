package jh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import hh.y9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.su0;

public final class g1 extends GestureDetector.SimpleOnGestureListener {

    public float f13346a;

    public float f13347b;

    public final int f13348c;

    public g1(int i10) {
        su0 su0Var = i1.T;
        this.f13348c = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        i1 i1Var = i1.V;
        if (i1Var.D) {
            for (int i10 = 1; i10 < i1Var.f13427e.getChildCount(); i10++) {
                View childAt = i1Var.f13427e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    i1Var.C = childAt;
                    return true;
                }
            }
        }
        this.f13346a = i1Var.J;
        this.f13347b = i1Var.K;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i1 i1Var = i1.V;
        if (!i1Var.A || i1Var.B) {
            return false;
        }
        o1.j jVar = i1Var.L;
        jVar.f19137a = f10;
        float f12 = i1Var.J;
        jVar.f19138b = f12;
        jVar.f19139c = true;
        o1.k kVar = jVar.f19147u;
        int i10 = i1Var.F;
        float f13 = (f10 / 7.0f) + (i10 / 2.0f) + f12;
        int i11 = AndroidUtilities.displaySize.x;
        kVar.f19154i = f13 >= ((float) i11) / 2.0f ? (i11 - i10) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        i1Var.L.f();
        o1.j jVar2 = i1Var.M;
        jVar2.f19137a = f10;
        float f14 = i1Var.K;
        jVar2.f19138b = f14;
        jVar2.f19139c = true;
        jVar2.f19147u.f19154i = h7.n.a((f11 / 10.0f) + f14, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - i1Var.G) - AndroidUtilities.dp(16.0f));
        i1Var.M.f();
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i1 i1Var = i1.V;
        if (!i1Var.A && i1Var.E == null && !i1Var.B) {
            float fAbs = Math.abs(f10);
            float f12 = this.f13348c;
            if (fAbs >= f12 || Math.abs(f11) >= f12) {
                i1Var.A = true;
                i1Var.L.c();
                i1Var.M.c();
            }
        }
        if (i1Var.A) {
            WindowManager.LayoutParams layoutParams = i1Var.f13426c;
            float rawX = (motionEvent2.getRawX() + this.f13346a) - motionEvent.getRawX();
            i1Var.J = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = i1Var.f13426c;
            float rawY = (motionEvent2.getRawY() + this.f13347b) - motionEvent.getRawY();
            i1Var.K = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(i1Var.f13425b, i1Var.d, i1Var.f13426c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i1 i1Var = i1.V;
        y9 y9Var = i1Var.Q;
        if (i1Var.E == null) {
            if (i1Var.P) {
                AndroidUtilities.cancelRunOnUIThread(y9Var);
                i1Var.P = false;
            }
            boolean z10 = !i1Var.D;
            i1Var.D = z10;
            i1Var.p(z10);
            if (i1Var.D && !i1Var.P) {
                AndroidUtilities.runOnUIThread(y9Var, 2500L);
                i1Var.P = true;
            }
        }
        return true;
    }
}

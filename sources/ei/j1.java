package ei;

import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import b8.be;
import org.telegram.ui.Components.kt0;
public final class j1 extends GestureDetector.SimpleOnGestureListener {
    public float f10432a;
    public float f10433b;
    public final int f10434c;

    public j1(int i3) {
        kt0 kt0Var = n1.Y;
        this.f10434c = i3;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        n1 n1Var = n1.f10647a0;
        if (n1Var.I) {
            for (int i3 = 1; i3 < n1Var.f10651e.getChildCount(); i3++) {
                View childAt = n1Var.f10651e.getChildAt(i3);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    n1Var.H = childAt;
                    return true;
                }
            }
        }
        this.f10432a = n1Var.O;
        this.f10433b = n1Var.P;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        Point point;
        float L;
        float f12;
        n1 n1Var = n1.f10647a0;
        if (n1Var.F && !n1Var.G) {
            q1.g gVar = n1Var.Q;
            gVar.f53643a = f10;
            float f13 = n1Var.O;
            gVar.f53644b = f13;
            gVar.f53645c = true;
            q1.h hVar = gVar.f53653m;
            int i3 = n1Var.K;
            float f14 = (f10 / 7.0f) + (i3 / 2.0f) + f13;
            int i10 = org.telegram.messenger.g0.f22608q.x;
            if (f14 >= i10 / 2.0f) {
                L = (i10 - i3) - org.telegram.messenger.g0.L(16.0f);
            } else {
                L = org.telegram.messenger.g0.L(16.0f);
            }
            hVar.f53661i = L;
            n1Var.Q.h();
            q1.g gVar2 = n1Var.R;
            gVar2.f53643a = f10;
            gVar2.f53644b = n1Var.P;
            gVar2.f53645c = true;
            gVar2.f53653m.f53661i = be.a((f11 / 10.0f) + f12, org.telegram.messenger.g0.L(16.0f), (point.y - n1Var.L) - org.telegram.messenger.g0.L(16.0f));
            n1Var.R.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        n1 n1Var = n1.f10647a0;
        if (!n1Var.F && n1Var.J == null && !n1Var.G) {
            float abs = Math.abs(f10);
            float f12 = this.f10434c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                n1Var.F = true;
                n1Var.Q.d();
                n1Var.R.d();
            }
        }
        if (n1Var.F) {
            WindowManager.LayoutParams layoutParams = n1Var.f10650c;
            float rawX = (motionEvent2.getRawX() + this.f10432a) - motionEvent.getRawX();
            n1Var.O = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = n1Var.f10650c;
            float rawY = (motionEvent2.getRawY() + this.f10433b) - motionEvent.getRawY();
            n1Var.P = rawY;
            layoutParams2.y = (int) rawY;
            org.telegram.messenger.g0.T3(n1Var.f10649b, n1Var.d, n1Var.f10650c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        n1 n1Var = n1.f10647a0;
        ci.d1 d1Var = n1Var.V;
        if (n1Var.J == null) {
            if (n1Var.U) {
                org.telegram.messenger.g0.r(d1Var);
                n1Var.U = false;
            }
            boolean z10 = !n1Var.I;
            n1Var.I = z10;
            n1Var.j(z10);
            if (n1Var.I && !n1Var.U) {
                org.telegram.messenger.g0.i3(d1Var, 2500L);
                n1Var.U = true;
            }
        }
        return true;
    }
}

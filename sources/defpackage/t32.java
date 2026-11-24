package defpackage;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.a;
public final class t32 implements m7, xh5, zh5, ed, mg0 {
    public final c42 a;

    public t32(c42 c42Var) {
        this.a = c42Var;
    }

    @Override
    public final boolean a(MotionEvent motionEvent, wy4 wy4Var) {
        MotionEvent motionEvent2;
        c42 c42Var = this.a;
        if (c42Var.H != 0.0f) {
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.offsetLocation(0.0f, (-c42Var.H) / 2.0f);
            motionEvent2 = motionEvent;
        } else {
            motionEvent2 = null;
        }
        boolean booleanValue = wy4Var.a(motionEvent).booleanValue();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return booleanValue;
    }

    @Override
    public final void b() {
        c42 c42Var = this.a;
        c42Var.f0 = false;
        c42Var.i0();
    }

    @Override
    public final void c(int i) {
        View childAt;
        s49 T;
        int L;
        c42 c42Var = this.a;
        fu fuVar = c42Var.M;
        if (i == 1 && !c42Var.I && fuVar.getChildCount() > 0 && (childAt = fuVar.getChildAt(0)) != null) {
            View F = fuVar.F(childAt);
            if (F == null) {
                T = null;
            } else {
                T = fuVar.T(F);
            }
            if (T != null && T.b() == 0) {
                if (c42Var.p0 == 0) {
                    L = 0;
                } else {
                    L = gl.L(66.0f);
                }
                int top = childAt.getTop();
                if (top < (-L)) {
                    fw5 d = c42Var.E.d();
                    c42Var.G = ((ize) a.j()).newCameraUpdateLatLngZoom((yh5) d.b, d.c);
                    fuVar.x0(0, top + L, null);
                }
            }
        }
    }

    @Override
    public final void h(int i) {
        ty4 ty4Var = this.a.E;
        if (ty4Var != null) {
            if (i == 2) {
                ty4Var.j(0);
            } else if (i == 3) {
                ty4Var.j(1);
            } else if (i == 4) {
                ty4Var.j(2);
            }
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        this.a.b0();
    }
}

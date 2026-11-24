package defpackage;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.a;
public final class e52 implements m7, wj5, yj5, ee, nh0 {
    public final n52 a;

    public e52(n52 n52Var) {
        this.a = n52Var;
    }

    @Override
    public final boolean a(MotionEvent motionEvent, v05 v05Var) {
        MotionEvent motionEvent2;
        n52 n52Var = this.a;
        if (n52Var.H != 0.0f) {
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.offsetLocation(0.0f, (-n52Var.H) / 2.0f);
            motionEvent2 = motionEvent;
        } else {
            motionEvent2 = null;
        }
        boolean booleanValue = v05Var.a(motionEvent).booleanValue();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return booleanValue;
    }

    @Override
    public final void b() {
        n52 n52Var = this.a;
        n52Var.f0 = false;
        n52Var.i0();
    }

    @Override
    public final void c(int i) {
        View childAt;
        u69 T;
        int L;
        n52 n52Var = this.a;
        fv fvVar = n52Var.M;
        if (i == 1 && !n52Var.I && fvVar.getChildCount() > 0 && (childAt = fvVar.getChildAt(0)) != null) {
            View F = fvVar.F(childAt);
            if (F == null) {
                T = null;
            } else {
                T = fvVar.T(F);
            }
            if (T != null && T.b() == 0) {
                if (n52Var.p0 == 0) {
                    L = 0;
                } else {
                    L = gm.L(66.0f);
                }
                int top = childAt.getTop();
                if (top < (-L)) {
                    fy5 d = n52Var.E.d();
                    n52Var.G = ((k1f) a.j()).newCameraUpdateLatLngZoom((xj5) d.b, d.c);
                    fvVar.x0(0, top + L, null);
                }
            }
        }
    }

    @Override
    public final void h(int i) {
        s05 s05Var = this.a.E;
        if (s05Var != null) {
            if (i == 2) {
                s05Var.j(0);
            } else if (i == 3) {
                s05Var.j(1);
            } else if (i == 4) {
                s05Var.j(2);
            }
        }
    }

    @Override
    public final void r(he heVar, int i) {
        this.a.b0();
    }
}

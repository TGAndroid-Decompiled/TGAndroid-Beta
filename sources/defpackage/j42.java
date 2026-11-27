package defpackage;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.a;
public final class j42 implements n7, zj5, bk5, fd, ng0 {
    public final s42 a;

    public j42(s42 s42Var) {
        this.a = s42Var;
    }

    @Override
    public final boolean a(MotionEvent motionEvent, a15 a15Var) {
        MotionEvent motionEvent2;
        s42 s42Var = this.a;
        if (s42Var.H != 0.0f) {
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.offsetLocation(0.0f, (-s42Var.H) / 2.0f);
            motionEvent2 = motionEvent;
        } else {
            motionEvent2 = null;
        }
        boolean booleanValue = a15Var.a(motionEvent).booleanValue();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return booleanValue;
    }

    @Override
    public final void b() {
        s42 s42Var = this.a;
        s42Var.f0 = false;
        s42Var.h0();
    }

    @Override
    public final void c(int i) {
        View childAt;
        f89 U;
        int L;
        s42 s42Var = this.a;
        gu guVar = s42Var.M;
        if (i == 1 && !s42Var.I && guVar.getChildCount() > 0 && (childAt = guVar.getChildAt(0)) != null) {
            View G = guVar.G(childAt);
            if (G == null) {
                U = null;
            } else {
                U = guVar.U(G);
            }
            if (U != null && U.b() == 0) {
                if (s42Var.p0 == 0) {
                    L = 0;
                } else {
                    L = hl.L(66.0f);
                }
                int top = childAt.getTop();
                if (top < (-L)) {
                    ky5 d = s42Var.E.d();
                    s42Var.G = ((z3f) a.j()).newCameraUpdateLatLngZoom((ak5) d.b, d.c);
                    guVar.y0(0, top + L, null);
                }
            }
        }
    }

    @Override
    public final void g(int i) {
        x05 x05Var = this.a.E;
        if (x05Var != null) {
            if (i == 2) {
                x05Var.j(0);
            } else if (i == 3) {
                x05Var.j(1);
            } else if (i == 4) {
                x05Var.j(2);
            }
        }
    }

    @Override
    public final void w(id idVar, int i) {
        this.a.a0();
    }
}

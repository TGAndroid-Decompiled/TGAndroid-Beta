package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
public final class w69 extends tu4 {
    public View a;
    public final gu5 b;

    public w69(gu5 gu5Var) {
        this.b = gu5Var;
    }

    @Override
    public final boolean a() {
        if (((d79) this.b.b).X0 != null) {
            return true;
        }
        return false;
    }

    public final void b(View view, MotionEvent motionEvent) {
        d79 d79Var = (d79) this.b.b;
        if (view != null) {
            if (d79Var.U0 != null || d79Var.V0 != null) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                d79Var.l1(view, x, y, true);
                int i = d79Var.N1;
                if (d79Var.Q1 && i != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    r69 r69Var = d79Var.U0;
                    if (r69Var != null) {
                        r69Var.e(i, view);
                    } else {
                        s69 s69Var = d79Var.V0;
                        if (s69Var != null) {
                            s69Var.d(x - view.getX(), y - view.getY(), i, view);
                        }
                    }
                }
                v69 v69Var = new v69(this, view, i, x, y);
                d79Var.R1 = v69Var;
                hl.d3(v69Var, ViewConfiguration.getPressedStateDuration());
                ct4 ct4Var = d79Var.d1;
                if (ct4Var != null) {
                    hl.r(ct4Var);
                    d79Var.d1 = null;
                    d79Var.M1 = null;
                    d79Var.O1 = false;
                    d79Var.o1(view, motionEvent);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        s69 s69Var;
        d79 d79Var = (d79) this.b.b;
        View view = this.a;
        if (view != null && (s69Var = d79Var.V0) != null && s69Var.C(view)) {
            d79Var.V0.u(this.a, motionEvent.getX(), motionEvent.getY());
            this.a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        int i;
        d79 d79Var = (d79) this.b.b;
        View view = d79Var.M1;
        if (view != null && (i = d79Var.N1) != -1) {
            t69 t69Var = d79Var.W0;
            if (t69Var == null) {
                u69 u69Var = d79Var.X0;
                if (u69Var != null && u69Var.mo8d(motionEvent.getX() - d79Var.M1.getX(), motionEvent.getY() - d79Var.M1.getY(), i, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(2);
                    d79Var.Y0 = true;
                }
            } else if (t69Var.e(i, view)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused2) {
                }
                view.sendAccessibilityEvent(2);
            }
        }
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        s69 s69Var;
        View view = this.a;
        if (view != null && (s69Var = ((d79) this.b.b).V0) != null && s69Var.C(view)) {
            b(this.a, motionEvent);
            this.a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        d79 d79Var = (d79) this.b.b;
        View view = d79Var.M1;
        if (view != null) {
            s69 s69Var = d79Var.V0;
            if (s69Var != null && s69Var.C(view)) {
                this.a = d79Var.M1;
                return false;
            }
            b(d79Var.M1, motionEvent);
        }
        return false;
    }
}

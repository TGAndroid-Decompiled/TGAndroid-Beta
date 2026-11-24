package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
public final class k59 extends qu4 {
    public View a;
    public final cu5 b;

    public k59(cu5 cu5Var) {
        this.b = cu5Var;
    }

    @Override
    public final boolean a() {
        if (((r59) this.b.b).X0 != null) {
            return true;
        }
        return false;
    }

    public final void b(View view, MotionEvent motionEvent) {
        r59 r59Var = (r59) this.b.b;
        if (view != null) {
            if (r59Var.U0 != null || r59Var.V0 != null) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                r59Var.k1(view, x, y, true);
                int i = r59Var.N1;
                if (r59Var.Q1 && i != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    f59 f59Var = r59Var.U0;
                    if (f59Var != null) {
                        f59Var.g(i, view);
                    } else {
                        g59 g59Var = r59Var.V0;
                        if (g59Var != null) {
                            g59Var.d(x - view.getX(), y - view.getY(), i, view);
                        }
                    }
                }
                j59 j59Var = new j59(this, view, i, x, y);
                r59Var.R1 = j59Var;
                gm.d3(j59Var, ViewConfiguration.getPressedStateDuration());
                zs4 zs4Var = r59Var.d1;
                if (zs4Var != null) {
                    gm.r(zs4Var);
                    r59Var.d1 = null;
                    r59Var.M1 = null;
                    r59Var.O1 = false;
                    r59Var.n1(view, motionEvent);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        g59 g59Var;
        r59 r59Var = (r59) this.b.b;
        View view = this.a;
        if (view != null && (g59Var = r59Var.V0) != null && g59Var.u(view)) {
            r59Var.V0.p(this.a, motionEvent.getX(), motionEvent.getY());
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
        r59 r59Var = (r59) this.b.b;
        View view = r59Var.M1;
        if (view != null && (i = r59Var.N1) != -1) {
            h59 h59Var = r59Var.W0;
            if (h59Var == null) {
                i59 i59Var = r59Var.X0;
                if (i59Var != null && i59Var.mo14d(motionEvent.getX() - r59Var.M1.getX(), motionEvent.getY() - r59Var.M1.getY(), i, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(2);
                    r59Var.Y0 = true;
                }
            } else if (h59Var.g(i, view)) {
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
        g59 g59Var;
        View view = this.a;
        if (view != null && (g59Var = ((r59) this.b.b).V0) != null && g59Var.u(view)) {
            b(this.a, motionEvent);
            this.a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        r59 r59Var = (r59) this.b.b;
        View view = r59Var.M1;
        if (view != null) {
            g59 g59Var = r59Var.V0;
            if (g59Var != null && g59Var.u(view)) {
                this.a = r59Var.M1;
                return false;
            }
            b(r59Var.M1, motionEvent);
        }
        return false;
    }
}

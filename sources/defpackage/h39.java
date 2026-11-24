package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
public final class h39 extends ps4 {
    public View a;
    public final ds5 b;

    public h39(ds5 ds5Var) {
        this.b = ds5Var;
    }

    @Override
    public final boolean a() {
        if (((o39) this.b.b).X0 != null) {
            return true;
        }
        return false;
    }

    public final void b(View view, MotionEvent motionEvent) {
        o39 o39Var = (o39) this.b.b;
        if (view != null) {
            if (o39Var.U0 != null || o39Var.V0 != null) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                o39Var.k1(view, x, y, true);
                int i = o39Var.N1;
                if (o39Var.Q1 && i != -1) {
                    try {
                        view.playSoundEffect(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(1);
                    c39 c39Var = o39Var.U0;
                    if (c39Var != null) {
                        c39Var.d(i, view);
                    } else {
                        d39 d39Var = o39Var.V0;
                        if (d39Var != null) {
                            d39Var.e(x - view.getX(), y - view.getY(), i, view);
                        }
                    }
                }
                g39 g39Var = new g39(this, view, i, x, y);
                o39Var.R1 = g39Var;
                gl.d3(g39Var, ViewConfiguration.getPressedStateDuration());
                yq4 yq4Var = o39Var.d1;
                if (yq4Var != null) {
                    gl.r(yq4Var);
                    o39Var.d1 = null;
                    o39Var.M1 = null;
                    o39Var.O1 = false;
                    o39Var.n1(view, motionEvent);
                }
            }
        }
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        d39 d39Var;
        o39 o39Var = (o39) this.b.b;
        View view = this.a;
        if (view != null && (d39Var = o39Var.V0) != null && d39Var.q(view)) {
            o39Var.V0.l(this.a, motionEvent.getX(), motionEvent.getY());
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
        o39 o39Var = (o39) this.b.b;
        View view = o39Var.M1;
        if (view != null && (i = o39Var.N1) != -1) {
            e39 e39Var = o39Var.W0;
            if (e39Var == null) {
                f39 f39Var = o39Var.X0;
                if (f39Var != null && f39Var.mo8e(motionEvent.getX() - o39Var.M1.getX(), motionEvent.getY() - o39Var.M1.getY(), i, view)) {
                    try {
                        view.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    view.sendAccessibilityEvent(2);
                    o39Var.Y0 = true;
                }
            } else if (e39Var.d(i, view)) {
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
        d39 d39Var;
        View view = this.a;
        if (view != null && (d39Var = ((o39) this.b.b).V0) != null && d39Var.q(view)) {
            b(this.a, motionEvent);
            this.a = null;
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        o39 o39Var = (o39) this.b.b;
        View view = o39Var.M1;
        if (view != null) {
            d39 d39Var = o39Var.V0;
            if (d39Var != null && d39Var.q(view)) {
                this.a = o39Var.M1;
                return false;
            }
            b(o39Var.M1, motionEvent);
        }
        return false;
    }
}

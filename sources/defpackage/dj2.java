package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
public final class dj2 {
    public int a;
    public float b;
    public float c;
    public Object d;
    public Object e;

    public dj2(cj2 cj2Var) {
        this.d = cj2Var;
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        cj2 cj2Var = (cj2) this.d;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && (this.a & 1) != 0) {
                        b(view, x, y);
                        return true;
                    }
                } else if ((this.a & 1) != 0) {
                    cj2Var.n(x, y);
                    if ((this.a & 4) != 0) {
                        cj2Var.D1(view, x, y);
                        return true;
                    }
                    if (cj2Var.e0() && Math.max(Math.abs(this.b - x), Math.abs(this.c - y)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                        b(view, x, y);
                        return true;
                    }
                    return true;
                }
            } else {
                int i = this.a;
                if ((i & 1) != 0) {
                    if ((i & 4) != 0) {
                        cj2Var.j(view, x, y);
                        this.a &= -5;
                    } else {
                        cj2Var.I(x, y);
                        if ((this.a & 256) == 0 && view != null) {
                            view.playSoundEffect(0);
                        }
                    }
                    b(view, x, y);
                    return true;
                }
            }
            if ((this.a & 1) == 0) {
                return false;
            }
            return true;
        }
        b(view, x, y);
        if (cj2Var.T0(x, y)) {
            this.a |= 1;
            this.b = x;
            this.c = y;
            cj2Var.p0();
            if (cj2Var.Y1() && view != null) {
                if (((ea2) this.e) == null) {
                    this.a |= 2;
                    ea2 ea2Var = new ea2(this, view, (byte) 19);
                    this.e = ea2Var;
                    view.postDelayed(ea2Var, cj2Var.getLongPressDuration());
                    return true;
                }
                lq5.f();
                return false;
            }
            return true;
        }
        return false;
    }

    public final void b(View view, float f, float f2) {
        cj2 cj2Var = (cj2) this.d;
        int i = this.a;
        if ((i & 2) != 0) {
            this.a = i & (-3);
            ea2 ea2Var = (ea2) this.e;
            if (ea2Var != null) {
                view.removeCallbacks(ea2Var);
                this.e = null;
            } else {
                lq5.f();
                return;
            }
        }
        int i2 = this.a;
        if ((i2 & 8) != 0) {
            this.a = i2 & (-9);
            cj2Var.s(view, f, f2);
        }
        int i3 = this.a;
        if ((i3 & 4) != 0) {
            cj2Var.j(view, f, f2);
            i3 = this.a & (-5);
            this.a = i3;
        }
        if ((i3 & 1) != 0) {
            cj2Var.x0();
            this.a &= -2;
        }
    }
}

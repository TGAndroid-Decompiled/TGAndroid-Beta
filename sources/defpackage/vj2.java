package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
public final class vj2 {
    public int a;
    public float b;
    public float c;
    public Object d;
    public Object e;

    public vj2(uj2 uj2Var) {
        this.d = uj2Var;
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        uj2 uj2Var = (uj2) this.d;
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
                    uj2Var.l(x, y);
                    if ((this.a & 4) != 0) {
                        uj2Var.G1(view, x, y);
                        return true;
                    }
                    if (uj2Var.f0() && Math.max(Math.abs(this.b - x), Math.abs(this.c - y)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                        b(view, x, y);
                        return true;
                    }
                    return true;
                }
            } else {
                int i = this.a;
                if ((i & 1) != 0) {
                    if ((i & 4) != 0) {
                        uj2Var.j(view, x, y);
                        this.a &= -5;
                    } else {
                        uj2Var.I(x, y);
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
        if (uj2Var.a1(x, y)) {
            this.a |= 1;
            this.b = x;
            this.c = y;
            uj2Var.q0();
            if (uj2Var.b2() && view != null) {
                if (((ra2) this.e) == null) {
                    this.a |= 2;
                    ra2 ra2Var = new ra2(this, view, (byte) 21);
                    this.e = ra2Var;
                    view.postDelayed(ra2Var, uj2Var.getLongPressDuration());
                    return true;
                }
                zo4.f();
                return false;
            }
            return true;
        }
        return false;
    }

    public final void b(View view, float f, float f2) {
        uj2 uj2Var = (uj2) this.d;
        int i = this.a;
        if ((i & 2) != 0) {
            this.a = i & (-3);
            ra2 ra2Var = (ra2) this.e;
            if (ra2Var != null) {
                view.removeCallbacks(ra2Var);
                this.e = null;
            } else {
                zo4.f();
                return;
            }
        }
        int i2 = this.a;
        if ((i2 & 8) != 0) {
            this.a = i2 & (-9);
            uj2Var.r(view, f, f2);
        }
        int i3 = this.a;
        if ((i3 & 4) != 0) {
            uj2Var.j(view, f, f2);
            i3 = this.a & (-5);
            this.a = i3;
        }
        if ((i3 & 1) != 0) {
            uj2Var.y0();
            this.a &= -2;
        }
    }
}

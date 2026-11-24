package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
public final class hi2 {
    public int a;
    public float b;
    public float c;
    public Object d;
    public Object e;

    public hi2(gi2 gi2Var) {
        this.d = gi2Var;
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        gi2 gi2Var = (gi2) this.d;
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
                    gi2Var.k(x, y);
                    if ((this.a & 4) != 0) {
                        gi2Var.f1(view, x, y);
                        return true;
                    }
                    if (gi2Var.T() && Math.max(Math.abs(this.b - x), Math.abs(this.c - y)) > ViewConfiguration.get(view.getContext()).getScaledTouchSlop() * 1.89f) {
                        b(view, x, y);
                        return true;
                    }
                    return true;
                }
            } else {
                int i = this.a;
                if ((i & 1) != 0) {
                    if ((i & 4) != 0) {
                        gi2Var.g(view, x, y);
                        this.a &= -5;
                    } else {
                        gi2Var.K(x, y);
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
        if (gi2Var.H0(x, y)) {
            this.a |= 1;
            this.b = x;
            this.c = y;
            gi2Var.g0();
            if (gi2Var.s1() && view != null) {
                if (((n92) this.e) == null) {
                    this.a |= 2;
                    n92 n92Var = new n92(this, view, (byte) 20);
                    this.e = n92Var;
                    view.postDelayed(n92Var, gi2Var.getLongPressDuration());
                    return true;
                }
                wn4.f();
                return false;
            }
            return true;
        }
        return false;
    }

    public final void b(View view, float f, float f2) {
        gi2 gi2Var = (gi2) this.d;
        int i = this.a;
        if ((i & 2) != 0) {
            this.a = i & (-3);
            n92 n92Var = (n92) this.e;
            if (n92Var != null) {
                view.removeCallbacks(n92Var);
                this.e = null;
            } else {
                wn4.f();
                return;
            }
        }
        int i2 = this.a;
        if ((i2 & 8) != 0) {
            this.a = i2 & (-9);
            gi2Var.n(view, f, f2);
        }
        int i3 = this.a;
        if ((i3 & 4) != 0) {
            gi2Var.g(view, f, f2);
            i3 = this.a & (-5);
            this.a = i3;
        }
        if ((i3 & 1) != 0) {
            gi2Var.o0();
            this.a &= -2;
        }
    }
}

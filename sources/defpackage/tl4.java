package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
public final class tl4 extends tu4 {
    public float a;
    public float b;
    public final int c;
    public final xl4 d;

    public tl4(xl4 xl4Var, int i) {
        this.d = xl4Var;
        this.c = i;
    }

    @Override
    public final boolean a() {
        xl4 xl4Var = this.d;
        if (!xl4Var.d && !xl4Var.N && !xl4Var.K && xl4Var.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z;
        int i;
        xl4 xl4Var = this.d;
        rec recVar = xl4Var.I;
        je8 je8Var = xl4Var.b;
        if (xl4Var.b() && xl4Var.c()) {
            if (motionEvent.getX() >= xl4Var.A * 0.5f) {
                z = true;
            } else {
                z = false;
            }
            long duration = je8Var.getDuration();
            long k = je8Var.k();
            if (z) {
                i = 10000;
            } else {
                i = -10000;
            }
            long j = i + k;
            if (j > duration) {
                j = duration;
            } else if (j < 0) {
                if (j >= -9000) {
                    j = 0;
                }
                return true;
            }
            if (k != j) {
                recVar.c(true);
                recVar.b(!z);
                long j2 = recVar.o + 10000;
                recVar.o = j2;
                recVar.p = ob6.G((int) (j2 / 1000), "Seconds", new Object[0]);
                je8Var.g(j);
                recVar.e(0L);
                xl4Var.L = ((float) j) / ((float) duration);
                vl4 vl4Var = xl4Var.q;
                if (vl4Var != null) {
                    vl4Var.invalidate();
                }
                pl4 pl4Var = xl4Var.o;
                if (pl4Var != null) {
                    pl4Var.invalidate();
                }
                if (!xl4Var.x) {
                    xl4Var.x = true;
                    xl4Var.q(true);
                    if (!xl4Var.z) {
                        xl4Var.z = true;
                        hl.d3(xl4Var.V, 2500L);
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        xl4 xl4Var = this.d;
        if (xl4Var.x) {
            for (int i = 1; i < xl4Var.k.getChildCount(); i++) {
                View childAt = xl4Var.k.getChildAt(i);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    xl4Var.w = childAt;
                    return true;
                }
            }
        }
        this.a = xl4Var.E;
        this.b = xl4Var.F;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        float f4;
        boolean z;
        boolean z2;
        xl4 xl4Var = this.d;
        if (xl4Var.d && xl4Var.u && xl4Var.h() > 0.0f && Math.abs(f) > hl.L(800.0f)) {
            if (f < 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if ((xl4Var.A / 2.0f) + xl4Var.E < hl.q.x / 2.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z == z2) {
                xl4Var.o();
                return true;
            }
        }
        if (!xl4Var.u || xl4Var.v) {
            return false;
        }
        vpa vpaVar = xl4Var.G;
        vpaVar.a = f;
        vpaVar.b = xl4Var.E;
        vpaVar.c = true;
        vpaVar.m.i = xl4.p((f / 7.0f) + f3, xl4Var.A);
        xl4Var.G.h();
        vpa vpaVar2 = xl4Var.H;
        vpaVar2.a = f2;
        vpaVar2.b = xl4Var.F;
        vpaVar2.c = true;
        vpaVar2.m.i = xl4.e((f2 / 10.0f) + f4, xl4Var.B);
        xl4Var.H.h();
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        xl4 xl4Var = this.d;
        WindowManager.LayoutParams layoutParams = xl4Var.f;
        if (!xl4Var.u && xl4Var.y == null && !xl4Var.v) {
            float abs = Math.abs(f);
            float f3 = this.c;
            if (abs >= f3 || Math.abs(f2) >= f3) {
                xl4Var.u = true;
                xl4Var.G.d();
                xl4Var.H.d();
                xl4Var.R = false;
                xl4Var.b.T();
                hl.r(xl4Var.T);
            }
        }
        if (xl4Var.u && motionEvent != null) {
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            xl4Var.F = rawY;
            vpa vpaVar = xl4Var.G;
            if (vpaVar.f) {
                vpaVar.m.i = rawX;
            } else {
                xl4Var.E = rawX;
                layoutParams.x = (int) rawX;
            }
            layoutParams.y = (int) rawY;
            xl4Var.v();
            if (xl4Var.d) {
                xl4Var.j.setAlpha(1.0f - (ete.a(xl4Var.h() / (xl4Var.A / 2.0f), 0.0f, 1.0f) * 0.5f));
            }
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        xl4 xl4Var = this.d;
        ql4 ql4Var = xl4Var.V;
        if (xl4Var.d) {
            xl4Var.r();
            return true;
        }
        if (xl4Var.y == null) {
            if (xl4Var.z) {
                hl.r(ql4Var);
                xl4Var.z = false;
            }
            boolean z = !xl4Var.x;
            xl4Var.x = z;
            xl4Var.q(z);
            if (xl4Var.x) {
                hl.d3(ql4Var, 2500L);
                xl4Var.z = true;
            }
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (!a()) {
            onSingleTapConfirmed(motionEvent);
            return true;
        }
        return super.onSingleTapUp(motionEvent);
    }
}

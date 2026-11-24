package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
public final class oj4 extends ps4 {
    public float a;
    public float b;
    public final int c;
    public final sj4 d;

    public oj4(sj4 sj4Var, int i) {
        this.d = sj4Var;
        this.c = i;
    }

    @Override
    public final boolean a() {
        sj4 sj4Var = this.d;
        if (!sj4Var.K && !sj4Var.H && sj4Var.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z;
        int i;
        sj4 sj4Var = this.d;
        rac racVar = sj4Var.F;
        sa8 sa8Var = sj4Var.b;
        if (sj4Var.b() && sj4Var.c()) {
            if (motionEvent.getX() >= sj4Var.x * 0.5f) {
                z = true;
            } else {
                z = false;
            }
            long duration = sa8Var.getDuration();
            long m = sa8Var.m();
            if (z) {
                i = 10000;
            } else {
                i = -10000;
            }
            long j = i + m;
            if (j > duration) {
                j = duration;
            } else if (j < 0) {
                if (j >= -9000) {
                    j = 0;
                }
                return true;
            }
            if (m != j) {
                racVar.c(true);
                racVar.b(!z);
                long j2 = racVar.o + 10000;
                racVar.o = j2;
                racVar.p = k96.G((int) (j2 / 1000), "Seconds", new Object[0]);
                sa8Var.f(j);
                racVar.e(0L);
                sj4Var.I = ((float) j) / ((float) duration);
                rj4 rj4Var = sj4Var.o;
                if (rj4Var != null) {
                    rj4Var.invalidate();
                }
                lj4 lj4Var = sj4Var.m;
                if (lj4Var != null) {
                    lj4Var.invalidate();
                }
                if (!sj4Var.u) {
                    sj4Var.u = true;
                    sj4Var.o(true);
                    if (!sj4Var.w) {
                        sj4Var.w = true;
                        gl.d3(sj4Var.P, 2500L);
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        sj4 sj4Var = this.d;
        if (sj4Var.u) {
            for (int i = 1; i < sj4Var.i.getChildCount(); i++) {
                View childAt = sj4Var.i.getChildAt(i);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    sj4Var.t = childAt;
                    return true;
                }
            }
        }
        this.a = sj4Var.B;
        this.b = sj4Var.C;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        sj4 sj4Var = this.d;
        if (sj4Var.r && !sj4Var.s) {
            yla ylaVar = sj4Var.D;
            ylaVar.a = f;
            float f3 = sj4Var.B;
            ylaVar.b = f3;
            ylaVar.c = true;
            ylaVar.m.i = sj4.n((f / 7.0f) + f3, sj4Var.x);
            sj4Var.D.h();
            yla ylaVar2 = sj4Var.E;
            ylaVar2.a = f2;
            float f4 = sj4Var.C;
            ylaVar2.b = f4;
            ylaVar2.c = true;
            ylaVar2.m.i = sj4.e((f2 / 10.0f) + f4, sj4Var.y);
            sj4Var.E.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        sj4 sj4Var = this.d;
        WindowManager.LayoutParams layoutParams = sj4Var.e;
        if (!sj4Var.r && sj4Var.v == null && !sj4Var.s) {
            float abs = Math.abs(f);
            float f3 = this.c;
            if (abs >= f3 || Math.abs(f2) >= f3) {
                sj4Var.r = true;
                sj4Var.D.d();
                sj4Var.E.d();
                sj4Var.L = false;
                sj4Var.b.L0();
                gl.r(sj4Var.N);
            }
        }
        if (sj4Var.r && motionEvent != null) {
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            sj4Var.C = rawY;
            yla ylaVar = sj4Var.D;
            if (ylaVar.f) {
                ylaVar.m.i = rawX;
            } else {
                sj4Var.B = rawX;
                layoutParams.x = (int) rawX;
            }
            layoutParams.y = (int) rawY;
            sj4Var.r();
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        sj4 sj4Var = this.d;
        mj4 mj4Var = sj4Var.P;
        if (sj4Var.v == null) {
            if (sj4Var.w) {
                gl.r(mj4Var);
                sj4Var.w = false;
            }
            boolean z = !sj4Var.u;
            sj4Var.u = z;
            sj4Var.o(z);
            if (sj4Var.u) {
                gl.d3(mj4Var, 2500L);
                sj4Var.w = true;
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

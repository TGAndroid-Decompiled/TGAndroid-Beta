package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
public final class sl4 extends qu4 {
    public float a;
    public float b;
    public final int c;
    public final tl4 d;

    public sl4(tl4 tl4Var, int i) {
        this.d = tl4Var;
        this.c = i;
    }

    @Override
    public final boolean a() {
        tl4 tl4Var = this.d;
        if (!tl4Var.K && !tl4Var.H && tl4Var.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z;
        int i;
        tl4 tl4Var = this.d;
        ucc uccVar = tl4Var.F;
        vc8 vc8Var = tl4Var.b;
        if (tl4Var.b() && tl4Var.c()) {
            if (motionEvent.getX() >= tl4Var.x * 0.5f) {
                z = true;
            } else {
                z = false;
            }
            long duration = vc8Var.getDuration();
            long k = vc8Var.k();
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
                uccVar.c(true);
                uccVar.b(!z);
                long j2 = uccVar.o + 10000;
                uccVar.o = j2;
                uccVar.p = jb6.G((int) (j2 / 1000), "Seconds", new Object[0]);
                vc8Var.e(j);
                uccVar.e(0L);
                tl4Var.I = ((float) j) / ((float) duration);
                yc ycVar = tl4Var.o;
                if (ycVar != null) {
                    ycVar.invalidate();
                }
                pl4 pl4Var = tl4Var.m;
                if (pl4Var != null) {
                    pl4Var.invalidate();
                }
                if (!tl4Var.u) {
                    tl4Var.u = true;
                    tl4Var.o(true);
                    if (!tl4Var.w) {
                        tl4Var.w = true;
                        gm.d3(tl4Var.P, 2500L);
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        tl4 tl4Var = this.d;
        if (tl4Var.u) {
            for (int i = 1; i < tl4Var.i.getChildCount(); i++) {
                View childAt = tl4Var.i.getChildAt(i);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    tl4Var.t = childAt;
                    return true;
                }
            }
        }
        this.a = tl4Var.B;
        this.b = tl4Var.C;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        tl4 tl4Var = this.d;
        if (tl4Var.r && !tl4Var.s) {
            zna znaVar = tl4Var.D;
            znaVar.a = f;
            float f3 = tl4Var.B;
            znaVar.b = f3;
            znaVar.c = true;
            znaVar.m.i = tl4.n((f / 7.0f) + f3, tl4Var.x);
            tl4Var.D.h();
            zna znaVar2 = tl4Var.E;
            znaVar2.a = f2;
            float f4 = tl4Var.C;
            znaVar2.b = f4;
            znaVar2.c = true;
            znaVar2.m.i = tl4.e((f2 / 10.0f) + f4, tl4Var.y);
            tl4Var.E.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        tl4 tl4Var = this.d;
        WindowManager.LayoutParams layoutParams = tl4Var.e;
        if (!tl4Var.r && tl4Var.v == null && !tl4Var.s) {
            float abs = Math.abs(f);
            float f3 = this.c;
            if (abs >= f3 || Math.abs(f2) >= f3) {
                tl4Var.r = true;
                tl4Var.D.d();
                tl4Var.E.d();
                tl4Var.L = false;
                tl4Var.b.R();
                gm.r(tl4Var.N);
            }
        }
        if (tl4Var.r && motionEvent != null) {
            float rawX = (motionEvent2.getRawX() + this.a) - motionEvent.getRawX();
            float rawY = (motionEvent2.getRawY() + this.b) - motionEvent.getRawY();
            tl4Var.C = rawY;
            zna znaVar = tl4Var.D;
            if (znaVar.f) {
                znaVar.m.i = rawX;
            } else {
                tl4Var.B = rawX;
                layoutParams.x = (int) rawX;
            }
            layoutParams.y = (int) rawY;
            tl4Var.r();
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        tl4 tl4Var = this.d;
        ql4 ql4Var = tl4Var.P;
        if (tl4Var.v == null) {
            if (tl4Var.w) {
                gm.r(ql4Var);
                tl4Var.w = false;
            }
            boolean z = !tl4Var.u;
            tl4Var.u = z;
            tl4Var.o(z);
            if (tl4Var.u) {
                gm.d3(ql4Var, 2500L);
                tl4Var.w = true;
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

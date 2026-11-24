package defpackage;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
public final class q7b extends ps4 {
    public final s7b a;

    public q7b(s7b s7bVar) {
        this.a = s7bVar;
    }

    @Override
    public final boolean a() {
        y6b y6bVar;
        t7b t7bVar = this.a.u0;
        if (t7bVar.g0 == 0 && (y6bVar = t7bVar.C0) != null && !t7bVar.T1 && y6bVar.isInited() && !t7bVar.Q1 && !t7bVar.P0.y0) {
            lq9 lq9Var = t7bVar.E0;
            if ((lq9Var == null || (!lq9Var.y.i && !lq9Var.M)) && !t7bVar.H() && t7bVar.q2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        t7b t7bVar = this.a.u0;
        y6b y6bVar = t7bVar.C0;
        if (y6bVar != null && !t7bVar.T1 && !t7bVar.Q1 && y6bVar.isInited() && t7bVar.g0 == 0 && t7bVar.P1 != -1) {
            t7bVar.C0.switchCamera();
            t7bVar.P0.d(180.0f);
            na7.c1().edit().putBoolean("stories_camera", t7bVar.C0.isFrontface()).apply();
            if (t7bVar.p0()) {
                t7bVar.s.c(null);
                return true;
            }
            t7bVar.s.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        y6b y6bVar = this.a.u0.C0;
        if (y6bVar != null) {
            y6bVar.O = null;
            y6bVar.L = -1L;
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        s7b s7bVar = this.a;
        s7bVar.s0 = 0.0f;
        s7bVar.t0 = 0.0f;
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        lq9 lq9Var;
        y6b y6bVar;
        azc azcVar;
        h7b h7bVar;
        boolean z;
        boolean z2;
        s7b s7bVar = this.a;
        t7b t7bVar = s7bVar.u0;
        ValueAnimator valueAnimator = t7bVar.F;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((lq9Var = t7bVar.E0) != null && (lq9Var.y.i || lq9Var.M)) || t7bVar.P0.y0 || (((y6bVar = t7bVar.C0) != null && y6bVar.s) || s7bVar.q0 || (((azcVar = t7bVar.W0) != null && (azcVar.G || azcVar.H)) || t7bVar.G())))) {
            return false;
        }
        boolean z3 = true;
        s7bVar.o0 = true;
        if (t7bVar.X) {
            if (Math.abs(t7bVar.r.a) >= gl.L(1.0f)) {
                if ((f2 > 0.0f && Math.abs(f2) > 2000.0f && Math.abs(f2) > Math.abs(f)) || t7bVar.L > 0.4f) {
                    t7bVar.o(true);
                } else {
                    t7bVar.b();
                }
            } else if (t7bVar.N0 != null && !t7bVar.M0 && t7bVar.P1 != -1) {
                if (Math.abs(f2) > 200.0f && (!t7bVar.N0.d.canScrollVertically(-1) || !t7bVar.L0)) {
                    if (!t7bVar.R1 && f2 < 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    t7bVar.c(z2);
                } else {
                    if (!t7bVar.R1 && t7bVar.N0.getTranslationY() < t7bVar.N0.getPadding()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    t7bVar.c(z);
                }
            }
            t7bVar.M0 = false;
            t7bVar.X = false;
            t7bVar.Y = false;
            if (z3 && (h7bVar = t7bVar.B0) != null) {
                h7bVar.a();
            }
            return z3;
        }
        z3 = false;
        t7bVar.M0 = false;
        t7bVar.X = false;
        t7bVar.Y = false;
        if (z3) {
            h7bVar.a();
        }
        return z3;
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r6, android.view.MotionEvent r7, float r8, float r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q7b.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        y6b y6bVar = this.a.u0.C0;
        if (y6bVar != null) {
            hr3 hr3Var = y6bVar.O;
            if (hr3Var != null) {
                hr3Var.run();
                y6bVar.O = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        t7b t7bVar = this.a.u0;
        t7bVar.X = false;
        t7bVar.Y = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!t7bVar.H() || motionEvent.getY() >= t7bVar.N0.g()) {
            return false;
        }
        t7bVar.c(false);
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

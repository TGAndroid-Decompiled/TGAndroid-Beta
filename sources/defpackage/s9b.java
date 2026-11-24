package defpackage;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
public final class s9b extends qu4 {
    public final u9b a;

    public s9b(u9b u9bVar) {
        this.a = u9bVar;
    }

    @Override
    public final boolean a() {
        a9b a9bVar;
        v9b v9bVar = this.a.u0;
        if (v9bVar.g0 == 0 && (a9bVar = v9bVar.C0) != null && !v9bVar.T1 && a9bVar.isInited() && !v9bVar.Q1 && !v9bVar.P0.y0) {
            ms9 ms9Var = v9bVar.E0;
            if ((ms9Var == null || (!ms9Var.y.i && !ms9Var.M)) && !v9bVar.H() && v9bVar.q2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        v9b v9bVar = this.a.u0;
        a9b a9bVar = v9bVar.C0;
        if (a9bVar != null && !v9bVar.T1 && !v9bVar.Q1 && a9bVar.isInited() && v9bVar.g0 == 0 && v9bVar.P1 != -1) {
            v9bVar.C0.switchCamera();
            v9bVar.P0.d(180.0f);
            oc7.d1().edit().putBoolean("stories_camera", v9bVar.C0.isFrontface()).apply();
            if (v9bVar.p0()) {
                v9bVar.s.c(null);
                return true;
            }
            v9bVar.s.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        a9b a9bVar = this.a.u0.C0;
        if (a9bVar != null) {
            a9bVar.O = null;
            a9bVar.L = -1L;
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        u9b u9bVar = this.a;
        u9bVar.s0 = 0.0f;
        u9bVar.t0 = 0.0f;
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ms9 ms9Var;
        a9b a9bVar;
        b1d b1dVar;
        j9b j9bVar;
        boolean z;
        boolean z2;
        u9b u9bVar = this.a;
        v9b v9bVar = u9bVar.u0;
        ValueAnimator valueAnimator = v9bVar.F;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((ms9Var = v9bVar.E0) != null && (ms9Var.y.i || ms9Var.M)) || v9bVar.P0.y0 || (((a9bVar = v9bVar.C0) != null && a9bVar.s) || u9bVar.q0 || (((b1dVar = v9bVar.W0) != null && (b1dVar.G || b1dVar.H)) || v9bVar.G())))) {
            return false;
        }
        boolean z3 = true;
        u9bVar.o0 = true;
        if (v9bVar.X) {
            if (Math.abs(v9bVar.r.a) >= gm.L(1.0f)) {
                if ((f2 > 0.0f && Math.abs(f2) > 2000.0f && Math.abs(f2) > Math.abs(f)) || v9bVar.L > 0.4f) {
                    v9bVar.o(true);
                } else {
                    v9bVar.b();
                }
            } else if (v9bVar.N0 != null && !v9bVar.M0 && v9bVar.P1 != -1) {
                if (Math.abs(f2) > 200.0f && (!v9bVar.N0.d.canScrollVertically(-1) || !v9bVar.L0)) {
                    if (!v9bVar.R1 && f2 < 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    v9bVar.c(z2);
                } else {
                    if (!v9bVar.R1 && v9bVar.N0.getTranslationY() < v9bVar.N0.getPadding()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    v9bVar.c(z);
                }
            }
            v9bVar.M0 = false;
            v9bVar.X = false;
            v9bVar.Y = false;
            if (z3 && (j9bVar = v9bVar.B0) != null) {
                j9bVar.a();
            }
            return z3;
        }
        z3 = false;
        v9bVar.M0 = false;
        v9bVar.X = false;
        v9bVar.Y = false;
        if (z3) {
            j9bVar.a();
        }
        return z3;
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r6, android.view.MotionEvent r7, float r8, float r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s9b.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        a9b a9bVar = this.a.u0.C0;
        if (a9bVar != null) {
            rs3 rs3Var = a9bVar.O;
            if (rs3Var != null) {
                rs3Var.run();
                a9bVar.O = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        v9b v9bVar = this.a.u0;
        v9bVar.X = false;
        v9bVar.Y = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!v9bVar.H() || motionEvent.getY() >= v9bVar.N0.g()) {
            return false;
        }
        v9bVar.c(false);
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

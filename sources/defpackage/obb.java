package defpackage;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
public final class obb extends tu4 {
    public final qbb a;

    public obb(qbb qbbVar) {
        this.a = qbbVar;
    }

    @Override
    public final boolean a() {
        wab wabVar;
        rbb rbbVar = this.a.o0;
        if (rbbVar.g0 == 0 && (wabVar = rbbVar.C0) != null && !rbbVar.T1 && wabVar.isInited() && !rbbVar.Q1 && !rbbVar.P0.y0) {
            du9 du9Var = rbbVar.E0;
            if ((du9Var == null || (!du9Var.y.i && !du9Var.M)) && !rbbVar.H() && rbbVar.q2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        rbb rbbVar = this.a.o0;
        wab wabVar = rbbVar.C0;
        if (wabVar != null && !rbbVar.T1 && !rbbVar.Q1 && wabVar.isInited() && rbbVar.g0 == 0 && rbbVar.P1 != -1) {
            rbbVar.C0.switchCamera();
            rbbVar.P0.d(180.0f);
            uc7.e1().edit().putBoolean("stories_camera", rbbVar.C0.isFrontface()).apply();
            if (rbbVar.p0()) {
                rbbVar.s.c(null);
                return true;
            }
            rbbVar.s.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        wab wabVar = this.a.o0.C0;
        if (wabVar != null) {
            wabVar.O = null;
            wabVar.L = -1L;
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        qbb qbbVar = this.a;
        qbbVar.m0 = 0.0f;
        qbbVar.n0 = 0.0f;
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        du9 du9Var;
        wab wabVar;
        r3d r3dVar;
        fbb fbbVar;
        boolean z;
        boolean z2;
        qbb qbbVar = this.a;
        rbb rbbVar = qbbVar.o0;
        ValueAnimator valueAnimator = rbbVar.F;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((du9Var = rbbVar.E0) != null && (du9Var.y.i || du9Var.M)) || rbbVar.P0.y0 || (((wabVar = rbbVar.C0) != null && wabVar.s) || qbbVar.k0 || (((r3dVar = rbbVar.W0) != null && (r3dVar.G || r3dVar.H)) || rbbVar.G())))) {
            return false;
        }
        boolean z3 = true;
        qbbVar.i0 = true;
        if (rbbVar.X) {
            if (Math.abs(rbbVar.r.a) >= hl.L(1.0f)) {
                if ((f2 > 0.0f && Math.abs(f2) > 2000.0f && Math.abs(f2) > Math.abs(f)) || rbbVar.L > 0.4f) {
                    rbbVar.o(true);
                } else {
                    rbbVar.b();
                }
            } else if (rbbVar.N0 != null && !rbbVar.M0 && rbbVar.P1 != -1) {
                if (Math.abs(f2) > 200.0f && (!rbbVar.N0.d.canScrollVertically(-1) || !rbbVar.L0)) {
                    if (!rbbVar.R1 && f2 < 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    rbbVar.c(z2);
                } else {
                    if (!rbbVar.R1 && rbbVar.N0.getTranslationY() < rbbVar.N0.getPadding()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    rbbVar.c(z);
                }
            }
            rbbVar.M0 = false;
            rbbVar.X = false;
            rbbVar.Y = false;
            if (z3 && (fbbVar = rbbVar.B0) != null) {
                fbbVar.a();
            }
            return z3;
        }
        z3 = false;
        rbbVar.M0 = false;
        rbbVar.X = false;
        rbbVar.Y = false;
        if (z3) {
            fbbVar.a();
        }
        return z3;
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r6, android.view.MotionEvent r7, float r8, float r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.obb.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        wab wabVar = this.a.o0.C0;
        if (wabVar != null) {
            zr3 zr3Var = wabVar.O;
            if (zr3Var != null) {
                zr3Var.run();
                wabVar.O = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        rbb rbbVar = this.a.o0;
        rbbVar.X = false;
        rbbVar.Y = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!rbbVar.H() || motionEvent.getY() >= rbbVar.N0.g()) {
            return false;
        }
        rbbVar.c(false);
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

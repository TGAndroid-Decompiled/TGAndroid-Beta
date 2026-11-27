package defpackage;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
public final class pbb extends tu4 {
    public final rbb a;

    public pbb(rbb rbbVar) {
        this.a = rbbVar;
    }

    @Override
    public final boolean a() {
        xab xabVar;
        sbb sbbVar = this.a.o0;
        if (sbbVar.g0 == 0 && (xabVar = sbbVar.C0) != null && !sbbVar.T1 && xabVar.isInited() && !sbbVar.Q1 && !sbbVar.P0.y0) {
            du9 du9Var = sbbVar.E0;
            if ((du9Var == null || (!du9Var.y.i && !du9Var.M)) && !sbbVar.H() && sbbVar.q2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        sbb sbbVar = this.a.o0;
        xab xabVar = sbbVar.C0;
        if (xabVar != null && !sbbVar.T1 && !sbbVar.Q1 && xabVar.isInited() && sbbVar.g0 == 0 && sbbVar.P1 != -1) {
            sbbVar.C0.switchCamera();
            sbbVar.P0.d(180.0f);
            uc7.e1().edit().putBoolean("stories_camera", sbbVar.C0.isFrontface()).apply();
            if (sbbVar.p0()) {
                sbbVar.s.c(null);
                return true;
            }
            sbbVar.s.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        xab xabVar = this.a.o0.C0;
        if (xabVar != null) {
            xabVar.O = null;
            xabVar.L = -1L;
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        rbb rbbVar = this.a;
        rbbVar.m0 = 0.0f;
        rbbVar.n0 = 0.0f;
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        du9 du9Var;
        xab xabVar;
        r3d r3dVar;
        gbb gbbVar;
        boolean z;
        boolean z2;
        rbb rbbVar = this.a;
        sbb sbbVar = rbbVar.o0;
        ValueAnimator valueAnimator = sbbVar.F;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((du9Var = sbbVar.E0) != null && (du9Var.y.i || du9Var.M)) || sbbVar.P0.y0 || (((xabVar = sbbVar.C0) != null && xabVar.s) || rbbVar.k0 || (((r3dVar = sbbVar.W0) != null && (r3dVar.G || r3dVar.H)) || sbbVar.G())))) {
            return false;
        }
        boolean z3 = true;
        rbbVar.i0 = true;
        if (sbbVar.X) {
            if (Math.abs(sbbVar.r.a) >= hl.L(1.0f)) {
                if ((f2 > 0.0f && Math.abs(f2) > 2000.0f && Math.abs(f2) > Math.abs(f)) || sbbVar.L > 0.4f) {
                    sbbVar.o(true);
                } else {
                    sbbVar.b();
                }
            } else if (sbbVar.N0 != null && !sbbVar.M0 && sbbVar.P1 != -1) {
                if (Math.abs(f2) > 200.0f && (!sbbVar.N0.d.canScrollVertically(-1) || !sbbVar.L0)) {
                    if (!sbbVar.R1 && f2 < 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sbbVar.c(z2);
                } else {
                    if (!sbbVar.R1 && sbbVar.N0.getTranslationY() < sbbVar.N0.getPadding()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sbbVar.c(z);
                }
            }
            sbbVar.M0 = false;
            sbbVar.X = false;
            sbbVar.Y = false;
            if (z3 && (gbbVar = sbbVar.B0) != null) {
                gbbVar.a();
            }
            return z3;
        }
        z3 = false;
        sbbVar.M0 = false;
        sbbVar.X = false;
        sbbVar.Y = false;
        if (z3) {
            gbbVar.a();
        }
        return z3;
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r6, android.view.MotionEvent r7, float r8, float r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pbb.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        xab xabVar = this.a.o0.C0;
        if (xabVar != null) {
            zr3 zr3Var = xabVar.O;
            if (zr3Var != null) {
                zr3Var.run();
                xabVar.O = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        sbb sbbVar = this.a.o0;
        sbbVar.X = false;
        sbbVar.Y = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!sbbVar.H() || motionEvent.getY() >= sbbVar.N0.g()) {
            return false;
        }
        sbbVar.c(false);
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

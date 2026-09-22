package ci;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l20;
import org.telegram.ui.Components.t91;
public final class lc extends l20 {
    public final nc f4983a;

    public lc(nc ncVar) {
        this.f4983a = ncVar;
    }

    @Override
    public final boolean a() {
        rb rbVar;
        oc ocVar = this.f4983a.E0;
        if (ocVar.f5221f0 == 0 && (rbVar = ocVar.B0) != null && !ocVar.S1 && rbVar.isInited() && !ocVar.P1 && !ocVar.O0.f4970x0) {
            w7 w7Var = ocVar.D0;
            if ((w7Var == null || (!w7Var.f5708x.h && !w7Var.L)) && !ocVar.J() && ocVar.f5252p2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        oc ocVar = this.f4983a.E0;
        rb rbVar = ocVar.B0;
        if (rbVar != null && !ocVar.S1 && !ocVar.P1 && rbVar.isInited() && ocVar.f5221f0 == 0 && ocVar.O1 != -1) {
            ocVar.B0.switchCamera();
            ocVar.O0.d(180.0f);
            oc.a0(ocVar.B0.isFrontface());
            if (ocVar.q0()) {
                ocVar.f5260s.c(null);
                return true;
            }
            ocVar.f5260s.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        rb rbVar = this.f4983a.E0.B0;
        if (rbVar != null) {
            rbVar.N = null;
            rbVar.K = -1L;
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        nc ncVar = this.f4983a;
        ncVar.C0 = 0.0f;
        ncVar.D0 = 0.0f;
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        w7 w7Var;
        rb rbVar;
        t91 t91Var;
        bc bcVar;
        boolean z10;
        boolean z11;
        nc ncVar = this.f4983a;
        oc ocVar = ncVar.E0;
        ValueAnimator valueAnimator = ocVar.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((w7Var = ocVar.D0) != null && (w7Var.f5708x.h || w7Var.L)) || ocVar.O0.f4970x0 || (((rbVar = ocVar.B0) != null && rbVar.f4483s) || ncVar.A0 || (((t91Var = ocVar.V0) != null && (t91Var.F || t91Var.G)) || ocVar.I())))) {
            return false;
        }
        boolean z12 = true;
        ncVar.f5099y0 = true;
        if (ocVar.W) {
            if (Math.abs(ocVar.f5256r.f4729a) >= AndroidUtilities.dp(1.0f)) {
                if ((f10 > 0.0f && Math.abs(f10) > 2000.0f && Math.abs(f10) > Math.abs(f7)) || ocVar.K > 0.4f) {
                    ocVar.q(true);
                } else {
                    oc.c(ocVar);
                }
            } else if (ocVar.M0 != null && !ocVar.L0 && ocVar.O1 != -1) {
                if (Math.abs(f10) > 200.0f && (!ocVar.M0.d.canScrollVertically(-1) || !ocVar.K0)) {
                    if (!ocVar.Q1 && f10 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ocVar.f(z11);
                } else {
                    if (!ocVar.Q1 && ocVar.M0.getTranslationY() < ocVar.M0.getPadding()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ocVar.f(z10);
                }
            }
            ocVar.L0 = false;
            ocVar.W = false;
            ocVar.X = false;
            if (z12 && (bcVar = ocVar.A0) != null) {
                bcVar.d();
            }
            return z12;
        }
        z12 = false;
        ocVar.L0 = false;
        ocVar.W = false;
        ocVar.X = false;
        if (z12) {
            bcVar.d();
        }
        return z12;
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        throw new UnsupportedOperationException("Method not decompiled: ci.lc.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        rb rbVar = this.f4983a.E0.B0;
        if (rbVar != null) {
            c1 c1Var = rbVar.N;
            if (c1Var != null) {
                c1Var.run();
                rbVar.N = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        oc ocVar = this.f4983a.E0;
        ocVar.W = false;
        ocVar.X = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!ocVar.J() || motionEvent.getY() >= ocVar.M0.g()) {
            return false;
        }
        ocVar.f(false);
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

package nh;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h20;
import org.telegram.ui.Components.u81;
public final class db extends h20 {
    public final fb f17549a;

    public db(fb fbVar) {
        this.f17549a = fbVar;
    }

    @Override
    public final boolean a() {
        ka kaVar;
        gb gbVar = this.f17549a.A0;
        if (gbVar.f17740b0 == 0 && (kaVar = gbVar.f17812x0) != null && !gbVar.O1 && kaVar.isInited() && !gbVar.L1 && !gbVar.K0.f18244t0) {
            y6 y6Var = gbVar.f17819z0;
            if ((y6Var == null || (!y6Var.f18888x.h && !y6Var.H)) && !gbVar.J() && gbVar.f17774l2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        gb gbVar = this.f17549a.A0;
        ka kaVar = gbVar.f17812x0;
        if (kaVar != null && !gbVar.O1 && !gbVar.L1 && kaVar.isInited() && gbVar.f17740b0 == 0 && gbVar.K1 != -1) {
            gbVar.f17812x0.switchCamera();
            gbVar.K0.d(180.0f);
            gb.a0(gbVar.f17812x0.isFrontface());
            if (gbVar.q0()) {
                gbVar.f17794s.c(null);
                return true;
            }
            gbVar.f17794s.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        ka kaVar = this.f17549a.A0.f17812x0;
        if (kaVar != null) {
            kaVar.J = null;
            kaVar.G = -1L;
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        fb fbVar = this.f17549a;
        fbVar.f17688y0 = 0.0f;
        fbVar.f17689z0 = 0.0f;
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        y6 y6Var;
        ka kaVar;
        u81 u81Var;
        ua uaVar;
        boolean z10;
        boolean z11;
        fb fbVar = this.f17549a;
        gb gbVar = fbVar.A0;
        ValueAnimator valueAnimator = gbVar.A;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((y6Var = gbVar.f17819z0) != null && (y6Var.f18888x.h || y6Var.H)) || gbVar.K0.f18244t0 || (((kaVar = gbVar.f17812x0) != null && kaVar.f17464s) || fbVar.f17686w0 || (((u81Var = gbVar.R0) != null && (u81Var.B || u81Var.C)) || gbVar.I())))) {
            return false;
        }
        boolean z12 = true;
        fbVar.f17684u0 = true;
        if (gbVar.S) {
            if (Math.abs(gbVar.f17790r.f18912a) >= AndroidUtilities.dp(1.0f)) {
                if ((f10 > 0.0f && Math.abs(f10) > 2000.0f && Math.abs(f10) > Math.abs(f9)) || gbVar.G > 0.4f) {
                    gbVar.q(true);
                } else {
                    gb.c(gbVar);
                }
            } else if (gbVar.I0 != null && !gbVar.H0 && gbVar.K1 != -1) {
                if (Math.abs(f10) > 200.0f && (!gbVar.I0.d.canScrollVertically(-1) || !gbVar.G0)) {
                    if (!gbVar.M1 && f10 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    gbVar.f(z11);
                } else {
                    if (!gbVar.M1 && gbVar.I0.getTranslationY() < gbVar.I0.getPadding()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    gbVar.f(z10);
                }
            }
            gbVar.H0 = false;
            gbVar.S = false;
            gbVar.T = false;
            if (z12 && (uaVar = gbVar.f17808w0) != null) {
                uaVar.d();
            }
            return z12;
        }
        z12 = false;
        gbVar.H0 = false;
        gbVar.S = false;
        gbVar.T = false;
        if (z12) {
            uaVar.d();
        }
        return z12;
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        throw new UnsupportedOperationException("Method not decompiled: nh.db.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ka kaVar = this.f17549a.A0.f17812x0;
        if (kaVar != null) {
            b1 b1Var = kaVar.J;
            if (b1Var != null) {
                b1Var.run();
                kaVar.J = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        gb gbVar = this.f17549a.A0;
        gbVar.S = false;
        gbVar.T = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!gbVar.J() || motionEvent.getY() >= gbVar.I0.g()) {
            return false;
        }
        gbVar.f(false);
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

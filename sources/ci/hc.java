package ci;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ba1;
import org.telegram.ui.Components.p20;
public final class hc extends p20 {
    public final jc f5144a;

    public hc(jc jcVar) {
        this.f5144a = jcVar;
    }

    @Override
    public final boolean a() {
        nb nbVar;
        kc kcVar = this.f5144a.E0;
        if (kcVar.f5392f0 == 0 && (nbVar = kcVar.B0) != null && !kcVar.S1 && nbVar.isInited() && !kcVar.P1 && !kcVar.O0.f5247x0) {
            t7 t7Var = kcVar.D0;
            if ((t7Var == null || (!t7Var.f5995x.h && !t7Var.L)) && !kcVar.J() && kcVar.f5423p2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        kc kcVar = this.f5144a.E0;
        nb nbVar = kcVar.B0;
        if (nbVar != null && !kcVar.S1 && !kcVar.P1 && nbVar.isInited() && kcVar.f5392f0 == 0 && kcVar.O1 != -1) {
            kcVar.B0.switchCamera();
            kcVar.O0.d(180.0f);
            kc.a0(kcVar.B0.isFrontface());
            if (kcVar.q0()) {
                kcVar.f5431s.c(null);
                return true;
            }
            kcVar.f5431s.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        nb nbVar = this.f5144a.E0.B0;
        if (nbVar != null) {
            nbVar.N = null;
            nbVar.K = -1L;
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        jc jcVar = this.f5144a;
        jcVar.C0 = 0.0f;
        jcVar.D0 = 0.0f;
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        t7 t7Var;
        nb nbVar;
        ba1 ba1Var;
        xb xbVar;
        boolean z10;
        boolean z11;
        jc jcVar = this.f5144a;
        kc kcVar = jcVar.E0;
        ValueAnimator valueAnimator = kcVar.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((t7Var = kcVar.D0) != null && (t7Var.f5995x.h || t7Var.L)) || kcVar.O0.f5247x0 || (((nbVar = kcVar.B0) != null && nbVar.f4890s) || jcVar.A0 || (((ba1Var = kcVar.V0) != null && (ba1Var.F || ba1Var.G)) || kcVar.I())))) {
            return false;
        }
        boolean z12 = true;
        jcVar.f5276y0 = true;
        if (kcVar.W) {
            if (Math.abs(kcVar.f5427r.f4842a) >= AndroidUtilities.dp(1.0f)) {
                if ((f10 > 0.0f && Math.abs(f10) > 2000.0f && Math.abs(f10) > Math.abs(f7)) || kcVar.K > 0.4f) {
                    kcVar.q(true);
                } else {
                    kc.c(kcVar);
                }
            } else if (kcVar.M0 != null && !kcVar.L0 && kcVar.O1 != -1) {
                if (Math.abs(f10) > 200.0f && (!kcVar.M0.d.canScrollVertically(-1) || !kcVar.K0)) {
                    if (!kcVar.Q1 && f10 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    kcVar.f(z11);
                } else {
                    if (!kcVar.Q1 && kcVar.M0.getTranslationY() < kcVar.M0.getPadding()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    kcVar.f(z10);
                }
            }
            kcVar.L0 = false;
            kcVar.W = false;
            kcVar.X = false;
            if (z12 && (xbVar = kcVar.A0) != null) {
                xbVar.d();
            }
            return z12;
        }
        z12 = false;
        kcVar.L0 = false;
        kcVar.W = false;
        kcVar.X = false;
        if (z12) {
            xbVar.d();
        }
        return z12;
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        throw new UnsupportedOperationException("Method not decompiled: ci.hc.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        nb nbVar = this.f5144a.E0.B0;
        if (nbVar != null) {
            c1 c1Var = nbVar.N;
            if (c1Var != null) {
                c1Var.run();
                nbVar.N = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        kc kcVar = this.f5144a.E0;
        kcVar.W = false;
        kcVar.X = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!kcVar.J() || motionEvent.getY() >= kcVar.M0.g()) {
            return false;
        }
        kcVar.f(false);
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

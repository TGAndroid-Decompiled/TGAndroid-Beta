package di;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fa1;
import org.telegram.ui.Components.y20;
public final class hc extends y20 {
    public final jc f7018a;

    public hc(jc jcVar) {
        this.f7018a = jcVar;
    }

    @Override
    public final boolean a() {
        nb nbVar;
        kc kcVar = this.f7018a.E0;
        if (kcVar.f7255f0 == 0 && (nbVar = kcVar.B0) != null && !kcVar.S1 && nbVar.isInited() && !kcVar.P1 && !kcVar.O0.f7079x0) {
            s7 s7Var = kcVar.D0;
            if ((s7Var == null || (!s7Var.f7783x.f23201i && !s7Var.L)) && !kcVar.I() && kcVar.f7286p2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        kc kcVar = this.f7018a.E0;
        nb nbVar = kcVar.B0;
        if (nbVar != null && !kcVar.S1 && !kcVar.P1 && nbVar.isInited() && kcVar.f7255f0 == 0 && kcVar.O1 != -1) {
            kcVar.B0.switchCamera();
            kcVar.O0.d(180.0f);
            kc.Z(kcVar.B0.isFrontface());
            if (kcVar.p0()) {
                kcVar.f7294s.c(null);
                return true;
            }
            kcVar.f7294s.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        nb nbVar = this.f7018a.E0.B0;
        if (nbVar != null) {
            nbVar.N = null;
            nbVar.K = -1L;
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        jc jcVar = this.f7018a;
        jcVar.C0 = 0.0f;
        jcVar.D0 = 0.0f;
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        s7 s7Var;
        nb nbVar;
        fa1 fa1Var;
        xb xbVar;
        boolean z10;
        boolean z11;
        jc jcVar = this.f7018a;
        kc kcVar = jcVar.E0;
        ValueAnimator valueAnimator = kcVar.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((s7Var = kcVar.D0) != null && (s7Var.f7783x.f23201i || s7Var.L)) || kcVar.O0.f7079x0 || (((nbVar = kcVar.B0) != null && nbVar.f6692s) || jcVar.A0 || (((fa1Var = kcVar.V0) != null && (fa1Var.F || fa1Var.G)) || kcVar.H())))) {
            return false;
        }
        boolean z12 = true;
        jcVar.f7147y0 = true;
        if (kcVar.W) {
            if (Math.abs(kcVar.f7290r.f6745a) >= AndroidUtilities.dp(1.0f)) {
                if ((f10 > 0.0f && Math.abs(f10) > 2000.0f && Math.abs(f10) > Math.abs(f7)) || kcVar.K > 0.4f) {
                    kcVar.p(true);
                } else {
                    kc.b(kcVar);
                }
            } else if (kcVar.M0 != null && !kcVar.L0 && kcVar.O1 != -1) {
                if (Math.abs(f10) > 200.0f && (!kcVar.M0.d.canScrollVertically(-1) || !kcVar.K0)) {
                    if (!kcVar.Q1 && f10 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    kcVar.e(z11);
                } else {
                    if (!kcVar.Q1 && kcVar.M0.getTranslationY() < kcVar.M0.getPadding()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    kcVar.e(z10);
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
        throw new UnsupportedOperationException("Method not decompiled: di.hc.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        nb nbVar = this.f7018a.E0.B0;
        if (nbVar != null) {
            b1 b1Var = nbVar.N;
            if (b1Var != null) {
                b1Var.run();
                nbVar.N = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        kc kcVar = this.f7018a.E0;
        kcVar.W = false;
        kcVar.X = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!kcVar.I() || motionEvent.getY() >= kcVar.M0.g()) {
            return false;
        }
        kcVar.e(false);
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

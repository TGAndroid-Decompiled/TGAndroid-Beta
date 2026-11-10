package fi;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.r71;
public final class sa extends b10 {
    public final ua f12820a;

    public sa(ua uaVar) {
        this.f12820a = uaVar;
    }

    @Override
    public final boolean a() {
        y9 y9Var;
        va vaVar = this.f12820a.f12910n0;
        if (vaVar.f12955f0 == 0 && (y9Var = vaVar.B0) != null && !vaVar.S1 && y9Var.isInited() && !vaVar.P1 && !vaVar.O0.f12107x0) {
            q6 q6Var = vaVar.D0;
            if ((q6Var == null || (!q6Var.f12678y.f34302i && !q6Var.L)) && !vaVar.I() && vaVar.f12985p2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        va vaVar = this.f12820a.f12910n0;
        y9 y9Var = vaVar.B0;
        if (y9Var != null && !vaVar.S1 && !vaVar.P1 && y9Var.isInited() && vaVar.f12955f0 == 0 && vaVar.O1 != -1) {
            vaVar.B0.switchCamera();
            vaVar.O0.d(180.0f);
            va.Z(vaVar.B0.isFrontface());
            if (vaVar.p0()) {
                vaVar.f12993s.c(null);
                return true;
            }
            vaVar.f12993s.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        y9 y9Var = this.f12820a.f12910n0.B0;
        if (y9Var != null) {
            y9Var.N = null;
            y9Var.K = -1L;
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        ua uaVar = this.f12820a;
        uaVar.f12909l0 = 0.0f;
        uaVar.m0 = 0.0f;
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        q6 q6Var;
        y9 y9Var;
        r71 r71Var;
        ia iaVar;
        boolean z9;
        boolean z10;
        ua uaVar = this.f12820a;
        va vaVar = uaVar.f12910n0;
        ValueAnimator valueAnimator = vaVar.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((q6Var = vaVar.D0) != null && (q6Var.f12678y.f34302i || q6Var.L)) || vaVar.O0.f12107x0 || (((y9Var = vaVar.B0) != null && y9Var.f11648s) || uaVar.f12907j0 || (((r71Var = vaVar.V0) != null && (r71Var.F || r71Var.G)) || vaVar.H())))) {
            return false;
        }
        boolean z11 = true;
        uaVar.f12905h0 = true;
        if (vaVar.W) {
            if (Math.abs(vaVar.f12989r.f12500a) >= org.telegram.messenger.g0.L(1.0f)) {
                if ((f11 > 0.0f && Math.abs(f11) > 2000.0f && Math.abs(f11) > Math.abs(f10)) || vaVar.K > 0.4f) {
                    vaVar.p(true);
                } else {
                    va.b(vaVar);
                }
            } else if (vaVar.M0 != null && !vaVar.L0 && vaVar.O1 != -1) {
                if (Math.abs(f11) > 200.0f && (!vaVar.M0.d.canScrollVertically(-1) || !vaVar.K0)) {
                    if (!vaVar.Q1 && f11 < 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    vaVar.e(z10);
                } else {
                    if (!vaVar.Q1 && vaVar.M0.getTranslationY() < vaVar.M0.getPadding()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    vaVar.e(z9);
                }
            }
            vaVar.L0 = false;
            vaVar.W = false;
            vaVar.X = false;
            if (z11 && (iaVar = vaVar.A0) != null) {
                iaVar.b();
            }
            return z11;
        }
        z11 = false;
        vaVar.L0 = false;
        vaVar.W = false;
        vaVar.X = false;
        if (z11) {
            iaVar.b();
        }
        return z11;
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        throw new UnsupportedOperationException("Method not decompiled: fi.sa.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        y9 y9Var = this.f12820a.f12910n0.B0;
        if (y9Var != null) {
            a1 a1Var = y9Var.N;
            if (a1Var != null) {
                a1Var.run();
                y9Var.N = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        va vaVar = this.f12820a.f12910n0;
        vaVar.W = false;
        vaVar.X = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!vaVar.I() || motionEvent.getY() >= vaVar.M0.g()) {
            return false;
        }
        vaVar.e(false);
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

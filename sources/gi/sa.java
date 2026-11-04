package gi;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.x00;
public final class sa extends x00 {
    public final ua f13581a;

    public sa(ua uaVar) {
        this.f13581a = uaVar;
    }

    @Override
    public final boolean a() {
        y9 y9Var;
        va vaVar = this.f13581a.f13674o0;
        if (vaVar.f13720g0 == 0 && (y9Var = vaVar.C0) != null && !vaVar.T1 && y9Var.isInited() && !vaVar.Q1 && !vaVar.P0.f12917y0) {
            r6 r6Var = vaVar.E0;
            if ((r6Var == null || (!r6Var.f13522y.f34049i && !r6Var.M)) && !vaVar.I() && vaVar.f13750q2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        va vaVar = this.f13581a.f13674o0;
        y9 y9Var = vaVar.C0;
        if (y9Var != null && !vaVar.T1 && !vaVar.Q1 && y9Var.isInited() && vaVar.f13720g0 == 0 && vaVar.P1 != -1) {
            vaVar.C0.switchCamera();
            vaVar.P0.d(180.0f);
            va.Z(vaVar.C0.isFrontface());
            if (vaVar.p0()) {
                vaVar.f13755s.c(null);
                return true;
            }
            vaVar.f13755s.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        y9 y9Var = this.f13581a.f13674o0.C0;
        if (y9Var != null) {
            y9Var.O = null;
            y9Var.L = -1L;
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        ua uaVar = this.f13581a;
        uaVar.m0 = 0.0f;
        uaVar.f13673n0 = 0.0f;
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        r6 r6Var;
        y9 y9Var;
        j71 j71Var;
        ia iaVar;
        boolean z10;
        boolean z11;
        ua uaVar = this.f13581a;
        va vaVar = uaVar.f13674o0;
        ValueAnimator valueAnimator = vaVar.F;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((r6Var = vaVar.E0) != null && (r6Var.f13522y.f34049i || r6Var.M)) || vaVar.P0.f12917y0 || (((y9Var = vaVar.C0) != null && y9Var.f12437s) || uaVar.f13671k0 || (((j71Var = vaVar.W0) != null && (j71Var.G || j71Var.H)) || vaVar.H())))) {
            return false;
        }
        boolean z12 = true;
        uaVar.f13669i0 = true;
        if (vaVar.X) {
            if (Math.abs(vaVar.f13751r.f13311a) >= org.telegram.messenger.g0.L(1.0f)) {
                if ((f11 > 0.0f && Math.abs(f11) > 2000.0f && Math.abs(f11) > Math.abs(f10)) || vaVar.L > 0.4f) {
                    vaVar.p(true);
                } else {
                    va.b(vaVar);
                }
            } else if (vaVar.N0 != null && !vaVar.M0 && vaVar.P1 != -1) {
                if (Math.abs(f11) > 200.0f && (!vaVar.N0.d.canScrollVertically(-1) || !vaVar.L0)) {
                    if (!vaVar.R1 && f11 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    vaVar.e(z11);
                } else {
                    if (!vaVar.R1 && vaVar.N0.getTranslationY() < vaVar.N0.getPadding()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    vaVar.e(z10);
                }
            }
            vaVar.M0 = false;
            vaVar.X = false;
            vaVar.Y = false;
            if (z12 && (iaVar = vaVar.B0) != null) {
                iaVar.b();
            }
            return z12;
        }
        z12 = false;
        vaVar.M0 = false;
        vaVar.X = false;
        vaVar.Y = false;
        if (z12) {
            iaVar.b();
        }
        return z12;
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        throw new UnsupportedOperationException("Method not decompiled: gi.sa.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        y9 y9Var = this.f13581a.f13674o0.C0;
        if (y9Var != null) {
            a1 a1Var = y9Var.O;
            if (a1Var != null) {
                a1Var.run();
                y9Var.O = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        va vaVar = this.f13581a.f13674o0;
        vaVar.X = false;
        vaVar.Y = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!vaVar.I() || motionEvent.getY() >= vaVar.N0.g()) {
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

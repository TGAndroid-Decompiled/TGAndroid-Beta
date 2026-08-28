package kh;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.w10;
public final class tb extends w10 {
    public final vb f16110a;

    public tb(vb vbVar) {
        this.f16110a = vbVar;
    }

    @Override
    public final boolean a() {
        za zaVar;
        wb wbVar = this.f16110a.A0;
        if (wbVar.f16250b0 == 0 && (zaVar = wbVar.f16322x0) != null && !wbVar.O1 && zaVar.isInited() && !wbVar.L1 && !wbVar.K0.f16454t0) {
            k7 k7Var = wbVar.f16329z0;
            if ((k7Var == null || (!k7Var.f15537x.h && !k7Var.H)) && !wbVar.J() && wbVar.f16284l2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        wb wbVar = this.f16110a.A0;
        za zaVar = wbVar.f16322x0;
        if (zaVar != null && !wbVar.O1 && !wbVar.L1 && zaVar.isInited() && wbVar.f16250b0 == 0 && wbVar.K1 != -1) {
            wbVar.f16322x0.switchCamera();
            wbVar.K0.d(180.0f);
            wb.a0(wbVar.f16322x0.isFrontface());
            if (wbVar.q0()) {
                wbVar.f16304s.c(null);
                return true;
            }
            wbVar.f16304s.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        za zaVar = this.f16110a.A0.f16322x0;
        if (zaVar != null) {
            zaVar.J = null;
            zaVar.G = -1L;
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        vb vbVar = this.f16110a;
        vbVar.f16219y0 = 0.0f;
        vbVar.f16220z0 = 0.0f;
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        k7 k7Var;
        za zaVar;
        i81 i81Var;
        jb jbVar;
        boolean z10;
        boolean z11;
        vb vbVar = this.f16110a;
        wb wbVar = vbVar.A0;
        ValueAnimator valueAnimator = wbVar.A;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((k7Var = wbVar.f16329z0) != null && (k7Var.f15537x.h || k7Var.H)) || wbVar.K0.f16454t0 || (((zaVar = wbVar.f16322x0) != null && zaVar.f15086s) || vbVar.f16217w0 || (((i81Var = wbVar.R0) != null && (i81Var.B || i81Var.C)) || wbVar.I())))) {
            return false;
        }
        boolean z12 = true;
        vbVar.f16215u0 = true;
        if (wbVar.S) {
            if (Math.abs(wbVar.f16300r.f15805a) >= AndroidUtilities.dp(1.0f)) {
                if ((f11 > 0.0f && Math.abs(f11) > 2000.0f && Math.abs(f11) > Math.abs(f10)) || wbVar.G > 0.4f) {
                    wbVar.q(true);
                } else {
                    wb.c(wbVar);
                }
            } else if (wbVar.I0 != null && !wbVar.H0 && wbVar.K1 != -1) {
                if (Math.abs(f11) > 200.0f && (!wbVar.I0.d.canScrollVertically(-1) || !wbVar.G0)) {
                    if (!wbVar.M1 && f11 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    wbVar.f(z11);
                } else {
                    if (!wbVar.M1 && wbVar.I0.getTranslationY() < wbVar.I0.getPadding()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    wbVar.f(z10);
                }
            }
            wbVar.H0 = false;
            wbVar.S = false;
            wbVar.T = false;
            if (z12 && (jbVar = wbVar.f16318w0) != null) {
                jbVar.d();
            }
            return z12;
        }
        z12 = false;
        wbVar.H0 = false;
        wbVar.S = false;
        wbVar.T = false;
        if (z12) {
            jbVar.d();
        }
        return z12;
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        throw new UnsupportedOperationException("Method not decompiled: kh.tb.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        za zaVar = this.f16110a.A0.f16322x0;
        if (zaVar != null) {
            c1 c1Var = zaVar.J;
            if (c1Var != null) {
                c1Var.run();
                zaVar.J = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        wb wbVar = this.f16110a.A0;
        wbVar.S = false;
        wbVar.T = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!wbVar.J() || motionEvent.getY() >= wbVar.I0.g()) {
            return false;
        }
        wbVar.f(false);
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

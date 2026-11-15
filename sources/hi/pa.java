package hi;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.s71;
public final class pa extends f10 {
    public final ra f14882a;

    public pa(ra raVar) {
        this.f14882a = raVar;
    }

    @Override
    public final boolean a() {
        v9 v9Var;
        sa saVar = this.f14882a.f15010o0;
        if (saVar.f15057g0 == 0 && (v9Var = saVar.C0) != null && !saVar.T1 && v9Var.isInited() && !saVar.Q1 && !saVar.P0.f14309y0) {
            p6 p6Var = saVar.E0;
            if ((p6Var == null || (!p6Var.f14866y.f33917i && !p6Var.M)) && !saVar.I() && saVar.f15087q2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        sa saVar = this.f14882a.f15010o0;
        v9 v9Var = saVar.C0;
        if (v9Var != null && !saVar.T1 && !saVar.Q1 && v9Var.isInited() && saVar.f15057g0 == 0 && saVar.P1 != -1) {
            saVar.C0.switchCamera();
            saVar.P0.d(180.0f);
            sa.Z(saVar.C0.isFrontface());
            if (saVar.p0()) {
                saVar.f15092s.c(null);
                return true;
            }
            saVar.f15092s.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        v9 v9Var = this.f14882a.f15010o0.C0;
        if (v9Var != null) {
            v9Var.O = null;
            v9Var.L = -1L;
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        ra raVar = this.f14882a;
        raVar.m0 = 0.0f;
        raVar.f15009n0 = 0.0f;
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        p6 p6Var;
        v9 v9Var;
        s71 s71Var;
        fa faVar;
        boolean z10;
        boolean z11;
        ra raVar = this.f14882a;
        sa saVar = raVar.f15010o0;
        ValueAnimator valueAnimator = saVar.F;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((p6Var = saVar.E0) != null && (p6Var.f14866y.f33917i || p6Var.M)) || saVar.P0.f14309y0 || (((v9Var = saVar.C0) != null && v9Var.f13966s) || raVar.f15007k0 || (((s71Var = saVar.W0) != null && (s71Var.G || s71Var.H)) || saVar.H())))) {
            return false;
        }
        boolean z12 = true;
        raVar.f15005i0 = true;
        if (saVar.X) {
            if (Math.abs(saVar.f15088r.f14523a) >= org.telegram.messenger.g0.L(1.0f)) {
                if ((f11 > 0.0f && Math.abs(f11) > 2000.0f && Math.abs(f11) > Math.abs(f10)) || saVar.L > 0.4f) {
                    saVar.p(true);
                } else {
                    sa.b(saVar);
                }
            } else if (saVar.N0 != null && !saVar.M0 && saVar.P1 != -1) {
                if (Math.abs(f11) > 200.0f && (!saVar.N0.d.canScrollVertically(-1) || !saVar.L0)) {
                    if (!saVar.R1 && f11 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    saVar.e(z11);
                } else {
                    if (!saVar.R1 && saVar.N0.getTranslationY() < saVar.N0.getPadding()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    saVar.e(z10);
                }
            }
            saVar.M0 = false;
            saVar.X = false;
            saVar.Y = false;
            if (z12 && (faVar = saVar.B0) != null) {
                faVar.b();
            }
            return z12;
        }
        z12 = false;
        saVar.M0 = false;
        saVar.X = false;
        saVar.Y = false;
        if (z12) {
            faVar.b();
        }
        return z12;
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        throw new UnsupportedOperationException("Method not decompiled: hi.pa.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        v9 v9Var = this.f14882a.f15010o0.C0;
        if (v9Var != null) {
            b1 b1Var = v9Var.O;
            if (b1Var != null) {
                b1Var.run();
                v9Var.O = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        sa saVar = this.f14882a.f15010o0;
        saVar.X = false;
        saVar.Y = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!saVar.I() || motionEvent.getY() >= saVar.N0.g()) {
            return false;
        }
        saVar.e(false);
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

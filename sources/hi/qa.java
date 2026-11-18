package hi;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.m10;
public final class qa extends m10 {
    public final sa f15297a;

    public qa(sa saVar) {
        this.f15297a = saVar;
    }

    @Override
    public final boolean a() {
        w9 w9Var;
        ta taVar = this.f15297a.f15401o0;
        if (taVar.f15445g0 == 0 && (w9Var = taVar.C0) != null && !taVar.T1 && w9Var.isInited() && !taVar.Q1 && !taVar.P0.f14595y0) {
            o6 o6Var = taVar.E0;
            if ((o6Var == null || (!o6Var.f15183y.f37434i && !o6Var.M)) && !taVar.I() && taVar.f15475q2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ta taVar = this.f15297a.f15401o0;
        w9 w9Var = taVar.C0;
        if (w9Var != null && !taVar.T1 && !taVar.Q1 && w9Var.isInited() && taVar.f15445g0 == 0 && taVar.P1 != -1) {
            taVar.C0.switchCamera();
            taVar.P0.d(180.0f);
            ta.Z(taVar.C0.isFrontface());
            if (taVar.p0()) {
                taVar.f15480s.c(null);
                return true;
            }
            taVar.f15480s.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        w9 w9Var = this.f15297a.f15401o0.C0;
        if (w9Var != null) {
            w9Var.O = null;
            w9Var.L = -1L;
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        sa saVar = this.f15297a;
        saVar.m0 = 0.0f;
        saVar.f15400n0 = 0.0f;
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        o6 o6Var;
        w9 w9Var;
        c81 c81Var;
        ga gaVar;
        boolean z10;
        boolean z11;
        sa saVar = this.f15297a;
        ta taVar = saVar.f15401o0;
        ValueAnimator valueAnimator = taVar.F;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((o6Var = taVar.E0) != null && (o6Var.f15183y.f37434i || o6Var.M)) || taVar.P0.f14595y0 || (((w9Var = taVar.C0) != null && w9Var.f14368s) || saVar.f15398k0 || (((c81Var = taVar.W0) != null && (c81Var.G || c81Var.H)) || taVar.H())))) {
            return false;
        }
        boolean z12 = true;
        saVar.f15396i0 = true;
        if (taVar.X) {
            if (Math.abs(taVar.f15476r.f14968a) >= org.telegram.messenger.g0.L(1.0f)) {
                if ((f11 > 0.0f && Math.abs(f11) > 2000.0f && Math.abs(f11) > Math.abs(f10)) || taVar.L > 0.4f) {
                    taVar.p(true);
                } else {
                    ta.b(taVar);
                }
            } else if (taVar.N0 != null && !taVar.M0 && taVar.P1 != -1) {
                if (Math.abs(f11) > 200.0f && (!taVar.N0.d.canScrollVertically(-1) || !taVar.L0)) {
                    if (!taVar.R1 && f11 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    taVar.e(z11);
                } else {
                    if (!taVar.R1 && taVar.N0.getTranslationY() < taVar.N0.getPadding()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    taVar.e(z10);
                }
            }
            taVar.M0 = false;
            taVar.X = false;
            taVar.Y = false;
            if (z12 && (gaVar = taVar.B0) != null) {
                gaVar.b();
            }
            return z12;
        }
        z12 = false;
        taVar.M0 = false;
        taVar.X = false;
        taVar.Y = false;
        if (z12) {
            gaVar.b();
        }
        return z12;
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        throw new UnsupportedOperationException("Method not decompiled: hi.qa.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        w9 w9Var = this.f15297a.f15401o0.C0;
        if (w9Var != null) {
            c1 c1Var = w9Var.O;
            if (c1Var != null) {
                c1Var.run();
                w9Var.O = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ta taVar = this.f15297a.f15401o0;
        taVar.X = false;
        taVar.Y = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!taVar.I() || motionEvent.getY() >= taVar.N0.g()) {
            return false;
        }
        taVar.e(false);
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

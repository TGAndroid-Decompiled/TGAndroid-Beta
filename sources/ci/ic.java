package ci;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.q91;
public final class ic extends m20 {
    public final kc f4797a;

    public ic(kc kcVar) {
        this.f4797a = kcVar;
    }

    @Override
    public final boolean a() {
        ob obVar;
        lc lcVar = this.f4797a.E0;
        if (lcVar.f5044f0 == 0 && (obVar = lcVar.B0) != null && !lcVar.S1 && obVar.isInited() && !lcVar.P1 && !lcVar.O0.f4859x0) {
            t7 t7Var = lcVar.D0;
            if ((t7Var == null || (!t7Var.f5564x.h && !t7Var.L)) && !lcVar.J() && lcVar.f5075p2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        lc lcVar = this.f4797a.E0;
        ob obVar = lcVar.B0;
        if (obVar != null && !lcVar.S1 && !lcVar.P1 && obVar.isInited() && lcVar.f5044f0 == 0 && lcVar.O1 != -1) {
            lcVar.B0.switchCamera();
            lcVar.O0.d(180.0f);
            lc.a0(lcVar.B0.isFrontface());
            if (lcVar.q0()) {
                lcVar.f5083s.c(null);
                return true;
            }
            lcVar.f5083s.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        ob obVar = this.f4797a.E0.B0;
        if (obVar != null) {
            obVar.N = null;
            obVar.K = -1L;
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        kc kcVar = this.f4797a;
        kcVar.C0 = 0.0f;
        kcVar.D0 = 0.0f;
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        t7 t7Var;
        ob obVar;
        q91 q91Var;
        yb ybVar;
        boolean z10;
        boolean z11;
        kc kcVar = this.f4797a;
        lc lcVar = kcVar.E0;
        ValueAnimator valueAnimator = lcVar.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((t7Var = lcVar.D0) != null && (t7Var.f5564x.h || t7Var.L)) || lcVar.O0.f4859x0 || (((obVar = lcVar.B0) != null && obVar.f4498s) || kcVar.A0 || (((q91Var = lcVar.V0) != null && (q91Var.F || q91Var.G)) || lcVar.I())))) {
            return false;
        }
        boolean z12 = true;
        kcVar.f4925y0 = true;
        if (lcVar.W) {
            if (Math.abs(lcVar.f5079r.f4551a) >= AndroidUtilities.dp(1.0f)) {
                if ((f10 > 0.0f && Math.abs(f10) > 2000.0f && Math.abs(f10) > Math.abs(f7)) || lcVar.K > 0.4f) {
                    lcVar.q(true);
                } else {
                    lc.c(lcVar);
                }
            } else if (lcVar.M0 != null && !lcVar.L0 && lcVar.O1 != -1) {
                if (Math.abs(f10) > 200.0f && (!lcVar.M0.d.canScrollVertically(-1) || !lcVar.K0)) {
                    if (!lcVar.Q1 && f10 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    lcVar.f(z11);
                } else {
                    if (!lcVar.Q1 && lcVar.M0.getTranslationY() < lcVar.M0.getPadding()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    lcVar.f(z10);
                }
            }
            lcVar.L0 = false;
            lcVar.W = false;
            lcVar.X = false;
            if (z12 && (ybVar = lcVar.A0) != null) {
                ybVar.d();
            }
            return z12;
        }
        z12 = false;
        lcVar.L0 = false;
        lcVar.W = false;
        lcVar.X = false;
        if (z12) {
            ybVar.d();
        }
        return z12;
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        throw new UnsupportedOperationException("Method not decompiled: ci.ic.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ob obVar = this.f4797a.E0.B0;
        if (obVar != null) {
            c1 c1Var = obVar.N;
            if (c1Var != null) {
                c1Var.run();
                obVar.N = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        lc lcVar = this.f4797a.E0;
        lcVar.W = false;
        lcVar.X = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!lcVar.J() || motionEvent.getY() >= lcVar.M0.g()) {
            return false;
        }
        lcVar.f(false);
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

package di;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.l20;
public final class mc extends l20 {
    public final oc f7692a;

    public mc(oc ocVar) {
        this.f7692a = ocVar;
    }

    @Override
    public final boolean a() {
        sb sbVar;
        pc pcVar = this.f7692a.E0;
        if (pcVar.f7888f0 == 0 && (sbVar = pcVar.B0) != null && !pcVar.S1 && sbVar.isInited() && !pcVar.P1 && !pcVar.O0.f7594x0) {
            w7 w7Var = pcVar.D0;
            if ((w7Var == null || (!w7Var.f8371x.h && !w7Var.L)) && !pcVar.J() && pcVar.f7919p2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        pc pcVar = this.f7692a.E0;
        sb sbVar = pcVar.B0;
        if (sbVar != null && !pcVar.S1 && !pcVar.P1 && sbVar.isInited() && pcVar.f7888f0 == 0 && pcVar.O1 != -1) {
            pcVar.B0.switchCamera();
            pcVar.O0.d(180.0f);
            pc.a0(pcVar.B0.isFrontface());
            if (pcVar.q0()) {
                pcVar.f7927s.c(null);
                return true;
            }
            pcVar.f7927s.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        sb sbVar = this.f7692a.E0.B0;
        if (sbVar != null) {
            sbVar.N = null;
            sbVar.K = -1L;
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        oc ocVar = this.f7692a;
        ocVar.C0 = 0.0f;
        ocVar.D0 = 0.0f;
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        w7 w7Var;
        sb sbVar;
        d91 d91Var;
        cc ccVar;
        boolean z10;
        boolean z11;
        oc ocVar = this.f7692a;
        pc pcVar = ocVar.E0;
        ValueAnimator valueAnimator = pcVar.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((w7Var = pcVar.D0) != null && (w7Var.f8371x.h || w7Var.L)) || pcVar.O0.f7594x0 || (((sbVar = pcVar.B0) != null && sbVar.f7075s) || ocVar.A0 || (((d91Var = pcVar.V0) != null && (d91Var.F || d91Var.G)) || pcVar.I())))) {
            return false;
        }
        boolean z12 = true;
        ocVar.f7834y0 = true;
        if (pcVar.W) {
            if (Math.abs(pcVar.f7923r.f7377a) >= AndroidUtilities.dp(1.0f)) {
                if ((f10 > 0.0f && Math.abs(f10) > 2000.0f && Math.abs(f10) > Math.abs(f7)) || pcVar.K > 0.4f) {
                    pcVar.q(true);
                } else {
                    pc.c(pcVar);
                }
            } else if (pcVar.M0 != null && !pcVar.L0 && pcVar.O1 != -1) {
                if (Math.abs(f10) > 200.0f && (!pcVar.M0.d.canScrollVertically(-1) || !pcVar.K0)) {
                    if (!pcVar.Q1 && f10 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    pcVar.f(z11);
                } else {
                    if (!pcVar.Q1 && pcVar.M0.getTranslationY() < pcVar.M0.getPadding()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    pcVar.f(z10);
                }
            }
            pcVar.L0 = false;
            pcVar.W = false;
            pcVar.X = false;
            if (z12 && (ccVar = pcVar.A0) != null) {
                ccVar.d();
            }
            return z12;
        }
        z12 = false;
        pcVar.L0 = false;
        pcVar.W = false;
        pcVar.X = false;
        if (z12) {
            ccVar.d();
        }
        return z12;
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        throw new UnsupportedOperationException("Method not decompiled: di.mc.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        sb sbVar = this.f7692a.E0.B0;
        if (sbVar != null) {
            c1 c1Var = sbVar.N;
            if (c1Var != null) {
                c1Var.run();
                sbVar.N = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        pc pcVar = this.f7692a.E0;
        pcVar.W = false;
        pcVar.X = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!pcVar.J() || motionEvent.getY() >= pcVar.M0.g()) {
            return false;
        }
        pcVar.f(false);
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

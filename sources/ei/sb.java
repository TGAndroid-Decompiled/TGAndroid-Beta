package ei;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.w91;
public final class sb extends u20 {
    public final ub f9824a;

    public sb(ub ubVar) {
        this.f9824a = ubVar;
    }

    @Override
    public final boolean a() {
        ya yaVar;
        vb vbVar = this.f9824a.E0;
        if (vbVar.f9968f0 == 0 && (yaVar = vbVar.B0) != null && !vbVar.S1 && yaVar.isInited() && !vbVar.P1 && !vbVar.O0.f10239x0) {
            j7 j7Var = vbVar.D0;
            if ((j7Var == null || (!j7Var.f9268x.f32613i && !j7Var.L)) && !vbVar.I() && vbVar.f9999p2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        vb vbVar = this.f9824a.E0;
        ya yaVar = vbVar.B0;
        if (yaVar != null && !vbVar.S1 && !vbVar.P1 && yaVar.isInited() && vbVar.f9968f0 == 0 && vbVar.O1 != -1) {
            vbVar.B0.switchCamera();
            vbVar.O0.d(180.0f);
            vb.Z(vbVar.B0.isFrontface());
            if (vbVar.p0()) {
                vbVar.f10007s.c(null);
                return true;
            }
            vbVar.f10007s.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        ya yaVar = this.f9824a.E0.B0;
        if (yaVar != null) {
            yaVar.N = null;
            yaVar.K = -1L;
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        ub ubVar = this.f9824a;
        ubVar.C0 = 0.0f;
        ubVar.D0 = 0.0f;
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        j7 j7Var;
        ya yaVar;
        w91 w91Var;
        ib ibVar;
        boolean z10;
        boolean z11;
        ub ubVar = this.f9824a;
        vb vbVar = ubVar.E0;
        ValueAnimator valueAnimator = vbVar.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((j7Var = vbVar.D0) != null && (j7Var.f9268x.f32613i || j7Var.L)) || vbVar.O0.f10239x0 || (((yaVar = vbVar.B0) != null && yaVar.f8816s) || ubVar.A0 || (((w91Var = vbVar.V0) != null && (w91Var.F || w91Var.G)) || vbVar.H())))) {
            return false;
        }
        boolean z12 = true;
        ubVar.f9920y0 = true;
        if (vbVar.W) {
            if (Math.abs(vbVar.f10003r.f9532a) >= AndroidUtilities.dp(1.0f)) {
                if ((f10 > 0.0f && Math.abs(f10) > 2000.0f && Math.abs(f10) > Math.abs(f7)) || vbVar.K > 0.4f) {
                    vbVar.p(true);
                } else {
                    vb.b(vbVar);
                }
            } else if (vbVar.M0 != null && !vbVar.L0 && vbVar.O1 != -1) {
                if (Math.abs(f10) > 200.0f && (!vbVar.M0.d.canScrollVertically(-1) || !vbVar.K0)) {
                    if (!vbVar.Q1 && f10 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    vbVar.e(z11);
                } else {
                    if (!vbVar.Q1 && vbVar.M0.getTranslationY() < vbVar.M0.getPadding()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    vbVar.e(z10);
                }
            }
            vbVar.L0 = false;
            vbVar.W = false;
            vbVar.X = false;
            if (z12 && (ibVar = vbVar.A0) != null) {
                ibVar.d();
            }
            return z12;
        }
        z12 = false;
        vbVar.L0 = false;
        vbVar.W = false;
        vbVar.X = false;
        if (z12) {
            ibVar.d();
        }
        return z12;
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        throw new UnsupportedOperationException("Method not decompiled: ei.sb.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ya yaVar = this.f9824a.E0.B0;
        if (yaVar != null) {
            b1 b1Var = yaVar.N;
            if (b1Var != null) {
                b1Var.run();
                yaVar.N = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        vb vbVar = this.f9824a.E0;
        vbVar.W = false;
        vbVar.X = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!vbVar.I() || motionEvent.getY() >= vbVar.M0.g()) {
            return false;
        }
        vbVar.e(false);
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

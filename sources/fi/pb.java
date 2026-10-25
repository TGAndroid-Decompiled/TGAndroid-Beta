package fi;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fc1;
import org.telegram.ui.Components.w20;
public final class pb extends w20 {
    public final rb f11452a;

    public pb(rb rbVar) {
        this.f11452a = rbVar;
    }

    @Override
    public final boolean a() {
        va vaVar;
        sb sbVar = this.f11452a.f11568t0;
        if (sbVar.f11623f0 == 0 && (vaVar = sbVar.B0) != null && !sbVar.S1 && vaVar.isInited() && !sbVar.P1 && !sbVar.O0.f11884x0) {
            g7 g7Var = sbVar.D0;
            if ((g7Var == null || (!g7Var.f10916x.f34687i && !g7Var.L)) && !sbVar.I() && sbVar.f11654p2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        sb sbVar = this.f11452a.f11568t0;
        va vaVar = sbVar.B0;
        if (vaVar != null && !sbVar.S1 && !sbVar.P1 && vaVar.isInited() && sbVar.f11623f0 == 0 && sbVar.O1 != -1) {
            sbVar.B0.switchCamera();
            sbVar.O0.d(180.0f);
            sb.Z(sbVar.B0.isFrontface());
            if (sbVar.p0()) {
                sbVar.f11662s.c(null);
                return true;
            }
            sbVar.f11662s.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        va vaVar = this.f11452a.f11568t0.B0;
        if (vaVar != null) {
            vaVar.N = null;
            vaVar.K = -1L;
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        rb rbVar = this.f11452a;
        rbVar.f11566r0 = 0.0f;
        rbVar.f11567s0 = 0.0f;
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        g7 g7Var;
        va vaVar;
        fc1 fc1Var;
        fb fbVar;
        boolean z10;
        boolean z11;
        rb rbVar = this.f11452a;
        sb sbVar = rbVar.f11568t0;
        ValueAnimator valueAnimator = sbVar.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((g7Var = sbVar.D0) != null && (g7Var.f10916x.f34687i || g7Var.L)) || sbVar.O0.f11884x0 || (((vaVar = sbVar.B0) != null && vaVar.f10600s) || rbVar.f11564p0 || (((fc1Var = sbVar.V0) != null && (fc1Var.F || fc1Var.G)) || sbVar.H())))) {
            return false;
        }
        boolean z12 = true;
        rbVar.f11562n0 = true;
        if (sbVar.W) {
            if (Math.abs(sbVar.f11658r.f11135a) >= AndroidUtilities.dp(1.0f)) {
                if ((f10 > 0.0f && Math.abs(f10) > 2000.0f && Math.abs(f10) > Math.abs(f7)) || sbVar.K > 0.4f) {
                    sbVar.p(true);
                } else {
                    sb.b(sbVar);
                }
            } else if (sbVar.M0 != null && !sbVar.L0 && sbVar.O1 != -1) {
                if (Math.abs(f10) > 200.0f && (!sbVar.M0.d.canScrollVertically(-1) || !sbVar.K0)) {
                    if (!sbVar.Q1 && f10 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    sbVar.e(z11);
                } else {
                    if (!sbVar.Q1 && sbVar.M0.getTranslationY() < sbVar.M0.getPadding()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    sbVar.e(z10);
                }
            }
            sbVar.L0 = false;
            sbVar.W = false;
            sbVar.X = false;
            if (z12 && (fbVar = sbVar.A0) != null) {
                fbVar.d();
            }
            return z12;
        }
        z12 = false;
        sbVar.L0 = false;
        sbVar.W = false;
        sbVar.X = false;
        if (z12) {
            fbVar.d();
        }
        return z12;
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        throw new UnsupportedOperationException("Method not decompiled: fi.pb.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        va vaVar = this.f11452a.f11568t0.B0;
        if (vaVar != null) {
            b1 b1Var = vaVar.N;
            if (b1Var != null) {
                b1Var.run();
                vaVar.N = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        sb sbVar = this.f11452a.f11568t0;
        sbVar.W = false;
        sbVar.X = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!sbVar.I() || motionEvent.getY() >= sbVar.M0.g()) {
            return false;
        }
        sbVar.e(false);
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

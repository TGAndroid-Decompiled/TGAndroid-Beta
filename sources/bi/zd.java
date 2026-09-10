package bi;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.u20;
public final class zd extends u20 {
    public final be f4026a;

    public zd(be beVar) {
        this.f4026a = beVar;
    }

    @Override
    public final boolean a() {
        bd bdVar;
        ce ceVar = this.f4026a.E0;
        if (ceVar.f2448f0 == 0 && (bdVar = ceVar.B0) != null && !ceVar.S1 && bdVar.isInited() && !ceVar.P1 && !ceVar.O0.f3135x0) {
            x8 x8Var = ceVar.D0;
            if ((x8Var == null || (!x8Var.f3928x.h && !x8Var.L)) && !ceVar.J() && ceVar.f2479p2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ce ceVar = this.f4026a.E0;
        bd bdVar = ceVar.B0;
        if (bdVar != null && !ceVar.S1 && !ceVar.P1 && bdVar.isInited() && ceVar.f2448f0 == 0 && ceVar.O1 != -1) {
            ceVar.B0.switchCamera();
            ceVar.O0.d(180.0f);
            ce.a0(ceVar.B0.isFrontface());
            if (ceVar.q0()) {
                ceVar.f2487s.c(null);
                return true;
            }
            ceVar.f2487s.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        bd bdVar = this.f4026a.E0.B0;
        if (bdVar != null) {
            bdVar.N = null;
            bdVar.K = -1L;
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        be beVar = this.f4026a;
        beVar.C0 = 0.0f;
        beVar.D0 = 0.0f;
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        x8 x8Var;
        bd bdVar;
        q91 q91Var;
        md mdVar;
        boolean z10;
        boolean z11;
        be beVar = this.f4026a;
        ce ceVar = beVar.E0;
        ValueAnimator valueAnimator = ceVar.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((x8Var = ceVar.D0) != null && (x8Var.f3928x.h || x8Var.L)) || ceVar.O0.f3135x0 || (((bdVar = ceVar.B0) != null && bdVar.f2845s) || beVar.A0 || (((q91Var = ceVar.V0) != null && (q91Var.F || q91Var.G)) || ceVar.I())))) {
            return false;
        }
        boolean z12 = true;
        beVar.f2386y0 = true;
        if (ceVar.W) {
            if (Math.abs(ceVar.f2483r.f3694a) >= AndroidUtilities.dp(1.0f)) {
                if ((f10 > 0.0f && Math.abs(f10) > 2000.0f && Math.abs(f10) > Math.abs(f7)) || ceVar.K > 0.4f) {
                    ceVar.q(true);
                } else {
                    ce.c(ceVar);
                }
            } else if (ceVar.M0 != null && !ceVar.L0 && ceVar.O1 != -1) {
                if (Math.abs(f10) > 200.0f && (!ceVar.M0.d.canScrollVertically(-1) || !ceVar.K0)) {
                    if (!ceVar.Q1 && f10 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ceVar.f(z11);
                } else {
                    if (!ceVar.Q1 && ceVar.M0.getTranslationY() < ceVar.M0.getPadding()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ceVar.f(z10);
                }
            }
            ceVar.L0 = false;
            ceVar.W = false;
            ceVar.X = false;
            if (z12 && (mdVar = ceVar.A0) != null) {
                mdVar.d();
            }
            return z12;
        }
        z12 = false;
        ceVar.L0 = false;
        ceVar.W = false;
        ceVar.X = false;
        if (z12) {
            mdVar.d();
        }
        return z12;
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        throw new UnsupportedOperationException("Method not decompiled: bi.zd.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        bd bdVar = this.f4026a.E0.B0;
        if (bdVar != null) {
            h1 h1Var = bdVar.N;
            if (h1Var != null) {
                h1Var.run();
                bdVar.N = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ce ceVar = this.f4026a.E0;
        ceVar.W = false;
        ceVar.X = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!ceVar.J() || motionEvent.getY() >= ceVar.M0.g()) {
            return false;
        }
        ceVar.f(false);
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

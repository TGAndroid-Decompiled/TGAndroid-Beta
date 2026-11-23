package hi;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.n10;
public final class kb extends n10 {
    public final mb f14801a;

    public kb(mb mbVar) {
        this.f14801a = mbVar;
    }

    @Override
    public final boolean a() {
        qa qaVar;
        nb nbVar = this.f14801a.f14926o0;
        if (nbVar.f15076g0 == 0 && (qaVar = nbVar.C0) != null && !nbVar.T1 && qaVar.isInited() && !nbVar.Q1 && !nbVar.P0.f15047y0) {
            x6 x6Var = nbVar.E0;
            if ((x6Var == null || (!x6Var.f15732y.f37109i && !x6Var.M)) && !nbVar.I() && nbVar.f15106q2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        nb nbVar = this.f14801a.f14926o0;
        qa qaVar = nbVar.C0;
        if (qaVar != null && !nbVar.T1 && !nbVar.Q1 && qaVar.isInited() && nbVar.f15076g0 == 0 && nbVar.P1 != -1) {
            nbVar.C0.switchCamera();
            nbVar.P0.d(180.0f);
            nb.Z(nbVar.C0.isFrontface());
            if (nbVar.p0()) {
                nbVar.f15111s.c(null);
                return true;
            }
            nbVar.f15111s.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        qa qaVar = this.f14801a.f14926o0.C0;
        if (qaVar != null) {
            qaVar.O = null;
            qaVar.L = -1L;
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        mb mbVar = this.f14801a;
        mbVar.m0 = 0.0f;
        mbVar.f14925n0 = 0.0f;
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        x6 x6Var;
        qa qaVar;
        g81 g81Var;
        ab abVar;
        boolean z10;
        boolean z11;
        mb mbVar = this.f14801a;
        nb nbVar = mbVar.f14926o0;
        ValueAnimator valueAnimator = nbVar.F;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((x6Var = nbVar.E0) != null && (x6Var.f15732y.f37109i || x6Var.M)) || nbVar.P0.f15047y0 || (((qaVar = nbVar.C0) != null && qaVar.f14818s) || mbVar.f14923k0 || (((g81Var = nbVar.W0) != null && (g81Var.G || g81Var.H)) || nbVar.H())))) {
            return false;
        }
        boolean z12 = true;
        mbVar.f14921i0 = true;
        if (nbVar.X) {
            if (Math.abs(nbVar.f15107r.f14508a) >= org.telegram.messenger.g0.L(1.0f)) {
                if ((f11 > 0.0f && Math.abs(f11) > 2000.0f && Math.abs(f11) > Math.abs(f10)) || nbVar.L > 0.4f) {
                    nbVar.p(true);
                } else {
                    nb.b(nbVar);
                }
            } else if (nbVar.N0 != null && !nbVar.M0 && nbVar.P1 != -1) {
                if (Math.abs(f11) > 200.0f && (!nbVar.N0.d.canScrollVertically(-1) || !nbVar.L0)) {
                    if (!nbVar.R1 && f11 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    nbVar.e(z11);
                } else {
                    if (!nbVar.R1 && nbVar.N0.getTranslationY() < nbVar.N0.getPadding()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    nbVar.e(z10);
                }
            }
            nbVar.M0 = false;
            nbVar.X = false;
            nbVar.Y = false;
            if (z12 && (abVar = nbVar.B0) != null) {
                abVar.b();
            }
            return z12;
        }
        z12 = false;
        nbVar.M0 = false;
        nbVar.X = false;
        nbVar.Y = false;
        if (z12) {
            abVar.b();
        }
        return z12;
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        throw new UnsupportedOperationException("Method not decompiled: hi.kb.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        qa qaVar = this.f14801a.f14926o0.C0;
        if (qaVar != null) {
            k1 k1Var = qaVar.O;
            if (k1Var != null) {
                k1Var.run();
                qaVar.O = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        nb nbVar = this.f14801a.f14926o0;
        nbVar.X = false;
        nbVar.Y = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!nbVar.I() || motionEvent.getY() >= nbVar.N0.g()) {
            return false;
        }
        nbVar.e(false);
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

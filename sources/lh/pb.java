package lh;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.z10;

public final class pb extends z10 {

    public final rb f16547a;

    public pb(rb rbVar) {
        this.f16547a = rbVar;
    }

    @Override
    public final boolean a() {
        wa waVar;
        sb sbVar = this.f16547a.A0;
        if (sbVar.f16746b0 != 0 || (waVar = sbVar.f16818x0) == null || sbVar.O1 || !waVar.isInited() || sbVar.L1 || sbVar.K0.f17110t0) {
            return false;
        }
        i7 i7Var = sbVar.f16825z0;
        return (i7Var == null || !(i7Var.f16126x.h || i7Var.H)) && !sbVar.J() && sbVar.f16780l2 == null;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        sb sbVar = this.f16547a.A0;
        wa waVar = sbVar.f16818x0;
        if (waVar == null || sbVar.O1 || sbVar.L1 || !waVar.isInited() || sbVar.f16746b0 != 0 || sbVar.K1 == -1) {
            return false;
        }
        sbVar.f16818x0.switchCamera();
        sbVar.K0.d(180.0f);
        sb.a0(sbVar.f16818x0.isFrontface());
        if (sbVar.q0()) {
            sbVar.f16800s.c(null);
            return true;
        }
        sbVar.f16800s.d();
        return true;
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        wa waVar = this.f16547a.A0.f16818x0;
        if (waVar == null) {
            return false;
        }
        waVar.J = null;
        waVar.G = -1L;
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        rb rbVar = this.f16547a;
        rbVar.f16686y0 = 0.0f;
        rbVar.f16687z0 = 0.0f;
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i7 i7Var;
        wa waVar;
        k81 k81Var;
        gb gbVar;
        rb rbVar = this.f16547a;
        sb sbVar = rbVar.A0;
        ValueAnimator valueAnimator = sbVar.A;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((i7Var = sbVar.f16825z0) != null && (i7Var.f16126x.h || i7Var.H)) || sbVar.K0.f17110t0 || (((waVar = sbVar.f16818x0) != null && waVar.f15728s) || rbVar.f16684w0 || (((k81Var = sbVar.R0) != null && (k81Var.B || k81Var.C)) || sbVar.I())))) {
            return false;
        }
        boolean z10 = true;
        rbVar.f16682u0 = true;
        if (!sbVar.S) {
            z10 = false;
        } else if (Math.abs(sbVar.f16796r.f16260a) >= AndroidUtilities.dp(1.0f)) {
            if ((f11 <= 0.0f || Math.abs(f11) <= 2000.0f || Math.abs(f11) <= Math.abs(f10)) && sbVar.G <= 0.4f) {
                sb.c(sbVar);
            } else {
                sbVar.q(true);
            }
        } else if (sbVar.I0 == null || sbVar.H0 || sbVar.K1 == -1) {
            z10 = false;
        } else if (Math.abs(f11) <= 200.0f || (sbVar.I0.d.canScrollVertically(-1) && sbVar.G0)) {
            sbVar.f(!sbVar.M1 && sbVar.I0.getTranslationY() < ((float) sbVar.I0.getPadding()));
        } else {
            sbVar.f(!sbVar.M1 && f11 < 0.0f);
        }
        sbVar.H0 = false;
        sbVar.S = false;
        sbVar.T = false;
        if (z10 && (gbVar = sbVar.f16814w0) != null) {
            gbVar.d();
        }
        return z10;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i7 i7Var;
        wa waVar;
        k81 k81Var;
        rb rbVar = this.f16547a;
        sb sbVar = rbVar.A0;
        ValueAnimator valueAnimator = sbVar.A;
        if ((valueAnimator != null && valueAnimator.isRunning()) || sbVar.f16778k2 != null || sbVar.f16775j2 != null || (((i7Var = sbVar.f16825z0) != null && (i7Var.f16126x.h || i7Var.H)) || sbVar.K0.f17110t0 || (((waVar = sbVar.f16818x0) != null && waVar.f15728s) || rbVar.f16684w0 || (((k81Var = sbVar.R0) != null && (k81Var.B || k81Var.C)) || sbVar.I() || sbVar.M1 || sbVar.L1 || sbVar.f16746b0 != 0)))) {
            return false;
        }
        if (!sbVar.T) {
            float f12 = rbVar.f16686y0 + f11;
            rbVar.f16686y0 = f12;
            if (!sbVar.S && Math.abs(f12) >= AndroidUtilities.touchSlop) {
                gb gbVar = sbVar.f16814w0;
                if (gbVar != null) {
                    gbVar.d();
                }
                sbVar.S = true;
            }
        }
        if (sbVar.S) {
            int measuredHeight = (sbVar.f16783n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
            sa saVar = sbVar.I0;
            if (saVar != null) {
                float f13 = measuredHeight;
                if (saVar.getTranslationY() >= f13) {
                    rbVar.f16685x0 = sbVar.f16796r.f16260a;
                } else {
                    rbVar.f16685x0 = sbVar.I0.getTranslationY() - f13;
                }
            } else {
                rbVar.f16685x0 = sbVar.f16796r.f16260a;
            }
            sa saVar2 = sbVar.I0;
            if (saVar2 != null && saVar2.d.canScrollVertically(-1)) {
                f11 = Math.max(0.0f, f11);
            }
            float f14 = rbVar.f16685x0 - f11;
            rbVar.f16685x0 = f14;
            float fMax = Math.max(-measuredHeight, f14);
            rbVar.f16685x0 = fMax;
            if (sbVar.f16746b0 == 1) {
                rbVar.f16685x0 = Math.max(0.0f, fMax);
            }
            float f15 = rbVar.f16685x0;
            if (f15 >= 0.0f) {
                sbVar.f16796r.setTranslationY(f15);
                sa saVar3 = sbVar.I0;
                if (saVar3 != null) {
                    saVar3.setTranslationY(measuredHeight);
                }
            } else {
                sbVar.f16796r.setTranslationY(0.0f);
                if (sbVar.I0 == null) {
                    sbVar.t(false);
                }
                sbVar.I0.setTranslationY(measuredHeight + rbVar.f16685x0);
            }
        }
        if (!sbVar.S) {
            float f16 = rbVar.f16687z0 + f10;
            rbVar.f16687z0 = f16;
            if (!sbVar.T && Math.abs(f16) >= AndroidUtilities.touchSlop) {
                gb gbVar2 = sbVar.f16814w0;
                if (gbVar2 != null) {
                    gbVar2.d();
                }
                sbVar.T = true;
            }
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        wa waVar = this.f16547a.A0.f16818x0;
        if (waVar == null) {
            return false;
        }
        b1 b1Var = waVar.J;
        if (b1Var == null) {
            return true;
        }
        b1Var.run();
        waVar.J = null;
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        sb sbVar = this.f16547a.A0;
        sbVar.S = false;
        sbVar.T = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!sbVar.J() || motionEvent.getY() >= sbVar.I0.g()) {
            return false;
        }
        sbVar.f(false);
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

package fi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.v61;
import org.telegram.ui.an;
import org.telegram.ui.bm0;
import org.telegram.ui.g81;
import org.telegram.ui.hm0;
import org.telegram.ui.ly0;
import org.telegram.ui.ny0;
import org.telegram.ui.oy0;
import org.telegram.ui.zr0;
public final class g1 extends v61 {
    public final int V;
    public final Object W;

    public g1(int i7, Context context, Object obj) {
        super(context, null);
        this.V = i7;
        this.W = obj;
    }

    @Override
    public void A(int i7) {
        switch (this.V) {
            case 3:
                if (i7 == 0) {
                    an anVar = (an) this.W;
                    if (anVar.G1) {
                        anVar.G1 = false;
                        anVar.E1.h.clear();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public int H() {
        switch (this.V) {
            case 9:
                return 12;
            default:
                return super.H();
        }
    }

    @Override
    public boolean b(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: fi.g1.b(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean j(MotionEvent motionEvent) {
        switch (this.V) {
            case 2:
                if (getCurrentPosition() != 2) {
                    return true;
                }
                return false;
            default:
                return super.j(motionEvent);
        }
    }

    @Override
    public boolean k(MotionEvent motionEvent) {
        switch (this.V) {
            case 2:
                return false;
            case 6:
                return false;
            default:
                return super.k(motionEvent);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.V) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void t(View view, View view2, int i7, int i10) {
        switch (this.V) {
            case 1:
                s8 s8Var = (s8) this.W;
                if (s8Var.d) {
                    s8Var.M0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void u() {
        switch (this.V) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((ii.d0) this.W).f15510r1.d.f37190f3.O(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void v() {
        ly0 ly0Var;
        switch (this.V) {
            case 6:
                if ((getCurrentView() instanceof ny0) && (ly0Var = ((ny0) getCurrentView()).f48173n) != null) {
                    org.telegram.messenger.g0.v1(ly0Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void w(boolean z9) {
        switch (this.V) {
            case 0:
                k2 k2Var = (k2) this.W;
                g1 g1Var = k2Var.f12255m1;
                j2 j2Var = k2Var.n1;
                if (j2Var != null) {
                    j2Var.F = g1Var.getPositionAnimated();
                    j2Var.invalidate();
                }
                k2Var.f28619b.invalidate();
                invalidate();
                k2.f12251y1 = g1Var.getCurrentPosition();
                return;
            case 1:
                ((s8) this.W).f28619b.invalidate();
                return;
            case 2:
                ((ii.d0) this.W).f28619b.invalidate();
                return;
            case 3:
                an anVar = (an) this.W;
                anVar.l1.getClass();
                anVar.l1.getClass();
                anVar.z7();
                return;
            case 4:
                hm0 hm0Var = (hm0) this.W;
                float positionAnimated = hm0Var.I.getPositionAnimated();
                hm0Var.M.setSelected(positionAnimated);
                hm0Var.f46455e.setProgressToGradient(1.0f - c8.j9.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                hm0Var.K0();
                bm0 H0 = hm0Var.H0();
                d dVar = hm0Var.Q;
                if (dVar != null && H0 != null && H0 != hm0Var.R) {
                    hm0Var.R = H0;
                    j2.n nVar = H0.f44436e;
                    dVar.i((CharSequence) nVar.f16456b, true, true);
                    hm0Var.Q.g((SpannableStringBuilder) nVar.f16457c, true);
                    return;
                }
                return;
            case 5:
                ((zr0) this.W).e();
                return;
            case 6:
                ((oy0) this.W).f28619b.invalidate();
                return;
            case 7:
                ((g81) this.W).e();
                return;
            case 8:
                ((org.telegram.ui.Wallet.y2) this.W).f28619b.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.x5 x5Var = (org.telegram.ui.Wallet.x5) this.W;
                x5Var.Z0();
                org.telegram.ui.Wallet.b8 b8Var = x5Var.f43342j0;
                if (b8Var != null && b8Var.f42236h1) {
                    b8Var.f0();
                    return;
                }
                return;
        }
    }

    @Override
    public void y(int i7) {
        org.telegram.ui.Wallet.s8 s8Var;
        switch (this.V) {
            case 9:
                org.telegram.ui.Wallet.x5 x5Var = (org.telegram.ui.Wallet.x5) this.W;
                x5Var.f43336e0 = i7;
                if (i7 != 1 && (s8Var = x5Var.f43341i0) != null) {
                    s8Var.b(false);
                }
                if (i7 == 1) {
                    x5Var.f43348p0.post(new org.telegram.ui.Wallet.e4(x5Var, 13));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public g1(org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, f6Var);
        this.V = i7;
        this.W = f2Var;
    }
}

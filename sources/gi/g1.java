package gi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import b8.be;
import org.telegram.ui.Components.n61;
import org.telegram.ui.by0;
import org.telegram.ui.cm0;
import org.telegram.ui.dy0;
import org.telegram.ui.ey0;
import org.telegram.ui.pr0;
import org.telegram.ui.w71;
import org.telegram.ui.wl0;
import org.telegram.ui.wm;
public final class g1 extends n61 {
    public final int W;
    public final Object f12822a0;

    public g1(int i3, Context context, Object obj) {
        super(context, null);
        this.W = i3;
        this.f12822a0 = obj;
    }

    @Override
    public int G() {
        switch (this.W) {
            case 9:
                return 12;
            default:
                return super.G();
        }
    }

    @Override
    public boolean c(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: gi.g1.c(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean e(MotionEvent motionEvent) {
        switch (this.W) {
            case 2:
                if (getCurrentPosition() != 2) {
                    return true;
                }
                return false;
            default:
                return super.e(motionEvent);
        }
    }

    @Override
    public boolean f(MotionEvent motionEvent) {
        switch (this.W) {
            case 2:
                return false;
            case 6:
                return false;
            default:
                return super.f(motionEvent);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.W) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void r(View view, View view2, int i3, int i10) {
        switch (this.W) {
            case 1:
                t8 t8Var = (t8) this.f12822a0;
                if (t8Var.d) {
                    t8Var.M0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void s() {
        switch (this.W) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((ji.b0) this.f12822a0).f16271s1.d.f35594g3.O(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void t() {
        by0 by0Var;
        switch (this.W) {
            case 6:
                if ((getCurrentView() instanceof dy0) && (by0Var = ((dy0) getCurrentView()).f44833n) != null) {
                    org.telegram.messenger.g0.v1(by0Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void u(boolean z10) {
        switch (this.W) {
            case 0:
                i2 i2Var = (i2) this.f12822a0;
                g1 g1Var = i2Var.f12953n1;
                h2 h2Var = i2Var.f12954o1;
                if (h2Var != null) {
                    h2Var.G = g1Var.getPositionAnimated();
                    h2Var.invalidate();
                }
                i2Var.f28586b.invalidate();
                invalidate();
                i2.f12950z1 = g1Var.getCurrentPosition();
                return;
            case 1:
                ((t8) this.f12822a0).f28586b.invalidate();
                return;
            case 2:
                ((ji.b0) this.f12822a0).f28586b.invalidate();
                return;
            case 3:
                wm wmVar = (wm) this.f12822a0;
                wmVar.m1.getClass();
                wmVar.m1.getClass();
                wmVar.z7();
                return;
            case 4:
                cm0 cm0Var = (cm0) this.f12822a0;
                float positionAnimated = cm0Var.J.getPositionAnimated();
                cm0Var.N.setSelected(positionAnimated);
                cm0Var.f44395e.setProgressToGradient(1.0f - be.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                cm0Var.K0();
                wl0 H0 = cm0Var.H0();
                d dVar = cm0Var.R;
                if (dVar != null && H0 != null && H0 != cm0Var.S) {
                    cm0Var.S = H0;
                    mi.h0 h0Var = H0.f51207e;
                    dVar.i((CharSequence) h0Var.f19644b, true, true);
                    cm0Var.R.g((SpannableStringBuilder) h0Var.f19645c, true);
                    return;
                }
                return;
            case 5:
                ((pr0) this.f12822a0).e();
                return;
            case 6:
                ((ey0) this.f12822a0).f28586b.invalidate();
                return;
            case 7:
                ((w71) this.f12822a0).e();
                return;
            case 8:
                ((org.telegram.ui.Wallet.x2) this.f12822a0).f28586b.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.f12822a0;
                w5Var.Z0();
                org.telegram.ui.Wallet.b8 b8Var = w5Var.f43331k0;
                if (b8Var != null && b8Var.f42310i1) {
                    b8Var.f0();
                    return;
                }
                return;
        }
    }

    @Override
    public void x(int i3) {
        org.telegram.ui.Wallet.s8 s8Var;
        switch (this.W) {
            case 9:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.f12822a0;
                w5Var.f43326f0 = i3;
                if (i3 != 1 && (s8Var = w5Var.f43330j0) != null) {
                    s8Var.b(false);
                }
                if (i3 == 1) {
                    w5Var.f43337q0.post(new org.telegram.ui.Wallet.d4(w5Var, 13));
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void z(int i3) {
        switch (this.W) {
            case 3:
                if (i3 == 0) {
                    wm wmVar = (wm) this.f12822a0;
                    if (wmVar.H1) {
                        wmVar.H1 = false;
                        wmVar.F1.h.clear();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public g1(org.telegram.ui.ActionBar.d2 d2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var);
        this.W = i3;
        this.f12822a0 = d2Var;
    }
}

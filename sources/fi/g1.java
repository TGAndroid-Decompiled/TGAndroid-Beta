package fi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.w61;
import org.telegram.ui.bs0;
import org.telegram.ui.cn;
import org.telegram.ui.dm0;
import org.telegram.ui.h81;
import org.telegram.ui.jm0;
import org.telegram.ui.oy0;
import org.telegram.ui.qy0;
import org.telegram.ui.ry0;
public final class g1 extends w61 {
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
                    cn cnVar = (cn) this.W;
                    if (cnVar.G1) {
                        cnVar.G1 = false;
                        cnVar.E1.h.clear();
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
                    ((ii.d0) this.W).f15510r1.d.f37556f3.O(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void v() {
        oy0 oy0Var;
        switch (this.V) {
            case 6:
                if ((getCurrentView() instanceof qy0) && (oy0Var = ((qy0) getCurrentView()).f49221n) != null) {
                    org.telegram.messenger.g0.v1(oy0Var);
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
                k2Var.f28624b.invalidate();
                invalidate();
                k2.f12251y1 = g1Var.getCurrentPosition();
                return;
            case 1:
                ((s8) this.W).f28624b.invalidate();
                return;
            case 2:
                ((ii.d0) this.W).f28624b.invalidate();
                return;
            case 3:
                cn cnVar = (cn) this.W;
                cnVar.l1.getClass();
                cnVar.l1.getClass();
                cnVar.A7();
                return;
            case 4:
                jm0 jm0Var = (jm0) this.W;
                float positionAnimated = jm0Var.I.getPositionAnimated();
                jm0Var.M.setSelected(positionAnimated);
                jm0Var.f47043e.setProgressToGradient(1.0f - c8.j9.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                jm0Var.K0();
                dm0 H0 = jm0Var.H0();
                d dVar = jm0Var.Q;
                if (dVar != null && H0 != null && H0 != jm0Var.R) {
                    jm0Var.R = H0;
                    j2.n nVar = H0.f45065e;
                    dVar.i((CharSequence) nVar.f16456b, true, true);
                    jm0Var.Q.g((SpannableStringBuilder) nVar.f16457c, true);
                    return;
                }
                return;
            case 5:
                ((bs0) this.W).e();
                return;
            case 6:
                ((ry0) this.W).f28624b.invalidate();
                return;
            case 7:
                ((h81) this.W).e();
                return;
            case 8:
                ((org.telegram.ui.Wallet.x2) this.W).f28624b.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.W;
                w5Var.Z0();
                org.telegram.ui.Wallet.a8 a8Var = w5Var.f43260j0;
                if (a8Var != null && a8Var.f42156h1) {
                    a8Var.f0();
                    return;
                }
                return;
        }
    }

    @Override
    public void y(int i7) {
        org.telegram.ui.Wallet.r8 r8Var;
        switch (this.V) {
            case 9:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.W;
                w5Var.f43254e0 = i7;
                if (i7 != 1 && (r8Var = w5Var.f43259i0) != null) {
                    r8Var.b(false);
                }
                if (i7 == 1) {
                    w5Var.f43266p0.post(new org.telegram.ui.Wallet.d4(w5Var, 13));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public g1(org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i7) {
        super(context, g6Var);
        this.V = i7;
        this.W = f2Var;
    }
}

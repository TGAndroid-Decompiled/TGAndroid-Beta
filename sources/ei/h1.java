package ei;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c91;
import org.telegram.ui.ad1;
import org.telegram.ui.ep0;
import org.telegram.ui.kp0;
import org.telegram.ui.o21;
import org.telegram.ui.p21;
import org.telegram.ui.q21;
import org.telegram.ui.r91;
import org.telegram.ui.sn;
import org.telegram.ui.sv0;
public final class h1 extends c91 {
    public final int T;
    public final Object U;

    public h1(Object obj, Context context, int i10) {
        super(context, null);
        this.T = i10;
        this.U = obj;
    }

    @Override
    public int G() {
        switch (this.T) {
            case 10:
                return 12;
            default:
                return super.G();
        }
    }

    @Override
    public boolean i(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: ei.h1.i(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean j(MotionEvent motionEvent) {
        switch (this.T) {
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
        switch (this.T) {
            case 2:
                return false;
            case 6:
                return false;
            default:
                return super.k(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.T) {
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                r91.Y((r91) this.U);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.T) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void t(View view, View view2, int i10, int i11) {
        switch (this.T) {
            case 1:
                r9 r9Var = (r9) this.U;
                if (r9.e0(r9Var)) {
                    r9Var.g1();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void u() {
        switch (this.T) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((hi.k0) this.U).v.d.W2.N(false);
                    return;
                }
                return;
            case 7:
                r91 r91Var = (r91) this.U;
                r91Var.m0(r91Var.f40674i0.getCurrentPosition(), true);
                r91Var.n0(0.0f, false);
                r91.W(r91Var);
                return;
            default:
                return;
        }
    }

    @Override
    public void v() {
        o21 o21Var;
        switch (this.T) {
            case 6:
                if ((getCurrentView() instanceof p21) && (o21Var = ((p21) getCurrentView()).f39964n) != null) {
                    AndroidUtilities.hideKeyboard(o21Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                n2 n2Var = (n2) this.U;
                h1 h1Var = n2Var.f9504f;
                m2 m2Var = n2Var.h;
                if (m2Var != null) {
                    m2Var.F = h1Var.getPositionAnimated();
                    m2Var.invalidate();
                }
                n2.c0(n2Var).invalidate();
                invalidate();
                n2.G = h1Var.getCurrentPosition();
                return;
            case 1:
                r9.d0((r9) this.U).invalidate();
                return;
            case 2:
                hi.k0.t((hi.k0) this.U).invalidate();
                return;
            case 3:
                sn snVar = (sn) this.U;
                snVar.X0.getClass();
                snVar.X0.getClass();
                snVar.o7();
                snVar.v9(1);
                return;
            case 4:
                kp0 kp0Var = (kp0) this.U;
                float positionAnimated = kp0Var.I.getPositionAnimated();
                kp0Var.M.setSelected(positionAnimated);
                kp0Var.e.setProgressToGradient(1.0f - w7.r.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                kp0Var.G0();
                ep0 C0 = kp0Var.C0();
                d dVar = kp0Var.Q;
                if (dVar != null && C0 != null && C0 != kp0Var.R) {
                    kp0Var.R = C0;
                    n2.e eVar = C0.e;
                    dVar.g((CharSequence) eVar.f17042b, true, true);
                    kp0Var.Q.f((SpannableStringBuilder) eVar.f17043c, true);
                }
                kp0Var.D0(1);
                return;
            case 5:
                ((sv0) this.U).e();
                return;
            case 6:
                q21.p((q21) this.U).invalidate();
                return;
            case 7:
                r91 r91Var = (r91) this.U;
                float positionAnimated2 = r91Var.f40674i0.getPositionAnimated();
                r91Var.n0(positionAnimated2, !z10);
                if (!z10) {
                    r91Var.m0(Math.round(positionAnimated2), true);
                }
                r91.W(r91Var);
                r91.Y(r91Var);
                return;
            case 8:
                ((ad1) this.U).e();
                return;
            case 9:
                org.telegram.ui.Wallet.j2.n((org.telegram.ui.Wallet.j2) this.U).invalidate();
                return;
            default:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.U;
                m5Var.S0();
                org.telegram.ui.Wallet.z7 z7Var = m5Var.f34578k0;
                if (z7Var != null && z7Var.f35186c1) {
                    z7Var.h0();
                    return;
                }
                return;
        }
    }

    @Override
    public void x(int i10) {
        org.telegram.ui.Wallet.t8 t8Var;
        switch (this.T) {
            case 10:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.U;
                m5Var.f34573f0 = i10;
                if (i10 != 1 && (t8Var = m5Var.f34577j0) != null) {
                    t8Var.b(false);
                }
                if (i10 == 1) {
                    m5Var.f34584q0.post(new org.telegram.ui.Wallet.n3(m5Var, 13));
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void z(int i10) {
        switch (this.T) {
            case 3:
                if (i10 == 0) {
                    sn snVar = (sn) this.U;
                    if (snVar.f41390s1) {
                        snVar.f41390s1 = false;
                        snVar.f41363q1.h.clear();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public h1(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.T = i10;
        this.U = n2Var;
    }
}

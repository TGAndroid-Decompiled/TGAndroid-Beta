package ei;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e91;
import org.telegram.ui.cp0;
import org.telegram.ui.ip0;
import org.telegram.ui.m21;
import org.telegram.ui.n21;
import org.telegram.ui.o21;
import org.telegram.ui.p91;
import org.telegram.ui.qn;
import org.telegram.ui.qv0;
import org.telegram.ui.yc1;
public final class h1 extends e91 {
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
                p91.Y((p91) this.U);
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
                p91 p91Var = (p91) this.U;
                p91Var.m0(p91Var.f40139i0.getCurrentPosition(), true);
                p91Var.n0(0.0f, false);
                p91.W(p91Var);
                return;
            default:
                return;
        }
    }

    @Override
    public void v() {
        m21 m21Var;
        switch (this.T) {
            case 6:
                if ((getCurrentView() instanceof n21) && (m21Var = ((n21) getCurrentView()).f39398n) != null) {
                    AndroidUtilities.hideKeyboard(m21Var);
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
                h1 h1Var = n2Var.f9501f;
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
                hi.k0.u((hi.k0) this.U).invalidate();
                return;
            case 3:
                qn qnVar = (qn) this.U;
                qnVar.X0.getClass();
                qnVar.X0.getClass();
                qnVar.o7();
                qnVar.v9(1);
                return;
            case 4:
                ip0 ip0Var = (ip0) this.U;
                float positionAnimated = ip0Var.I.getPositionAnimated();
                ip0Var.M.setSelected(positionAnimated);
                ip0Var.e.setProgressToGradient(1.0f - w7.r.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                ip0Var.G0();
                cp0 C0 = ip0Var.C0();
                d dVar = ip0Var.Q;
                if (dVar != null && C0 != null && C0 != ip0Var.R) {
                    ip0Var.R = C0;
                    n2.e eVar = C0.e;
                    dVar.g((CharSequence) eVar.f17039b, true, true);
                    ip0Var.Q.f((SpannableStringBuilder) eVar.f17040c, true);
                }
                ip0Var.D0(1);
                return;
            case 5:
                ((qv0) this.U).e();
                return;
            case 6:
                o21.p((o21) this.U).invalidate();
                return;
            case 7:
                p91 p91Var = (p91) this.U;
                float positionAnimated2 = p91Var.f40139i0.getPositionAnimated();
                p91Var.n0(positionAnimated2, !z10);
                if (!z10) {
                    p91Var.m0(Math.round(positionAnimated2), true);
                }
                p91.W(p91Var);
                p91.Y(p91Var);
                return;
            case 8:
                ((yc1) this.U).e();
                return;
            case 9:
                org.telegram.ui.Wallet.j2.n((org.telegram.ui.Wallet.j2) this.U).invalidate();
                return;
            default:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) this.U;
                o5Var.T0();
                org.telegram.ui.Wallet.t7 t7Var = o5Var.f34651i0;
                if (t7Var != null && t7Var.f34931h1) {
                    t7Var.f0();
                    return;
                }
                return;
        }
    }

    @Override
    public void x(int i10) {
        org.telegram.ui.Wallet.n8 n8Var;
        switch (this.T) {
            case 10:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) this.U;
                o5Var.f34645d0 = i10;
                if (i10 != 1 && (n8Var = o5Var.f34650h0) != null) {
                    n8Var.b(false);
                }
                if (i10 == 1) {
                    o5Var.f34657o0.post(new org.telegram.ui.Wallet.p3(o5Var, 13));
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
                    qn qnVar = (qn) this.U;
                    if (qnVar.f40837s1) {
                        qnVar.f40837s1 = false;
                        qnVar.f40810q1.h.clear();
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

package ei;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l91;
import org.telegram.ui.ed1;
import org.telegram.ui.fp0;
import org.telegram.ui.lp0;
import org.telegram.ui.q21;
import org.telegram.ui.r21;
import org.telegram.ui.s21;
import org.telegram.ui.sn;
import org.telegram.ui.u91;
import org.telegram.ui.uv0;
public final class h1 extends l91 {
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
                u91.Y((u91) this.U);
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
                if (r9.d0(r9Var)) {
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
                    ((hi.k0) this.U).v.d.Z2.N(false);
                    return;
                }
                return;
            case 7:
                u91 u91Var = (u91) this.U;
                u91Var.m0(u91Var.f42322i0.getCurrentPosition(), true);
                u91Var.n0(0.0f, false);
                u91.W(u91Var);
                return;
            default:
                return;
        }
    }

    @Override
    public void v() {
        q21 q21Var;
        switch (this.T) {
            case 6:
                if ((getCurrentView() instanceof r21) && (q21Var = ((r21) getCurrentView()).f40983n) != null) {
                    AndroidUtilities.hideKeyboard(q21Var);
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
                h1 h1Var = n2Var.f9512f;
                m2 m2Var = n2Var.h;
                if (m2Var != null) {
                    m2Var.F = h1Var.getPositionAnimated();
                    m2Var.invalidate();
                }
                n2.d0(n2Var).invalidate();
                invalidate();
                n2.H = h1Var.getCurrentPosition();
                return;
            case 1:
                r9.c0((r9) this.U).invalidate();
                return;
            case 2:
                hi.k0.t((hi.k0) this.U).invalidate();
                return;
            case 3:
                sn snVar = (sn) this.U;
                snVar.f41561j1.getClass();
                snVar.f41561j1.getClass();
                snVar.o7();
                snVar.v9(1);
                return;
            case 4:
                lp0 lp0Var = (lp0) this.U;
                float positionAnimated = lp0Var.I.getPositionAnimated();
                lp0Var.M.setSelected(positionAnimated);
                lp0Var.e.setProgressToGradient(1.0f - w7.r.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                lp0Var.G0();
                fp0 C0 = lp0Var.C0();
                d dVar = lp0Var.Q;
                if (dVar != null && C0 != null && C0 != lp0Var.R) {
                    lp0Var.R = C0;
                    mi.q qVar = C0.e;
                    dVar.i((CharSequence) qVar.f17036b, true, true);
                    lp0Var.Q.g((SpannableStringBuilder) qVar.f17037c, true);
                }
                lp0Var.D0(1);
                return;
            case 5:
                ((uv0) this.U).e();
                return;
            case 6:
                s21.p((s21) this.U).invalidate();
                return;
            case 7:
                u91 u91Var = (u91) this.U;
                float positionAnimated2 = u91Var.f42322i0.getPositionAnimated();
                u91Var.n0(positionAnimated2, !z10);
                if (!z10) {
                    u91Var.m0(Math.round(positionAnimated2), true);
                }
                u91.W(u91Var);
                u91.Y(u91Var);
                return;
            case 8:
                ((ed1) this.U).e();
                return;
            case 9:
                org.telegram.ui.Wallet.i2.m((org.telegram.ui.Wallet.i2) this.U).invalidate();
                return;
            default:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) this.U;
                o5Var.U0();
                org.telegram.ui.Wallet.t7 t7Var = o5Var.f34942i0;
                if (t7Var != null && t7Var.f35237h1) {
                    t7Var.f0();
                    return;
                }
                return;
        }
    }

    @Override
    public void x(int i10) {
        org.telegram.ui.Wallet.o8 o8Var;
        switch (this.T) {
            case 10:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) this.U;
                o5Var.f34936d0 = i10;
                if (i10 != 1 && (o8Var = o5Var.f34941h0) != null) {
                    o8Var.b(false);
                }
                if (i10 == 1) {
                    o5Var.f34948o0.post(new org.telegram.ui.Wallet.o3(o5Var, 13));
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
                    if (snVar.E1) {
                        snVar.E1 = false;
                        snVar.C1.h.clear();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public h1(org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.T = i10;
        this.U = o2Var;
    }
}

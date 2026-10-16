package di;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l91;
import org.telegram.ui.eq0;
import org.telegram.ui.fo;
import org.telegram.ui.g41;
import org.telegram.ui.h41;
import org.telegram.ui.hb1;
import org.telegram.ui.i41;
import org.telegram.ui.re1;
import org.telegram.ui.rw0;
import org.telegram.ui.yp0;
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
        throw new UnsupportedOperationException("Method not decompiled: di.h1.i(android.view.MotionEvent):boolean");
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
                hb1.Y((hb1) this.U);
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
                ea eaVar = (ea) this.U;
                if (ea.e0(eaVar)) {
                    eaVar.g1();
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
                    ((gi.k0) this.U).v.d.W2.N(false);
                    return;
                }
                return;
            case 7:
                hb1 hb1Var = (hb1) this.U;
                hb1Var.m0(hb1Var.f36487i0.getCurrentPosition(), true);
                hb1Var.n0(0.0f, false);
                hb1.W(hb1Var);
                return;
            default:
                return;
        }
    }

    @Override
    public void v() {
        g41 g41Var;
        switch (this.T) {
            case 6:
                if ((getCurrentView() instanceof h41) && (g41Var = ((h41) getCurrentView()).f36393n) != null) {
                    AndroidUtilities.hideKeyboard(g41Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void w(boolean z10) {
        ViewGroup viewGroup;
        switch (this.T) {
            case 0:
                r2 r2Var = (r2) this.U;
                h1 h1Var = r2Var.f7693f;
                q2 q2Var = r2Var.h;
                if (q2Var != null) {
                    q2Var.F = h1Var.getPositionAnimated();
                    q2Var.invalidate();
                }
                viewGroup = ((org.telegram.ui.ActionBar.e3) r2Var).containerView;
                viewGroup.invalidate();
                invalidate();
                r2.G = h1Var.getCurrentPosition();
                return;
            case 1:
                ea.d0((ea) this.U).invalidate();
                return;
            case 2:
                gi.k0.u((gi.k0) this.U).invalidate();
                return;
            case 3:
                fo foVar = (fo) this.U;
                foVar.X0.getClass();
                foVar.X0.getClass();
                foVar.o7();
                foVar.v9(1);
                return;
            case 4:
                eq0 eq0Var = (eq0) this.U;
                float positionAnimated = eq0Var.I.getPositionAnimated();
                eq0Var.M.setSelected(positionAnimated);
                eq0Var.e.setProgressToGradient(1.0f - w7.r.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                eq0Var.G0();
                yp0 C0 = eq0Var.C0();
                d dVar = eq0Var.Q;
                if (dVar != null && C0 != null && C0 != eq0Var.R) {
                    eq0Var.R = C0;
                    n3.b bVar = C0.e;
                    dVar.g((CharSequence) bVar.f15703b, true, true);
                    eq0Var.Q.f((SpannableStringBuilder) bVar.f15704c, true);
                }
                eq0Var.D0(1);
                return;
            case 5:
                ((rw0) this.U).e();
                return;
            case 6:
                i41.q((i41) this.U).invalidate();
                return;
            case 7:
                hb1 hb1Var = (hb1) this.U;
                float positionAnimated2 = hb1Var.f36487i0.getPositionAnimated();
                hb1Var.n0(positionAnimated2, !z10);
                if (!z10) {
                    hb1Var.m0(Math.round(positionAnimated2), true);
                }
                hb1.W(hb1Var);
                hb1.Y(hb1Var);
                return;
            case 8:
                ((re1) this.U).e();
                return;
            case 9:
                org.telegram.ui.Wallet.i2.n((org.telegram.ui.Wallet.i2) this.U).invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void x(int i10) {
        switch (this.T) {
            case 10:
                org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) this.U;
                a5Var.f32642f0 = i10;
                if (i10 == 1) {
                    a5Var.f32650n0.post(new org.telegram.ui.Wallet.g3(a5Var, 12));
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
                    fo foVar = (fo) this.U;
                    if (foVar.f35797s1) {
                        foVar.f35797s1 = false;
                        foVar.f35770q1.h.clear();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public h1(org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.T = i10;
        this.U = m2Var;
    }
}

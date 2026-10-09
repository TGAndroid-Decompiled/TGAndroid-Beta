package ci;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.o91;
import org.telegram.ui.a41;
import org.telegram.ui.aq0;
import org.telegram.ui.b41;
import org.telegram.ui.bb1;
import org.telegram.ui.c41;
import org.telegram.ui.me1;
import org.telegram.ui.mw0;
import org.telegram.ui.up0;
import org.telegram.ui.zn;
public final class h1 extends o91 {
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
        throw new UnsupportedOperationException("Method not decompiled: ci.h1.i(android.view.MotionEvent):boolean");
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
                bb1.Y((bb1) this.U);
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
                fa faVar = (fa) this.U;
                if (fa.e0(faVar)) {
                    faVar.g1();
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
                    ((fi.k0) this.U).v.d.W2.N(false);
                    return;
                }
                return;
            case 7:
                bb1 bb1Var = (bb1) this.U;
                bb1Var.m0(bb1Var.f36215i0.getCurrentPosition(), true);
                bb1Var.n0(0.0f, false);
                bb1.W(bb1Var);
                return;
            default:
                return;
        }
    }

    @Override
    public void v() {
        a41 a41Var;
        switch (this.T) {
            case 6:
                if ((getCurrentView() instanceof b41) && (a41Var = ((b41) getCurrentView()).f36134n) != null) {
                    AndroidUtilities.hideKeyboard(a41Var);
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
                h1 h1Var = r2Var.f5885f;
                q2 q2Var = r2Var.h;
                if (q2Var != null) {
                    q2Var.F = h1Var.getPositionAnimated();
                    q2Var.invalidate();
                }
                viewGroup = ((org.telegram.ui.ActionBar.f3) r2Var).containerView;
                viewGroup.invalidate();
                invalidate();
                r2.G = h1Var.getCurrentPosition();
                return;
            case 1:
                fa.d0((fa) this.U).invalidate();
                return;
            case 2:
                fi.k0.u((fi.k0) this.U).invalidate();
                return;
            case 3:
                zn znVar = (zn) this.U;
                znVar.X0.getClass();
                znVar.X0.getClass();
                znVar.o7();
                znVar.v9(1);
                return;
            case 4:
                aq0 aq0Var = (aq0) this.U;
                float positionAnimated = aq0Var.I.getPositionAnimated();
                aq0Var.M.setSelected(positionAnimated);
                aq0Var.f35984e.setProgressToGradient(1.0f - w7.o.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                aq0Var.G0();
                up0 C0 = aq0Var.C0();
                d dVar = aq0Var.Q;
                if (dVar != null && C0 != null && C0 != aq0Var.R) {
                    aq0Var.R = C0;
                    n6.t tVar = C0.f42517e;
                    dVar.g((CharSequence) tVar.f16717b, true, true);
                    aq0Var.Q.f((SpannableStringBuilder) tVar.f16718c, true);
                }
                aq0Var.D0(1);
                return;
            case 5:
                ((mw0) this.U).e();
                return;
            case 6:
                c41.q((c41) this.U).invalidate();
                return;
            case 7:
                bb1 bb1Var = (bb1) this.U;
                float positionAnimated2 = bb1Var.f36215i0.getPositionAnimated();
                bb1Var.n0(positionAnimated2, !z10);
                if (!z10) {
                    bb1Var.m0(Math.round(positionAnimated2), true);
                }
                bb1.W(bb1Var);
                bb1.Y(bb1Var);
                return;
            case 8:
                ((me1) this.U).e();
                return;
            case 9:
                org.telegram.ui.Wallet.h2.o((org.telegram.ui.Wallet.h2) this.U).invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void x(int i10) {
        switch (this.T) {
            case 10:
                org.telegram.ui.Wallet.z4 z4Var = (org.telegram.ui.Wallet.z4) this.U;
                z4Var.f35720f0 = i10;
                if (i10 == 1) {
                    z4Var.f35728n0.post(new org.telegram.ui.Wallet.e3(z4Var, 12));
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
                    zn znVar = (zn) this.U;
                    if (znVar.f44924s1) {
                        znVar.f44924s1 = false;
                        znVar.f44897q1.h.clear();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public h1(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, e6Var);
        this.T = i10;
        this.U = n2Var;
    }
}

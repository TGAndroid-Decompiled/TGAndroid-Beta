package ci;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.p91;
import org.telegram.ui.a41;
import org.telegram.ui.ab1;
import org.telegram.ui.b41;
import org.telegram.ui.le1;
import org.telegram.ui.lw0;
import org.telegram.ui.tp0;
import org.telegram.ui.z31;
import org.telegram.ui.zn;
import org.telegram.ui.zp0;
public final class h1 extends p91 {
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
                ab1.Y((ab1) this.U);
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
                ab1 ab1Var = (ab1) this.U;
                ab1Var.m0(ab1Var.f36008i0.getCurrentPosition(), true);
                ab1Var.n0(0.0f, false);
                ab1.W(ab1Var);
                return;
            default:
                return;
        }
    }

    @Override
    public void v() {
        z31 z31Var;
        switch (this.T) {
            case 6:
                if ((getCurrentView() instanceof a41) && (z31Var = ((a41) getCurrentView()).f35915n) != null) {
                    AndroidUtilities.hideKeyboard(z31Var);
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
                h1 h1Var = r2Var.f5884f;
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
                zp0 zp0Var = (zp0) this.U;
                float positionAnimated = zp0Var.I.getPositionAnimated();
                zp0Var.M.setSelected(positionAnimated);
                zp0Var.f45077e.setProgressToGradient(1.0f - w7.o.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                zp0Var.G0();
                tp0 C0 = zp0Var.C0();
                d dVar = zp0Var.Q;
                if (dVar != null && C0 != null && C0 != zp0Var.R) {
                    zp0Var.R = C0;
                    n6.k kVar = C0.f42262e;
                    dVar.g((CharSequence) kVar.f16765b, true, true);
                    zp0Var.Q.f((SpannableStringBuilder) kVar.f16766c, true);
                }
                zp0Var.D0(1);
                return;
            case 5:
                ((lw0) this.U).e();
                return;
            case 6:
                b41.q((b41) this.U).invalidate();
                return;
            case 7:
                ab1 ab1Var = (ab1) this.U;
                float positionAnimated2 = ab1Var.f36008i0.getPositionAnimated();
                ab1Var.n0(positionAnimated2, !z10);
                if (!z10) {
                    ab1Var.m0(Math.round(positionAnimated2), true);
                }
                ab1.W(ab1Var);
                ab1.Y(ab1Var);
                return;
            case 8:
                ((le1) this.U).e();
                return;
            case 9:
                org.telegram.ui.Wallet.j2.o((org.telegram.ui.Wallet.j2) this.U).invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public void x(int i10) {
        switch (this.T) {
            case 10:
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) this.U;
                c5Var.f34780f0 = i10;
                if (i10 == 1) {
                    c5Var.f34788n0.post(new org.telegram.ui.Wallet.h3(c5Var, 12));
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
                    if (znVar.f44959s1) {
                        znVar.f44959s1 = false;
                        znVar.f44932q1.h.clear();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public h1(org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.T = i10;
        this.U = m2Var;
    }
}

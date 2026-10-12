package ci;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.u91;
import org.telegram.ui.c41;
import org.telegram.ui.cq0;
import org.telegram.ui.d41;
import org.telegram.ui.db1;
import org.telegram.ui.e41;
import org.telegram.ui.eo;
import org.telegram.ui.oe1;
import org.telegram.ui.ow0;
import org.telegram.ui.wp0;
public final class h1 extends u91 {
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
                db1.Y((db1) this.U);
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
                db1 db1Var = (db1) this.U;
                db1Var.m0(db1Var.f36737i0.getCurrentPosition(), true);
                db1Var.n0(0.0f, false);
                db1.W(db1Var);
                return;
            default:
                return;
        }
    }

    @Override
    public void v() {
        c41 c41Var;
        switch (this.T) {
            case 6:
                if ((getCurrentView() instanceof d41) && (c41Var = ((d41) getCurrentView()).f36645n) != null) {
                    AndroidUtilities.hideKeyboard(c41Var);
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
                h1 h1Var = r2Var.f5883f;
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
                eo eoVar = (eo) this.U;
                eoVar.X0.getClass();
                eoVar.X0.getClass();
                eoVar.o7();
                eoVar.v9(1);
                return;
            case 4:
                cq0 cq0Var = (cq0) this.U;
                float positionAnimated = cq0Var.I.getPositionAnimated();
                cq0Var.M.setSelected(positionAnimated);
                cq0Var.f36483e.setProgressToGradient(1.0f - w7.n.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                cq0Var.G0();
                wp0 C0 = cq0Var.C0();
                d dVar = cq0Var.Q;
                if (dVar != null && C0 != null && C0 != cq0Var.R) {
                    cq0Var.R = C0;
                    n6.k kVar = C0.f43589e;
                    dVar.g((CharSequence) kVar.f16433b, true, true);
                    cq0Var.Q.f((SpannableStringBuilder) kVar.f16434c, true);
                }
                cq0Var.D0(1);
                return;
            case 5:
                ((ow0) this.U).e();
                return;
            case 6:
                e41.q((e41) this.U).invalidate();
                return;
            case 7:
                db1 db1Var = (db1) this.U;
                float positionAnimated2 = db1Var.f36737i0.getPositionAnimated();
                db1Var.n0(positionAnimated2, !z10);
                if (!z10) {
                    db1Var.m0(Math.round(positionAnimated2), true);
                }
                db1.W(db1Var);
                db1.Y(db1Var);
                return;
            case 8:
                ((oe1) this.U).e();
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
                c5Var.f34557f0 = i10;
                if (i10 == 1) {
                    c5Var.f34565n0.post(new org.telegram.ui.Wallet.h3(c5Var, 12));
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
                    eo eoVar = (eo) this.U;
                    if (eoVar.f37419s1) {
                        eoVar.f37419s1 = false;
                        eoVar.f37392q1.h.clear();
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

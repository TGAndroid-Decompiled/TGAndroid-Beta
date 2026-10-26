package fi;

import a8.ee;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.u91;
import org.telegram.ui.id1;
import org.telegram.ui.lp0;
import org.telegram.ui.rp0;
import org.telegram.ui.s21;
import org.telegram.ui.u21;
import org.telegram.ui.un;
import org.telegram.ui.v21;
import org.telegram.ui.wj0;
import org.telegram.ui.xj0;
import org.telegram.ui.xv0;
public final class h1 extends u91 {
    public final int V;
    public final Object W;

    public h1(Object obj, Context context, int i10) {
        super(context, null);
        this.V = i10;
        this.W = obj;
    }

    @Override
    public void A(int i10) {
        switch (this.V) {
            case 3:
                if (i10 == 0) {
                    un unVar = (un) this.W;
                    if (unVar.E1) {
                        unVar.E1 = false;
                        unVar.C1.h.clear();
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
            case 10:
                return 12;
            default:
                return super.H();
        }
    }

    @Override
    public boolean i(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: fi.h1.i(android.view.MotionEvent):boolean");
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
            case 7:
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
    public void t(View view, View view2, int i10, int i11) {
        switch (this.V) {
            case 1:
                n9 n9Var = (n9) this.W;
                if (n9.d0(n9Var)) {
                    n9Var.g1();
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
                    ((ii.j0) this.W).v.d.f32152g3.O(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void v() {
        s21 s21Var;
        switch (this.V) {
            case 4:
                xj0.a0((xj0) this.W);
                return;
            case 7:
                if ((getCurrentView() instanceof u21) && (s21Var = ((u21) getCurrentView()).f43988n) != null) {
                    AndroidUtilities.hideKeyboard(s21Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.V) {
            case 0:
                l2 l2Var = (l2) this.W;
                h1 h1Var = l2Var.f11158f;
                k2 k2Var = l2Var.h;
                if (k2Var != null) {
                    k2Var.F = h1Var.getPositionAnimated();
                    k2Var.invalidate();
                }
                l2.d0(l2Var).invalidate();
                invalidate();
                l2.H = h1Var.getCurrentPosition();
                return;
            case 1:
                n9.c0((n9) this.W).invalidate();
                return;
            case 2:
                ii.j0.s((ii.j0) this.W).invalidate();
                return;
            case 3:
                un unVar = (un) this.W;
                unVar.f44295j1.getClass();
                unVar.f44295j1.getClass();
                unVar.s7();
                return;
            case 4:
                wj0 wj0Var = ((xj0) this.W).f45790w;
                if (wj0Var != null) {
                    wj0Var.invalidate();
                    return;
                }
                return;
            case 5:
                rp0 rp0Var = (rp0) this.W;
                float positionAnimated = rp0Var.I.getPositionAnimated();
                rp0Var.M.setSelected(positionAnimated);
                rp0Var.e.setProgressToGradient(1.0f - ee.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                rp0Var.G0();
                lp0 D0 = rp0Var.D0();
                d dVar = rp0Var.Q;
                if (dVar != null && D0 != null && D0 != rp0Var.R) {
                    rp0Var.R = D0;
                    m4.c cVar = D0.e;
                    dVar.i((CharSequence) cVar.f18009b, true, true);
                    rp0Var.Q.g((SpannableStringBuilder) cVar.f18010c, true);
                    return;
                }
                return;
            case 6:
                ((xv0) this.W).e();
                return;
            case 7:
                v21.o((v21) this.W).invalidate();
                return;
            case 8:
                ((id1) this.W).e();
                return;
            case 9:
                org.telegram.ui.Wallet.i2.m((org.telegram.ui.Wallet.i2) this.W).invalidate();
                return;
            default:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.W;
                m5Var.V0();
                org.telegram.ui.Wallet.t7 t7Var = m5Var.f36946j0;
                if (t7Var != null && t7Var.f37294h1) {
                    t7Var.f0();
                    return;
                }
                return;
        }
    }

    @Override
    public void y(int i10) {
        org.telegram.ui.Wallet.n8 n8Var;
        switch (this.V) {
            case 10:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.W;
                m5Var.f36940e0 = i10;
                if (i10 != 1 && (n8Var = m5Var.f36945i0) != null) {
                    n8Var.b(false);
                }
                if (i10 == 1) {
                    m5Var.f36952p0.post(new org.telegram.ui.Wallet.o3(m5Var, 13));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public h1(org.telegram.ui.ActionBar.r2 r2Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.V = i10;
        this.W = r2Var;
    }
}

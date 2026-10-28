package fi;

import a8.ee;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.v91;
import org.telegram.ui.kd1;
import org.telegram.ui.np0;
import org.telegram.ui.tp0;
import org.telegram.ui.u21;
import org.telegram.ui.w21;
import org.telegram.ui.wn;
import org.telegram.ui.x21;
import org.telegram.ui.yj0;
import org.telegram.ui.zj0;
import org.telegram.ui.zv0;
public final class h1 extends v91 {
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
                    wn wnVar = (wn) this.W;
                    if (wnVar.E1) {
                        wnVar.E1 = false;
                        wnVar.C1.h.clear();
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
                    ((ii.j0) this.W).v.d.f32504g3.O(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void v() {
        u21 u21Var;
        switch (this.V) {
            case 4:
                zj0.a0((zj0) this.W);
                return;
            case 7:
                if ((getCurrentView() instanceof w21) && (u21Var = ((w21) getCurrentView()).f44503n) != null) {
                    AndroidUtilities.hideKeyboard(u21Var);
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
                h1 h1Var = l2Var.f11157f;
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
                wn wnVar = (wn) this.W;
                wnVar.f45163j1.getClass();
                wnVar.f45163j1.getClass();
                wnVar.u7();
                return;
            case 4:
                yj0 yj0Var = ((zj0) this.W).f46294w;
                if (yj0Var != null) {
                    yj0Var.invalidate();
                    return;
                }
                return;
            case 5:
                tp0 tp0Var = (tp0) this.W;
                float positionAnimated = tp0Var.I.getPositionAnimated();
                tp0Var.M.setSelected(positionAnimated);
                tp0Var.e.setProgressToGradient(1.0f - ee.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                tp0Var.G0();
                np0 D0 = tp0Var.D0();
                d dVar = tp0Var.Q;
                if (dVar != null && D0 != null && D0 != tp0Var.R) {
                    tp0Var.R = D0;
                    m4.c cVar = D0.e;
                    dVar.i((CharSequence) cVar.f18008b, true, true);
                    tp0Var.Q.g((SpannableStringBuilder) cVar.f18009c, true);
                    return;
                }
                return;
            case 6:
                ((zv0) this.W).e();
                return;
            case 7:
                x21.o((x21) this.W).invalidate();
                return;
            case 8:
                ((kd1) this.W).e();
                return;
            case 9:
                org.telegram.ui.Wallet.i2.m((org.telegram.ui.Wallet.i2) this.W).invalidate();
                return;
            default:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.W;
                m5Var.V0();
                org.telegram.ui.Wallet.t7 t7Var = m5Var.f36951j0;
                if (t7Var != null && t7Var.f37318h1) {
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
                m5Var.f36945e0 = i10;
                if (i10 != 1 && (n8Var = m5Var.f36950i0) != null) {
                    n8Var.b(false);
                }
                if (i10 == 1) {
                    m5Var.f36957p0.post(new org.telegram.ui.Wallet.o3(m5Var, 13));
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

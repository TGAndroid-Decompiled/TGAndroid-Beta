package nh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.z71;
import org.telegram.ui.fd1;
import org.telegram.ui.iv0;
import org.telegram.ui.t91;
import org.telegram.ui.tn;
import org.telegram.ui.v21;
import org.telegram.ui.x21;
import org.telegram.ui.y21;
import org.telegram.ui.yo0;
public final class g1 extends z71 {
    public final int P;
    public final Object Q;

    public g1(Object obj, Context context, int i10) {
        super(context, null);
        this.P = i10;
        this.Q = obj;
    }

    @Override
    public boolean i(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: nh.g1.i(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean j(MotionEvent motionEvent) {
        switch (this.P) {
            case 8:
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
        switch (this.P) {
            case 5:
                return false;
            case 8:
                return false;
            default:
                return super.k(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.P) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                t91.Y((t91) this.Q);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.P) {
            case 2:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void t(View view, View view2, int i10, int i11) {
        switch (this.P) {
            case 1:
                e9 e9Var = (e9) this.Q;
                if (e9.d0(e9Var)) {
                    e9Var.f1();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void u() {
        switch (this.P) {
            case 6:
                t91 t91Var = (t91) this.Q;
                t91Var.m0(t91Var.f42596e0.getCurrentPosition(), true);
                t91Var.n0(0.0f, false);
                t91.W(t91Var);
                return;
            case 7:
            default:
                return;
            case 8:
                if (getCurrentPosition() == 1) {
                    ((qh.i0) this.Q).v.d.U2.N(false);
                    return;
                }
                return;
        }
    }

    @Override
    public void v() {
        v21 v21Var;
        switch (this.P) {
            case 5:
                if ((getCurrentView() instanceof x21) && (v21Var = ((x21) getCurrentView()).f44447n) != null) {
                    AndroidUtilities.hideKeyboard(v21Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void w(boolean z10) {
        ViewGroup viewGroup;
        switch (this.P) {
            case 0:
                k2 k2Var = (k2) this.Q;
                g1 g1Var = k2Var.f17993f;
                j2 j2Var = k2Var.h;
                if (j2Var != null) {
                    j2Var.B = g1Var.getPositionAnimated();
                    j2Var.invalidate();
                }
                viewGroup = ((org.telegram.ui.ActionBar.f3) k2Var).containerView;
                viewGroup.invalidate();
                invalidate();
                k2.C = g1Var.getCurrentPosition();
                return;
            case 1:
                e9.c0((e9) this.Q).invalidate();
                return;
            case 2:
                tn tnVar = (tn) this.Q;
                tnVar.T0.getClass();
                tnVar.T0.getClass();
                tnVar.l7();
                tnVar.q9(1);
                return;
            case 3:
                yo0 yo0Var = (yo0) this.Q;
                yo0Var.D.setSelected(yo0Var.f44951y.getPositionAnimated());
                yo0Var.f44944e.setProgressToGradient(1.0f - yo0Var.f44951y.getPositionAnimated());
                return;
            case 4:
                ((iv0) this.Q).e();
                return;
            case 5:
                y21.o((y21) this.Q).invalidate();
                return;
            case 6:
                t91 t91Var = (t91) this.Q;
                float positionAnimated = t91Var.f42596e0.getPositionAnimated();
                t91Var.n0(positionAnimated, !z10);
                if (!z10) {
                    t91Var.m0(Math.round(positionAnimated), true);
                }
                t91.W(t91Var);
                t91.Y(t91Var);
                return;
            case 7:
                ((fd1) this.Q).e();
                return;
            default:
                qh.i0.s((qh.i0) this.Q).invalidate();
                return;
        }
    }

    @Override
    public void z(int i10) {
        switch (this.P) {
            case 2:
                if (i10 == 0) {
                    tn tnVar = (tn) this.Q;
                    if (tnVar.f42913o1) {
                        tnVar.f42913o1 = false;
                        tnVar.f42887m1.h.clear();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public g1(Context context, org.telegram.ui.ActionBar.c6 c6Var, tn tnVar) {
        super(context, c6Var);
        this.P = 2;
        this.Q = tnVar;
    }
}

package kh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n71;
import org.telegram.ui.dd1;
import org.telegram.ui.iv0;
import org.telegram.ui.qn;
import org.telegram.ui.s91;
import org.telegram.ui.v21;
import org.telegram.ui.x21;
import org.telegram.ui.y21;
import org.telegram.ui.zo0;
public final class j1 extends n71 {
    public final int P;
    public final Object Q;

    public j1(Object obj, Context context, int i9) {
        super(context, null);
        this.P = i9;
        this.Q = obj;
    }

    @Override
    public boolean i(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: kh.j1.i(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean j(MotionEvent motionEvent) {
        switch (this.P) {
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
        switch (this.P) {
            case 2:
                return false;
            case 6:
                return false;
            default:
                return super.k(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.P) {
            case 7:
                super.onLayout(z10, i9, i10, i11, i12);
                s91.X((s91) this.Q);
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.P) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void t(View view, View view2, int i9, int i10) {
        switch (this.P) {
            case 1:
                t9 t9Var = (t9) this.Q;
                if (t9.c0(t9Var)) {
                    t9Var.f1();
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
            case 2:
                if (getCurrentPosition() == 1) {
                    ((nh.j0) this.Q).v.d.U2.N(false);
                    return;
                }
                return;
            case 7:
                s91 s91Var = (s91) this.Q;
                s91Var.l0(s91Var.f42614e0.getCurrentPosition(), true);
                s91Var.m0(0.0f, false);
                s91.V(s91Var);
                return;
            default:
                return;
        }
    }

    @Override
    public void v() {
        v21 v21Var;
        switch (this.P) {
            case 6:
                if ((getCurrentView() instanceof x21) && (v21Var = ((x21) getCurrentView()).f44341n) != null) {
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
        switch (this.P) {
            case 0:
                n2 n2Var = (n2) this.Q;
                j1 j1Var = n2Var.f15736f;
                m2 m2Var = n2Var.h;
                if (m2Var != null) {
                    m2Var.B = j1Var.getPositionAnimated();
                    m2Var.invalidate();
                }
                n2.a0(n2Var).invalidate();
                invalidate();
                n2.C = j1Var.getCurrentPosition();
                return;
            case 1:
                t9.b0((t9) this.Q).invalidate();
                return;
            case 2:
                nh.j0.s((nh.j0) this.Q).invalidate();
                return;
            case 3:
                qn qnVar = (qn) this.Q;
                qnVar.T0.getClass();
                qnVar.T0.getClass();
                qnVar.l7();
                qnVar.q9(1);
                return;
            case 4:
                zo0 zo0Var = (zo0) this.Q;
                zo0Var.D.setSelected(zo0Var.f45202y.getPositionAnimated());
                zo0Var.f45195e.setProgressToGradient(1.0f - zo0Var.f45202y.getPositionAnimated());
                return;
            case 5:
                ((iv0) this.Q).e();
                return;
            case 6:
                y21.o((y21) this.Q).invalidate();
                return;
            case 7:
                s91 s91Var = (s91) this.Q;
                float positionAnimated = s91Var.f42614e0.getPositionAnimated();
                s91Var.m0(positionAnimated, !z10);
                if (!z10) {
                    s91Var.l0(Math.round(positionAnimated), true);
                }
                s91.V(s91Var);
                s91.X(s91Var);
                return;
            default:
                ((dd1) this.Q).e();
                return;
        }
    }

    @Override
    public void z(int i9) {
        switch (this.P) {
            case 3:
                if (i9 == 0) {
                    qn qnVar = (qn) this.Q;
                    if (qnVar.f42016o1) {
                        qnVar.f42016o1 = false;
                        qnVar.f41990m1.h.clear();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public j1(Context context, org.telegram.ui.ActionBar.b6 b6Var, qn qnVar) {
        super(context, b6Var);
        this.P = 3;
        this.Q = qnVar;
    }
}

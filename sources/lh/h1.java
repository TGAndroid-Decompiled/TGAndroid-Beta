package lh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.ak;
import org.telegram.ui.ap0;
import org.telegram.ui.dd1;
import org.telegram.ui.jv0;
import org.telegram.ui.q91;
import org.telegram.ui.rn;
import org.telegram.ui.u21;
import org.telegram.ui.w21;
import org.telegram.ui.x21;

public final class h1 extends p71 {
    public final int P;
    public final Object Q;

    public h1(Object obj, Context context, int i10) {
        super(context, null);
        this.P = i10;
        this.Q = obj;
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        int i10;
        View viewE;
        int iR;
        switch (this.P) {
            case 1:
                q9 q9Var = (q9) this.Q;
                View currentView = q9Var.f16593b.getCurrentView();
                if (!(currentView instanceof k9)) {
                    return true;
                }
                if (getCurrentPosition() > 0) {
                    q9Var.f1();
                    return true;
                }
                k9 k9Var = (k9) currentView;
                ArrayList arrayList = k9Var.H;
                zk0 zk0Var = k9Var.f16253f;
                if (k9Var.f16249a != 0 || motionEvent == null || (viewE = zk0Var.E(motionEvent.getX(), motionEvent.getY() - k9Var.f16252e.getPaddingTop())) == null || (iR = RecyclerView.R(viewE)) < 0 || iR >= arrayList.size()) {
                    i10 = -1;
                } else {
                    x8 x8Var = (x8) arrayList.get(iR);
                    if (x8Var.f49413a != 3 || x8Var.f17047n) {
                        i10 = -1;
                    } else {
                        boolean z10 = LocaleController.isRTL;
                        float x8 = motionEvent.getX();
                        if (!z10 ? x8 > AndroidUtilities.dp(100.0f) : x8 < k9Var.getWidth() - AndroidUtilities.dp(100.0f)) {
                            i10 = -1;
                        } else {
                            i10 = x8Var.f17042i;
                        }
                    }
                }
                if (i10 != -1) {
                    q9Var.I = i10;
                    if (i10 == 3) {
                        if (!q9Var.f16597n.isEmpty() && !q9Var.f16598r.isEmpty()) {
                            q9Var.J = i10;
                        }
                    } else if (i10 != 4) {
                        q9Var.J = i10;
                    } else if (!q9Var.d.isEmpty() && !q9Var.f16595e.isEmpty()) {
                        q9Var.J = i10;
                    }
                    k9Var.f(true);
                    k9Var.e(true);
                }
                if (i10 != -1) {
                    q9Var.f1();
                }
                return i10 != -1;
            case 2:
            default:
                return super.i(motionEvent);
            case 3:
                ak akVar = ((rn) this.Q).l1;
                return akVar != null && akVar.f29063b > 0.5f;
        }
    }

    @Override
    public boolean j(MotionEvent motionEvent) {
        switch (this.P) {
            case 2:
                return getCurrentPosition() != 2;
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.P) {
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                q91.Y((q91) this.Q);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
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
    public void t(View view, View view2, int i10, int i11) {
        switch (this.P) {
            case 1:
                q9 q9Var = (q9) this.Q;
                if (((org.telegram.ui.ActionBar.e3) q9Var).keyboardVisible) {
                    q9Var.f1();
                }
                break;
        }
    }

    @Override
    public void u() {
        switch (this.P) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((oh.j0) this.Q).v.d.U2.N(false);
                }
                break;
            case 7:
                q91 q91Var = (q91) this.Q;
                q91Var.m0(q91Var.f41557e0.getCurrentPosition(), true);
                q91Var.n0(0.0f, false);
                q91.W(q91Var);
                break;
        }
    }

    @Override
    public void v() {
        u21 u21Var;
        switch (this.P) {
            case 6:
                if ((getCurrentView() instanceof w21) && (u21Var = ((w21) getCurrentView()).f43586n) != null) {
                    AndroidUtilities.hideKeyboard(u21Var);
                    break;
                }
                break;
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.P) {
            case 0:
                l2 l2Var = (l2) this.Q;
                h1 h1Var = l2Var.f16288f;
                k2 k2Var = l2Var.h;
                if (k2Var != null) {
                    k2Var.B = h1Var.getPositionAnimated();
                    k2Var.invalidate();
                }
                ((org.telegram.ui.ActionBar.e3) l2Var).containerView.invalidate();
                invalidate();
                l2.C = h1Var.getCurrentPosition();
                break;
            case 1:
                ((org.telegram.ui.ActionBar.e3) ((q9) this.Q)).containerView.invalidate();
                break;
            case 2:
                ((org.telegram.ui.ActionBar.e3) ((oh.j0) this.Q)).containerView.invalidate();
                break;
            case 3:
                rn rnVar = (rn) this.Q;
                rnVar.T0.getClass();
                rnVar.T0.getClass();
                rnVar.l7();
                rnVar.q9(1);
                break;
            case 4:
                ap0 ap0Var = (ap0) this.Q;
                ap0Var.D.setSelected(ap0Var.f36595y.getPositionAnimated());
                ap0Var.f36588e.setProgressToGradient(1.0f - ap0Var.f36595y.getPositionAnimated());
                break;
            case 5:
                ((jv0) this.Q).e();
                break;
            case 6:
                ((org.telegram.ui.ActionBar.e3) ((x21) this.Q)).containerView.invalidate();
                break;
            case 7:
                q91 q91Var = (q91) this.Q;
                float positionAnimated = q91Var.f41557e0.getPositionAnimated();
                q91Var.n0(positionAnimated, !z10);
                if (!z10) {
                    q91Var.m0(Math.round(positionAnimated), true);
                }
                q91.W(q91Var);
                q91.Y(q91Var);
                break;
            default:
                ((dd1) this.Q).e();
                break;
        }
    }

    @Override
    public void z(int i10) {
        switch (this.P) {
            case 3:
                if (i10 == 0) {
                    rn rnVar = (rn) this.Q;
                    if (rnVar.f42152o1) {
                        rnVar.f42152o1 = false;
                        rnVar.f42126m1.h.clear();
                    }
                }
                break;
        }
    }

    public h1(Context context, org.telegram.ui.ActionBar.c6 c6Var, rn rnVar) {
        super(context, c6Var);
        this.P = 3;
        this.Q = rnVar;
    }
}

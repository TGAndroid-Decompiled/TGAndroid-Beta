package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import oi.p4;
import org.telegram.messenger.a8;
import org.telegram.messenger.ns;
import org.telegram.messenger.uu;
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.q40;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.t7;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.xp;
public final class j2 extends AnimatorListenerAdapter {
    public final int f18370a;
    public final int f18371b;
    public final Object f18372c;

    public j2(Object obj, int i7, int i10) {
        this.f18370a = i10;
        this.f18372c = obj;
        this.f18371b = i7;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f18370a) {
            case 4:
                AnimatorSet[] animatorSetArr = ((org.telegram.ui.ActionBar.t1) this.f18372c).G;
                int i7 = this.f18371b;
                AnimatorSet animatorSet = animatorSetArr[i7];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i7] = null;
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.f18372c;
                AnimatorSet animatorSet2 = u2Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    u2Var.A0 = null;
                    u2Var.B0 = 0;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        int i11 = this.f18370a;
        int i12 = 8;
        boolean z10 = true;
        int i13 = this.f18371b;
        Object obj = this.f18372c;
        switch (i11) {
            case 0:
                x2 x2Var = (x2) obj;
                x2Var.R.setColor(i13);
                x2Var.F();
                x2Var.f18661f.invalidate();
                org.telegram.ui.b3 b3Var = x2Var.Z0;
                if (b3Var != null) {
                    if (org.telegram.messenger.g0.B(x2Var.R.getColor()) > 0.721f) {
                        z10 = false;
                    }
                    b3Var.b(z10, false);
                    x2Var.Z0.setBackgroundColor(x2Var.R.getColor());
                }
                x2Var.K();
                return;
            case 1:
                y3 y3Var = (y3) obj;
                p2 p2Var = y3Var.f18715n;
                if (p2Var.getWebView() != null) {
                    p2Var.getWebView().setScrollY(i13);
                }
                if (animator == y3Var.f18716r) {
                    y3Var.f18716r = null;
                    return;
                }
                return;
            case 2:
                p4 p4Var = (p4) obj;
                p4Var.f21880a0 = i13;
                p4Var.f21881b0 = 0.0f;
                p4Var.requestLayout();
                p4Var.invalidate();
                return;
            case 3:
                uu uuVar = (uu) obj;
                uuVar.f26869b0 = i13;
                uuVar.f26870c0 = 0.0f;
                View view = uuVar.W;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 4:
                AnimatorSet[] animatorSetArr = ((org.telegram.ui.ActionBar.t1) obj).G;
                AnimatorSet animatorSet = animatorSetArr[i13];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i13] = null;
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) obj;
                AnimatorSet animatorSet2 = u2Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    u2Var.A0 = null;
                    u2Var.B0 = 0;
                    DialogInterface.OnClickListener onClickListener = u2Var.L;
                    if (onClickListener != null) {
                        onClickListener.onClick(u2Var, i13);
                    }
                    org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.r0(this, 4));
                }
                ns.e().k(99, 512);
                return;
            case 6:
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) obj;
                if (!f4Var.c()) {
                    f4Var.b(i13);
                }
                f4Var.f30223e0 = null;
                return;
            case 7:
                ((g6) obj).u(i13);
                return;
            case 8:
                ((t7) obj).f39565a[i13].setVisibility(8);
                return;
            case 9:
                dx dxVar = (dx) obj;
                ug.q0 q0Var = dxVar.f34091r;
                if (i13 == 1) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                q0Var.setVisibility(i7);
                TextView textView = dxVar.h;
                if (i13 == 2) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                textView.setVisibility(i10);
                TextView textView2 = dxVar.f34090n;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 10:
                q40 q40Var = (q40) obj;
                if (i13 == q40Var.f38510u0) {
                    q40Var.f38514x.setRotationY(0.0f);
                    q40Var.f38508s0 = true;
                    q40Var.f38489d0 = null;
                    a8.b("RoundVideo camera flip visual animation completed: elapsedMs=" + q40.m(q40Var));
                    q40.n(q40Var);
                    return;
                }
                return;
            case 11:
                qf0 qf0Var = (qf0) obj;
                qf0Var.I = null;
                qf0Var.Q.f40394e1.delete(i13);
                return;
            case 12:
                xp xpVar = (xp) obj;
                ((xi0) xpVar.d).f41706b.remove(i13);
                xi0 xi0Var = (xi0) xpVar.d;
                xi0Var.d = true;
                xi0Var.f41705a.invalidate();
                return;
            case 13:
                ar0 ar0Var = (ar0) obj;
                ar0Var.f33047e.S1.remove(i13);
                ar0Var.f33044a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.d1 d1Var = (org.telegram.ui.Components.voip.d1) obj;
                d1Var.f40548y = -1;
                d1Var.f40546w = i13;
                d1Var.f40545s = 0.0f;
                d1Var.V = null;
                d1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f18370a) {
            case 9:
                dx dxVar = (dx) this.f18372c;
                dxVar.f34091r.setVisibility(0);
                dxVar.h.setVisibility(0);
                dxVar.f34090n.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}

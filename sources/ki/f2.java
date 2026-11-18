package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import oi.r4;
import org.telegram.messenger.a8;
import org.telegram.messenger.ks;
import org.telegram.messenger.qu;
import org.telegram.ui.Components.ag0;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.jx;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.y40;
import org.telegram.ui.yp;
public final class f2 extends AnimatorListenerAdapter {
    public final int f18655a;
    public final int f18656b;
    public final Object f18657c;

    public f2(Object obj, int i7, int i10) {
        this.f18655a = i10;
        this.f18657c = obj;
        this.f18656b = i7;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f18655a) {
            case 4:
                AnimatorSet[] animatorSetArr = ((org.telegram.ui.ActionBar.u1) this.f18657c).G;
                int i7 = this.f18656b;
                AnimatorSet animatorSet = animatorSetArr[i7];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i7] = null;
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) this.f18657c;
                AnimatorSet animatorSet2 = x2Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    x2Var.A0 = null;
                    x2Var.B0 = 0;
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
        int i11 = this.f18655a;
        int i12 = 8;
        boolean z10 = true;
        int i13 = this.f18656b;
        Object obj = this.f18657c;
        switch (i11) {
            case 0:
                t2 t2Var = (t2) obj;
                t2Var.R.setColor(i13);
                t2Var.F();
                t2Var.f18930f.invalidate();
                org.telegram.ui.b3 b3Var = t2Var.Z0;
                if (b3Var != null) {
                    if (org.telegram.messenger.g0.B(t2Var.R.getColor()) > 0.721f) {
                        z10 = false;
                    }
                    b3Var.b(z10, false);
                    t2Var.Z0.setBackgroundColor(t2Var.R.getColor());
                }
                t2Var.K();
                return;
            case 1:
                t3 t3Var = (t3) obj;
                l2 l2Var = t3Var.f18958n;
                if (l2Var.getWebView() != null) {
                    l2Var.getWebView().setScrollY(i13);
                }
                if (animator == t3Var.f18959r) {
                    t3Var.f18959r = null;
                    return;
                }
                return;
            case 2:
                r4 r4Var = (r4) obj;
                r4Var.f22294a0 = i13;
                r4Var.f22295b0 = 0.0f;
                r4Var.requestLayout();
                r4Var.invalidate();
                return;
            case 3:
                qu quVar = (qu) obj;
                quVar.f26457b0 = i13;
                quVar.f26458c0 = 0.0f;
                View view = quVar.W;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 4:
                AnimatorSet[] animatorSetArr = ((org.telegram.ui.ActionBar.u1) obj).G;
                AnimatorSet animatorSet = animatorSetArr[i13];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i13] = null;
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) obj;
                AnimatorSet animatorSet2 = x2Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    x2Var.A0 = null;
                    x2Var.B0 = 0;
                    DialogInterface.OnClickListener onClickListener = x2Var.L;
                    if (onClickListener != null) {
                        onClickListener.onClick(x2Var, i13);
                    }
                    org.telegram.messenger.g0.g3(new oi.a2(this, 8));
                }
                ks.e().k(99, 512);
                return;
            case 6:
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) obj;
                if (!f4Var.c()) {
                    f4Var.b(i13);
                }
                f4Var.f30599e0 = null;
                return;
            case 7:
                ((m6) obj).u(i13);
                return;
            case 8:
                ((b8) obj).f33576a[i13].setVisibility(8);
                return;
            case 9:
                jx jxVar = (jx) obj;
                ug.s0 s0Var = jxVar.f36549r;
                if (i13 == 1) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                s0Var.setVisibility(i7);
                TextView textView = jxVar.h;
                if (i13 == 2) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                textView.setVisibility(i10);
                TextView textView2 = jxVar.f36548n;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 10:
                y40 y40Var = (y40) obj;
                if (i13 == y40Var.f42318u0) {
                    y40Var.f42322x.setRotationY(0.0f);
                    y40Var.f42316s0 = true;
                    y40Var.f42297d0 = null;
                    a8.b("RoundVideo camera flip visual animation completed: elapsedMs=" + y40.m(y40Var));
                    y40.n(y40Var);
                    return;
                }
                return;
            case 11:
                ag0 ag0Var = (ag0) obj;
                ag0Var.I = null;
                ag0Var.Q.f35082e1.delete(i13);
                return;
            case 12:
                yp ypVar = (yp) obj;
                ((fj0) ypVar.d).f35121b.remove(i13);
                fj0 fj0Var = (fj0) ypVar.d;
                fj0Var.d = true;
                fj0Var.f35120a.invalidate();
                return;
            case 13:
                ir0 ir0Var = (ir0) obj;
                ir0Var.f36180e.S1.remove(i13);
                ir0Var.f36177a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.c1 c1Var = (org.telegram.ui.Components.voip.c1) obj;
                c1Var.f40798y = -1;
                c1Var.f40796w = i13;
                c1Var.f40795s = 0.0f;
                c1Var.V = null;
                c1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f18655a) {
            case 9:
                jx jxVar = (jx) this.f18657c;
                jxVar.f36549r.setVisibility(0);
                jxVar.h.setVisibility(0);
                jxVar.f36548n.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}

package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import oi.s4;
import org.telegram.messenger.ks;
import org.telegram.messenger.qu;
import org.telegram.ui.Cells.g4;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.b50;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.kr0;
import org.telegram.ui.Components.lx;
import org.telegram.ui.Components.n6;
import org.telegram.ui.yp;
public final class e2 extends AnimatorListenerAdapter {
    public final int f18662a;
    public final int f18663b;
    public final Object f18664c;

    public e2(Object obj, int i7, int i10) {
        this.f18662a = i10;
        this.f18664c = obj;
        this.f18663b = i7;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f18662a) {
            case 4:
                AnimatorSet[] animatorSetArr = ((org.telegram.ui.ActionBar.t1) this.f18664c).G;
                int i7 = this.f18663b;
                AnimatorSet animatorSet = animatorSetArr[i7];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i7] = null;
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f18664c;
                AnimatorSet animatorSet2 = w2Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    w2Var.A0 = null;
                    w2Var.B0 = 0;
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
        int i11 = this.f18662a;
        int i12 = 8;
        boolean z10 = true;
        int i13 = this.f18663b;
        Object obj = this.f18664c;
        switch (i11) {
            case 0:
                s2 s2Var = (s2) obj;
                s2Var.R.setColor(i13);
                s2Var.F();
                s2Var.f18937f.invalidate();
                org.telegram.ui.b3 b3Var = s2Var.Z0;
                if (b3Var != null) {
                    if (org.telegram.messenger.g0.B(s2Var.R.getColor()) > 0.721f) {
                        z10 = false;
                    }
                    b3Var.b(z10, false);
                    s2Var.Z0.setBackgroundColor(s2Var.R.getColor());
                }
                s2Var.K();
                return;
            case 1:
                s3 s3Var = (s3) obj;
                k2 k2Var = s3Var.f18965n;
                if (k2Var.getWebView() != null) {
                    k2Var.getWebView().setScrollY(i13);
                }
                if (animator == s3Var.f18966r) {
                    s3Var.f18966r = null;
                    return;
                }
                return;
            case 2:
                s4 s4Var = (s4) obj;
                s4Var.f22373a0 = i13;
                s4Var.f22374b0 = 0.0f;
                s4Var.requestLayout();
                s4Var.invalidate();
                return;
            case 3:
                qu quVar = (qu) obj;
                quVar.f26483b0 = i13;
                quVar.f26484c0 = 0.0f;
                View view = quVar.W;
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
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj;
                AnimatorSet animatorSet2 = w2Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    w2Var.A0 = null;
                    w2Var.B0 = 0;
                    DialogInterface.OnClickListener onClickListener = w2Var.L;
                    if (onClickListener != null) {
                        onClickListener.onClick(w2Var, i13);
                    }
                    org.telegram.messenger.g0.g3(new oi.c2(this, 8));
                }
                ks.e().k(99, 512);
                return;
            case 6:
                g4 g4Var = (g4) obj;
                if (!g4Var.c()) {
                    g4Var.b(i13);
                }
                g4Var.f30686e0 = null;
                return;
            case 7:
                ((n6) obj).u(i13);
                return;
            case 8:
                ((a8) obj).f33396a[i13].setVisibility(8);
                return;
            case 9:
                lx lxVar = (lx) obj;
                ug.r0 r0Var = lxVar.f37312r;
                if (i13 == 1) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                r0Var.setVisibility(i7);
                TextView textView = lxVar.h;
                if (i13 == 2) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                textView.setVisibility(i10);
                TextView textView2 = lxVar.f37311n;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 10:
                b50 b50Var = (b50) obj;
                if (i13 == b50Var.f33767u0) {
                    b50Var.f33771x.setRotationY(0.0f);
                    b50Var.f33765s0 = true;
                    b50Var.f33746d0 = null;
                    org.telegram.messenger.a8.b("RoundVideo camera flip visual animation completed: elapsedMs=" + b50.m(b50Var));
                    b50.n(b50Var);
                    return;
                }
                return;
            case 11:
                cg0 cg0Var = (cg0) obj;
                cg0Var.I = null;
                cg0Var.Q.f35889e1.delete(i13);
                return;
            case 12:
                yp ypVar = (yp) obj;
                ((hj0) ypVar.d).f35928b.remove(i13);
                hj0 hj0Var = (hj0) ypVar.d;
                hj0Var.d = true;
                hj0Var.f35927a.invalidate();
                return;
            case 13:
                kr0 kr0Var = (kr0) obj;
                kr0Var.f36961e.S1.remove(i13);
                kr0Var.f36958a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.c1 c1Var = (org.telegram.ui.Components.voip.c1) obj;
                c1Var.f40933y = -1;
                c1Var.f40931w = i13;
                c1Var.f40930s = 0.0f;
                c1Var.V = null;
                c1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f18662a) {
            case 9:
                lx lxVar = (lx) this.f18664c;
                lxVar.f37312r.setVisibility(0);
                lxVar.h.setVisibility(0);
                lxVar.f37311n.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}

package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import oi.s4;
import org.telegram.messenger.a8;
import org.telegram.messenger.ks;
import org.telegram.messenger.qu;
import org.telegram.ui.Cells.g4;
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.ix;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.y40;
import org.telegram.ui.Components.z7;
import org.telegram.ui.yp;
public final class e2 extends AnimatorListenerAdapter {
    public final int f18732a;
    public final int f18733b;
    public final Object f18734c;

    public e2(Object obj, int i7, int i10) {
        this.f18732a = i10;
        this.f18734c = obj;
        this.f18733b = i7;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f18732a) {
            case 4:
                AnimatorSet[] animatorSetArr = ((org.telegram.ui.ActionBar.t1) this.f18734c).G;
                int i7 = this.f18733b;
                AnimatorSet animatorSet = animatorSetArr[i7];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i7] = null;
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f18734c;
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
        int i11 = this.f18732a;
        int i12 = 8;
        boolean z10 = true;
        int i13 = this.f18733b;
        Object obj = this.f18734c;
        switch (i11) {
            case 0:
                t2 t2Var = (t2) obj;
                t2Var.R.setColor(i13);
                t2Var.F();
                t2Var.f19025f.invalidate();
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
                k2 k2Var = t3Var.f19053n;
                if (k2Var.getWebView() != null) {
                    k2Var.getWebView().setScrollY(i13);
                }
                if (animator == t3Var.f19054r) {
                    t3Var.f19054r = null;
                    return;
                }
                return;
            case 2:
                s4 s4Var = (s4) obj;
                s4Var.f22444a0 = i13;
                s4Var.f22445b0 = 0.0f;
                s4Var.requestLayout();
                s4Var.invalidate();
                return;
            case 3:
                qu quVar = (qu) obj;
                quVar.f26567b0 = i13;
                quVar.f26568c0 = 0.0f;
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
                g4Var.f30744e0 = null;
                return;
            case 7:
                ((m6) obj).u(i13);
                return;
            case 8:
                ((z7) obj).f42726a[i13].setVisibility(8);
                return;
            case 9:
                ix ixVar = (ix) obj;
                ug.r0 r0Var = ixVar.f36186r;
                if (i13 == 1) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                r0Var.setVisibility(i7);
                TextView textView = ixVar.h;
                if (i13 == 2) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                textView.setVisibility(i10);
                TextView textView2 = ixVar.f36185n;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 10:
                y40 y40Var = (y40) obj;
                if (i13 == y40Var.f42346u0) {
                    y40Var.f42350x.setRotationY(0.0f);
                    y40Var.f42344s0 = true;
                    y40Var.f42325d0 = null;
                    a8.b("RoundVideo camera flip visual animation completed: elapsedMs=" + y40.m(y40Var));
                    y40.n(y40Var);
                    return;
                }
                return;
            case 11:
                bg0 bg0Var = (bg0) obj;
                bg0Var.I = null;
                bg0Var.Q.f35417e1.delete(i13);
                return;
            case 12:
                yp ypVar = (yp) obj;
                ((hj0) ypVar.d).f35754b.remove(i13);
                hj0 hj0Var = (hj0) ypVar.d;
                hj0Var.d = true;
                hj0Var.f35753a.invalidate();
                return;
            case 13:
                jr0 jr0Var = (jr0) obj;
                jr0Var.f36502e.S1.remove(i13);
                jr0Var.f36499a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.d1 d1Var = (org.telegram.ui.Components.voip.d1) obj;
                d1Var.f40827y = -1;
                d1Var.f40825w = i13;
                d1Var.f40824s = 0.0f;
                d1Var.V = null;
                d1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f18732a) {
            case 9:
                ix ixVar = (ix) this.f18734c;
                ixVar.f36186r.setVisibility(0);
                ixVar.h.setVisibility(0);
                ixVar.f36185n.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}

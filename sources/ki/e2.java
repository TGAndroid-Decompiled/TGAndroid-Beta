package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import oi.s4;
import org.telegram.messenger.ls;
import org.telegram.messenger.ru;
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
    public final int f18665a;
    public final int f18666b;
    public final Object f18667c;

    public e2(Object obj, int i7, int i10) {
        this.f18665a = i10;
        this.f18667c = obj;
        this.f18666b = i7;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f18665a) {
            case 4:
                AnimatorSet[] animatorSetArr = ((org.telegram.ui.ActionBar.t1) this.f18667c).G;
                int i7 = this.f18666b;
                AnimatorSet animatorSet = animatorSetArr[i7];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i7] = null;
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f18667c;
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
        int i11 = this.f18665a;
        int i12 = 8;
        boolean z10 = true;
        int i13 = this.f18666b;
        Object obj = this.f18667c;
        switch (i11) {
            case 0:
                s2 s2Var = (s2) obj;
                s2Var.R.setColor(i13);
                s2Var.F();
                s2Var.f18940f.invalidate();
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
                k2 k2Var = s3Var.f18968n;
                if (k2Var.getWebView() != null) {
                    k2Var.getWebView().setScrollY(i13);
                }
                if (animator == s3Var.f18969r) {
                    s3Var.f18969r = null;
                    return;
                }
                return;
            case 2:
                s4 s4Var = (s4) obj;
                s4Var.f22376a0 = i13;
                s4Var.f22377b0 = 0.0f;
                s4Var.requestLayout();
                s4Var.invalidate();
                return;
            case 3:
                ru ruVar = (ru) obj;
                ruVar.f26666b0 = i13;
                ruVar.f26667c0 = 0.0f;
                View view = ruVar.W;
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
                ls.e().k(99, 512);
                return;
            case 6:
                g4 g4Var = (g4) obj;
                if (!g4Var.c()) {
                    g4Var.b(i13);
                }
                g4Var.f30689e0 = null;
                return;
            case 7:
                ((n6) obj).u(i13);
                return;
            case 8:
                ((a8) obj).f33409a[i13].setVisibility(8);
                return;
            case 9:
                lx lxVar = (lx) obj;
                ug.r0 r0Var = lxVar.f37318r;
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
                TextView textView2 = lxVar.f37317n;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 10:
                b50 b50Var = (b50) obj;
                if (i13 == b50Var.f33760u0) {
                    b50Var.f33764x.setRotationY(0.0f);
                    b50Var.f33758s0 = true;
                    b50Var.f33739d0 = null;
                    org.telegram.messenger.a8.b("RoundVideo camera flip visual animation completed: elapsedMs=" + b50.m(b50Var));
                    b50.n(b50Var);
                    return;
                }
                return;
            case 11:
                cg0 cg0Var = (cg0) obj;
                cg0Var.I = null;
                cg0Var.Q.f35882e1.delete(i13);
                return;
            case 12:
                yp ypVar = (yp) obj;
                ((hj0) ypVar.d).f35921b.remove(i13);
                hj0 hj0Var = (hj0) ypVar.d;
                hj0Var.d = true;
                hj0Var.f35920a.invalidate();
                return;
            case 13:
                kr0 kr0Var = (kr0) obj;
                kr0Var.f36963e.S1.remove(i13);
                kr0Var.f36960a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.c1 c1Var = (org.telegram.ui.Components.voip.c1) obj;
                c1Var.f40934y = -1;
                c1Var.f40932w = i13;
                c1Var.f40931s = 0.0f;
                c1Var.V = null;
                c1Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f18665a) {
            case 9:
                lx lxVar = (lx) this.f18667c;
                lxVar.f37318r.setVisibility(0);
                lxVar.h.setVisibility(0);
                lxVar.f37317n.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}

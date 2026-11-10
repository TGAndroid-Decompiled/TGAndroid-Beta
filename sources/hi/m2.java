package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import li.s4;
import org.telegram.messenger.a8;
import org.telegram.messenger.qs;
import org.telegram.messenger.wu;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.v7;
import org.telegram.ui.Components.xw;
import org.telegram.ui.Components.zq0;
import org.telegram.ui.xp;
public final class m2 extends AnimatorListenerAdapter {
    public final int f14797a;
    public final int f14798b;
    public final Object f14799c;

    public m2(Object obj, int i7, int i10) {
        this.f14797a = i10;
        this.f14799c = obj;
        this.f14798b = i7;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f14797a) {
            case 4:
                AnimatorSet[] animatorSetArr = ((org.telegram.ui.ActionBar.u1) this.f14799c).F;
                int i7 = this.f14798b;
                AnimatorSet animatorSet = animatorSetArr[i7];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i7] = null;
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f14799c;
                AnimatorSet animatorSet2 = w2Var.f28714z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    w2Var.f28714z0 = null;
                    w2Var.A0 = 0;
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
        int i11 = this.f14797a;
        int i12 = 8;
        boolean z9 = true;
        int i13 = this.f14798b;
        Object obj = this.f14799c;
        switch (i11) {
            case 0:
                a3 a3Var = (a3) obj;
                a3Var.Q.setColor(i13);
                a3Var.F();
                a3Var.f14521f.invalidate();
                org.telegram.ui.b3 b3Var = a3Var.Y0;
                if (b3Var != null) {
                    if (org.telegram.messenger.g0.B(a3Var.Q.getColor()) > 0.721f) {
                        z9 = false;
                    }
                    b3Var.b(z9, false);
                    a3Var.Y0.setBackgroundColor(a3Var.Q.getColor());
                }
                a3Var.K();
                return;
            case 1:
                c4 c4Var = (c4) obj;
                s2 s2Var = c4Var.f14594n;
                if (s2Var.getWebView() != null) {
                    s2Var.getWebView().setScrollY(i13);
                }
                if (animator == c4Var.f14595r) {
                    c4Var.f14595r = null;
                    return;
                }
                return;
            case 2:
                s4 s4Var = (s4) obj;
                s4Var.W = i13;
                s4Var.f18844a0 = 0.0f;
                s4Var.requestLayout();
                s4Var.invalidate();
                return;
            case 3:
                wu wuVar = (wu) obj;
                wuVar.f26381a0 = i13;
                wuVar.f26382b0 = 0.0f;
                View view = wuVar.V;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 4:
                AnimatorSet[] animatorSetArr = ((org.telegram.ui.ActionBar.u1) obj).F;
                AnimatorSet animatorSet = animatorSetArr[i13];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i13] = null;
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj;
                AnimatorSet animatorSet2 = w2Var.f28714z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    w2Var.f28714z0 = null;
                    w2Var.A0 = 0;
                    DialogInterface.OnClickListener onClickListener = w2Var.K;
                    if (onClickListener != null) {
                        onClickListener.onClick(w2Var, i13);
                    }
                    org.telegram.messenger.g0.h3(new l2.a0(this, 21));
                }
                qs.e().k(99, 512);
                return;
            case 6:
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) obj;
                if (!f4Var.c()) {
                    f4Var.b(i13);
                }
                f4Var.f29122d0 = null;
                return;
            case 7:
                ((h6) obj).u(i13);
                return;
            case 8:
                ((v7) obj).f38901a[i13].setVisibility(8);
                return;
            case 9:
                xw xwVar = (xw) obj;
                ug.p0 p0Var = xwVar.f40414r;
                if (i13 == 1) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                p0Var.setVisibility(i7);
                TextView textView = xwVar.h;
                if (i13 == 2) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                textView.setVisibility(i10);
                TextView textView2 = xwVar.f40413n;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 10:
                n40 n40Var = (n40) obj;
                if (i13 == n40Var.f36231t0) {
                    n40Var.f36236x.setRotationY(0.0f);
                    n40Var.f36228r0 = true;
                    n40Var.f36210c0 = null;
                    a8.b("RoundVideo camera flip visual animation completed: elapsedMs=" + n40.m(n40Var));
                    n40.n(n40Var);
                    return;
                }
                return;
            case 11:
                nf0 nf0Var = (nf0) obj;
                nf0Var.H = null;
                nf0Var.P.f37972d1.delete(i13);
                return;
            case 12:
                xp xpVar = (xp) obj;
                ((si0) xpVar.d).f38005b.remove(i13);
                si0 si0Var = (si0) xpVar.d;
                si0Var.d = true;
                si0Var.f38004a.invalidate();
                return;
            case 13:
                zq0 zq0Var = (zq0) obj;
                zq0Var.f41097e.R1.remove(i13);
                zq0Var.f41094a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.z0 z0Var = (org.telegram.ui.Components.voip.z0) obj;
                z0Var.f39687y = -1;
                z0Var.f39685w = i13;
                z0Var.f39684s = 0.0f;
                z0Var.U = null;
                z0Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f14797a) {
            case 9:
                xw xwVar = (xw) this.f14799c;
                xwVar.f40414r.setVisibility(0);
                xwVar.h.setVisibility(0);
                xwVar.f40413n.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}

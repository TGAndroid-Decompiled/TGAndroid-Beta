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
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.xw;
import org.telegram.ui.Components.yq0;
import org.telegram.ui.vp;
public final class m2 extends AnimatorListenerAdapter {
    public final int f14792a;
    public final int f14793b;
    public final Object f14794c;

    public m2(Object obj, int i7, int i10) {
        this.f14792a = i10;
        this.f14794c = obj;
        this.f14793b = i7;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f14792a) {
            case 4:
                AnimatorSet[] animatorSetArr = ((org.telegram.ui.ActionBar.u1) this.f14794c).F;
                int i7 = this.f14793b;
                AnimatorSet animatorSet = animatorSetArr[i7];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i7] = null;
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) this.f14794c;
                AnimatorSet animatorSet2 = v2Var.f28655z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    v2Var.f28655z0 = null;
                    v2Var.A0 = 0;
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
        int i11 = this.f14792a;
        int i12 = 8;
        boolean z9 = true;
        int i13 = this.f14793b;
        Object obj = this.f14794c;
        switch (i11) {
            case 0:
                a3 a3Var = (a3) obj;
                a3Var.Q.setColor(i13);
                a3Var.F();
                a3Var.f14519f.invalidate();
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
                s2 s2Var = c4Var.f14592n;
                if (s2Var.getWebView() != null) {
                    s2Var.getWebView().setScrollY(i13);
                }
                if (animator == c4Var.f14593r) {
                    c4Var.f14593r = null;
                    return;
                }
                return;
            case 2:
                s4 s4Var = (s4) obj;
                s4Var.W = i13;
                s4Var.f18838a0 = 0.0f;
                s4Var.requestLayout();
                s4Var.invalidate();
                return;
            case 3:
                wu wuVar = (wu) obj;
                wuVar.f26371a0 = i13;
                wuVar.f26372b0 = 0.0f;
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
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) obj;
                AnimatorSet animatorSet2 = v2Var.f28655z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    v2Var.f28655z0 = null;
                    v2Var.A0 = 0;
                    DialogInterface.OnClickListener onClickListener = v2Var.K;
                    if (onClickListener != null) {
                        onClickListener.onClick(v2Var, i13);
                    }
                    org.telegram.messenger.g0.h3(new l2.w(this, 22));
                }
                qs.e().k(99, 512);
                return;
            case 6:
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) obj;
                if (!f4Var.c()) {
                    f4Var.b(i13);
                }
                f4Var.f29104d0 = null;
                return;
            case 7:
                ((i6) obj).u(i13);
                return;
            case 8:
                ((w7) obj).f39885a[i13].setVisibility(8);
                return;
            case 9:
                xw xwVar = (xw) obj;
                ug.p0 p0Var = xwVar.f40463r;
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
                TextView textView2 = xwVar.f40462n;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 10:
                n40 n40Var = (n40) obj;
                if (i13 == n40Var.f36216s0) {
                    n40Var.f36222x.setRotationY(0.0f);
                    n40Var.f36212q0 = true;
                    n40Var.f36195b0 = null;
                    a8.b("RoundVideo camera flip visual animation completed: elapsedMs=" + n40.l(n40Var));
                    n40.m(n40Var);
                    return;
                }
                return;
            case 11:
                nf0 nf0Var = (nf0) obj;
                nf0Var.H = null;
                nf0Var.P.f38035d1.delete(i13);
                return;
            case 12:
                vp vpVar = (vp) obj;
                ((si0) vpVar.d).f38072b.remove(i13);
                si0 si0Var = (si0) vpVar.d;
                si0Var.d = true;
                si0Var.f38071a.invalidate();
                return;
            case 13:
                yq0 yq0Var = (yq0) obj;
                yq0Var.f40711e.R1.remove(i13);
                yq0Var.f40708a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.z0 z0Var = (org.telegram.ui.Components.voip.z0) obj;
                z0Var.f39641y = -1;
                z0Var.f39639w = i13;
                z0Var.f39638s = 0.0f;
                z0Var.U = null;
                z0Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f14792a) {
            case 9:
                xw xwVar = (xw) this.f14794c;
                xwVar.f40463r.setVisibility(0);
                xwVar.h.setVisibility(0);
                xwVar.f40462n.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}

package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.at;
import org.telegram.messenger.f8;
import org.telegram.messenger.iv;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.qg0;
import org.telegram.ui.Components.r7;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.uq;
public final class d5 extends AnimatorListenerAdapter {
    public final int f2960a;
    public final int f2961b;
    public final Object f2962c;

    public d5(Object obj, int i10, int i11) {
        this.f2960a = i11;
        this.f2962c = obj;
        this.f2961b = i10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f2960a) {
            case 2:
                AnimatorSet[] animatorSetArr = ((org.telegram.ui.ActionBar.x1) this.f2962c).F;
                int i10 = this.f2961b;
                AnimatorSet animatorSet = animatorSetArr[i10];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i10] = null;
                    return;
                }
                return;
            case 3:
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.f2962c;
                AnimatorSet animatorSet2 = z2Var.f21625z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    z2Var.f21625z0 = null;
                    z2Var.A0 = 0;
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
        int i10;
        int i11;
        int i12 = this.f2960a;
        int i13 = 8;
        boolean z10 = true;
        int i14 = this.f2961b;
        Object obj = this.f2962c;
        switch (i12) {
            case 0:
                f5 f5Var = (f5) obj;
                f5Var.W = i14;
                f5Var.f3001a0 = 0.0f;
                f5Var.requestLayout();
                f5Var.invalidate();
                return;
            case 1:
                iv ivVar = (iv) obj;
                ivVar.f16350a0 = i14;
                ivVar.f16351b0 = 0.0f;
                View view = ivVar.V;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 2:
                AnimatorSet[] animatorSetArr = ((org.telegram.ui.ActionBar.x1) obj).F;
                AnimatorSet animatorSet = animatorSetArr[i14];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i14] = null;
                    return;
                }
                return;
            case 3:
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj;
                AnimatorSet animatorSet2 = z2Var.f21625z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    z2Var.f21625z0 = null;
                    z2Var.A0 = 0;
                    DialogInterface.OnClickListener onClickListener = z2Var.K;
                    if (onClickListener != null) {
                        onClickListener.onClick(z2Var, i14);
                    }
                    org.telegram.messenger.i0.g3(new lg.s(this, 21));
                }
                at.e().k(99, 512);
                return;
            case 4:
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) obj;
                if (!h4Var.c()) {
                    h4Var.b(i14);
                }
                h4Var.f21979d0 = null;
                return;
            case 5:
                ((org.telegram.ui.Components.e6) obj).u(i14);
                return;
            case 6:
                ((r7) obj).f29902a[i14].setVisibility(8);
                return;
            case 7:
                ((hp) obj).f26899a[i14].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(gr.f26524g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 8:
                mx mxVar = (mx) obj;
                kg.x0 x0Var = mxVar.f28599r;
                if (i14 == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                x0Var.setVisibility(i10);
                TextView textView = mxVar.h;
                if (i14 == 2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                textView.setVisibility(i11);
                TextView textView2 = mxVar.f28598n;
                if (i14 == 3) {
                    i13 = 0;
                }
                textView2.setVisibility(i13);
                return;
            case 9:
                d50 d50Var = (d50) obj;
                if (i14 == d50Var.f25400s0) {
                    d50Var.f25406x.setRotationY(0.0f);
                    d50Var.f25396q0 = true;
                    d50Var.f25380b0 = null;
                    f8.b("RoundVideo camera flip visual animation completed: elapsedMs=" + d50.l(d50Var));
                    d50.m(d50Var);
                    return;
                }
                return;
            case 10:
                qg0 qg0Var = (qg0) obj;
                qg0Var.H = null;
                qg0Var.P.f31288d1.delete(i14);
                return;
            case 11:
                uq uqVar = (uq) obj;
                ((xj0) uqVar.d).f32593b.remove(i14);
                xj0 xj0Var = (xj0) uqVar.d;
                xj0Var.d = true;
                xj0Var.f32592a.invalidate();
                return;
            case 12:
                as0 as0Var = (as0) obj;
                as0Var.e.R1.remove(i14);
                as0Var.f24483a.invalidate();
                return;
            case 13:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) obj;
                m0Var.f31600y = -1;
                m0Var.f31598w = i14;
                m0Var.f31597s = 0.0f;
                m0Var.U = null;
                m0Var.e();
                return;
            case 14:
                xh.m2 m2Var = (xh.m2) obj;
                m2Var.Q.setColor(i14);
                m2Var.F();
                m2Var.f53899f.invalidate();
                org.telegram.ui.b3 b3Var = m2Var.Y0;
                if (b3Var != null) {
                    if (org.telegram.messenger.i0.B(m2Var.Q.getColor()) > 0.721f) {
                        z10 = false;
                    }
                    b3Var.b(z10, false);
                    m2Var.Y0.setBackgroundColor(m2Var.Q.getColor());
                }
                m2Var.K();
                return;
            default:
                xh.j3 j3Var = (xh.j3) obj;
                xh.e2 e2Var = j3Var.f53846n;
                if (e2Var.getWebView() != null) {
                    e2Var.getWebView().setScrollY(i14);
                }
                if (animator == j3Var.f53847r) {
                    j3Var.f53847r = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f2960a) {
            case 8:
                mx mxVar = (mx) this.f2962c;
                mxVar.f28599r.setVisibility(0);
                mxVar.h.setVisibility(0);
                mxVar.f28598n.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}

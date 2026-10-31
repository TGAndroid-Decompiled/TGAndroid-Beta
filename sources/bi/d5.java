package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.f8;
import org.telegram.messenger.hv;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.r7;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.zr0;
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
                AnimatorSet animatorSet2 = z2Var.f21624z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    z2Var.f21624z0 = null;
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
                hv hvVar = (hv) obj;
                hvVar.f15958a0 = i14;
                hvVar.f15959b0 = 0.0f;
                View view = hvVar.V;
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
                AnimatorSet animatorSet2 = z2Var.f21624z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    z2Var.f21624z0 = null;
                    z2Var.A0 = 0;
                    DialogInterface.OnClickListener onClickListener = z2Var.K;
                    if (onClickListener != null) {
                        onClickListener.onClick(z2Var, i14);
                    }
                    org.telegram.messenger.i0.g3(new lg.s(this, 21));
                }
                zs.e().k(99, 512);
                return;
            case 4:
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) obj;
                if (!h4Var.c()) {
                    h4Var.b(i14);
                }
                h4Var.f21978d0 = null;
                return;
            case 5:
                ((org.telegram.ui.Components.e6) obj).u(i14);
                return;
            case 6:
                ((r7) obj).f29847a[i14].setVisibility(8);
                return;
            case 7:
                ((hp) obj).f26787a[i14].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(gr.f26496g).setStartDelay(0L).setDuration(100L).start();
                return;
            case 8:
                mx mxVar = (mx) obj;
                kg.x0 x0Var = mxVar.f28622r;
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
                TextView textView2 = mxVar.f28621n;
                if (i14 == 3) {
                    i13 = 0;
                }
                textView2.setVisibility(i13);
                return;
            case 9:
                d50 d50Var = (d50) obj;
                if (i14 == d50Var.f25329s0) {
                    d50Var.f25335x.setRotationY(0.0f);
                    d50Var.f25325q0 = true;
                    d50Var.f25309b0 = null;
                    f8.b("RoundVideo camera flip visual animation completed: elapsedMs=" + d50.l(d50Var));
                    d50.m(d50Var);
                    return;
                }
                return;
            case 10:
                pg0 pg0Var = (pg0) obj;
                pg0Var.H = null;
                pg0Var.P.f30929d1.delete(i14);
                return;
            case 11:
                uq uqVar = (uq) obj;
                ((wj0) uqVar.d).f32210b.remove(i14);
                wj0 wj0Var = (wj0) uqVar.d;
                wj0Var.d = true;
                wj0Var.f32209a.invalidate();
                return;
            case 12:
                zr0 zr0Var = (zr0) obj;
                zr0Var.e.R1.remove(i14);
                zr0Var.f33155a.invalidate();
                return;
            case 13:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) obj;
                l0Var.f31521y = -1;
                l0Var.f31519w = i14;
                l0Var.f31518s = 0.0f;
                l0Var.U = null;
                l0Var.e();
                return;
            case 14:
                xh.m2 m2Var = (xh.m2) obj;
                m2Var.Q.setColor(i14);
                m2Var.F();
                m2Var.f53882f.invalidate();
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
                xh.i3 i3Var = (xh.i3) obj;
                xh.e2 e2Var = i3Var.f53809n;
                if (e2Var.getWebView() != null) {
                    e2Var.getWebView().setScrollY(i14);
                }
                if (animator == i3Var.f53810r) {
                    i3Var.f53810r = null;
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
                mxVar.f28622r.setVisibility(0);
                mxVar.h.setVisibility(0);
                mxVar.f28621n.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}

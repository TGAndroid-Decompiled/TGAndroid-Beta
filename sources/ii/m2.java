package ii;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import mi.t4;
import org.telegram.messenger.a8;
import org.telegram.messenger.hs;
import org.telegram.messenger.ou;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.u7;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.Components.ww;
import org.telegram.ui.Components.yq0;
import org.telegram.ui.tp;
public final class m2 extends AnimatorListenerAdapter {
    public final int f15077a;
    public final int f15078b;
    public final Object f15079c;

    public m2(Object obj, int i3, int i10) {
        this.f15077a = i10;
        this.f15079c = obj;
        this.f15078b = i3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f15077a) {
            case 4:
                AnimatorSet[] animatorSetArr = ((org.telegram.ui.ActionBar.s1) this.f15079c).G;
                int i3 = this.f15078b;
                AnimatorSet animatorSet = animatorSetArr[i3];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i3] = null;
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.f15079c;
                AnimatorSet animatorSet2 = t2Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t2Var.A0 = null;
                    t2Var.B0 = 0;
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
        int i3;
        int i10;
        int i11 = this.f15077a;
        int i12 = 8;
        boolean z10 = true;
        int i13 = this.f15078b;
        Object obj = this.f15079c;
        switch (i11) {
            case 0:
                a3 a3Var = (a3) obj;
                a3Var.R.setColor(i13);
                a3Var.F();
                a3Var.f14802f.invalidate();
                org.telegram.ui.c3 c3Var = a3Var.Z0;
                if (c3Var != null) {
                    if (org.telegram.messenger.g0.B(a3Var.R.getColor()) > 0.721f) {
                        z10 = false;
                    }
                    c3Var.b(z10, false);
                    a3Var.Z0.setBackgroundColor(a3Var.R.getColor());
                }
                a3Var.K();
                return;
            case 1:
                d4 d4Var = (d4) obj;
                s2 s2Var = d4Var.f14898n;
                if (s2Var.getWebView() != null) {
                    s2Var.getWebView().setScrollY(i13);
                }
                if (animator == d4Var.f14899r) {
                    d4Var.f14899r = null;
                    return;
                }
                return;
            case 2:
                t4 t4Var = (t4) obj;
                t4Var.f19939a0 = i13;
                t4Var.f19940b0 = 0.0f;
                t4Var.requestLayout();
                t4Var.invalidate();
                return;
            case 3:
                ou ouVar = (ou) obj;
                ouVar.f24602b0 = i13;
                ouVar.f24603c0 = 0.0f;
                View view = ouVar.W;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 4:
                AnimatorSet[] animatorSetArr = ((org.telegram.ui.ActionBar.s1) obj).G;
                AnimatorSet animatorSet = animatorSetArr[i13];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i13] = null;
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) obj;
                AnimatorSet animatorSet2 = t2Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t2Var.A0 = null;
                    t2Var.B0 = 0;
                    DialogInterface.OnClickListener onClickListener = t2Var.L;
                    if (onClickListener != null) {
                        onClickListener.onClick(t2Var, i13);
                    }
                    org.telegram.messenger.g0.h3(new lg.n(this, 25));
                }
                hs.e().k(99, 512);
                return;
            case 6:
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) obj;
                if (!f4Var.c()) {
                    f4Var.b(i13);
                }
                f4Var.f29164e0 = null;
                return;
            case 7:
                ((g6) obj).u(i13);
                return;
            case 8:
                ((u7) obj).f38663a[i13].setVisibility(8);
                return;
            case 9:
                ww wwVar = (ww) obj;
                vg.o0 o0Var = wwVar.f40162r;
                if (i13 == 1) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                o0Var.setVisibility(i3);
                TextView textView = wwVar.h;
                if (i13 == 2) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                textView.setVisibility(i10);
                TextView textView2 = wwVar.f40161n;
                if (i13 == 3) {
                    i12 = 0;
                }
                textView2.setVisibility(i12);
                return;
            case 10:
                j40 j40Var = (j40) obj;
                if (i13 == j40Var.f34951t0) {
                    j40Var.f34956x.setRotationY(0.0f);
                    j40Var.f34948r0 = true;
                    j40Var.f34930c0 = null;
                    a8.b("RoundVideo camera flip visual animation completed: elapsedMs=" + j40.l(j40Var));
                    j40.m(j40Var);
                    return;
                }
                return;
            case 11:
                qf0 qf0Var = (qf0) obj;
                qf0Var.I = null;
                qf0Var.Q.f39096e1.delete(i13);
                return;
            case 12:
                tp tpVar = (tp) obj;
                ((wi0) tpVar.d).f40014b.remove(i13);
                wi0 wi0Var = (wi0) tpVar.d;
                wi0Var.d = true;
                wi0Var.f40013a.invalidate();
                return;
            case 13:
                yq0 yq0Var = (yq0) obj;
                yq0Var.f40808e.S1.remove(i13);
                yq0Var.f40805a.invalidate();
                return;
            default:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) obj;
                l0Var.f39455y = -1;
                l0Var.f39453w = i13;
                l0Var.f39452s = 0.0f;
                l0Var.V = null;
                l0Var.e();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f15077a) {
            case 9:
                ww wwVar = (ww) this.f15079c;
                wwVar.f40162r.setVisibility(0);
                wwVar.h.setVisibility(0);
                wwVar.f40161n.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}

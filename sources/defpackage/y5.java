package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
public final class y5 extends AnimatorListenerAdapter {
    public final byte a;
    public boolean b;
    public final boolean c;
    public final Object d;

    public y5(s4b s4bVar, int i, boolean z) {
        this.a = (byte) 5;
        this.d = s4bVar;
        this.b = i;
        this.c = z;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 1:
                this.b = true;
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                actionBarLayout.k1 = false;
                actionBarLayout.s.setAlpha(1.0f);
                actionBarLayout.O(true);
                actionBarLayout.o1 = null;
                return;
            case 2:
            default:
                super.onAnimationCancel(animator);
                return;
            case 3:
                n12 n12Var = (n12) obj;
                if (animator.equals(n12Var.J2)) {
                    n12Var.J2 = null;
                    return;
                }
                return;
            case 4:
                AnimatorSet[] animatorSetArr = ((qh6) obj).L;
                int i = !this.b ? 1 : 0;
                AnimatorSet animatorSet = animatorSetArr[i];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i] = null;
                    return;
                }
                return;
            case 5:
                AnimatorSet[] animatorSetArr2 = ((s4b) obj).C1;
                boolean z = this.b;
                AnimatorSet animatorSet2 = animatorSetArr2[z ? 1 : 0];
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    animatorSetArr2[z ? 1 : 0] = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        f12 f12Var;
        byte b = this.a;
        int i = 8;
        float f = 1.0f;
        boolean z = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                a aVar = (a) obj;
                ema[] emaVarArr = aVar.n;
                ema emaVar = emaVarArr[1];
                if (emaVar != null && emaVar.getParent() != null) {
                    ((ViewGroup) emaVarArr[1].getParent()).removeView(emaVarArr[1]);
                }
                emaVarArr[1] = null;
                aVar.y0 = false;
                if (this.b && z) {
                    aVar.r.setVisibility(8);
                }
                aVar.requestLayout();
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                if (!this.b) {
                    actionBarLayout.k1 = false;
                    actionBarLayout.s.setAlpha(1.0f);
                    actionBarLayout.O(z);
                    actionBarLayout.o1 = null;
                    return;
                }
                return;
            case 2:
                ob0 ob0Var = (ob0) obj;
                ob0Var.H = null;
                boolean z2 = this.b;
                if (!z2) {
                    f = 0.0f;
                }
                ob0Var.m0(false, f);
                if (z) {
                    fb0 fb0Var = ob0Var.a;
                    fb0Var.x = -1.0f;
                    fb0Var.setExpanded(z2);
                    return;
                }
                return;
            case 3:
                boolean z3 = this.b;
                n12 n12Var = (n12) obj;
                if (animator.equals(n12Var.J2)) {
                    if (!z3) {
                        if (!n12Var.H1) {
                            n12Var.A2.setVisibility(4);
                        }
                        n12Var.E2.setVisibility(4);
                    } else if (n12Var.P2 && ((f12Var = n12Var.v2) == null || f12Var.M())) {
                        n12Var.u3.setVisibility(4);
                    }
                    if (z) {
                        n12Var.M1();
                        tt ttVar = n12Var.L2;
                        if (z3) {
                            i = 0;
                        }
                        ttVar.setVisibility(i);
                    }
                    n12Var.J2 = null;
                    return;
                }
                return;
            case 4:
                qh6 qh6Var = (qh6) obj;
                AnimatorSet[] animatorSetArr = qh6Var.L;
                boolean z4 = this.b;
                AnimatorSet animatorSet = animatorSetArr[!z4 ? 1 : 0];
                if (animatorSet != null && animatorSet.equals(animator) && !z && z4 && qh6Var.N.getAlpha() != 1.0f) {
                    qh6Var.N.setAlpha(1.0f);
                    qh6Var.N.setScaleX(1.0f);
                    qh6Var.N.setScaleY(1.0f);
                    qh6Var.N.setVisibility(0);
                    return;
                }
                return;
            default:
                s4b s4bVar = (s4b) obj;
                AnimatorSet[] animatorSetArr2 = s4bVar.C1;
                boolean z5 = this.b;
                AnimatorSet animatorSet2 = animatorSetArr2[z5 ? 1 : 0];
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z) {
                        s4bVar.D1[z5 ? 1 : 0].setVisibility(4);
                    }
                    animatorSetArr2[z5 ? 1 : 0] = null;
                    return;
                }
                return;
        }
    }

    public y5(ActionBarLayout actionBarLayout, boolean z) {
        this.a = (byte) 1;
        this.d = actionBarLayout;
        this.c = z;
    }

    public y5(Object obj, boolean z, boolean z2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = z;
        this.c = z2;
    }
}

package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
public final class x5 extends AnimatorListenerAdapter {
    public final byte a;
    public boolean b;
    public final boolean c;
    public final Object d;

    public x5(x2b x2bVar, int i, boolean z) {
        this.a = (byte) 5;
        this.d = x2bVar;
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
                i22 i22Var = (i22) obj;
                if (animator.equals(i22Var.J2)) {
                    i22Var.J2 = null;
                    return;
                }
                return;
            case 4:
                AnimatorSet[] animatorSetArr = ((mh6) obj).L;
                int i = !this.b ? 1 : 0;
                AnimatorSet animatorSet = animatorSetArr[i];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i] = null;
                    return;
                }
                return;
            case 5:
                AnimatorSet[] animatorSetArr2 = ((x2b) obj).C1;
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
        a22 a22Var;
        byte b = this.a;
        int i = 8;
        float f = 1.0f;
        boolean z = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                a aVar = (a) obj;
                lka[] lkaVarArr = aVar.n;
                lka lkaVar = lkaVarArr[1];
                if (lkaVar != null && lkaVar.getParent() != null) {
                    ((ViewGroup) lkaVarArr[1].getParent()).removeView(lkaVarArr[1]);
                }
                lkaVarArr[1] = null;
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
                mc0 mc0Var = (mc0) obj;
                mc0Var.H = null;
                boolean z2 = this.b;
                if (!z2) {
                    f = 0.0f;
                }
                mc0Var.n0(false, f);
                if (z) {
                    dc0 dc0Var = mc0Var.a;
                    dc0Var.x = -1.0f;
                    dc0Var.setExpanded(z2);
                    return;
                }
                return;
            case 3:
                boolean z3 = this.b;
                i22 i22Var = (i22) obj;
                if (animator.equals(i22Var.J2)) {
                    if (!z3) {
                        if (!i22Var.H1) {
                            i22Var.A2.setVisibility(4);
                        }
                        i22Var.E2.setVisibility(4);
                    } else if (i22Var.P2 && ((a22Var = i22Var.v2) == null || a22Var.M())) {
                        i22Var.u3.setVisibility(4);
                    }
                    if (z) {
                        i22Var.L1();
                        su suVar = i22Var.L2;
                        if (z3) {
                            i = 0;
                        }
                        suVar.setVisibility(i);
                    }
                    i22Var.J2 = null;
                    return;
                }
                return;
            case 4:
                mh6 mh6Var = (mh6) obj;
                AnimatorSet[] animatorSetArr = mh6Var.L;
                boolean z4 = this.b;
                AnimatorSet animatorSet = animatorSetArr[!z4 ? 1 : 0];
                if (animatorSet != null && animatorSet.equals(animator) && !z && z4 && mh6Var.N.getAlpha() != 1.0f) {
                    mh6Var.N.setAlpha(1.0f);
                    mh6Var.N.setScaleX(1.0f);
                    mh6Var.N.setScaleY(1.0f);
                    mh6Var.N.setVisibility(0);
                    return;
                }
                return;
            default:
                x2b x2bVar = (x2b) obj;
                AnimatorSet[] animatorSetArr2 = x2bVar.C1;
                boolean z5 = this.b;
                AnimatorSet animatorSet2 = animatorSetArr2[z5 ? 1 : 0];
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z) {
                        x2bVar.D1[z5 ? 1 : 0].setVisibility(4);
                    }
                    animatorSetArr2[z5 ? 1 : 0] = null;
                    return;
                }
                return;
        }
    }

    public x5(ActionBarLayout actionBarLayout, boolean z) {
        this.a = (byte) 1;
        this.d = actionBarLayout;
        this.c = z;
    }

    public x5(Object obj, boolean z, boolean z2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = z;
        this.c = z2;
    }
}

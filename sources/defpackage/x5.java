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

    public x5(u0b u0bVar, int i, boolean z) {
        this.a = (byte) 5;
        this.d = u0bVar;
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
                x02 x02Var = (x02) obj;
                if (animator.equals(x02Var.J2)) {
                    x02Var.J2 = null;
                    return;
                }
                return;
            case 4:
                AnimatorSet[] animatorSetArr = ((mf6) obj).L;
                int i = !this.b ? 1 : 0;
                AnimatorSet animatorSet = animatorSetArr[i];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[i] = null;
                    return;
                }
                return;
            case 5:
                AnimatorSet[] animatorSetArr2 = ((u0b) obj).C1;
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
        p02 p02Var;
        byte b = this.a;
        int i = 8;
        float f = 1.0f;
        boolean z = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                a aVar = (a) obj;
                jia[] jiaVarArr = aVar.n;
                jia jiaVar = jiaVarArr[1];
                if (jiaVar != null && jiaVar.getParent() != null) {
                    ((ViewGroup) jiaVarArr[1].getParent()).removeView(jiaVarArr[1]);
                }
                jiaVarArr[1] = null;
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
                mb0 mb0Var = (mb0) obj;
                mb0Var.H = null;
                boolean z2 = this.b;
                if (!z2) {
                    f = 0.0f;
                }
                mb0Var.m0(false, f);
                if (z) {
                    db0 db0Var = mb0Var.a;
                    db0Var.x = -1.0f;
                    db0Var.setExpanded(z2);
                    return;
                }
                return;
            case 3:
                boolean z3 = this.b;
                x02 x02Var = (x02) obj;
                if (animator.equals(x02Var.J2)) {
                    if (!z3) {
                        if (!x02Var.H1) {
                            x02Var.A2.setVisibility(4);
                        }
                        x02Var.E2.setVisibility(4);
                    } else if (x02Var.P2 && ((p02Var = x02Var.v2) == null || p02Var.N())) {
                        x02Var.u3.setVisibility(4);
                    }
                    if (z) {
                        x02Var.L1();
                        st stVar = x02Var.L2;
                        if (z3) {
                            i = 0;
                        }
                        stVar.setVisibility(i);
                    }
                    x02Var.J2 = null;
                    return;
                }
                return;
            case 4:
                mf6 mf6Var = (mf6) obj;
                AnimatorSet[] animatorSetArr = mf6Var.L;
                boolean z4 = this.b;
                AnimatorSet animatorSet = animatorSetArr[!z4 ? 1 : 0];
                if (animatorSet != null && animatorSet.equals(animator) && !z && z4 && mf6Var.N.getAlpha() != 1.0f) {
                    mf6Var.N.setAlpha(1.0f);
                    mf6Var.N.setScaleX(1.0f);
                    mf6Var.N.setScaleY(1.0f);
                    mf6Var.N.setVisibility(0);
                    return;
                }
                return;
            default:
                u0b u0bVar = (u0b) obj;
                AnimatorSet[] animatorSetArr2 = u0bVar.C1;
                boolean z5 = this.b;
                AnimatorSet animatorSet2 = animatorSetArr2[z5 ? 1 : 0];
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z) {
                        u0bVar.D1[z5 ? 1 : 0].setVisibility(4);
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

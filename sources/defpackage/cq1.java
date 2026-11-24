package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class cq1 extends AnimatorListenerAdapter {
    public final boolean a;
    public final boolean b;
    public final bf0 c;
    public final xv1 d;
    public final lka e;
    public final boolean f;
    public final mv1 h;
    public final yv1 n;

    public cq1(yv1 yv1Var, boolean z, boolean z2, bf0 bf0Var, xv1 xv1Var, lka lkaVar, boolean z3, mv1 mv1Var) {
        this.n = yv1Var;
        this.a = z;
        this.b = z2;
        this.c = bf0Var;
        this.d = xv1Var;
        this.e = lkaVar;
        this.f = z3;
        this.h = mv1Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        yv1 yv1Var = this.n;
        yv1Var.W2[1] = null;
        yv1Var.Q2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.n.W2;
        if (animator.equals(objArr[1])) {
            bf0 bf0Var = this.c;
            boolean z = this.b;
            boolean z2 = this.a;
            if (!z2 && !z && bf0Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(d53.h);
            objArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z2) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, View.TRANSLATION_Y, 0.0f));
            }
            if (z) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, View.TRANSLATION_Y, 0.0f));
            }
            if (this.f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, View.TRANSLATION_Y, 0.0f));
            }
            if (bf0Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(bf0Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new b91(this, (byte) 7));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}

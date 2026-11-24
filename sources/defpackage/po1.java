package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class po1 extends AnimatorListenerAdapter {
    public final boolean a;
    public final boolean b;
    public final be0 c;
    public final lu1 d;
    public final jia e;
    public final boolean f;
    public final au1 h;
    public final mu1 n;

    public po1(mu1 mu1Var, boolean z, boolean z2, be0 be0Var, lu1 lu1Var, jia jiaVar, boolean z3, au1 au1Var) {
        this.n = mu1Var;
        this.a = z;
        this.b = z2;
        this.c = be0Var;
        this.d = lu1Var;
        this.e = jiaVar;
        this.f = z3;
        this.h = au1Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        mu1 mu1Var = this.n;
        mu1Var.W2[1] = null;
        mu1Var.Q2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.n.W2;
        if (animator.equals(objArr[1])) {
            be0 be0Var = this.c;
            boolean z = this.b;
            boolean z2 = this.a;
            if (!z2 && !z && be0Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(s33.h);
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
            if (be0Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(be0Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new bb1(this, (byte) 5));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}

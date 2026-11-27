package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
public final class dp1 extends AnimatorListenerAdapter {
    public final boolean a;
    public final boolean b;
    public final de0 c;
    public final yu1 d;
    public final ema e;
    public final boolean f;
    public final nu1 h;
    public final zu1 n;

    public dp1(zu1 zu1Var, boolean z, boolean z2, de0 de0Var, yu1 yu1Var, ema emaVar, boolean z3, nu1 nu1Var) {
        this.n = zu1Var;
        this.a = z;
        this.b = z2;
        this.c = de0Var;
        this.d = yu1Var;
        this.e = emaVar;
        this.f = z3;
        this.h = nu1Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        zu1 zu1Var = this.n;
        zu1Var.W2[1] = null;
        zu1Var.Q2[1].setTranslationY(0.0f);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Object[] objArr = this.n.W2;
        if (animator.equals(objArr[1])) {
            de0 de0Var = this.c;
            boolean z = this.b;
            boolean z2 = this.a;
            if (!z2 && !z && de0Var == null) {
                objArr[1] = null;
                return;
            }
            objArr[1] = new AnimatorSet();
            objArr[1].setInterpolator(k43.h);
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
            if (de0Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(de0Var, View.TRANSLATION_Y, 0.0f));
            }
            objArr[1].addListener(new jb1(this, (byte) 5));
            objArr[1].playTogether(arrayList);
            objArr[1].start();
        }
    }
}

package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class x71 extends AnimatorListenerAdapter {
    public final a81 a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final boolean f;
    public final y71 h;

    public x71(y71 y71Var, a81 a81Var, float f, float f2, float f3, int i, boolean z) {
        this.h = y71Var;
        this.a = a81Var;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = i;
        this.f = z;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f = this.b;
        a81 a81Var = this.a;
        a81Var.a = f;
        a81Var.b = this.c;
        a81Var.c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        y71 y71Var = this.h;
        SparseArray sparseArray = y71Var.w;
        int i = this.e;
        sparseArray.remove(i);
        if (!this.f) {
            y71Var.x.remove(i);
        }
    }
}

package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class g91 extends AnimatorListenerAdapter {
    public final j91 a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final boolean f;
    public final h91 h;

    public g91(h91 h91Var, j91 j91Var, float f, float f2, float f3, int i, boolean z) {
        this.h = h91Var;
        this.a = j91Var;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = i;
        this.f = z;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f = this.b;
        j91 j91Var = this.a;
        j91Var.a = f;
        j91Var.b = this.c;
        j91Var.c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h91 h91Var = this.h;
        SparseArray sparseArray = h91Var.w;
        int i = this.e;
        sparseArray.remove(i);
        if (!this.f) {
            h91Var.x.remove(i);
        }
    }
}

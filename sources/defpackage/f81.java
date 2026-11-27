package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.SparseArray;
public final class f81 extends AnimatorListenerAdapter {
    public final i81 a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final boolean f;
    public final g81 h;

    public f81(g81 g81Var, i81 i81Var, float f, float f2, float f3, int i, boolean z) {
        this.h = g81Var;
        this.a = i81Var;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = i;
        this.f = z;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f = this.b;
        i81 i81Var = this.a;
        i81Var.a = f;
        i81Var.b = this.c;
        i81Var.c = this.d;
        this.h.invalidate();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        g81 g81Var = this.h;
        SparseArray sparseArray = g81Var.w;
        int i = this.e;
        sparseArray.remove(i);
        if (!this.f) {
            g81Var.x.remove(i);
        }
    }
}

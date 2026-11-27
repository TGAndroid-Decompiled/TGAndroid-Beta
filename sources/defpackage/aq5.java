package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class aq5 extends AnimatorListenerAdapter {
    public final vg8 a;
    public final float b;
    public final v01 c;
    public final boolean d;
    public final ja9 e;
    public final bq5 f;

    public aq5(bq5 bq5Var, vg8 vg8Var, float f, v01 v01Var, boolean z, ja9 ja9Var) {
        this.f = bq5Var;
        this.a = vg8Var;
        this.b = f;
        this.c = v01Var;
        this.d = z;
        this.e = ja9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        oa9 oa9Var;
        bq5 bq5Var = this.f;
        bq5Var.x = null;
        j18 j18Var = new j18(new vg8[]{this.a});
        pa9 pa9Var = bq5Var.a;
        j18Var.c = pa9Var.getCurrentColor();
        j18Var.d = this.b * 1.0f;
        v01 v01Var = this.c;
        j18Var.e = v01Var;
        v01Var.getClass();
        if (v01Var instanceof r01) {
            currentColor = -1;
        } else {
            currentColor = pa9Var.getCurrentColor();
        }
        nx7 painting = pa9Var.getPainting();
        boolean z = this.d;
        painting.c(j18Var, currentColor, z, null);
        if (z && (oa9Var = pa9Var.a) != null) {
            oa9Var.O();
        }
        ja9 ja9Var = this.e;
        if (ja9Var != null) {
            ja9Var.run();
        }
    }
}

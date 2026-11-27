package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class a0b extends AnimatorListenerAdapter {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final b0b e;

    public a0b(b0b b0bVar, int i, int i2, int i3, int i4) {
        this.e = b0bVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f = vm2.f(1.0f, this.a, this.b);
        b0b b0bVar = this.e;
        b0bVar.r = f;
        b0bVar.s = vm2.f(1.0f, this.c, this.d);
        b0bVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{b0bVar.r, b0bVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        b0bVar.invalidate();
    }
}

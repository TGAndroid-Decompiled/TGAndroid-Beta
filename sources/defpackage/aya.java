package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class aya extends AnimatorListenerAdapter {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final bya e;

    public aya(bya byaVar, int i, int i2, int i3, int i4) {
        this.e = byaVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f = on2.f(1.0f, this.a, this.b);
        bya byaVar = this.e;
        byaVar.r = f;
        byaVar.s = on2.f(1.0f, this.c, this.d);
        byaVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{byaVar.r, byaVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        byaVar.invalidate();
    }
}

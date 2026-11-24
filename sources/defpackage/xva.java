package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class xva extends AnimatorListenerAdapter {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final yva e;

    public xva(yva yvaVar, int i, int i2, int i3, int i4) {
        this.e = yvaVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f = bm2.f(1.0f, this.a, this.b);
        yva yvaVar = this.e;
        yvaVar.r = f;
        yvaVar.s = bm2.f(1.0f, this.c, this.d);
        yvaVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{yvaVar.r, yvaVar.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        yvaVar.invalidate();
    }
}

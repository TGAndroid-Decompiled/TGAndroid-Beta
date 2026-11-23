package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class hc extends AnimatorListenerAdapter {
    public final int f8982a;
    public final int f8983b;
    public final int f8984c;
    public final int d;
    public final jc f8985e;

    public hc(jc jcVar, int i7, int i10, int i11, int i12) {
        this.f8985e = jcVar;
        this.f8982a = i7;
        this.f8983b = i10;
        this.f8984c = i11;
        this.d = i12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.f8982a, this.f8983b);
        jc jcVar = this.f8985e;
        jcVar.f9114r = f10;
        jcVar.f9115s = i0.a.f(1.0f, this.f8984c, this.d);
        jcVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{jcVar.f9114r, jcVar.f9115s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        jcVar.invalidate();
    }
}

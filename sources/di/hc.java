package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class hc extends AnimatorListenerAdapter {
    public final int f8988a;
    public final int f8989b;
    public final int f8990c;
    public final int d;
    public final jc f8991e;

    public hc(jc jcVar, int i7, int i10, int i11, int i12) {
        this.f8991e = jcVar;
        this.f8988a = i7;
        this.f8989b = i10;
        this.f8990c = i11;
        this.d = i12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.f8988a, this.f8989b);
        jc jcVar = this.f8991e;
        jcVar.f9123r = f10;
        jcVar.f9124s = i0.a.f(1.0f, this.f8990c, this.d);
        jcVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{jcVar.f9123r, jcVar.f9124s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        jcVar.invalidate();
    }
}

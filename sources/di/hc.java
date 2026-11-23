package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class hc extends AnimatorListenerAdapter {
    public final int f8980a;
    public final int f8981b;
    public final int f8982c;
    public final int d;
    public final jc f8983e;

    public hc(jc jcVar, int i7, int i10, int i11, int i12) {
        this.f8983e = jcVar;
        this.f8980a = i7;
        this.f8981b = i10;
        this.f8982c = i11;
        this.d = i12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.f8980a, this.f8981b);
        jc jcVar = this.f8983e;
        jcVar.f9110r = f10;
        jcVar.f9111s = i0.a.f(1.0f, this.f8982c, this.d);
        jcVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{jcVar.f9110r, jcVar.f9111s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        jcVar.invalidate();
    }
}

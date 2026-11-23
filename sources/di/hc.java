package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class hc extends AnimatorListenerAdapter {
    public final int f9019a;
    public final int f9020b;
    public final int f9021c;
    public final int d;
    public final jc f9022e;

    public hc(jc jcVar, int i7, int i10, int i11, int i12) {
        this.f9022e = jcVar;
        this.f9019a = i7;
        this.f9020b = i10;
        this.f9021c = i11;
        this.d = i12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.f9019a, this.f9020b);
        jc jcVar = this.f9022e;
        jcVar.f9149r = f10;
        jcVar.f9150s = i0.a.f(1.0f, this.f9021c, this.d);
        jcVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{jcVar.f9149r, jcVar.f9150s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        jcVar.invalidate();
    }
}

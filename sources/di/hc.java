package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class hc extends AnimatorListenerAdapter {
    public final int f8991a;
    public final int f8992b;
    public final int f8993c;
    public final int d;
    public final jc f8994e;

    public hc(jc jcVar, int i7, int i10, int i11, int i12) {
        this.f8994e = jcVar;
        this.f8991a = i7;
        this.f8992b = i10;
        this.f8993c = i11;
        this.d = i12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.f8991a, this.f8992b);
        jc jcVar = this.f8994e;
        jcVar.f9126r = f10;
        jcVar.f9127s = i0.a.f(1.0f, this.f8993c, this.d);
        jcVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{jcVar.f9126r, jcVar.f9127s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        jcVar.invalidate();
    }
}

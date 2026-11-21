package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class hc extends AnimatorListenerAdapter {
    public final int f9016a;
    public final int f9017b;
    public final int f9018c;
    public final int d;
    public final jc f9019e;

    public hc(jc jcVar, int i7, int i10, int i11, int i12) {
        this.f9019e = jcVar;
        this.f9016a = i7;
        this.f9017b = i10;
        this.f9018c = i11;
        this.d = i12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.f9016a, this.f9017b);
        jc jcVar = this.f9019e;
        jcVar.f9146r = f10;
        jcVar.f9147s = i0.a.f(1.0f, this.f9018c, this.d);
        jcVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{jcVar.f9146r, jcVar.f9147s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        jcVar.invalidate();
    }
}

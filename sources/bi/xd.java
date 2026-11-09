package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class xd extends AnimatorListenerAdapter {
    public final int f5049a;
    public final int f5050b;
    public final int f5051c;
    public final int d;
    public final zd f5052e;

    public xd(zd zdVar, int i7, int i10, int i11, int i12) {
        this.f5052e = zdVar;
        this.f5049a = i7;
        this.f5050b = i10;
        this.f5051c = i11;
        this.d = i12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.f5049a, this.f5050b);
        zd zdVar = this.f5052e;
        zdVar.f5209r = f10;
        zdVar.f5210s = i0.a.f(1.0f, this.f5051c, this.d);
        zdVar.D = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{zdVar.f5209r, zdVar.f5210s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        zdVar.invalidate();
    }
}

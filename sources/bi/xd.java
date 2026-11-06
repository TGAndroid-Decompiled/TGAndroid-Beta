package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class xd extends AnimatorListenerAdapter {
    public final int f5051a;
    public final int f5052b;
    public final int f5053c;
    public final int d;
    public final zd f5054e;

    public xd(zd zdVar, int i7, int i10, int i11, int i12) {
        this.f5054e = zdVar;
        this.f5051a = i7;
        this.f5052b = i10;
        this.f5053c = i11;
        this.d = i12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.f5051a, this.f5052b);
        zd zdVar = this.f5054e;
        zdVar.f5211r = f10;
        zdVar.f5212s = i0.a.f(1.0f, this.f5053c, this.d);
        zdVar.D = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{zdVar.f5211r, zdVar.f5212s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        zdVar.invalidate();
    }
}

package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class xd extends AnimatorListenerAdapter {
    public final int f5054a;
    public final int f5055b;
    public final int f5056c;
    public final int d;
    public final zd f5057e;

    public xd(zd zdVar, int i7, int i10, int i11, int i12) {
        this.f5057e = zdVar;
        this.f5054a = i7;
        this.f5055b = i10;
        this.f5056c = i11;
        this.d = i12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.f5054a, this.f5055b);
        zd zdVar = this.f5057e;
        zdVar.f5214r = f10;
        zdVar.f5215s = i0.a.f(1.0f, this.f5056c, this.d);
        zdVar.D = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{zdVar.f5214r, zdVar.f5215s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        zdVar.invalidate();
    }
}

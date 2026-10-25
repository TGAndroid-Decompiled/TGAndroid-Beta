package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class wd extends AnimatorListenerAdapter {
    public final int f5631a;
    public final int f5632b;
    public final int f5633c;
    public final int d;
    public final yd e;

    public wd(yd ydVar, int i10, int i11, int i12, int i13) {
        this.e = ydVar;
        this.f5631a = i10;
        this.f5632b = i11;
        this.f5633c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f7 = i0.a.f(1.0f, this.f5631a, this.f5632b);
        yd ydVar = this.e;
        ydVar.f5808r = f7;
        ydVar.f5809s = i0.a.f(1.0f, this.f5633c, this.d);
        ydVar.f5812y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{ydVar.f5808r, ydVar.f5809s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        ydVar.invalidate();
    }
}

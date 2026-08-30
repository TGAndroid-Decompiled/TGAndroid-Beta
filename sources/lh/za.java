package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class za extends AnimatorListenerAdapter {
    public final int f13448a;
    public final int f13449b;
    public final int f13450c;
    public final int d;
    public final bb e;

    public za(bb bbVar, int i10, int i11, int i12, int i13) {
        this.e = bbVar;
        this.f13448a = i10;
        this.f13449b = i11;
        this.f13450c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f13448a, this.f13449b);
        bb bbVar = this.e;
        bbVar.f12192r = d;
        bbVar.f12193s = i0.a.d(1.0f, this.f13450c, this.d);
        bbVar.f12196y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{bbVar.f12192r, bbVar.f12193s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        bbVar.invalidate();
    }
}

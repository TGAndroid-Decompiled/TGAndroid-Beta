package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class za extends AnimatorListenerAdapter {
    public final int f13432a;
    public final int f13433b;
    public final int f13434c;
    public final int d;
    public final bb e;

    public za(bb bbVar, int i10, int i11, int i12, int i13) {
        this.e = bbVar;
        this.f13432a = i10;
        this.f13433b = i11;
        this.f13434c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f13432a, this.f13433b);
        bb bbVar = this.e;
        bbVar.f12176r = d;
        bbVar.f12177s = i0.a.d(1.0f, this.f13434c, this.d);
        bbVar.f12180y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{bbVar.f12176r, bbVar.f12177s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        bbVar.invalidate();
    }
}

package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class za extends AnimatorListenerAdapter {
    public final int f15162a;
    public final int f15163b;
    public final int f15164c;
    public final int d;
    public final bb f15165e;

    public za(bb bbVar, int i10, int i11, int i12, int i13) {
        this.f15165e = bbVar;
        this.f15162a = i10;
        this.f15163b = i11;
        this.f15164c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f15162a, this.f15163b);
        bb bbVar = this.f15165e;
        bbVar.f13780r = d;
        bbVar.f13781s = i0.a.d(1.0f, this.f15164c, this.d);
        bbVar.f13784y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{bbVar.f13780r, bbVar.f13781s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        bbVar.invalidate();
    }
}

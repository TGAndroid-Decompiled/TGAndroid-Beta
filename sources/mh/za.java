package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class za extends AnimatorListenerAdapter {
    public final int f15164a;
    public final int f15165b;
    public final int f15166c;
    public final int d;
    public final bb f15167e;

    public za(bb bbVar, int i10, int i11, int i12, int i13) {
        this.f15167e = bbVar;
        this.f15164a = i10;
        this.f15165b = i11;
        this.f15166c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f15164a, this.f15165b);
        bb bbVar = this.f15167e;
        bbVar.f13782r = d;
        bbVar.f13783s = i0.a.d(1.0f, this.f15166c, this.d);
        bbVar.f13786y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{bbVar.f13782r, bbVar.f13783s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        bbVar.invalidate();
    }
}

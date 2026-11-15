package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class ec extends AnimatorListenerAdapter {
    public final int f8515a;
    public final int f8516b;
    public final int f8517c;
    public final int d;
    public final gc f8518e;

    public ec(gc gcVar, int i7, int i10, int i11, int i12) {
        this.f8518e = gcVar;
        this.f8515a = i7;
        this.f8516b = i10;
        this.f8517c = i11;
        this.d = i12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.f8515a, this.f8516b);
        gc gcVar = this.f8518e;
        gcVar.f8643r = f10;
        gcVar.f8644s = i0.a.f(1.0f, this.f8517c, this.d);
        gcVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{gcVar.f8643r, gcVar.f8644s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        gcVar.invalidate();
    }
}

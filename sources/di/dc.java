package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class dc extends AnimatorListenerAdapter {
    public final int f8422a;
    public final int f8423b;
    public final int f8424c;
    public final int d;
    public final fc f8425e;

    public dc(fc fcVar, int i7, int i10, int i11, int i12) {
        this.f8425e = fcVar;
        this.f8422a = i7;
        this.f8423b = i10;
        this.f8424c = i11;
        this.d = i12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.f8422a, this.f8423b);
        fc fcVar = this.f8425e;
        fcVar.f8587r = f10;
        fcVar.f8588s = i0.a.f(1.0f, this.f8424c, this.d);
        fcVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{fcVar.f8587r, fcVar.f8588s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        fcVar.invalidate();
    }
}

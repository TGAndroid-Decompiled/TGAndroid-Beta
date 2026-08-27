package hh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;

public final class eb extends AnimatorListenerAdapter {

    public final int f9229a;

    public final int f9230b;

    public final int f9231c;
    public final int d;

    public final gb f9232e;

    public eb(gb gbVar, int i10, int i11, int i12, int i13) {
        this.f9232e = gbVar;
        this.f9229a = i10;
        this.f9230b = i11;
        this.f9231c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int iD = i0.b.d(1.0f, this.f9229a, this.f9230b);
        gb gbVar = this.f9232e;
        gbVar.f9357r = iD;
        gbVar.f9358s = i0.b.d(1.0f, this.f9231c, this.d);
        gbVar.f9361y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{gbVar.f9357r, gbVar.f9358s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        gbVar.invalidate();
    }
}

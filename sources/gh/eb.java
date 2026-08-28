package gh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class eb extends AnimatorListenerAdapter {
    public final int f8038a;
    public final int f8039b;
    public final int f8040c;
    public final int d;
    public final gb f8041e;

    public eb(gb gbVar, int i9, int i10, int i11, int i12) {
        this.f8041e = gbVar;
        this.f8038a = i9;
        this.f8039b = i10;
        this.f8040c = i11;
        this.d = i12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f8038a, this.f8039b);
        gb gbVar = this.f8041e;
        gbVar.f8179r = d;
        gbVar.f8180s = i0.a.d(1.0f, this.f8040c, this.d);
        gbVar.f8183y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{gbVar.f8179r, gbVar.f8180s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        gbVar.invalidate();
    }
}

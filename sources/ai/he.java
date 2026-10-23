package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class he extends AnimatorListenerAdapter {
    public final int f1442a;
    public final int f1443b;
    public final int f1444c;
    public final int d;
    public final je e;

    public he(je jeVar, int i10, int i11, int i12, int i13) {
        this.e = jeVar;
        this.f1442a = i10;
        this.f1443b = i11;
        this.f1444c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f7 = i0.a.f(1.0f, this.f1442a, this.f1443b);
        je jeVar = this.e;
        jeVar.f1590r = f7;
        jeVar.f1591s = i0.a.f(1.0f, this.f1444c, this.d);
        jeVar.f1594y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{jeVar.f1590r, jeVar.f1591s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        jeVar.invalidate();
    }
}

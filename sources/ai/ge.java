package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class ge extends AnimatorListenerAdapter {
    public final int f1381a;
    public final int f1382b;
    public final int f1383c;
    public final int d;
    public final ie e;

    public ge(ie ieVar, int i10, int i11, int i12, int i13) {
        this.e = ieVar;
        this.f1381a = i10;
        this.f1382b = i11;
        this.f1383c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f7 = i0.a.f(1.0f, this.f1381a, this.f1382b);
        ie ieVar = this.e;
        ieVar.f1527r = f7;
        ieVar.f1528s = i0.a.f(1.0f, this.f1383c, this.d);
        ieVar.f1531y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{ieVar.f1527r, ieVar.f1528s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        ieVar.invalidate();
    }
}

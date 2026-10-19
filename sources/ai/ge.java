package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class ge extends AnimatorListenerAdapter {
    public final int f1392a;
    public final int f1393b;
    public final int f1394c;
    public final int d;
    public final ie e;

    public ge(ie ieVar, int i10, int i11, int i12, int i13) {
        this.e = ieVar;
        this.f1392a = i10;
        this.f1393b = i11;
        this.f1394c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f7 = i0.a.f(1.0f, this.f1392a, this.f1393b);
        ie ieVar = this.e;
        ieVar.f1533r = f7;
        ieVar.f1534s = i0.a.f(1.0f, this.f1394c, this.d);
        ieVar.f1537y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{ieVar.f1533r, ieVar.f1534s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        ieVar.invalidate();
    }
}

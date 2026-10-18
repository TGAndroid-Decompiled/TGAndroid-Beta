package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class ge extends AnimatorListenerAdapter {
    public final int f1383a;
    public final int f1384b;
    public final int f1385c;
    public final int d;
    public final ie e;

    public ge(ie ieVar, int i10, int i11, int i12, int i13) {
        this.e = ieVar;
        this.f1383a = i10;
        this.f1384b = i11;
        this.f1385c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f7 = i0.a.f(1.0f, this.f1383a, this.f1384b);
        ie ieVar = this.e;
        ieVar.f1526r = f7;
        ieVar.f1527s = i0.a.f(1.0f, this.f1385c, this.d);
        ieVar.f1530y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{ieVar.f1526r, ieVar.f1527s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        ieVar.invalidate();
    }
}

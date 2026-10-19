package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class ge extends AnimatorListenerAdapter {
    public final int f1377a;
    public final int f1378b;
    public final int f1379c;
    public final int d;
    public final ie e;

    public ge(ie ieVar, int i10, int i11, int i12, int i13) {
        this.e = ieVar;
        this.f1377a = i10;
        this.f1378b = i11;
        this.f1379c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f7 = i0.a.f(1.0f, this.f1377a, this.f1378b);
        ie ieVar = this.e;
        ieVar.f1524r = f7;
        ieVar.f1525s = i0.a.f(1.0f, this.f1379c, this.d);
        ieVar.f1528y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{ieVar.f1524r, ieVar.f1525s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        ieVar.invalidate();
    }
}

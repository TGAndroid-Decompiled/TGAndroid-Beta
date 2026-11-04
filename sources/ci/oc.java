package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class oc extends AnimatorListenerAdapter {
    public final int f5713a;
    public final int f5714b;
    public final int f5715c;
    public final int d;
    public final qc f5716e;

    public oc(qc qcVar, int i3, int i10, int i11, int i12) {
        this.f5716e = qcVar;
        this.f5713a = i3;
        this.f5714b = i10;
        this.f5715c = i11;
        this.d = i12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f10 = i0.a.f(1.0f, this.f5713a, this.f5714b);
        qc qcVar = this.f5716e;
        qcVar.f5874r = f10;
        qcVar.f5875s = i0.a.f(1.0f, this.f5715c, this.d);
        qcVar.E = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{qcVar.f5874r, qcVar.f5875s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        qcVar.invalidate();
    }
}

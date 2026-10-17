package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class fe extends AnimatorListenerAdapter {
    public final int f1340a;
    public final int f1341b;
    public final int f1342c;
    public final int d;
    public final he e;

    public fe(he heVar, int i10, int i11, int i12, int i13) {
        this.e = heVar;
        this.f1340a = i10;
        this.f1341b = i11;
        this.f1342c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int f7 = i0.b.f(1.0f, this.f1340a, this.f1341b);
        he heVar = this.e;
        heVar.f1469r = f7;
        heVar.f1470s = i0.b.f(1.0f, this.f1342c, this.d);
        heVar.f1473y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{heVar.f1469r, heVar.f1470s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        heVar.invalidate();
    }
}

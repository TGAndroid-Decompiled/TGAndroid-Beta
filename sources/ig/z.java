package ig;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final u0 f8510a;
    public final float f8511b;
    public final h f8512c;
    public final boolean d;
    public final Runnable e;
    public final a0 f8513f;

    public z(a0 a0Var, u0 u0Var, float f7, h hVar, boolean z10, Runnable runnable) {
        this.f8513f = a0Var;
        this.f8510a = u0Var;
        this.f8511b = f7;
        this.f8512c = hVar;
        this.d = z10;
        this.e = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int currentColor;
        b1 b1Var;
        a0 a0Var = this.f8513f;
        a0Var.f8266x = null;
        r0 r0Var = new r0(new u0[]{this.f8510a});
        c1 c1Var = a0Var.f8247a;
        r0Var.f8439c = c1Var.getCurrentColor();
        r0Var.d = this.f8511b * 1.0f;
        h hVar = this.f8512c;
        r0Var.e = hVar;
        hVar.getClass();
        if (hVar instanceof d) {
            currentColor = -1;
        } else {
            currentColor = c1Var.getCurrentColor();
        }
        q0 painting = c1Var.getPainting();
        boolean z10 = this.d;
        painting.c(r0Var, currentColor, z10, null);
        if (z10 && (b1Var = c1Var.f8283a) != null) {
            b1Var.n();
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }
}

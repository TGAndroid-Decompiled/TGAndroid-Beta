package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sk3 extends AnimatorListenerAdapter {
    public final byte a;
    public final tk3 b;

    public sk3(tk3 tk3Var, byte b) {
        this.a = b;
        this.b = tk3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        tk3 tk3Var = this.b;
        switch (b) {
            case 0:
                Runnable runnable = tk3Var.b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == tk3Var.e) {
                    tk3Var.e = null;
                    return;
                }
                return;
            default:
                Runnable runnable2 = tk3Var.b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == tk3Var.e) {
                    tk3Var.e = null;
                    return;
                }
                return;
        }
    }
}

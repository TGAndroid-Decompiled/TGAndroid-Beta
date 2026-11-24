package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pa8 extends AnimatorListenerAdapter {
    public final byte a;
    public final qa8 b;

    public pa8(qa8 qa8Var, byte b) {
        this.a = b;
        this.b = qa8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        qa8 qa8Var = this.b;
        switch (b) {
            case 0:
                qa8Var.h = false;
                qa8Var.a = qa8Var.c;
                qa8Var.invalidate();
                int i = qa8Var.K;
                if (i >= 0) {
                    qa8Var.b(i);
                    qa8Var.K = -1;
                    return;
                }
                return;
            default:
                qa8Var.n = false;
                qa8Var.h = false;
                qa8Var.invalidate();
                int i2 = qa8Var.K;
                if (i2 >= 0) {
                    qa8Var.b(i2);
                    qa8Var.K = -1;
                }
                qa8Var.a();
                return;
        }
    }
}

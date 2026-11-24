package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ql3 extends AnimatorListenerAdapter {
    public final byte a;
    public final u69 b;
    public final hg3 c;
    public final ki3 d;

    public ql3(ki3 ki3Var, u69 u69Var, hg3 hg3Var, byte b) {
        this.a = b;
        this.d = ki3Var;
        this.b = u69Var;
        this.c = hg3Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        u69 u69Var = this.b;
        ki3 ki3Var = this.d;
        hg3 hg3Var = this.c;
        switch (b) {
            case 0:
                animator.removeAllListeners();
                hg3Var.setClipProgress(0.0f);
                hg3Var.setElevation(0.0f);
                ki3Var.d(u69Var);
                ki3Var.x.remove(u69Var);
                ki3Var.A();
                return;
            default:
                animator.removeAllListeners();
                hg3Var.setClipProgress(0.0f);
                hg3Var.setElevation(0.0f);
                ki3Var.d(u69Var);
                ki3Var.x.remove(u69Var);
                ki3Var.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        ki3 ki3Var = this.d;
        switch (b) {
            case 0:
                ki3Var.y();
                return;
            default:
                ki3Var.y();
                return;
        }
    }
}

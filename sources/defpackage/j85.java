package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j85 extends AnimatorListenerAdapter {
    public final byte a;
    public final o85 b;

    public j85(o85 o85Var, byte b) {
        this.a = b;
        this.b = o85Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        o85 o85Var = this.b;
        switch (b) {
            case 0:
                o85Var.b.setVisibility(8);
                o85Var.F = false;
                o85Var.G = 0.0f;
                return;
            default:
                o85Var.e.setVisibility(8);
                return;
        }
    }
}

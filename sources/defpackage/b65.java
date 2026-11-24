package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b65 extends AnimatorListenerAdapter {
    public final byte a;
    public final h85 b;
    public final h75 c;

    public b65(h75 h75Var, h85 h85Var, byte b) {
        this.a = b;
        this.c = h75Var;
        this.b = h85Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        h75 h75Var = this.c;
        h85 h85Var = this.b;
        switch (b) {
            case 0:
                if (h85Var.getParent() != null) {
                    h75Var.b.removeView(h85Var);
                    return;
                }
                return;
            default:
                if (h85Var.getParent() != null) {
                    h75Var.b.removeView(h85Var);
                    return;
                }
                return;
        }
    }
}

package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m16 extends AnimatorListenerAdapter {
    public final byte a;
    public final n16 b;
    public final o16 c;

    public m16(o16 o16Var, n16 n16Var, byte b) {
        this.a = b;
        this.c = o16Var;
        this.b = n16Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        o16 o16Var = this.c;
        n16 n16Var = this.b;
        switch (b) {
            case 0:
                n16Var.f = null;
                o16Var.a();
                return;
            default:
                n16Var.f = null;
                o16Var.a();
                return;
        }
    }
}

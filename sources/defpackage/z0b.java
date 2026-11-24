package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z0b extends AnimatorListenerAdapter {
    public final byte a;
    public final a1b b;

    public z0b(a1b a1bVar, byte b) {
        this.a = b;
        this.b = a1bVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        a1b a1bVar = this.b;
        switch (b) {
            case 0:
                a1bVar.s.setVisibility(8);
                return;
            case 1:
                a1bVar.s.setVisibility(8);
                return;
            default:
                a1bVar.s.setVisibility(8);
                return;
        }
    }
}

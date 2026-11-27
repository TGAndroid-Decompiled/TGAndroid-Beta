package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y2b extends AnimatorListenerAdapter {
    public final byte a;
    public final z2b b;

    public y2b(z2b z2bVar, byte b) {
        this.a = b;
        this.b = z2bVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        z2b z2bVar = this.b;
        switch (b) {
            case 0:
                z2bVar.s.setVisibility(8);
                return;
            case 1:
                z2bVar.s.setVisibility(8);
                return;
            default:
                z2bVar.s.setVisibility(8);
                return;
        }
    }
}

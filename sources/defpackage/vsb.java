package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vsb extends AnimatorListenerAdapter {
    public final byte a;
    public final zsb b;

    public vsb(zsb zsbVar, byte b) {
        this.a = b;
        this.b = zsbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        zsb zsbVar = this.b;
        switch (b) {
            case 0:
                zsbVar.w = 0;
                zsbVar.n.setVisibility(8);
                return;
            case 1:
                zsbVar.w = 0;
                return;
            default:
                zsbVar.G.setVisibility(8);
                return;
        }
    }
}

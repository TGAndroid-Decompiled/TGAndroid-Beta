package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wwb extends AnimatorListenerAdapter {
    public final byte a;
    public final axb b;

    public wwb(axb axbVar, byte b) {
        this.a = b;
        this.b = axbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        axb axbVar = this.b;
        switch (b) {
            case 0:
                axbVar.w = 0;
                axbVar.n.setVisibility(8);
                return;
            case 1:
                axbVar.w = 0;
                return;
            default:
                axbVar.G.setVisibility(8);
                return;
        }
    }
}

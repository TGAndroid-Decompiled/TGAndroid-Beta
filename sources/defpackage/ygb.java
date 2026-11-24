package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ygb extends AnimatorListenerAdapter {
    public final byte a;
    public final int b;
    public final ahb c;

    public ygb(ahb ahbVar, int i, byte b) {
        this.a = b;
        this.c = ahbVar;
        this.b = i;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        int i = this.b;
        ahb ahbVar = this.c;
        switch (b) {
            case 0:
                ahbVar.r = 0;
                ahbVar.setBackgroundColor(i);
                ahbVar.invalidate();
                return;
            default:
                ahbVar.setBackgroundColor(i);
                ahbVar.r = 0;
                ahbVar.invalidate();
                return;
        }
    }
}

package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ukb extends AnimatorListenerAdapter {
    public final byte a;
    public final int b;
    public final wkb c;

    public ukb(wkb wkbVar, int i, byte b) {
        this.a = b;
        this.c = wkbVar;
        this.b = i;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        int i = this.b;
        wkb wkbVar = this.c;
        switch (b) {
            case 0:
                wkbVar.r = 0;
                wkbVar.setBackgroundColor(i);
                wkbVar.invalidate();
                return;
            default:
                wkbVar.setBackgroundColor(i);
                wkbVar.r = 0;
                wkbVar.invalidate();
                return;
        }
    }
}

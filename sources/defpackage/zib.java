package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zib extends AnimatorListenerAdapter {
    public final byte a;
    public final int b;
    public final bjb c;

    public zib(bjb bjbVar, int i, byte b) {
        this.a = b;
        this.c = bjbVar;
        this.b = i;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        int i = this.b;
        bjb bjbVar = this.c;
        switch (b) {
            case 0:
                bjbVar.r = 0;
                bjbVar.setBackgroundColor(i);
                bjbVar.invalidate();
                return;
            default:
                bjbVar.setBackgroundColor(i);
                bjbVar.r = 0;
                bjbVar.invalidate();
                return;
        }
    }
}

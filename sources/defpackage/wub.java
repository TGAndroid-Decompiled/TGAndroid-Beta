package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wub extends AnimatorListenerAdapter {
    public final byte a;
    public final avb b;

    public wub(avb avbVar, byte b) {
        this.a = b;
        this.b = avbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        avb avbVar = this.b;
        switch (b) {
            case 0:
                avbVar.w = 0;
                avbVar.n.setVisibility(8);
                return;
            case 1:
                avbVar.w = 0;
                return;
            default:
                avbVar.G.setVisibility(8);
                return;
        }
    }
}

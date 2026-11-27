package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xbb extends AnimatorListenerAdapter {
    public final byte a;
    public final zbb b;

    public xbb(zbb zbbVar, byte b) {
        this.a = b;
        this.b = zbbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        zbb zbbVar = this.b;
        switch (b) {
            case 0:
                lcb lcbVar = zbbVar.s0;
                lcbVar.Y = 0.0f;
                lcbVar.V();
                return;
            default:
                lcb lcbVar2 = zbbVar.s0;
                lcbVar2.X = 0.0f;
                lcbVar2.a0 = 0.0f;
                lcbVar2.V();
                return;
        }
    }
}

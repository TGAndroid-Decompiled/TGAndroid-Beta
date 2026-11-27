package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wbb extends AnimatorListenerAdapter {
    public final byte a;
    public final ybb b;

    public wbb(ybb ybbVar, byte b) {
        this.a = b;
        this.b = ybbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ybb ybbVar = this.b;
        switch (b) {
            case 0:
                lcb lcbVar = ybbVar.s0;
                lcbVar.Y = 0.0f;
                lcbVar.V();
                return;
            default:
                lcb lcbVar2 = ybbVar.s0;
                lcbVar2.X = 0.0f;
                lcbVar2.a0 = 0.0f;
                lcbVar2.V();
                return;
        }
    }
}

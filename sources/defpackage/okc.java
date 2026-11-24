package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class okc extends AnimatorListenerAdapter {
    public final byte a;
    public final qkc b;

    public okc(qkc qkcVar, byte b) {
        this.a = b;
        this.b = qkcVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        qkc qkcVar = this.b;
        switch (b) {
            case 0:
                qkcVar.r = 0;
                qkcVar.invalidate();
                return;
            default:
                qkcVar.s = 0;
                qkcVar.invalidate();
                return;
        }
    }
}

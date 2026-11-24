package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class oic extends AnimatorListenerAdapter {
    public final byte a;
    public final qic b;

    public oic(qic qicVar, byte b) {
        this.a = b;
        this.b = qicVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        qic qicVar = this.b;
        switch (b) {
            case 0:
                qicVar.r = 0;
                qicVar.invalidate();
                return;
            default:
                qicVar.s = 0;
                qicVar.invalidate();
                return;
        }
    }
}

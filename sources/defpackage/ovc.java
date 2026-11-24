package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ovc extends AnimatorListenerAdapter {
    public final byte a;
    public final pvc b;

    public ovc(pvc pvcVar, byte b) {
        this.a = b;
        this.b = pvcVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        pvc pvcVar = this.b;
        switch (b) {
            case 0:
                pvcVar.E = null;
                return;
            default:
                pvcVar.E = null;
                return;
        }
    }
}

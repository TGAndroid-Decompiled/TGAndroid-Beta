package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cyc extends AnimatorListenerAdapter {
    public final byte a;
    public final dyc b;

    public cyc(dyc dycVar, byte b) {
        this.a = b;
        this.b = dycVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        dyc dycVar = this.b;
        switch (b) {
            case 0:
                dycVar.E = null;
                return;
            default:
                dycVar.E = null;
                return;
        }
    }
}

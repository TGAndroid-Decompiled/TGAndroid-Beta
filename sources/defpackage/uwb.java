package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class uwb extends AnimatorListenerAdapter {
    public final byte a;
    public final vwb b;

    public uwb(vwb vwbVar, byte b) {
        this.a = b;
        this.b = vwbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        vwb vwbVar = this.b;
        switch (b) {
            case 0:
                vwbVar.b.s.setVisibility(8);
                return;
            default:
                vwbVar.b.a.setVisibility(8);
                return;
        }
    }
}

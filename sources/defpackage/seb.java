package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.Switch;
public final class seb extends AnimatorListenerAdapter {
    public final byte a;
    public final Switch b;

    public seb(Switch r1, byte b) {
        this.a = b;
        this.b = r1;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Switch r1 = this.b;
        switch (b) {
            case 0:
                r1.d = null;
                return;
            default:
                r1.e = null;
                return;
        }
    }
}

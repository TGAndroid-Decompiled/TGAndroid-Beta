package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ig5 extends AnimatorListenerAdapter {
    public final byte a;
    public final lg5 b;

    public ig5(lg5 lg5Var, byte b) {
        this.a = b;
        this.b = lg5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        lg5 lg5Var = this.b;
        switch (b) {
            case 0:
                lg5Var.d = null;
                ea5 ea5Var = new ea5(this, (byte) 7);
                lg5Var.e = ea5Var;
                hl.d3(ea5Var, lg5Var.w);
                return;
            default:
                lg5Var.setVisibility(4);
                lg5Var.c = null;
                lg5Var.d = null;
                return;
        }
    }
}

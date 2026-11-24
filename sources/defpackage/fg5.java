package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fg5 extends AnimatorListenerAdapter {
    public final byte a;
    public final ig5 b;

    public fg5(ig5 ig5Var, byte b) {
        this.a = b;
        this.b = ig5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ig5 ig5Var = this.b;
        switch (b) {
            case 0:
                ig5Var.d = null;
                qn4 qn4Var = new qn4(this, (byte) 29);
                ig5Var.e = qn4Var;
                gm.d3(qn4Var, ig5Var.w);
                return;
            default:
                ig5Var.setVisibility(4);
                ig5Var.c = null;
                ig5Var.d = null;
                return;
        }
    }
}

package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q32 extends AnimatorListenerAdapter {
    public final byte a = 0;
    public final r32 b;

    public q32(r32 r32Var) {
        this.b = r32Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        r32 r32Var = this.b;
        switch (b) {
            case 0:
                ((t32) r32Var.d).V.e();
                return;
            default:
                tk4 tk4Var = r32Var.b;
                tk4Var.setAlpha(1.0f);
                q79.w0(tk4Var);
                ((t32) r32Var.d).Y.r.removeView(tk4Var);
                return;
        }
    }

    public q32(r32 r32Var, q79 q79Var) {
        this.b = r32Var;
    }
}

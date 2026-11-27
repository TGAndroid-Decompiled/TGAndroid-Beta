package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ng4 extends AnimatorListenerAdapter {
    public final byte a = 0;
    public final r32 b;

    public ng4(r32 r32Var) {
        this.b = r32Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        r32 r32Var = this.b;
        switch (b) {
            case 0:
                ((yg4) r32Var.d).m0.e();
                return;
            default:
                tk4 tk4Var = r32Var.b;
                tk4Var.setAlpha(1.0f);
                q79.w0(tk4Var);
                ((yg4) r32Var.d).b.removeView(tk4Var);
                return;
        }
    }

    public ng4(r32 r32Var, q79 q79Var) {
        this.b = r32Var;
    }
}

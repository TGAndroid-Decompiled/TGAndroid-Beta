package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l42 extends AnimatorListenerAdapter {
    public final byte a = 0;
    public final m42 b;

    public l42(m42 m42Var) {
        this.b = m42Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        m42 m42Var = this.b;
        switch (b) {
            case 0:
                ((o42) m42Var.d).V.e();
                return;
            default:
                tk4 tk4Var = m42Var.b;
                tk4Var.setAlpha(1.0f);
                f69.w0(tk4Var);
                ((o42) m42Var.d).Y.r.removeView(tk4Var);
                return;
        }
    }

    public l42(m42 m42Var, f69 f69Var) {
        this.b = m42Var;
    }
}

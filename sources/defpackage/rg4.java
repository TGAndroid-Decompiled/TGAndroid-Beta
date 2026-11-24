package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rg4 extends AnimatorListenerAdapter {
    public final byte a = 0;
    public final m42 b;

    public rg4(m42 m42Var) {
        this.b = m42Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        m42 m42Var = this.b;
        switch (b) {
            case 0:
                ((ch4) m42Var.d).m0.e();
                return;
            default:
                tk4 tk4Var = m42Var.b;
                tk4Var.setAlpha(1.0f);
                f69.w0(tk4Var);
                ((ch4) m42Var.d).b.removeView(tk4Var);
                return;
        }
    }

    public rg4(m42 m42Var, f69 f69Var) {
        this.b = m42Var;
    }
}

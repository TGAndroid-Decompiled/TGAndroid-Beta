package ih;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f9 extends AnimatorListenerAdapter {
    public final int f11456a;
    public final v8 f11457b;

    public f9(v8 v8Var, int i9) {
        this.f11456a = i9;
        this.f11457b = v8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11456a) {
            case 0:
                super.onAnimationEnd(animator);
                m9 m9Var = this.f11457b.f12265b;
                z6 z6Var = m9Var.f11820q1;
                if (z6Var != null) {
                    z6Var.b();
                    m9Var.v.removeView(m9Var.f11820q1);
                }
                m9Var.f11820q1 = null;
                m9Var.P();
                return;
            default:
                super.onAnimationEnd(animator);
                z6 z6Var2 = this.f11457b.f12265b.f11820q1;
                if (z6Var2 != null) {
                    z6Var2.a(true);
                    return;
                }
                return;
        }
    }
}

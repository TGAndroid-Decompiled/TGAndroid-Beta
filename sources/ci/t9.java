package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t9 extends AnimatorListenerAdapter {
    public final int f6031a;
    public final j9 f6032b;

    public t9(j9 j9Var, int i10) {
        this.f6031a = i10;
        this.f6032b = j9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6031a) {
            case 0:
                super.onAnimationEnd(animator);
                aa aaVar = this.f6032b.f5555b;
                m7 m7Var = aaVar.f5223u1;
                if (m7Var != null) {
                    m7Var.b();
                    aaVar.v.removeView(aaVar.f5223u1);
                }
                aaVar.f5223u1 = null;
                aaVar.P();
                return;
            default:
                super.onAnimationEnd(animator);
                m7 m7Var2 = this.f6032b.f5555b.f5223u1;
                if (m7Var2 != null) {
                    m7Var2.a(true);
                    return;
                }
                return;
        }
    }
}

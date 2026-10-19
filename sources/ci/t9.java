package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t9 extends AnimatorListenerAdapter {
    public final int f6030a;
    public final j9 f6031b;

    public t9(j9 j9Var, int i10) {
        this.f6030a = i10;
        this.f6031b = j9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6030a) {
            case 0:
                super.onAnimationEnd(animator);
                aa aaVar = this.f6031b.f5554b;
                m7 m7Var = aaVar.f5222u1;
                if (m7Var != null) {
                    m7Var.b();
                    aaVar.v.removeView(aaVar.f5222u1);
                }
                aaVar.f5222u1 = null;
                aaVar.P();
                return;
            default:
                super.onAnimationEnd(animator);
                m7 m7Var2 = this.f6031b.f5554b.f5222u1;
                if (m7Var2 != null) {
                    m7Var2.a(true);
                    return;
                }
                return;
        }
    }
}

package kg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t extends AnimatorListenerAdapter {
    public final int f11270a;
    public final u f11271b;
    public final v f11272c;

    public t(v vVar, u uVar, int i10) {
        this.f11270a = i10;
        this.f11272c = vVar;
        this.f11271b = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11270a) {
            case 0:
                this.f11271b.f11276f = null;
                v.a(this.f11272c);
                return;
            default:
                this.f11271b.f11276f = null;
                v.a(this.f11272c);
                return;
        }
    }
}

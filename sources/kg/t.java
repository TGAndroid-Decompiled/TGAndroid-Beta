package kg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t extends AnimatorListenerAdapter {
    public final int f11269a;
    public final u f11270b;
    public final v f11271c;

    public t(v vVar, u uVar, int i10) {
        this.f11269a = i10;
        this.f11271c = vVar;
        this.f11270b = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11269a) {
            case 0:
                this.f11270b.f11275f = null;
                v.a(this.f11271c);
                return;
            default:
                this.f11270b.f11275f = null;
                v.a(this.f11271c);
                return;
        }
    }
}

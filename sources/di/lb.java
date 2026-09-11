package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lb extends AnimatorListenerAdapter {
    public final int f7579a;
    public final int f7580b;
    public final int f7581c;
    public final pc d;

    public lb(pc pcVar, int i10, int i11, int i12) {
        this.f7579a = i12;
        this.d = pcVar;
        this.f7580b = i10;
        this.f7581c = i11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7579a) {
            case 0:
                this.d.N(this.f7580b, this.f7581c);
                return;
            default:
                int i10 = this.f7580b;
                int i11 = this.f7581c;
                if (i10 != i11) {
                    this.d.Q(i10, i11);
                    return;
                }
                return;
        }
    }
}

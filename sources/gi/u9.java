package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u9 extends AnimatorListenerAdapter {
    public final int f13664a;
    public final int f13665b;
    public final int f13666c;
    public final va d;

    public u9(va vaVar, int i3, int i10, int i11) {
        this.f13664a = i11;
        this.d = vaVar;
        this.f13665b = i3;
        this.f13666c = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f13664a) {
            case 0:
                this.d.M(this.f13665b, this.f13666c);
                return;
            default:
                int i3 = this.f13665b;
                int i10 = this.f13666c;
                if (i3 != i10) {
                    this.d.P(i3, i10);
                    return;
                }
                return;
        }
    }
}

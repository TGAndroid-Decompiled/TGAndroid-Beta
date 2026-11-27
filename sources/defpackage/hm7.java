package defpackage;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class hm7 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a = 0;
    public final boolean b;
    public final FrameLayout c;
    public final Object d;

    public hm7(v94 v94Var, r47 r47Var, boolean z) {
        this.c = v94Var;
        this.d = r47Var;
        this.b = z;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.d;
        boolean z = this.b;
        FrameLayout frameLayout = this.c;
        switch (b) {
            case 0:
                v94 v94Var = (v94) frameLayout;
                if (v94Var.getMessage() == ((r47) obj)) {
                    v94Var.o(z, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                return;
            default:
                ((xd8) frameLayout).i(z, (pt2) obj, valueAnimator);
                return;
        }
    }

    public hm7(xd8 xd8Var, boolean z, pt2 pt2Var) {
        this.c = xd8Var;
        this.b = z;
        this.d = pt2Var;
    }
}

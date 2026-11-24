package defpackage;

import android.animation.ValueAnimator;
import java.util.ArrayList;
public final class t0b implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ep b;
    public final int c;

    public t0b(ep epVar, int i, byte b) {
        this.a = b;
        this.b = epVar;
        this.c = i;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        int i = this.c;
        ep epVar = this.b;
        switch (b) {
            case 0:
                Float f = (Float) valueAnimator.getAnimatedValue();
                f.getClass();
                ((ArrayList) epVar.d).set(i, f);
                return;
            case 1:
                Float f2 = (Float) valueAnimator.getAnimatedValue();
                f2.getClass();
                ((ArrayList) epVar.e).set(i, f2);
                return;
            case 2:
                Float f3 = (Float) valueAnimator.getAnimatedValue();
                f3.getClass();
                ((ArrayList) epVar.f).set(i, f3);
                return;
            case 3:
                Float f4 = (Float) valueAnimator.getAnimatedValue();
                f4.getClass();
                ((ArrayList) epVar.d).set(i, f4);
                return;
            case 4:
                Float f5 = (Float) valueAnimator.getAnimatedValue();
                f5.getClass();
                ((ArrayList) epVar.e).set(i, f5);
                return;
            default:
                Float f6 = (Float) valueAnimator.getAnimatedValue();
                f6.getClass();
                ((ArrayList) epVar.f).set(i, f6);
                return;
        }
    }
}

package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class wza implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final View b;
    public final FrameLayout c;

    public wza(FrameLayout frameLayout, View view, byte b) {
        this.a = b;
        this.c = frameLayout;
        this.b = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        View view = this.b;
        FrameLayout frameLayout = this.c;
        switch (b) {
            case 0:
                xza xzaVar = (xza) frameLayout;
                xzaVar.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xzaVar.invalidate();
                ((er9) view).invalidate();
                return;
            default:
                ((wec) frameLayout).F(view, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}

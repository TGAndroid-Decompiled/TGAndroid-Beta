package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class x1b implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final View b;
    public final FrameLayout c;

    public x1b(FrameLayout frameLayout, View view, byte b) {
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
                y1b y1bVar = (y1b) frameLayout;
                y1bVar.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y1bVar.invalidate();
                ((gt9) view).invalidate();
                return;
            default:
                ((wgc) frameLayout).F(view, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}

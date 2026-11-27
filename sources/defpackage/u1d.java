package defpackage;

import android.view.WindowInsetsAnimation;
import android.widget.FrameLayout;
public final class u1d extends v1d {
    public final WindowInsetsAnimation e;

    public u1d(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    public static mq5 e(WindowInsetsAnimation.Bounds bounds) {
        return mq5.c(bounds.getUpperBound());
    }

    public static mq5 f(WindowInsetsAnimation.Bounds bounds) {
        return mq5.c(bounds.getLowerBound());
    }

    public static void g(FrameLayout frameLayout, j1d j1dVar) {
        frameLayout.setWindowInsetsAnimationCallback(new t1d(j1dVar));
    }

    @Override
    public final long a() {
        return this.e.getDurationMillis();
    }

    @Override
    public final float b() {
        return this.e.getInterpolatedFraction();
    }

    @Override
    public final int c() {
        return this.e.getTypeMask();
    }

    @Override
    public final void d(float f) {
        this.e.setFraction(f);
    }
}

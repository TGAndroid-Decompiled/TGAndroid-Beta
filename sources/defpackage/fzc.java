package defpackage;

import android.view.WindowInsetsAnimation;
import android.widget.FrameLayout;
public final class fzc extends gzc {
    public final WindowInsetsAnimation e;

    public fzc(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    public static iq5 e(WindowInsetsAnimation.Bounds bounds) {
        return iq5.c(bounds.getUpperBound());
    }

    public static iq5 f(WindowInsetsAnimation.Bounds bounds) {
        return iq5.c(bounds.getLowerBound());
    }

    public static void g(FrameLayout frameLayout, uyc uycVar) {
        frameLayout.setWindowInsetsAnimationCallback(new ezc(uycVar));
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

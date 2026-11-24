package defpackage;

import android.view.WindowInsetsAnimation;
import android.widget.FrameLayout;
public final class exc extends fxc {
    public final WindowInsetsAnimation e;

    public exc(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    public static io5 e(WindowInsetsAnimation.Bounds bounds) {
        return io5.c(bounds.getUpperBound());
    }

    public static io5 f(WindowInsetsAnimation.Bounds bounds) {
        return io5.c(bounds.getLowerBound());
    }

    public static void g(FrameLayout frameLayout, twc twcVar) {
        frameLayout.setWindowInsetsAnimationCallback(new dxc(twcVar));
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

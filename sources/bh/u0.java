package bh;

import android.graphics.drawable.Drawable;
import android.view.View;
import bi.q6;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.qp0;
import org.telegram.ui.Components.qq;
public final class u0 implements Drawable.Callback {
    public final int f4159a;
    public Object f4160b;

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f4159a) {
            case 0:
                v0 v0Var = (v0) this.f4160b;
                View view = v0Var.W;
                if (view != null) {
                    view.invalidate();
                    if (v0Var.R && v0Var.W.getParent() != null && (v0Var.W.getParent().getParent() instanceof View)) {
                        ((View) v0Var.W.getParent().getParent()).invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((q6) this.f4160b).h.invalidate();
                return;
            case 2:
                ((ch.c) this.f4160b).invalidateSelf();
                return;
            case 3:
                return;
            case 4:
                ((li.s0) this.f4160b).f17461b.invalidate();
                return;
            case 5:
                ((qq) this.f4160b).invalidateSelf();
                return;
            case 6:
                ((qp0) this.f4160b).f31976b.run();
                return;
            case 7:
                ((dd) this.f4160b).invalidateSelf();
                return;
            case 8:
                ((k41) this.f4160b).invalidateSelf();
                return;
            case 9:
                ((y4.d) this.f4160b).invalidateSelf();
                return;
            case 10:
                ((yg.a) this.f4160b).f52531c.invalidate();
                return;
            default:
                ((yg.c) this.f4160b).f52556c.invalidate();
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f4159a) {
            case 0:
                View view = ((v0) this.f4160b).W;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j10);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                ((ch.c) this.f4160b).scheduleSelf(runnable, j10);
                return;
            case 3:
                Drawable.Callback callback = (Drawable.Callback) this.f4160b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j10);
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                ((qq) this.f4160b).scheduleSelf(runnable, j10);
                return;
            case 6:
                return;
            case 7:
                ((dd) this.f4160b).scheduleSelf(runnable, j10);
                return;
            case 8:
                return;
            case 9:
                ((y4.d) this.f4160b).scheduleSelf(runnable, j10);
                return;
            case 10:
                ((yg.a) this.f4160b).f52531c.invalidate();
                return;
            default:
                ((yg.c) this.f4160b).f52556c.invalidate();
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f4159a) {
            case 0:
                View view = ((v0) this.f4160b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                ((ch.c) this.f4160b).unscheduleSelf(runnable);
                return;
            case 3:
                Drawable.Callback callback = (Drawable.Callback) this.f4160b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                ((qq) this.f4160b).unscheduleSelf(runnable);
                return;
            case 6:
                return;
            case 7:
                ((dd) this.f4160b).unscheduleSelf(runnable);
                return;
            case 8:
                return;
            case 9:
                ((y4.d) this.f4160b).unscheduleSelf(runnable);
                return;
            case 10:
                ((yg.a) this.f4160b).f52531c.invalidate();
                return;
            default:
                ((yg.c) this.f4160b).f52556c.invalidate();
                return;
        }
    }

    public u0(Object obj, int i10) {
        this.f4159a = i10;
        this.f4160b = obj;
    }

    private final void a(Drawable drawable) {
    }

    private final void f(Drawable drawable, Runnable runnable) {
    }

    private final void g(Drawable drawable, Runnable runnable) {
    }

    private final void h(Drawable drawable, Runnable runnable) {
    }

    private final void i(Drawable drawable, Runnable runnable) {
    }

    private final void b(Drawable drawable, Runnable runnable, long j10) {
    }

    private final void c(Drawable drawable, Runnable runnable, long j10) {
    }

    private final void d(Drawable drawable, Runnable runnable, long j10) {
    }

    private final void e(Drawable drawable, Runnable runnable, long j10) {
    }
}

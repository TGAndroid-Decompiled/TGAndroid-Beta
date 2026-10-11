package i;

import android.graphics.drawable.Drawable;
import android.view.View;
import ii.u0;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.rp0;
import org.telegram.ui.Components.uq;
import yh.h3;
import zg.l0;
public final class f implements Drawable.Callback {
    public final int f11571a;
    public Object f11572b;

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f11571a) {
            case 0:
                return;
            case 1:
                ((u0) this.f11572b).f12722b.invalidate();
                return;
            case 2:
                ((uq) this.f11572b).invalidateSelf();
                return;
            case 3:
                ((rp0) this.f11572b).f30495b.run();
                return;
            case 4:
                ((hd) this.f11572b).invalidateSelf();
                return;
            case 5:
                ((k41) this.f11572b).invalidateSelf();
                return;
            case 6:
                ((wg.a) this.f11572b).f50430c.invalidate();
                return;
            case 7:
                ((wg.c) this.f11572b).f50456c.invalidate();
                return;
            case 8:
                ((x4.d) this.f11572b).invalidateSelf();
                return;
            case 9:
                ((h3) this.f11572b).h.invalidate();
                return;
            default:
                l0 l0Var = (l0) this.f11572b;
                View view = l0Var.W;
                if (view != null) {
                    view.invalidate();
                    if (l0Var.R && l0Var.W.getParent() != null && (l0Var.W.getParent().getParent() instanceof View)) {
                        ((View) l0Var.W.getParent().getParent()).invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f11571a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f11572b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j3);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                ((uq) this.f11572b).scheduleSelf(runnable, j3);
                return;
            case 3:
                return;
            case 4:
                ((hd) this.f11572b).scheduleSelf(runnable, j3);
                return;
            case 5:
                return;
            case 6:
                ((wg.a) this.f11572b).f50430c.invalidate();
                return;
            case 7:
                ((wg.c) this.f11572b).f50456c.invalidate();
                return;
            case 8:
                ((x4.d) this.f11572b).scheduleSelf(runnable, j3);
                return;
            case 9:
                return;
            default:
                View view = ((l0) this.f11572b).W;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f11571a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f11572b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                ((uq) this.f11572b).unscheduleSelf(runnable);
                return;
            case 3:
                return;
            case 4:
                ((hd) this.f11572b).unscheduleSelf(runnable);
                return;
            case 5:
                return;
            case 6:
                ((wg.a) this.f11572b).f50430c.invalidate();
                return;
            case 7:
                ((wg.c) this.f11572b).f50456c.invalidate();
                return;
            case 8:
                ((x4.d) this.f11572b).unscheduleSelf(runnable);
                return;
            case 9:
                return;
            default:
                View view = ((l0) this.f11572b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
        }
    }

    public f(Object obj, int i10) {
        this.f11571a = i10;
        this.f11572b = obj;
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

    private final void b(Drawable drawable, Runnable runnable, long j3) {
    }

    private final void c(Drawable drawable, Runnable runnable, long j3) {
    }

    private final void d(Drawable drawable, Runnable runnable, long j3) {
    }

    private final void e(Drawable drawable, Runnable runnable, long j3) {
    }
}

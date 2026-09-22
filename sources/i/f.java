package i;

import android.graphics.drawable.Drawable;
import android.view.View;
import ii.u0;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.d31;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.ko0;
import yh.n3;
import zg.n0;
public final class f implements Drawable.Callback {
    public final int f10578a;
    public Object f10579b;

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f10578a) {
            case 0:
                return;
            case 1:
                ((u0) this.f10579b).f11649b.invalidate();
                return;
            case 2:
                ((eq) this.f10579b).invalidateSelf();
                return;
            case 3:
                ((ko0) this.f10579b).f25636b.run();
                return;
            case 4:
                ((cd) this.f10579b).invalidateSelf();
                return;
            case 5:
                ((d31) this.f10579b).invalidateSelf();
                return;
            case 6:
                ((wg.a) this.f10579b).f45022c.invalidate();
                return;
            case 7:
                ((wg.c) this.f10579b).f45047c.invalidate();
                return;
            case 8:
                ((x4.d) this.f10579b).invalidateSelf();
                return;
            case 9:
                ((n3) this.f10579b).f47459f.invalidate();
                return;
            default:
                n0 n0Var = (n0) this.f10579b;
                View view = n0Var.W;
                if (view != null) {
                    view.invalidate();
                    if (n0Var.R && n0Var.W.getParent() != null && (n0Var.W.getParent().getParent() instanceof View)) {
                        ((View) n0Var.W.getParent().getParent()).invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f10578a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f10579b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j3);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                ((eq) this.f10579b).scheduleSelf(runnable, j3);
                return;
            case 3:
                return;
            case 4:
                ((cd) this.f10579b).scheduleSelf(runnable, j3);
                return;
            case 5:
                return;
            case 6:
                ((wg.a) this.f10579b).f45022c.invalidate();
                return;
            case 7:
                ((wg.c) this.f10579b).f45047c.invalidate();
                return;
            case 8:
                ((x4.d) this.f10579b).scheduleSelf(runnable, j3);
                return;
            case 9:
                return;
            default:
                View view = ((n0) this.f10579b).W;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f10578a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f10579b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                ((eq) this.f10579b).unscheduleSelf(runnable);
                return;
            case 3:
                return;
            case 4:
                ((cd) this.f10579b).unscheduleSelf(runnable);
                return;
            case 5:
                return;
            case 6:
                ((wg.a) this.f10579b).f45022c.invalidate();
                return;
            case 7:
                ((wg.c) this.f10579b).f45047c.invalidate();
                return;
            case 8:
                ((x4.d) this.f10579b).unscheduleSelf(runnable);
                return;
            case 9:
                return;
            default:
                View view = ((n0) this.f10579b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
        }
    }

    public f(Object obj, int i10) {
        this.f10578a = i10;
        this.f10579b = obj;
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

package ah;

import android.graphics.drawable.Drawable;
import android.view.View;
import ii.u0;
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.ep0;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.hq;
import yh.m3;
import zg.k0;
public final class d implements Drawable.Callback {
    public final int f462a;
    public Object f463b;

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f462a) {
            case 0:
                ((e) this.f463b).invalidateSelf();
                return;
            case 1:
                return;
            case 2:
                ((u0) this.f463b).f12676b.invalidate();
                return;
            case 3:
                ((hq) this.f463b).invalidateSelf();
                return;
            case 4:
                ((ep0) this.f463b).f26177b.run();
                return;
            case 5:
                ((fd) this.f463b).invalidateSelf();
                return;
            case 6:
                ((c41) this.f463b).invalidateSelf();
                return;
            case 7:
                ((wg.a) this.f463b).f49058c.invalidate();
                return;
            case 8:
                ((wg.c) this.f463b).f49084c.invalidate();
                return;
            case 9:
                ((x4.d) this.f463b).invalidateSelf();
                return;
            case 10:
                ((m3) this.f463b).f51636f.invalidate();
                return;
            default:
                k0 k0Var = (k0) this.f463b;
                View view = k0Var.W;
                if (view != null) {
                    view.invalidate();
                    if (k0Var.R && k0Var.W.getParent() != null && (k0Var.W.getParent().getParent() instanceof View)) {
                        ((View) k0Var.W.getParent().getParent()).invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f462a) {
            case 0:
                ((e) this.f463b).scheduleSelf(runnable, j3);
                return;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.f463b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j3);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                ((hq) this.f463b).scheduleSelf(runnable, j3);
                return;
            case 4:
                return;
            case 5:
                ((fd) this.f463b).scheduleSelf(runnable, j3);
                return;
            case 6:
                return;
            case 7:
                ((wg.a) this.f463b).f49058c.invalidate();
                return;
            case 8:
                ((wg.c) this.f463b).f49084c.invalidate();
                return;
            case 9:
                ((x4.d) this.f463b).scheduleSelf(runnable, j3);
                return;
            case 10:
                return;
            default:
                View view = ((k0) this.f463b).W;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f462a) {
            case 0:
                ((e) this.f463b).unscheduleSelf(runnable);
                return;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.f463b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                ((hq) this.f463b).unscheduleSelf(runnable);
                return;
            case 4:
                return;
            case 5:
                ((fd) this.f463b).unscheduleSelf(runnable);
                return;
            case 6:
                return;
            case 7:
                ((wg.a) this.f463b).f49058c.invalidate();
                return;
            case 8:
                ((wg.c) this.f463b).f49084c.invalidate();
                return;
            case 9:
                ((x4.d) this.f463b).unscheduleSelf(runnable);
                return;
            case 10:
                return;
            default:
                View view = ((k0) this.f463b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
        }
    }

    public d(Object obj, int i10) {
        this.f462a = i10;
        this.f463b = obj;
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

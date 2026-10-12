package i;

import android.graphics.drawable.Drawable;
import android.view.View;
import ii.u0;
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.wq;
import yh.h3;
import zg.l0;
public final class f implements Drawable.Callback {
    public final int f11570a;
    public Object f11571b;

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f11570a) {
            case 0:
                return;
            case 1:
                ((u0) this.f11571b).f12723b.invalidate();
                return;
            case 2:
                ((wq) this.f11571b).invalidateSelf();
                return;
            case 3:
                ((vp0) this.f11571b).f32140b.run();
                return;
            case 4:
                ((gd) this.f11571b).invalidateSelf();
                return;
            case 5:
                ((n41) this.f11571b).invalidateSelf();
                return;
            case 6:
                ((wg.a) this.f11571b).f50579c.invalidate();
                return;
            case 7:
                ((wg.c) this.f11571b).f50605c.invalidate();
                return;
            case 8:
                ((x4.d) this.f11571b).invalidateSelf();
                return;
            case 9:
                ((h3) this.f11571b).h.invalidate();
                return;
            default:
                l0 l0Var = (l0) this.f11571b;
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
        switch (this.f11570a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f11571b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j3);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                ((wq) this.f11571b).scheduleSelf(runnable, j3);
                return;
            case 3:
                return;
            case 4:
                ((gd) this.f11571b).scheduleSelf(runnable, j3);
                return;
            case 5:
                return;
            case 6:
                ((wg.a) this.f11571b).f50579c.invalidate();
                return;
            case 7:
                ((wg.c) this.f11571b).f50605c.invalidate();
                return;
            case 8:
                ((x4.d) this.f11571b).scheduleSelf(runnable, j3);
                return;
            case 9:
                return;
            default:
                View view = ((l0) this.f11571b).W;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f11570a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f11571b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                ((wq) this.f11571b).unscheduleSelf(runnable);
                return;
            case 3:
                return;
            case 4:
                ((gd) this.f11571b).unscheduleSelf(runnable);
                return;
            case 5:
                return;
            case 6:
                ((wg.a) this.f11571b).f50579c.invalidate();
                return;
            case 7:
                ((wg.c) this.f11571b).f50605c.invalidate();
                return;
            case 8:
                ((x4.d) this.f11571b).unscheduleSelf(runnable);
                return;
            case 9:
                return;
            default:
                View view = ((l0) this.f11571b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
        }
    }

    public f(Object obj, int i10) {
        this.f11570a = i10;
        this.f11571b = obj;
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

package i;

import android.graphics.drawable.Drawable;
import android.view.View;
import mh.t4;
import ng.o0;
import org.telegram.ui.Components.c31;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.oo0;
import wh.r0;
public final class f implements Drawable.Callback {
    public final int f7743a;
    public Object f7744b;

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f7743a) {
            case 0:
                return;
            case 1:
                ((k2.d) this.f7744b).invalidateSelf();
                return;
            case 2:
                ((kg.a) this.f7744b).f11186c.invalidate();
                return;
            case 3:
                ((kg.c) this.f7744b).f11212c.invalidate();
                return;
            case 4:
                ((t4) this.f7744b).f14802f.invalidate();
                return;
            case 5:
                o0 o0Var = (o0) this.f7744b;
                View view = o0Var.W;
                if (view != null) {
                    view.invalidate();
                    if (o0Var.R && o0Var.W.getParent() != null && (o0Var.W.getParent().getParent() instanceof View)) {
                        ((View) o0Var.W.getParent().getParent()).invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ((eq) this.f7744b).invalidateSelf();
                return;
            case 7:
                ((oo0) this.f7744b).f29842b.run();
                return;
            case 8:
                ((ef.f) this.f7744b).invalidateSelf();
                return;
            case 9:
                ((c31) this.f7744b).invalidateSelf();
                return;
            default:
                ((r0) this.f7744b).f49998b.invalidate();
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f7743a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f7744b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j10);
                    return;
                }
                return;
            case 1:
                ((k2.d) this.f7744b).scheduleSelf(runnable, j10);
                return;
            case 2:
                ((kg.a) this.f7744b).f11186c.invalidate();
                return;
            case 3:
                ((kg.c) this.f7744b).f11212c.invalidate();
                return;
            case 4:
                return;
            case 5:
                View view = ((o0) this.f7744b).W;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j10);
                    return;
                }
                return;
            case 6:
                ((eq) this.f7744b).scheduleSelf(runnable, j10);
                return;
            case 7:
                return;
            case 8:
                ((ef.f) this.f7744b).scheduleSelf(runnable, j10);
                return;
            case 9:
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f7743a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f7744b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 1:
                ((k2.d) this.f7744b).unscheduleSelf(runnable);
                return;
            case 2:
                ((kg.a) this.f7744b).f11186c.invalidate();
                return;
            case 3:
                ((kg.c) this.f7744b).f11212c.invalidate();
                return;
            case 4:
                return;
            case 5:
                View view = ((o0) this.f7744b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 6:
                ((eq) this.f7744b).unscheduleSelf(runnable);
                return;
            case 7:
                return;
            case 8:
                ((ef.f) this.f7744b).unscheduleSelf(runnable);
                return;
            case 9:
            default:
                return;
        }
    }

    public f(Object obj, int i10) {
        this.f7743a = i10;
        this.f7744b = obj;
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

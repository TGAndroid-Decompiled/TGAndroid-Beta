package i;

import android.graphics.drawable.Drawable;
import android.view.View;
import lh.t4;
import mg.o0;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.c31;
import org.telegram.ui.Components.no0;
import vh.r0;
public final class f implements Drawable.Callback {
    public final int f7184a;
    public Object f7185b;

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f7184a) {
            case 0:
                return;
            case 1:
                ((jg.a) this.f7185b).f9353c.invalidate();
                return;
            case 2:
                ((jg.c) this.f7185b).f9378c.invalidate();
                return;
            case 3:
                ((k2.d) this.f7185b).invalidateSelf();
                return;
            case 4:
                ((t4) this.f7185b).f13107f.invalidate();
                return;
            case 5:
                o0 o0Var = (o0) this.f7185b;
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
                ((bq) this.f7185b).invalidateSelf();
                return;
            case 7:
                ((no0) this.f7185b).f27325b.run();
                return;
            case 8:
                ((df.f) this.f7185b).invalidateSelf();
                return;
            case 9:
                ((c31) this.f7185b).invalidateSelf();
                return;
            default:
                ((r0) this.f7185b).f46176b.invalidate();
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f7184a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f7185b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j10);
                    return;
                }
                return;
            case 1:
                ((jg.a) this.f7185b).f9353c.invalidate();
                return;
            case 2:
                ((jg.c) this.f7185b).f9378c.invalidate();
                return;
            case 3:
                ((k2.d) this.f7185b).scheduleSelf(runnable, j10);
                return;
            case 4:
                return;
            case 5:
                View view = ((o0) this.f7185b).W;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j10);
                    return;
                }
                return;
            case 6:
                ((bq) this.f7185b).scheduleSelf(runnable, j10);
                return;
            case 7:
                return;
            case 8:
                ((df.f) this.f7185b).scheduleSelf(runnable, j10);
                return;
            case 9:
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f7184a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f7185b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 1:
                ((jg.a) this.f7185b).f9353c.invalidate();
                return;
            case 2:
                ((jg.c) this.f7185b).f9378c.invalidate();
                return;
            case 3:
                ((k2.d) this.f7185b).unscheduleSelf(runnable);
                return;
            case 4:
                return;
            case 5:
                View view = ((o0) this.f7185b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 6:
                ((bq) this.f7185b).unscheduleSelf(runnable);
                return;
            case 7:
                return;
            case 8:
                ((df.f) this.f7185b).unscheduleSelf(runnable);
                return;
            case 9:
            default:
                return;
        }
    }

    public f(Object obj, int i10) {
        this.f7184a = i10;
        this.f7185b = obj;
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

package i;

import android.graphics.drawable.Drawable;
import android.view.View;
import ii.u0;
import org.telegram.ui.Components.c31;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.ko0;
import yh.m3;
import zg.n0;
public final class f implements Drawable.Callback {
    public final int f10564a;
    public Object f10565b;

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f10564a) {
            case 0:
                return;
            case 1:
                ((u0) this.f10565b).f11645b.invalidate();
                return;
            case 2:
                ((fq) this.f10565b).invalidateSelf();
                return;
            case 3:
                ((ko0) this.f10565b).f25644b.run();
                return;
            case 4:
                ((ed) this.f10565b).invalidateSelf();
                return;
            case 5:
                ((c31) this.f10565b).invalidateSelf();
                return;
            case 6:
                ((wg.a) this.f10565b).f44976c.invalidate();
                return;
            case 7:
                ((wg.c) this.f10565b).f45001c.invalidate();
                return;
            case 8:
                ((x4.d) this.f10565b).invalidateSelf();
                return;
            case 9:
                ((m3) this.f10565b).f47394f.invalidate();
                return;
            default:
                n0 n0Var = (n0) this.f10565b;
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
        switch (this.f10564a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f10565b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j3);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                ((fq) this.f10565b).scheduleSelf(runnable, j3);
                return;
            case 3:
                return;
            case 4:
                ((ed) this.f10565b).scheduleSelf(runnable, j3);
                return;
            case 5:
                return;
            case 6:
                ((wg.a) this.f10565b).f44976c.invalidate();
                return;
            case 7:
                ((wg.c) this.f10565b).f45001c.invalidate();
                return;
            case 8:
                ((x4.d) this.f10565b).scheduleSelf(runnable, j3);
                return;
            case 9:
                return;
            default:
                View view = ((n0) this.f10565b).W;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f10564a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f10565b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                ((fq) this.f10565b).unscheduleSelf(runnable);
                return;
            case 3:
                return;
            case 4:
                ((ed) this.f10565b).unscheduleSelf(runnable);
                return;
            case 5:
                return;
            case 6:
                ((wg.a) this.f10565b).f44976c.invalidate();
                return;
            case 7:
                ((wg.c) this.f10565b).f45001c.invalidate();
                return;
            case 8:
                ((x4.d) this.f10565b).unscheduleSelf(runnable);
                return;
            case 9:
                return;
            default:
                View view = ((n0) this.f10565b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
        }
    }

    public f(Object obj, int i10) {
        this.f10564a = i10;
        this.f10565b = obj;
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

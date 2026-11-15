package a5;

import android.graphics.drawable.Drawable;
import android.view.View;
import ch.n0;
import di.n5;
import oi.p0;
import org.telegram.ui.Components.um0;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.w11;
public final class b implements Drawable.Callback {
    public final int f209a;
    public Object f210b;

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f209a) {
            case 0:
                ((e) this.f210b).invalidateSelf();
                return;
            case 1:
                n0 n0Var = (n0) this.f210b;
                View view = n0Var.V;
                if (view != null) {
                    view.invalidate();
                    if (n0Var.Q && n0Var.V.getParent() != null && (n0Var.V.getParent().getParent() instanceof View)) {
                        ((View) n0Var.V.getParent().getParent()).invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((dh.d) this.f210b).invalidateSelf();
                return;
            case 3:
                ((n5) this.f210b).h.invalidate();
                return;
            case 4:
                return;
            case 5:
                ((p0) this.f210b).f21866b.invalidate();
                return;
            case 6:
                ((vp) this.f210b).invalidateSelf();
                return;
            case 7:
                ((um0) this.f210b).f40110b.run();
                return;
            case 8:
                ((w11) this.f210b).invalidateSelf();
                return;
            case 9:
                ((zg.a) this.f210b).f61361c.invalidate();
                return;
            default:
                ((zg.c) this.f210b).f61387c.invalidate();
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f209a) {
            case 0:
                ((e) this.f210b).scheduleSelf(runnable, j3);
                return;
            case 1:
                View view = ((n0) this.f210b).V;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j3);
                    return;
                }
                return;
            case 2:
                ((dh.d) this.f210b).scheduleSelf(runnable, j3);
                return;
            case 3:
                return;
            case 4:
                Drawable.Callback callback = (Drawable.Callback) this.f210b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j3);
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                ((vp) this.f210b).scheduleSelf(runnable, j3);
                return;
            case 7:
            case 8:
                return;
            case 9:
                ((zg.a) this.f210b).f61361c.invalidate();
                return;
            default:
                ((zg.c) this.f210b).f61387c.invalidate();
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f209a) {
            case 0:
                ((e) this.f210b).unscheduleSelf(runnable);
                return;
            case 1:
                View view = ((n0) this.f210b).V;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 2:
                ((dh.d) this.f210b).unscheduleSelf(runnable);
                return;
            case 3:
                return;
            case 4:
                Drawable.Callback callback = (Drawable.Callback) this.f210b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                ((vp) this.f210b).unscheduleSelf(runnable);
                return;
            case 7:
            case 8:
                return;
            case 9:
                ((zg.a) this.f210b).f61361c.invalidate();
                return;
            default:
                ((zg.c) this.f210b).f61387c.invalidate();
                return;
        }
    }

    public b(Object obj, int i7) {
        this.f209a = i7;
        this.f210b = obj;
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

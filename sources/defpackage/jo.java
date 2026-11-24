package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class jo implements Drawable.Callback {
    public final byte a;
    public Object b;

    public jo(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                ((mo) this.b).invalidateSelf();
                return;
            case 1:
                ((qm0) this.b).invalidateSelf();
                return;
            case 2:
                ((ai2) this.b).invalidateSelf();
                return;
            case 3:
                ((bk2) this.b).invalidateSelf();
                return;
            case 4:
                return;
            case 5:
                ((ay4) this.b).c.invalidate();
                return;
            case 6:
                ((cy4) this.b).c.invalidate();
                return;
            case 7:
                cm1 cm1Var = ((vq8) this.b).g;
                if (cm1Var != null) {
                    cm1Var.invalidate();
                    return;
                }
                return;
            case 8:
                i39 i39Var = (i39) this.b;
                View view = i39Var.V;
                if (view != null) {
                    view.invalidate();
                    if (i39Var.Q && view.getParent() != null && (view.getParent().getParent() instanceof View)) {
                        ((View) view.getParent().getParent()).invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((be9) this.b).b.invalidate();
                return;
            case 10:
                ((lx9) this.b).b.run();
                return;
            case 11:
                ((jsa) this.b).h.invalidate();
                return;
            default:
                ((u0c) this.b).invalidateSelf();
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.a) {
            case 0:
                ((mo) this.b).scheduleSelf(runnable, j);
                return;
            case 1:
                ((qm0) this.b).scheduleSelf(runnable, j);
                return;
            case 2:
                ((ai2) this.b).scheduleSelf(runnable, j);
                return;
            case 3:
                ((bk2) this.b).scheduleSelf(runnable, j);
                return;
            case 4:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    return;
                }
                return;
            case 5:
                ((ay4) this.b).c.invalidate();
                return;
            case 6:
                ((cy4) this.b).c.invalidate();
                return;
            case 7:
                return;
            case 8:
                View view = ((i39) this.b).V;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j);
                    return;
                }
                return;
            case 9:
            case 10:
            case 11:
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                ((mo) this.b).unscheduleSelf(runnable);
                return;
            case 1:
                ((qm0) this.b).unscheduleSelf(runnable);
                return;
            case 2:
                ((ai2) this.b).unscheduleSelf(runnable);
                return;
            case 3:
                ((bk2) this.b).unscheduleSelf(runnable);
                return;
            case 4:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 5:
                ((ay4) this.b).c.invalidate();
                return;
            case 6:
                ((cy4) this.b).c.invalidate();
                return;
            case 7:
                return;
            case 8:
                View view = ((i39) this.b).V;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 9:
            case 10:
            case 11:
            default:
                return;
        }
    }

    private final void a(Drawable drawable) {
    }

    private final void g(Drawable drawable, Runnable runnable) {
    }

    private final void h(Drawable drawable, Runnable runnable) {
    }

    private final void i(Drawable drawable, Runnable runnable) {
    }

    private final void j(Drawable drawable, Runnable runnable) {
    }

    private final void k(Drawable drawable, Runnable runnable) {
    }

    private final void b(Drawable drawable, Runnable runnable, long j) {
    }

    private final void c(Drawable drawable, Runnable runnable, long j) {
    }

    private final void d(Drawable drawable, Runnable runnable, long j) {
    }

    private final void e(Drawable drawable, Runnable runnable, long j) {
    }

    private final void f(Drawable drawable, Runnable runnable, long j) {
    }
}

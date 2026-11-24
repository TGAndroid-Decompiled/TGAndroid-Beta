package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class in implements Drawable.Callback {
    public final byte a;
    public Object b;

    public in(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                ((ln) this.b).invalidateSelf();
                return;
            case 1:
                ((ql0) this.b).invalidateSelf();
                return;
            case 2:
                ((mg2) this.b).invalidateSelf();
                return;
            case 3:
                ((ni2) this.b).invalidateSelf();
                return;
            case 4:
                return;
            case 5:
                ((yv4) this.b).c.invalidate();
                return;
            case 6:
                ((aw4) this.b).c.invalidate();
                return;
            case 7:
                uk1 uk1Var = ((uo8) this.b).g;
                if (uk1Var != null) {
                    uk1Var.invalidate();
                    return;
                }
                return;
            case 8:
                f19 f19Var = (f19) this.b;
                View view = f19Var.V;
                if (view != null) {
                    view.invalidate();
                    if (f19Var.Q && view.getParent() != null && (view.getParent().getParent() instanceof View)) {
                        ((View) view.getParent().getParent()).invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((ac9) this.b).b.invalidate();
                return;
            case 10:
                ((iv9) this.b).b.run();
                return;
            case 11:
                ((jqa) this.b).h.invalidate();
                return;
            default:
                ((tyb) this.b).invalidateSelf();
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.a) {
            case 0:
                ((ln) this.b).scheduleSelf(runnable, j);
                return;
            case 1:
                ((ql0) this.b).scheduleSelf(runnable, j);
                return;
            case 2:
                ((mg2) this.b).scheduleSelf(runnable, j);
                return;
            case 3:
                ((ni2) this.b).scheduleSelf(runnable, j);
                return;
            case 4:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    return;
                }
                return;
            case 5:
                ((yv4) this.b).c.invalidate();
                return;
            case 6:
                ((aw4) this.b).c.invalidate();
                return;
            case 7:
                return;
            case 8:
                View view = ((f19) this.b).V;
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
                ((ln) this.b).unscheduleSelf(runnable);
                return;
            case 1:
                ((ql0) this.b).unscheduleSelf(runnable);
                return;
            case 2:
                ((mg2) this.b).unscheduleSelf(runnable);
                return;
            case 3:
                ((ni2) this.b).unscheduleSelf(runnable);
                return;
            case 4:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 5:
                ((yv4) this.b).c.invalidate();
                return;
            case 6:
                ((aw4) this.b).c.invalidate();
                return;
            case 7:
                return;
            case 8:
                View view = ((f19) this.b).V;
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

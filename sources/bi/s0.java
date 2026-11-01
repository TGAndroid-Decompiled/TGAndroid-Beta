package bi;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.sn0;
import org.telegram.ui.Components.u21;
import org.telegram.ui.Components.up;
public final class s0 implements Drawable.Callback {
    public final int f3335a;
    public Object f3336b;

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f3335a) {
            case 0:
                ((y0) this.f3336b).f3455b.invalidate();
                return;
            case 1:
                return;
            case 2:
                ((up) this.f3336b).invalidateSelf();
                return;
            case 3:
                ((sn0) this.f3336b).f30381b.run();
                return;
            case 4:
                ((jh.g) this.f3336b).invalidateSelf();
                return;
            case 5:
                ((u21) this.f3336b).invalidateSelf();
                return;
            case 6:
                ((pg.a) this.f3336b).f44931c.invalidate();
                return;
            case 7:
                ((pg.c) this.f3336b).f44956c.invalidate();
                return;
            case 8:
                ((rh.p3) this.f3336b).h.invalidate();
                return;
            case 9:
                sg.m0 m0Var = (sg.m0) this.f3336b;
                View view = m0Var.V;
                if (view != null) {
                    view.invalidate();
                    if (m0Var.Q && m0Var.V.getParent() != null && (m0Var.V.getParent().getParent() instanceof View)) {
                        ((View) m0Var.V.getParent().getParent()).invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((tg.c) this.f3336b).invalidateSelf();
                return;
            default:
                ((x4.d) this.f3336b).invalidateSelf();
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f3335a) {
            case 0:
                return;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.f3336b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j10);
                    return;
                }
                return;
            case 2:
                ((up) this.f3336b).scheduleSelf(runnable, j10);
                return;
            case 3:
                return;
            case 4:
                ((jh.g) this.f3336b).scheduleSelf(runnable, j10);
                return;
            case 5:
                return;
            case 6:
                ((pg.a) this.f3336b).f44931c.invalidate();
                return;
            case 7:
                ((pg.c) this.f3336b).f44956c.invalidate();
                return;
            case 8:
                return;
            case 9:
                View view = ((sg.m0) this.f3336b).V;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j10);
                    return;
                }
                return;
            case 10:
                ((tg.c) this.f3336b).scheduleSelf(runnable, j10);
                return;
            default:
                ((x4.d) this.f3336b).scheduleSelf(runnable, j10);
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f3335a) {
            case 0:
                return;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.f3336b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 2:
                ((up) this.f3336b).unscheduleSelf(runnable);
                return;
            case 3:
                return;
            case 4:
                ((jh.g) this.f3336b).unscheduleSelf(runnable);
                return;
            case 5:
                return;
            case 6:
                ((pg.a) this.f3336b).f44931c.invalidate();
                return;
            case 7:
                ((pg.c) this.f3336b).f44956c.invalidate();
                return;
            case 8:
                return;
            case 9:
                View view = ((sg.m0) this.f3336b).V;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 10:
                ((tg.c) this.f3336b).unscheduleSelf(runnable);
                return;
            default:
                ((x4.d) this.f3336b).unscheduleSelf(runnable);
                return;
        }
    }

    public s0(Object obj, int i10) {
        this.f3335a = i10;
        this.f3336b = obj;
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

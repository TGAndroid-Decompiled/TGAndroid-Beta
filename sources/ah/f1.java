package ah;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.e41;
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.rq;
import zh.g3;
public final class f1 implements Drawable.Callback {
    public final int f733a;
    public Object f734b;

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f733a) {
            case 0:
                g1 g1Var = (g1) this.f734b;
                View view = g1Var.W;
                if (view != null) {
                    view.invalidate();
                    if (g1Var.R && g1Var.W.getParent() != null && (g1Var.W.getParent().getParent() instanceof View)) {
                        ((View) g1Var.W.getParent().getParent()).invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                ((ji.t0) this.f734b).f13522b.invalidate();
                return;
            case 3:
                ((rq) this.f734b).invalidateSelf();
                return;
            case 4:
                ((lp0) this.f734b).f26781b.run();
                return;
            case 5:
                ((gd) this.f734b).invalidateSelf();
                return;
            case 6:
                ((e41) this.f734b).invalidateSelf();
                return;
            case 7:
                ((x4.d) this.f734b).invalidateSelf();
                return;
            case 8:
                ((xg.a) this.f734b).f48394c.invalidate();
                return;
            case 9:
                ((xg.c) this.f734b).f48419c.invalidate();
                return;
            default:
                ((g3) this.f734b).h.invalidate();
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f733a) {
            case 0:
                View view = ((g1) this.f734b).W;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j10);
                    return;
                }
                return;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.f734b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j10);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                ((rq) this.f734b).scheduleSelf(runnable, j10);
                return;
            case 4:
                return;
            case 5:
                ((gd) this.f734b).scheduleSelf(runnable, j10);
                return;
            case 6:
                return;
            case 7:
                ((x4.d) this.f734b).scheduleSelf(runnable, j10);
                return;
            case 8:
                ((xg.a) this.f734b).f48394c.invalidate();
                return;
            case 9:
                ((xg.c) this.f734b).f48419c.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f733a) {
            case 0:
                View view = ((g1) this.f734b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.f734b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                ((rq) this.f734b).unscheduleSelf(runnable);
                return;
            case 4:
                return;
            case 5:
                ((gd) this.f734b).unscheduleSelf(runnable);
                return;
            case 6:
                return;
            case 7:
                ((x4.d) this.f734b).unscheduleSelf(runnable);
                return;
            case 8:
                ((xg.a) this.f734b).f48394c.invalidate();
                return;
            case 9:
                ((xg.c) this.f734b).f48419c.invalidate();
                return;
            default:
                return;
        }
    }

    public f1(Object obj, int i10) {
        this.f733a = i10;
        this.f734b = obj;
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

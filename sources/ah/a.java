package ah;

import android.graphics.drawable.Drawable;
import android.view.View;
import ci.w5;
import dh.l0;
import mi.s0;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.tm0;
public final class a implements Drawable.Callback {
    public final int f422a;
    public Object f423b;

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f422a) {
            case 0:
                ((b) this.f423b).f426c.invalidate();
                return;
            case 1:
                ((d) this.f423b).f452c.invalidate();
                return;
            case 2:
                ((w5) this.f423b).h.invalidate();
                return;
            case 3:
                l0 l0Var = (l0) this.f423b;
                View view = l0Var.V;
                if (view != null) {
                    view.invalidate();
                    if (l0Var.Q && l0Var.V.getParent() != null && (l0Var.V.getParent().getParent() instanceof View)) {
                        ((View) l0Var.V.getParent().getParent()).invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((eh.d) this.f423b).invalidateSelf();
                return;
            case 5:
                return;
            case 6:
                ((s0) this.f423b).f19872b.invalidate();
                return;
            case 7:
                ((np) this.f423b).invalidateSelf();
                return;
            case 8:
                ((tm0) this.f423b).f38499b.run();
                return;
            case 9:
                ((l11) this.f423b).invalidateSelf();
                return;
            default:
                ((z4.d) this.f423b).invalidateSelf();
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f422a) {
            case 0:
                ((b) this.f423b).f426c.invalidate();
                return;
            case 1:
                ((d) this.f423b).f452c.invalidate();
                return;
            case 2:
                return;
            case 3:
                View view = ((l0) this.f423b).V;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j10);
                    return;
                }
                return;
            case 4:
                ((eh.d) this.f423b).scheduleSelf(runnable, j10);
                return;
            case 5:
                Drawable.Callback callback = (Drawable.Callback) this.f423b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j10);
                    return;
                }
                return;
            case 6:
                return;
            case 7:
                ((np) this.f423b).scheduleSelf(runnable, j10);
                return;
            case 8:
            case 9:
                return;
            default:
                ((z4.d) this.f423b).scheduleSelf(runnable, j10);
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f422a) {
            case 0:
                ((b) this.f423b).f426c.invalidate();
                return;
            case 1:
                ((d) this.f423b).f452c.invalidate();
                return;
            case 2:
                return;
            case 3:
                View view = ((l0) this.f423b).V;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 4:
                ((eh.d) this.f423b).unscheduleSelf(runnable);
                return;
            case 5:
                Drawable.Callback callback = (Drawable.Callback) this.f423b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 6:
                return;
            case 7:
                ((np) this.f423b).unscheduleSelf(runnable);
                return;
            case 8:
            case 9:
                return;
            default:
                ((z4.d) this.f423b).unscheduleSelf(runnable);
                return;
        }
    }

    public a(Object obj, int i3) {
        this.f422a = i3;
        this.f423b = obj;
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

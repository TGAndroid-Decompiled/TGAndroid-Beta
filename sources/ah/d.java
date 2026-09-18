package ah;

import android.graphics.drawable.Drawable;
import android.view.View;
import ii.u0;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.s31;
import org.telegram.ui.Components.yo0;
import yh.m3;
import zg.m0;
public final class d implements Drawable.Callback {
    public final int f428a;
    public Object f429b;

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f428a) {
            case 0:
                ((e) this.f429b).invalidateSelf();
                return;
            case 1:
                return;
            case 2:
                ((u0) this.f429b).f11650b.invalidate();
                return;
            case 3:
                ((eq) this.f429b).invalidateSelf();
                return;
            case 4:
                ((yo0) this.f429b).f30626b.run();
                return;
            case 5:
                ((ed) this.f429b).invalidateSelf();
                return;
            case 6:
                ((s31) this.f429b).invalidateSelf();
                return;
            case 7:
                ((wg.a) this.f429b).f45277c.invalidate();
                return;
            case 8:
                ((wg.c) this.f429b).f45302c.invalidate();
                return;
            case 9:
                ((x4.d) this.f429b).invalidateSelf();
                return;
            case 10:
                ((m3) this.f429b).f47701f.invalidate();
                return;
            default:
                m0 m0Var = (m0) this.f429b;
                View view = m0Var.W;
                if (view != null) {
                    view.invalidate();
                    if (m0Var.R && m0Var.W.getParent() != null && (m0Var.W.getParent().getParent() instanceof View)) {
                        ((View) m0Var.W.getParent().getParent()).invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f428a) {
            case 0:
                ((e) this.f429b).scheduleSelf(runnable, j3);
                return;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.f429b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j3);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                ((eq) this.f429b).scheduleSelf(runnable, j3);
                return;
            case 4:
                return;
            case 5:
                ((ed) this.f429b).scheduleSelf(runnable, j3);
                return;
            case 6:
                return;
            case 7:
                ((wg.a) this.f429b).f45277c.invalidate();
                return;
            case 8:
                ((wg.c) this.f429b).f45302c.invalidate();
                return;
            case 9:
                ((x4.d) this.f429b).scheduleSelf(runnable, j3);
                return;
            case 10:
                return;
            default:
                View view = ((m0) this.f429b).W;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f428a) {
            case 0:
                ((e) this.f429b).unscheduleSelf(runnable);
                return;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.f429b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                ((eq) this.f429b).unscheduleSelf(runnable);
                return;
            case 4:
                return;
            case 5:
                ((ed) this.f429b).unscheduleSelf(runnable);
                return;
            case 6:
                return;
            case 7:
                ((wg.a) this.f429b).f45277c.invalidate();
                return;
            case 8:
                ((wg.c) this.f429b).f45302c.invalidate();
                return;
            case 9:
                ((x4.d) this.f429b).unscheduleSelf(runnable);
                return;
            case 10:
                return;
            default:
                View view = ((m0) this.f429b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
        }
    }

    public d(Object obj, int i10) {
        this.f428a = i10;
        this.f429b = obj;
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

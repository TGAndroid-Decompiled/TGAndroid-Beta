package hg;

import android.graphics.drawable.Drawable;
import android.view.View;
import cf.f;
import jh.u4;
import kg.o0;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.s21;
import org.telegram.ui.Components.yp;
import th.q0;
public final class a implements Drawable.Callback {
    public final int f7998a;
    public Object f7999b;

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f7998a) {
            case 0:
                ((b) this.f7999b).f8002c.invalidate();
                return;
            case 1:
                ((d) this.f7999b).f8028c.invalidate();
                return;
            case 2:
                return;
            case 3:
                ((u4) this.f7999b).f12897f.invalidate();
                return;
            case 4:
                ((k2.d) this.f7999b).invalidateSelf();
                return;
            case 5:
                o0 o0Var = (o0) this.f7999b;
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
                ((yp) this.f7999b).invalidateSelf();
                return;
            case 7:
                ((eo0) this.f7999b).f28133b.run();
                return;
            case 8:
                ((f) this.f7999b).invalidateSelf();
                return;
            case 9:
                ((s21) this.f7999b).invalidateSelf();
                return;
            default:
                ((q0) this.f7999b).f48683b.invalidate();
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f7998a) {
            case 0:
                ((b) this.f7999b).f8002c.invalidate();
                return;
            case 1:
                ((d) this.f7999b).f8028c.invalidate();
                return;
            case 2:
                Drawable.Callback callback = (Drawable.Callback) this.f7999b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j10);
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                ((k2.d) this.f7999b).scheduleSelf(runnable, j10);
                return;
            case 5:
                View view = ((o0) this.f7999b).W;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j10);
                    return;
                }
                return;
            case 6:
                ((yp) this.f7999b).scheduleSelf(runnable, j10);
                return;
            case 7:
                return;
            case 8:
                ((f) this.f7999b).scheduleSelf(runnable, j10);
                return;
            case 9:
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f7998a) {
            case 0:
                ((b) this.f7999b).f8002c.invalidate();
                return;
            case 1:
                ((d) this.f7999b).f8028c.invalidate();
                return;
            case 2:
                Drawable.Callback callback = (Drawable.Callback) this.f7999b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                ((k2.d) this.f7999b).unscheduleSelf(runnable);
                return;
            case 5:
                View view = ((o0) this.f7999b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 6:
                ((yp) this.f7999b).unscheduleSelf(runnable);
                return;
            case 7:
                return;
            case 8:
                ((f) this.f7999b).unscheduleSelf(runnable);
                return;
            case 9:
            default:
                return;
        }
    }

    public a(Object obj, int i10) {
        this.f7998a = i10;
        this.f7999b = obj;
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

package hi;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.to0;
public final class s0 implements Drawable.Callback {
    public final int f9840a;
    public Object f9841b;

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f9840a) {
            case 0:
                ((w0) this.f9841b).f9919b.invalidate();
                return;
            case 1:
                return;
            case 2:
                ((kq) this.f9841b).invalidateSelf();
                return;
            case 3:
                ((to0) this.f9841b).f27443b.run();
                return;
            case 4:
                ((dd) this.f9841b).invalidateSelf();
                return;
            case 5:
                ((q31) this.f9841b).invalidateSelf();
                return;
            case 6:
                ((vg.a) this.f9841b).f43312c.invalidate();
                return;
            case 7:
                ((vg.c) this.f9841b).f43337c.invalidate();
                return;
            case 8:
                ((x4.d) this.f9841b).invalidateSelf();
                return;
            case 9:
                ((xh.l3) this.f9841b).f45646f.invalidate();
                return;
            default:
                yg.n0 n0Var = (yg.n0) this.f9841b;
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
        switch (this.f9840a) {
            case 0:
                return;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.f9841b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j3);
                    return;
                }
                return;
            case 2:
                ((kq) this.f9841b).scheduleSelf(runnable, j3);
                return;
            case 3:
                return;
            case 4:
                ((dd) this.f9841b).scheduleSelf(runnable, j3);
                return;
            case 5:
                return;
            case 6:
                ((vg.a) this.f9841b).f43312c.invalidate();
                return;
            case 7:
                ((vg.c) this.f9841b).f43337c.invalidate();
                return;
            case 8:
                ((x4.d) this.f9841b).scheduleSelf(runnable, j3);
                return;
            case 9:
                return;
            default:
                View view = ((yg.n0) this.f9841b).W;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f9840a) {
            case 0:
                return;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.f9841b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 2:
                ((kq) this.f9841b).unscheduleSelf(runnable);
                return;
            case 3:
                return;
            case 4:
                ((dd) this.f9841b).unscheduleSelf(runnable);
                return;
            case 5:
                return;
            case 6:
                ((vg.a) this.f9841b).f43312c.invalidate();
                return;
            case 7:
                ((vg.c) this.f9841b).f43337c.invalidate();
                return;
            case 8:
                ((x4.d) this.f9841b).unscheduleSelf(runnable);
                return;
            case 9:
                return;
            default:
                View view = ((yg.n0) this.f9841b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
        }
    }

    public s0(Object obj, int i10) {
        this.f9840a = i10;
        this.f9841b = obj;
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

package ah;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.c31;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.ko0;
import zh.l3;
public final class g1 implements Drawable.Callback {
    public final int f546a;
    public Object f547b;

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f546a) {
            case 0:
                h1 h1Var = (h1) this.f547b;
                View view = h1Var.W;
                if (view != null) {
                    view.invalidate();
                    if (h1Var.R && h1Var.W.getParent() != null && (h1Var.W.getParent().getParent() instanceof View)) {
                        ((View) h1Var.W.getParent().getParent()).invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                ((ji.t0) this.f547b).f14178b.invalidate();
                return;
            case 3:
                ((dq) this.f547b).invalidateSelf();
                return;
            case 4:
                ((ko0) this.f547b).f27862b.run();
                return;
            case 5:
                ((fd) this.f547b).invalidateSelf();
                return;
            case 6:
                ((c31) this.f547b).invalidateSelf();
                return;
            case 7:
                ((x4.d) this.f547b).invalidateSelf();
                return;
            case 8:
                ((xg.a) this.f547b).f49350c.invalidate();
                return;
            case 9:
                ((xg.c) this.f547b).f49376c.invalidate();
                return;
            default:
                ((l3) this.f547b).f52192f.invalidate();
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f546a) {
            case 0:
                View view = ((h1) this.f547b).W;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j3);
                    return;
                }
                return;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.f547b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j3);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                ((dq) this.f547b).scheduleSelf(runnable, j3);
                return;
            case 4:
                return;
            case 5:
                ((fd) this.f547b).scheduleSelf(runnable, j3);
                return;
            case 6:
                return;
            case 7:
                ((x4.d) this.f547b).scheduleSelf(runnable, j3);
                return;
            case 8:
                ((xg.a) this.f547b).f49350c.invalidate();
                return;
            case 9:
                ((xg.c) this.f547b).f49376c.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f546a) {
            case 0:
                View view = ((h1) this.f547b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.f547b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                ((dq) this.f547b).unscheduleSelf(runnable);
                return;
            case 4:
                return;
            case 5:
                ((fd) this.f547b).unscheduleSelf(runnable);
                return;
            case 6:
                return;
            case 7:
                ((x4.d) this.f547b).unscheduleSelf(runnable);
                return;
            case 8:
                ((xg.a) this.f547b).f49350c.invalidate();
                return;
            case 9:
                ((xg.c) this.f547b).f49376c.invalidate();
                return;
            default:
                return;
        }
    }

    public g1(Object obj, int i10) {
        this.f546a = i10;
        this.f547b = obj;
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

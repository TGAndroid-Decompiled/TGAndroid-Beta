package ah;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.c31;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.ko0;
import zh.l3;
public final class g1 implements Drawable.Callback {
    public final int f558a;
    public Object f559b;

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f558a) {
            case 0:
                h1 h1Var = (h1) this.f559b;
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
                ((ji.t0) this.f559b).f14204b.invalidate();
                return;
            case 3:
                ((dq) this.f559b).invalidateSelf();
                return;
            case 4:
                ((ko0) this.f559b).f27889b.run();
                return;
            case 5:
                ((fd) this.f559b).invalidateSelf();
                return;
            case 6:
                ((c31) this.f559b).invalidateSelf();
                return;
            case 7:
                ((x4.d) this.f559b).invalidateSelf();
                return;
            case 8:
                ((xg.a) this.f559b).f49379c.invalidate();
                return;
            case 9:
                ((xg.c) this.f559b).f49405c.invalidate();
                return;
            default:
                ((l3) this.f559b).f52223f.invalidate();
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f558a) {
            case 0:
                View view = ((h1) this.f559b).W;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j3);
                    return;
                }
                return;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.f559b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j3);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                ((dq) this.f559b).scheduleSelf(runnable, j3);
                return;
            case 4:
                return;
            case 5:
                ((fd) this.f559b).scheduleSelf(runnable, j3);
                return;
            case 6:
                return;
            case 7:
                ((x4.d) this.f559b).scheduleSelf(runnable, j3);
                return;
            case 8:
                ((xg.a) this.f559b).f49379c.invalidate();
                return;
            case 9:
                ((xg.c) this.f559b).f49405c.invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f558a) {
            case 0:
                View view = ((h1) this.f559b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.f559b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                ((dq) this.f559b).unscheduleSelf(runnable);
                return;
            case 4:
                return;
            case 5:
                ((fd) this.f559b).unscheduleSelf(runnable);
                return;
            case 6:
                return;
            case 7:
                ((x4.d) this.f559b).unscheduleSelf(runnable);
                return;
            case 8:
                ((xg.a) this.f559b).f49379c.invalidate();
                return;
            case 9:
                ((xg.c) this.f559b).f49405c.invalidate();
                return;
            default:
                return;
        }
    }

    public g1(Object obj, int i10) {
        this.f558a = i10;
        this.f559b = obj;
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

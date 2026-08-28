package eg;

import android.graphics.drawable.Drawable;
import android.view.View;
import gh.x4;
import hg.p0;
import org.telegram.ui.Components.h21;
import org.telegram.ui.Components.tn0;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.vc;
import qh.q0;
public final class a implements Drawable.Callback {
    public final int f5120a;
    public Object f5121b;

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f5120a) {
            case 0:
                ((b) this.f5121b).f5124c.invalidate();
                return;
            case 1:
                ((d) this.f5121b).f5150c.invalidate();
                return;
            case 2:
                ((x4) this.f5121b).f9152f.invalidate();
                return;
            case 3:
                p0 p0Var = (p0) this.f5121b;
                View view = p0Var.W;
                if (view != null) {
                    view.invalidate();
                    if (p0Var.R && p0Var.W.getParent() != null && (p0Var.W.getParent().getParent() instanceof View)) {
                        ((View) p0Var.W.getParent().getParent()).invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                ((k2.d) this.f5121b).invalidateSelf();
                return;
            case 6:
                ((up) this.f5121b).invalidateSelf();
                return;
            case 7:
                ((tn0) this.f5121b).f32752b.run();
                return;
            case 8:
                ((vc) this.f5121b).invalidateSelf();
                return;
            case 9:
                ((h21) this.f5121b).invalidateSelf();
                return;
            default:
                ((q0) this.f5121b).f46622b.invalidate();
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f5120a) {
            case 0:
                ((b) this.f5121b).f5124c.invalidate();
                return;
            case 1:
                ((d) this.f5121b).f5150c.invalidate();
                return;
            case 2:
                return;
            case 3:
                View view = ((p0) this.f5121b).W;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j10);
                    return;
                }
                return;
            case 4:
                Drawable.Callback callback = (Drawable.Callback) this.f5121b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j10);
                    return;
                }
                return;
            case 5:
                ((k2.d) this.f5121b).scheduleSelf(runnable, j10);
                return;
            case 6:
                ((up) this.f5121b).scheduleSelf(runnable, j10);
                return;
            case 7:
                return;
            case 8:
                ((vc) this.f5121b).scheduleSelf(runnable, j10);
                return;
            case 9:
            default:
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f5120a) {
            case 0:
                ((b) this.f5121b).f5124c.invalidate();
                return;
            case 1:
                ((d) this.f5121b).f5150c.invalidate();
                return;
            case 2:
                return;
            case 3:
                View view = ((p0) this.f5121b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 4:
                Drawable.Callback callback = (Drawable.Callback) this.f5121b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 5:
                ((k2.d) this.f5121b).unscheduleSelf(runnable);
                return;
            case 6:
                ((up) this.f5121b).unscheduleSelf(runnable);
                return;
            case 7:
                return;
            case 8:
                ((vc) this.f5121b).unscheduleSelf(runnable);
                return;
            case 9:
            default:
                return;
        }
    }

    public a(Object obj, int i9) {
        this.f5120a = i9;
        this.f5121b = obj;
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

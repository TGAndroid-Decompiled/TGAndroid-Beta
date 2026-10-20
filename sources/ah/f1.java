package ah;

import ai.v6;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.hp0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.z31;
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
                ((v6) this.f734b).h.invalidate();
                return;
            case 2:
                return;
            case 3:
                ((ki.t0) this.f734b).f15520b.invalidate();
                return;
            case 4:
                ((oq) this.f734b).invalidateSelf();
                return;
            case 5:
                ((hp0) this.f734b).f26959b.run();
                return;
            case 6:
                ((ed) this.f734b).invalidateSelf();
                return;
            case 7:
                ((z31) this.f734b).invalidateSelf();
                return;
            case 8:
                ((x4.d) this.f734b).invalidateSelf();
                return;
            case 9:
                ((xg.a) this.f734b).f49787c.invalidate();
                return;
            default:
                ((xg.c) this.f734b).f49812c.invalidate();
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
                return;
            case 2:
                Drawable.Callback callback = (Drawable.Callback) this.f734b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j10);
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                ((oq) this.f734b).scheduleSelf(runnable, j10);
                return;
            case 5:
                return;
            case 6:
                ((ed) this.f734b).scheduleSelf(runnable, j10);
                return;
            case 7:
                return;
            case 8:
                ((x4.d) this.f734b).scheduleSelf(runnable, j10);
                return;
            case 9:
                ((xg.a) this.f734b).f49787c.invalidate();
                return;
            default:
                ((xg.c) this.f734b).f49812c.invalidate();
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
                return;
            case 2:
                Drawable.Callback callback = (Drawable.Callback) this.f734b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                ((oq) this.f734b).unscheduleSelf(runnable);
                return;
            case 5:
                return;
            case 6:
                ((ed) this.f734b).unscheduleSelf(runnable);
                return;
            case 7:
                return;
            case 8:
                ((x4.d) this.f734b).unscheduleSelf(runnable);
                return;
            case 9:
                ((xg.a) this.f734b).f49787c.invalidate();
                return;
            default:
                ((xg.c) this.f734b).f49812c.invalidate();
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

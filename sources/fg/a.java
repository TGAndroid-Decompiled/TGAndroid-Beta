package fg;

import af.g;
import android.graphics.drawable.Drawable;
import android.view.View;
import hh.v4;
import ig.o0;
import org.telegram.ui.Components.j21;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.un0;
import rh.q0;

public final class a implements Drawable.Callback {

    public final int f6051a;

    public Object f6052b;

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f6051a) {
            case 0:
                ((b) this.f6052b).f6055c.invalidate();
                break;
            case 1:
                ((d) this.f6052b).f6081c.invalidate();
                break;
            case 2:
                ((v4) this.f6052b).f10214f.invalidate();
                break;
            case 3:
                break;
            case 4:
                o0 o0Var = (o0) this.f6052b;
                View view = o0Var.W;
                if (view != null) {
                    view.invalidate();
                    if (o0Var.R && o0Var.W.getParent() != null && (o0Var.W.getParent().getParent() instanceof View)) {
                        ((View) o0Var.W.getParent().getParent()).invalidate();
                        break;
                    }
                }
                break;
            case 5:
                ((k2.d) this.f6052b).invalidateSelf();
                break;
            case 6:
                ((sp) this.f6052b).invalidateSelf();
                break;
            case 7:
                ((un0) this.f6052b).f33141b.run();
                break;
            case 8:
                ((g) this.f6052b).invalidateSelf();
                break;
            case 9:
                ((j21) this.f6052b).invalidateSelf();
                break;
            default:
                ((q0) this.f6052b).f47385b.invalidate();
                break;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f6051a) {
            case 0:
                ((b) this.f6052b).f6055c.invalidate();
                break;
            case 1:
                ((d) this.f6052b).f6081c.invalidate();
                break;
            case 3:
                Drawable.Callback callback = (Drawable.Callback) this.f6052b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j10);
                }
                break;
            case 4:
                View view = ((o0) this.f6052b).W;
                if (view != null) {
                    view.scheduleDrawable(drawable, runnable, j10);
                }
                break;
            case 5:
                ((k2.d) this.f6052b).scheduleSelf(runnable, j10);
                break;
            case 6:
                ((sp) this.f6052b).scheduleSelf(runnable, j10);
                break;
            case 8:
                ((g) this.f6052b).scheduleSelf(runnable, j10);
                break;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f6051a) {
            case 0:
                ((b) this.f6052b).f6055c.invalidate();
                break;
            case 1:
                ((d) this.f6052b).f6081c.invalidate();
                break;
            case 3:
                Drawable.Callback callback = (Drawable.Callback) this.f6052b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                }
                break;
            case 4:
                View view = ((o0) this.f6052b).W;
                if (view != null) {
                    view.unscheduleDrawable(drawable, runnable);
                }
                break;
            case 5:
                ((k2.d) this.f6052b).unscheduleSelf(runnable);
                break;
            case 6:
                ((sp) this.f6052b).unscheduleSelf(runnable);
                break;
            case 8:
                ((g) this.f6052b).unscheduleSelf(runnable);
                break;
        }
    }

    public a(Object obj, int i10) {
        this.f6051a = i10;
        this.f6052b = obj;
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

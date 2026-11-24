package defpackage;

import android.graphics.drawable.Drawable;
public final class w43 implements Drawable.Callback {
    public final byte a;
    public final x43 b;

    public w43(x43 x43Var, byte b) {
        this.a = b;
        this.b = x43Var;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        byte b = this.a;
        x43 x43Var = this.b;
        switch (b) {
            case 0:
                if (x43Var.c < 1.0f) {
                    x43Var.invalidateSelf();
                    return;
                }
                return;
            default:
                if (x43Var.c > 0.0f) {
                    x43Var.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        byte b = this.a;
        x43 x43Var = this.b;
        switch (b) {
            case 0:
                if (x43Var.c < 1.0f) {
                    x43Var.scheduleSelf(runnable, j);
                    return;
                }
                return;
            default:
                if (x43Var.c > 0.0f) {
                    x43Var.scheduleSelf(runnable, j);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        byte b = this.a;
        x43 x43Var = this.b;
        switch (b) {
            case 0:
                if (x43Var.c < 1.0f) {
                    x43Var.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                if (x43Var.c > 0.0f) {
                    x43Var.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}

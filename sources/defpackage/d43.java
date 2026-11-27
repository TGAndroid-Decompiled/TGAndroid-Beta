package defpackage;

import android.graphics.drawable.Drawable;
public final class d43 implements Drawable.Callback {
    public final byte a;
    public final e43 b;

    public d43(e43 e43Var, byte b) {
        this.a = b;
        this.b = e43Var;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        byte b = this.a;
        e43 e43Var = this.b;
        switch (b) {
            case 0:
                if (e43Var.c < 1.0f) {
                    e43Var.invalidateSelf();
                    return;
                }
                return;
            default:
                if (e43Var.c > 0.0f) {
                    e43Var.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        byte b = this.a;
        e43 e43Var = this.b;
        switch (b) {
            case 0:
                if (e43Var.c < 1.0f) {
                    e43Var.scheduleSelf(runnable, j);
                    return;
                }
                return;
            default:
                if (e43Var.c > 0.0f) {
                    e43Var.scheduleSelf(runnable, j);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        byte b = this.a;
        e43 e43Var = this.b;
        switch (b) {
            case 0:
                if (e43Var.c < 1.0f) {
                    e43Var.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                if (e43Var.c > 0.0f) {
                    e43Var.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}

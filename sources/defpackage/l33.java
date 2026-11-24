package defpackage;

import android.graphics.drawable.Drawable;
public final class l33 implements Drawable.Callback {
    public final byte a;
    public final m33 b;

    public l33(m33 m33Var, byte b) {
        this.a = b;
        this.b = m33Var;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        byte b = this.a;
        m33 m33Var = this.b;
        switch (b) {
            case 0:
                if (m33Var.c < 1.0f) {
                    m33Var.invalidateSelf();
                    return;
                }
                return;
            default:
                if (m33Var.c > 0.0f) {
                    m33Var.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        byte b = this.a;
        m33 m33Var = this.b;
        switch (b) {
            case 0:
                if (m33Var.c < 1.0f) {
                    m33Var.scheduleSelf(runnable, j);
                    return;
                }
                return;
            default:
                if (m33Var.c > 0.0f) {
                    m33Var.scheduleSelf(runnable, j);
                    return;
                }
                return;
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        byte b = this.a;
        m33 m33Var = this.b;
        switch (b) {
            case 0:
                if (m33Var.c < 1.0f) {
                    m33Var.unscheduleSelf(runnable);
                    return;
                }
                return;
            default:
                if (m33Var.c > 0.0f) {
                    m33Var.unscheduleSelf(runnable);
                    return;
                }
                return;
        }
    }
}

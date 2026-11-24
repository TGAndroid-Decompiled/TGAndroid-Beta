package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class yt4 extends cja {
    public final du4 m0;

    public yt4(du4 du4Var, Context context) {
        super(context, null);
        this.m0 = du4Var;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final void T(Drawable drawable) {
        if (drawable instanceof ye7) {
            ((ye7) drawable).o();
        }
        du4 du4Var = this.m0;
        du4Var.n1.a = du4Var.m1.c(drawable);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.M) {
            du4 du4Var = this.m0;
            gx4 gx4Var = du4Var.n1.a;
            if (gx4Var instanceof hx4) {
                ((hx4) gx4Var).b(getWidth(), getHeight());
            }
            du4Var.n1.e(0.0f, 0.0f, getWidth(), getHeight(), canvas);
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final Drawable getNewDrawable() {
        Drawable drawable = this.m0.x1;
        if (drawable != null) {
            return drawable;
        }
        return super.getNewDrawable();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.m0.D0();
    }
}

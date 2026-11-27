package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class cw4 extends wma {
    public final hw4 g0;

    public cw4(hw4 hw4Var, Context context) {
        super(context, null);
        this.g0 = hw4Var;
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
        if (drawable instanceof ih7) {
            ((ih7) drawable).o();
        }
        hw4 hw4Var = this.g0;
        hw4Var.n1.a = hw4Var.m1.c(drawable);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.M) {
            hw4 hw4Var = this.g0;
            mz4 mz4Var = hw4Var.n1.a;
            if (mz4Var instanceof nz4) {
                ((nz4) mz4Var).b(getWidth(), getHeight());
            }
            hw4Var.n1.e(0.0f, 0.0f, getWidth(), getHeight(), canvas);
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final Drawable getNewDrawable() {
        Drawable drawable = this.g0.x1;
        if (drawable != null) {
            return drawable;
        }
        return super.getNewDrawable();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.g0.E0();
    }
}

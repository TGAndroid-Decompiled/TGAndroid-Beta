package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.xu0;
public final class u0 extends xu0 {
    public final z0 f6776s0;

    public u0(z0 z0Var, Context context) {
        super(context, null);
        this.f6776s0 = z0Var;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final void U(Drawable drawable) {
        if (drawable instanceof jb0) {
            ((jb0) drawable).p();
        }
        z0 z0Var = this.f6776s0;
        z0Var.d.f18609a = z0Var.f6898c.c(drawable);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.H) {
            z0 z0Var = this.f6776s0;
            ng.a aVar = z0Var.d.f18609a;
            if (aVar instanceof ng.b) {
                ((ng.b) aVar).b(getWidth(), getHeight());
            }
            z0Var.d.T0(canvas, 0.0f, 0.0f, getWidth(), getHeight());
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final Drawable getNewDrawable() {
        Drawable drawable = this.f6776s0.f6906y;
        if (drawable != null) {
            return drawable;
        }
        return super.getNewDrawable();
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        this.f6776s0.o();
    }
}

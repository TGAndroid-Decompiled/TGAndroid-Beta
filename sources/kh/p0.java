package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.qv0;
public final class p0 extends qv0 {
    public final u0 f10745t0;

    public p0(u0 u0Var, Context context) {
        super(context, null);
        this.f10745t0 = u0Var;
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
        if (drawable instanceof dc0) {
            ((dc0) drawable).p();
        }
        u0 u0Var = this.f10745t0;
        u0Var.d.f44317a = u0Var.f10837c.c(drawable);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.I) {
            u0 u0Var = this.f10745t0;
            sg.a aVar = u0Var.d.f44317a;
            if (aVar instanceof sg.b) {
                ((sg.b) aVar).b(getWidth(), getHeight());
            }
            u0Var.d.X(canvas, 0.0f, 0.0f, getWidth(), getHeight());
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final Drawable getNewDrawable() {
        Drawable drawable = this.f10745t0.f10844y;
        if (drawable != null) {
            return drawable;
        }
        return super.getNewDrawable();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.f10745t0.o();
    }
}

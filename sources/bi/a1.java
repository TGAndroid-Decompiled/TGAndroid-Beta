package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.bb0;
public final class a1 extends au0 {
    public final g1 f3378g0;

    public a1(g1 g1Var, Context context) {
        super(context, null);
        this.f3378g0 = g1Var;
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
        if (drawable instanceof bb0) {
            ((bb0) drawable).p();
        }
        g1 g1Var = this.f3378g0;
        g1Var.f3622o1.f59012a = g1Var.n1.c(drawable);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.M) {
            g1 g1Var = this.f3378g0;
            ui.a aVar = g1Var.f3622o1.f59012a;
            if (aVar instanceof ui.b) {
                ((ui.b) aVar).b(getWidth(), getHeight());
            }
            g1Var.f3622o1.o(0.0f, 0.0f, getWidth(), getHeight(), canvas);
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final Drawable getNewDrawable() {
        Drawable drawable = this.f3378g0.f3632y1;
        if (drawable != null) {
            return drawable;
        }
        return super.getNewDrawable();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f3378g0.J0();
    }
}

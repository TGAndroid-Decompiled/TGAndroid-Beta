package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.st0;
public final class a1 extends st0 {
    public final f1 f3373g0;

    public a1(f1 f1Var, Context context) {
        super(context, null);
        this.f3373g0 = f1Var;
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
        if (drawable instanceof ra0) {
            ((ra0) drawable).p();
        }
        f1 f1Var = this.f3373g0;
        f1Var.f3500o1.f58445a = f1Var.n1.c(drawable);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.M) {
            f1 f1Var = this.f3373g0;
            ui.a aVar = f1Var.f3500o1.f58445a;
            if (aVar instanceof ui.b) {
                ((ui.b) aVar).b(getWidth(), getHeight());
            }
            f1Var.f3500o1.b0(0.0f, 0.0f, getWidth(), getHeight(), canvas);
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final Drawable getNewDrawable() {
        Drawable drawable = this.f3373g0.f3510y1;
        if (drawable != null) {
            return drawable;
        }
        return super.getNewDrawable();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f3373g0.I0();
    }
}

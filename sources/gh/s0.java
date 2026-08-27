package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.zu0;

public final class s0 extends zu0 {

    public final x0 f7520s0;

    public s0(x0 x0Var, Context context) {
        super(context, null);
        this.f7520s0 = x0Var;
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
        if (drawable instanceof nb0) {
            ((nb0) drawable).p();
        }
        x0 x0Var = this.f7520s0;
        x0Var.d.f19458a = x0Var.f7615c.c(drawable);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.H) {
            return super.drawChild(canvas, view, j10);
        }
        x0 x0Var = this.f7520s0;
        og.a aVar = x0Var.d.f19458a;
        if (aVar instanceof og.b) {
            ((og.b) aVar).b(getWidth(), getHeight());
        }
        x0Var.d.T0(canvas, 0.0f, 0.0f, getWidth(), getHeight());
        return false;
    }

    @Override
    public final Drawable getNewDrawable() {
        Drawable drawable = this.f7520s0.f7623y;
        return drawable != null ? drawable : super.getNewDrawable();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f7520s0.p();
    }
}

package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.za0;
public final class e1 extends cu0 {
    public final k1 f3479g0;

    public e1(k1 k1Var, Context context) {
        super(context, null);
        this.f3479g0 = k1Var;
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
        if (drawable instanceof za0) {
            ((za0) drawable).p();
        }
        k1 k1Var = this.f3479g0;
        k1Var.f3736o1.f59137a = k1Var.n1.c(drawable);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.M) {
            k1 k1Var = this.f3479g0;
            ui.a aVar = k1Var.f3736o1.f59137a;
            if (aVar instanceof ui.b) {
                ((ui.b) aVar).b(getWidth(), getHeight());
            }
            k1Var.f3736o1.z(0.0f, 0.0f, getWidth(), getHeight(), canvas);
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final Drawable getNewDrawable() {
        Drawable drawable = this.f3479g0.f3746y1;
        if (drawable != null) {
            return drawable;
        }
        return super.getNewDrawable();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f3479g0.J0();
    }
}

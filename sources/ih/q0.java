package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.yb0;
public final class q0 extends hv0 {
    public final v0 f9333s0;

    public q0(v0 v0Var, Context context) {
        super(context, null);
        this.f9333s0 = v0Var;
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
        if (drawable instanceof yb0) {
            ((yb0) drawable).p();
        }
        v0 v0Var = this.f9333s0;
        v0Var.d.f46676a = v0Var.f9425c.c(drawable);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.H) {
            v0 v0Var = this.f9333s0;
            qg.a aVar = v0Var.d.f46676a;
            if (aVar instanceof qg.b) {
                ((qg.b) aVar).b(getWidth(), getHeight());
            }
            v0Var.d.E0(canvas, 0.0f, 0.0f, getWidth(), getHeight());
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final Drawable getNewDrawable() {
        Drawable drawable = this.f9333s0.f9433y;
        if (drawable != null) {
            return drawable;
        }
        return super.getNewDrawable();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f9333s0.o();
    }
}

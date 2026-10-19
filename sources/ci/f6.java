package ci;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.qc;
public final class f6 extends FrameLayout {
    public final float f5388a;
    public final g6 f5389b;

    public f6(g6 g6Var, Context context, float f7) {
        super(context);
        this.f5389b = g6Var;
        this.f5388a = f7;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qc.a(this.f5389b.container, new ah.m0(this, 3));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this.f5389b.container);
    }
}

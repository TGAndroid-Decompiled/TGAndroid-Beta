package ci;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.qc;
public final class f6 extends FrameLayout {
    public final float f5391a;
    public final g6 f5392b;

    public f6(g6 g6Var, Context context, float f7) {
        super(context);
        this.f5392b = g6Var;
        this.f5391a = f7;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qc.a(this.f5392b.container, new ah.m0(this, 3));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this.f5392b.container);
    }
}

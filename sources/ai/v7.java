package ai;

import android.content.Context;
import android.widget.FrameLayout;
public final class v7 extends FrameLayout {
    public final float f1617a;
    public final x7 f1618b;

    public v7(x7 x7Var, Context context, float f7) {
        super(context);
        this.f1618b = x7Var;
        this.f1617a = f7;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.qc.a(this.f1618b.container, new w4(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.qc.h(this.f1618b.container);
    }
}

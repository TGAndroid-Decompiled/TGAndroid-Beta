package ai;

import android.content.Context;
import android.widget.FrameLayout;
public final class w7 extends FrameLayout {
    public final float f1861a;
    public final y7 f1862b;

    public w7(y7 y7Var, Context context, float f7) {
        super(context);
        this.f1862b = y7Var;
        this.f1861a = f7;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.sc.a(this.f1862b.container, new x4(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.sc.h(this.f1862b.container);
    }
}

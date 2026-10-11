package ai;

import android.content.Context;
import android.widget.FrameLayout;
public final class w7 extends FrameLayout {
    public final float f1863a;
    public final y7 f1864b;

    public w7(y7 y7Var, Context context, float f7) {
        super(context);
        this.f1864b = y7Var;
        this.f1863a = f7;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.sc.a(this.f1864b.container, new x4(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.sc.h(this.f1864b.container);
    }
}

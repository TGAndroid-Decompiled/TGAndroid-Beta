package ai;

import android.content.Context;
import android.widget.FrameLayout;
public final class u7 extends FrameLayout {
    public final float f1576a;
    public final w7 f1577b;

    public u7(w7 w7Var, Context context, float f7) {
        super(context);
        this.f1577b = w7Var;
        this.f1576a = f7;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.oc.a(this.f1577b.container, new w4(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.oc.h(this.f1577b.container);
    }
}

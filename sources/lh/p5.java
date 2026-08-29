package lh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.mc;
public final class p5 extends FrameLayout {
    public final float f16092a;
    public final q5 f16093b;

    public p5(q5 q5Var, Context context, float f9) {
        super(context);
        this.f16093b = q5Var;
        this.f16092a = f9;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mc.a(this.f16093b.container, new ih.u0(this, 4));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mc.h(this.f16093b.container);
    }
}

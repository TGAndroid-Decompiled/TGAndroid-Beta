package nh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ic;
public final class q5 extends FrameLayout {
    public final float f15803a;
    public final r5 f15804b;

    public q5(r5 r5Var, Context context, float f10) {
        super(context);
        this.f15804b = r5Var;
        this.f15803a = f10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ic.a(this.f15804b.container, new kh.t0(this, 4));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ic.h(this.f15804b.container);
    }
}

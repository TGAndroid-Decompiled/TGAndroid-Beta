package nh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ic;
public final class q5 extends FrameLayout {
    public final float f15783a;
    public final r5 f15784b;

    public q5(r5 r5Var, Context context, float f10) {
        super(context);
        this.f15784b = r5Var;
        this.f15783a = f10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ic.a(this.f15784b.container, new kh.t0(this, 4));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ic.h(this.f15784b.container);
    }
}

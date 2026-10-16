package bi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.sc;
public final class h7 extends FrameLayout {
    public final float f3129a;
    public final j7 f3130b;

    public h7(j7 j7Var, Context context, float f7) {
        super(context);
        this.f3130b = j7Var;
        this.f3129a = f7;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        sc.a(this.f3130b.container, new ah.m0(this, 3));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        sc.h(this.f3130b.container);
    }
}

package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.cc;
public final class v5 extends FrameLayout {
    public final float f9869a;
    public final w5 f9870b;

    public v5(w5 w5Var, Context context, float f10) {
        super(context);
        this.f9870b = w5Var;
        this.f9869a = f10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cc.a(this.f9870b.f28618c, new ch.v(this, 3));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cc.h(this.f9870b.f28618c);
    }
}

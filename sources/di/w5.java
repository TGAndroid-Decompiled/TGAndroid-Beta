package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.cc;
public final class w5 extends FrameLayout {
    public final float f9897a;
    public final x5 f9898b;

    public w5(x5 x5Var, Context context, float f10) {
        super(context);
        this.f9898b = x5Var;
        this.f9897a = f10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cc.a(this.f9898b.f28627c, new ch.v(this, 3));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cc.h(this.f9898b.f28627c);
    }
}

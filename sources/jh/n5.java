package jh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ec;

public final class n5 extends FrameLayout {

    public final float f13698a;

    public final o5 f13699b;

    public n5(o5 o5Var, Context context, float f10) {
        super(context);
        this.f13699b = o5Var;
        this.f13698a = f10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ec.a(this.f13699b.container, new gh.w0(this, 4));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ec.h(this.f13699b.container);
    }
}

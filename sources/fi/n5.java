package fi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.xb;
public final class n5 extends FrameLayout {
    public final float f12076a;
    public final o5 f12077b;

    public n5(o5 o5Var, Context context, float f10) {
        super(context);
        this.f12077b = o5Var;
        this.f12076a = f10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xb.a(this.f12077b.f29685c, new bi.e1(this, 4));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xb.h(this.f12077b.f29685c);
    }
}

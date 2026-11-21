package fi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.gc;
public final class m5 extends FrameLayout {
    public final float f12308a;
    public final n5 f12309b;

    public m5(n5 n5Var, Context context, float f10) {
        super(context);
        this.f12309b = n5Var;
        this.f12308a = f10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gc.a(this.f12309b.f30176c, new bi.i1(this, 4));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gc.h(this.f12309b.f30176c);
    }
}

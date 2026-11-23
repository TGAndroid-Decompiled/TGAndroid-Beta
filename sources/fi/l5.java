package fi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.gc;
public final class l5 extends FrameLayout {
    public final float f12213a;
    public final m5 f12214b;

    public l5(m5 m5Var, Context context, float f10) {
        super(context);
        this.f12214b = m5Var;
        this.f12213a = f10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gc.a(this.f12214b.f30145c, new bi.i1(this, 4));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gc.h(this.f12214b.f30145c);
    }
}

package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.qc;
public final class e6 extends FrameLayout {
    public final float f8522a;
    public final f6 f8523b;

    public e6(f6 f6Var, Context context, float f7) {
        super(context);
        this.f8523b = f6Var;
        this.f8522a = f7;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qc.a(this.f8523b.container, new bh.c0(this, 3));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this.f8523b.container);
    }
}

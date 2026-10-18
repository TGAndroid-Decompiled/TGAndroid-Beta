package ci;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.qc;
public final class e6 extends FrameLayout {
    public final float f5289a;
    public final f6 f5290b;

    public e6(f6 f6Var, Context context, float f7) {
        super(context);
        this.f5290b = f6Var;
        this.f5289a = f7;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qc.a(this.f5290b.container, new ah.m0(this, 3));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this.f5290b.container);
    }
}

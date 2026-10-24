package ci;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.oc;
public final class e6 extends FrameLayout {
    public final float f5291a;
    public final f6 f5292b;

    public e6(f6 f6Var, Context context, float f7) {
        super(context);
        this.f5292b = f6Var;
        this.f5291a = f7;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        oc.a(this.f5292b.container, new ah.m0(this, 3));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oc.h(this.f5292b.container);
    }
}

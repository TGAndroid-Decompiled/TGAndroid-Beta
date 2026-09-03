package oh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ic;
public final class q5 extends FrameLayout {
    public final float f17660a;
    public final r5 f17661b;

    public q5(r5 r5Var, Context context, float f10) {
        super(context);
        this.f17661b = r5Var;
        this.f17660a = f10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ic.a(this.f17661b.container, new lh.t0(this, 4));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ic.h(this.f17661b.container);
    }
}

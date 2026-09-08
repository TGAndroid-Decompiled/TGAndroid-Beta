package bi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.qc;
public final class d7 extends FrameLayout {
    public final float f2893a;
    public final f7 f2894b;

    public d7(f7 f7Var, Context context, float f7) {
        super(context);
        this.f2894b = f7Var;
        this.f2893a = f7;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qc.a(this.f2894b.container, new ah.n0(this, 3));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this.f2894b.container);
    }
}

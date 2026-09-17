package bi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.qc;
public final class d7 extends FrameLayout {
    public final float f2866a;
    public final f7 f2867b;

    public d7(f7 f7Var, Context context, float f7) {
        super(context);
        this.f2867b = f7Var;
        this.f2866a = f7;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qc.a(this.f2867b.container, new ah.n0(this, 3));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this.f2867b.container);
    }
}

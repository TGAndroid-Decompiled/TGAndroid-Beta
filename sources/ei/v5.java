package ei;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ac;
public final class v5 extends FrameLayout {
    public final float f11125a;
    public final w5 f11126b;

    public v5(w5 w5Var, Context context, float f10) {
        super(context);
        this.f11126b = w5Var;
        this.f11125a = f10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ac.a(this.f11126b.f28589c, new ai.h1(this, 4));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ac.h(this.f11126b.f28589c);
    }
}

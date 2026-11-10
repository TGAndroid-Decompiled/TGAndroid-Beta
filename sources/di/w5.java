package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.bc;
public final class w5 extends FrameLayout {
    public final float f9902a;
    public final x5 f9903b;

    public w5(x5 x5Var, Context context, float f10) {
        super(context);
        this.f9903b = x5Var;
        this.f9902a = f10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bc.a(this.f9903b.f28675c, new ch.v(this, 3));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bc.h(this.f9903b.f28675c);
    }
}

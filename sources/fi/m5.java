package fi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.gc;
public final class m5 extends FrameLayout {
    public final float f12311a;
    public final n5 f12312b;

    public m5(n5 n5Var, Context context, float f10) {
        super(context);
        this.f12312b = n5Var;
        this.f12311a = f10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gc.a(this.f12312b.f30179c, new bi.i1(this, 4));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gc.h(this.f12312b.f30179c);
    }
}

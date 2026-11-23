package fi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.fc;
public final class m5 extends FrameLayout {
    public final float f12273a;
    public final n5 f12274b;

    public m5(n5 n5Var, Context context, float f10) {
        super(context);
        this.f12274b = n5Var;
        this.f12273a = f10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fc.a(this.f12274b.f30229c, new bi.i1(this, 4));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fc.h(this.f12274b.f30229c);
    }
}

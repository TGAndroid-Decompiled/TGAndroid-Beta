package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
public final class dya extends FrameLayout {
    public final float a;
    public final eya b;

    public dya(eya eyaVar, Context context, float f) {
        super(context);
        this.b = eyaVar;
        this.a = f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m21.a(this.b.c, new s10(this, (byte) 18));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m21.h(this.b.c);
    }
}

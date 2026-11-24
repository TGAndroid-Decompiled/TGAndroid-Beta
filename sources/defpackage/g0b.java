package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
public final class g0b extends FrameLayout {
    public final float a;
    public final h0b b;

    public g0b(h0b h0bVar, Context context, float f) {
        super(context);
        this.b = h0bVar;
        this.a = f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u31.a(this.b.c, new s20(this, (byte) 18));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u31.h(this.b.c);
    }
}

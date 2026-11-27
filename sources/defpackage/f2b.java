package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
public final class f2b extends FrameLayout {
    public final float a;
    public final g2b b;

    public f2b(g2b g2bVar, Context context, float f) {
        super(context);
        this.b = g2bVar;
        this.a = f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v21.a(this.b.c, new t10(this, (byte) 19));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v21.h(this.b.c);
    }
}

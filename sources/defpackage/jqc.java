package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class jqc extends FrameLayout {
    public View a;
    public float b;
    public int c;
    public final es1 d;
    public final uqc e;

    public jqc(uqc uqcVar, Context context) {
        super(context);
        this.e = uqcVar;
        this.d = new es1(this, (byte) 8);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.d);
    }

    @Override
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnPreDrawListener(this.d);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.e.X0();
    }
}

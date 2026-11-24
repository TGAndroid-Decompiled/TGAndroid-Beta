package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class vnc extends FrameLayout {
    public View a;
    public float b;
    public int c;
    public final cc d;
    public final goc e;

    public vnc(goc gocVar, Context context) {
        super(context);
        this.e = gocVar;
        this.d = new cc(this, (byte) 10);
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
        this.e.Y0();
    }
}

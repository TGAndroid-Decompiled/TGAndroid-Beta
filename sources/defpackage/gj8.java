package defpackage;

import android.content.Context;
import android.widget.Scroller;
public final class gj8 extends Scroller {
    public final hj8 a;

    public gj8(hj8 hj8Var, Context context) {
        super(context);
        this.a = hj8Var;
    }

    @Override
    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        int i6;
        if (this.a.y0) {
            i6 = 3;
        } else {
            i6 = 1;
        }
        super.startScroll(i, i2, i3, i4, i5 * i6);
    }
}

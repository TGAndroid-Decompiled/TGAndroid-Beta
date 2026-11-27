package defpackage;

import android.content.Context;
import android.widget.Scroller;
public final class sk8 extends Scroller {
    public final tk8 a;

    public sk8(tk8 tk8Var, Context context) {
        super(context);
        this.a = tk8Var;
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

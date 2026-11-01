package kg;

import android.content.Context;
import android.widget.Scroller;
public final class c1 extends Scroller {
    public final d1 f11018a;

    public c1(d1 d1Var, Context context) {
        super(context);
        this.f11018a = d1Var;
    }

    @Override
    public final void startScroll(int i10, int i11, int i12, int i13, int i14) {
        int i15;
        if (this.f11018a.f11031x0) {
            i15 = 3;
        } else {
            i15 = 1;
        }
        super.startScroll(i10, i11, i12, i13, i15 * i14);
    }
}

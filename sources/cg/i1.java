package cg;

import android.content.Context;
import android.widget.Scroller;
public final class i1 extends Scroller {
    public final j1 f3159a;

    public i1(j1 j1Var, Context context) {
        super(context);
        this.f3159a = j1Var;
    }

    @Override
    public final void startScroll(int i10, int i11, int i12, int i13, int i14) {
        int i15;
        if (this.f3159a.f3166t0) {
            i15 = 3;
        } else {
            i15 = 1;
        }
        super.startScroll(i10, i11, i12, i13, i15 * i14);
    }
}

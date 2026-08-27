package ag;

import android.content.Context;
import android.widget.Scroller;

public final class z1 extends Scroller {

    public final a2 f737a;

    public z1(a2 a2Var, Context context) {
        super(context);
        this.f737a = a2Var;
    }

    @Override
    public final void startScroll(int i10, int i11, int i12, int i13, int i14) {
        super.startScroll(i10, i11, i12, i13, (this.f737a.f287t0 ? 3 : 1) * i14);
    }
}

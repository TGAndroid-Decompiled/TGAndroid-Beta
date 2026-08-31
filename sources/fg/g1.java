package fg;

import android.content.Context;
import android.widget.Scroller;
public final class g1 extends Scroller {
    public final h1 f6318a;

    public g1(h1 h1Var, Context context) {
        super(context);
        this.f6318a = h1Var;
    }

    @Override
    public final void startScroll(int i10, int i11, int i12, int i13, int i14) {
        int i15;
        if (this.f6318a.f6324u0) {
            i15 = 3;
        } else {
            i15 = 1;
        }
        super.startScroll(i10, i11, i12, i13, i15 * i14);
    }
}

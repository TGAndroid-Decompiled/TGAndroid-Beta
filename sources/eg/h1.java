package eg;

import android.content.Context;
import android.widget.Scroller;
public final class h1 extends Scroller {
    public final i1 f5298a;

    public h1(i1 i1Var, Context context) {
        super(context);
        this.f5298a = i1Var;
    }

    @Override
    public final void startScroll(int i10, int i11, int i12, int i13, int i14) {
        int i15;
        if (this.f5298a.f5304u0) {
            i15 = 3;
        } else {
            i15 = 1;
        }
        super.startScroll(i10, i11, i12, i13, i15 * i14);
    }
}

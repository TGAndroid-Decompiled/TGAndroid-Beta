package m4;

import android.view.View;
public final class o0 implements e2.h {
    public final int f14640a;
    public final boolean f14641b;

    public o0(int i10, boolean z10) {
        this.f14640a = i10;
        this.f14641b = z10;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f14640a) {
            case 0:
                ((k1) obj).X(this.f14641b);
                return;
            case 1:
                ((k1) obj).o0(this.f14641b);
                return;
            case 2:
                ((k1) obj).x(this.f14641b);
                return;
            default:
                View view = (View) obj;
                if (view instanceof xg.l) {
                    ((xg.l) view).g(this.f14641b, true);
                    return;
                }
                return;
        }
    }
}

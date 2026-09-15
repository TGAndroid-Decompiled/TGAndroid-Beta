package m4;

import android.view.View;
public final class o0 implements e2.h {
    public final int f14630a;
    public final boolean f14631b;

    public o0(int i10, boolean z10) {
        this.f14630a = i10;
        this.f14631b = z10;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f14630a) {
            case 0:
                ((k1) obj).X(this.f14631b);
                return;
            case 1:
                ((k1) obj).o0(this.f14631b);
                return;
            case 2:
                ((k1) obj).x(this.f14631b);
                return;
            default:
                View view = (View) obj;
                if (view instanceof xg.l) {
                    ((xg.l) view).g(this.f14631b, true);
                    return;
                }
                return;
        }
    }
}

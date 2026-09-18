package m4;

import android.view.View;
public final class n0 implements e2.h {
    public final int f14807a;
    public final boolean f14808b;

    public n0(int i10, boolean z10) {
        this.f14807a = i10;
        this.f14808b = z10;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f14807a) {
            case 0:
                ((j1) obj).X(this.f14808b);
                return;
            case 1:
                ((j1) obj).o0(this.f14808b);
                return;
            case 2:
                ((j1) obj).x(this.f14808b);
                return;
            default:
                View view = (View) obj;
                if (view instanceof xg.l) {
                    ((xg.l) view).g(this.f14808b, true);
                    return;
                }
                return;
        }
    }
}

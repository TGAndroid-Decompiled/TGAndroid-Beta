package m4;

import android.view.View;
public final class o0 implements e2.h {
    public final int f13463a;
    public final boolean f13464b;

    public o0(int i10, boolean z10) {
        this.f13463a = i10;
        this.f13464b = z10;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f13463a) {
            case 0:
                ((l1) obj).X(this.f13464b);
                return;
            case 1:
                ((l1) obj).o0(this.f13464b);
                return;
            case 2:
                ((l1) obj).x(this.f13464b);
                return;
            default:
                View view = (View) obj;
                if (view instanceof wg.k) {
                    ((wg.k) view).g(this.f13464b, true);
                    return;
                }
                return;
        }
    }
}

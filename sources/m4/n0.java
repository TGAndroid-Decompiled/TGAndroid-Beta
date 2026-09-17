package m4;

import android.view.View;
public final class n0 implements e2.h {
    public final int f16036a;
    public final boolean f16037b;

    public n0(int i10, boolean z10) {
        this.f16036a = i10;
        this.f16037b = z10;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f16036a) {
            case 0:
                ((j1) obj).X(this.f16037b);
                return;
            case 1:
                ((j1) obj).o0(this.f16037b);
                return;
            case 2:
                ((j1) obj).x(this.f16037b);
                return;
            default:
                View view = (View) obj;
                if (view instanceof yg.l) {
                    ((yg.l) view).g(this.f16037b, true);
                    return;
                }
                return;
        }
    }
}

package m4;

import android.view.View;
public final class s0 implements e2.h {
    public final int f13511a;
    public final int f13512b;

    public s0(int i10, int i11) {
        this.f13511a = i11;
        this.f13512b = i10;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f13511a) {
            case 0:
                ((l1) obj).f0(this.f13512b);
                return;
            case 1:
                ((l1) obj).N(this.f13512b);
                return;
            case 2:
                ((l1) obj).j(this.f13512b);
                return;
            case 3:
                ((l1) obj).D0(this.f13512b);
                return;
            default:
                zh.k kVar = (zh.k) ((View) obj);
                kVar.invalidate();
                kVar.f48574y.setTextColor(this.f13512b);
                return;
        }
    }
}

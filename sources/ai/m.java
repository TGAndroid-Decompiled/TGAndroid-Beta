package ai;

import android.view.View;
public final class m implements e2.h {
    public final int f1217a;
    public final int f1218b;

    public m(int i10, int i11) {
        this.f1217a = i11;
        this.f1218b = i10;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f1217a) {
            case 0:
                a0 a0Var = (a0) ((View) obj);
                a0Var.invalidate();
                a0Var.f501y.setTextColor(this.f1218b);
                return;
            case 1:
                ((m4.k1) obj).f0(this.f1218b);
                return;
            case 2:
                ((m4.k1) obj).N(this.f1218b);
                return;
            case 3:
                ((m4.k1) obj).j(this.f1218b);
                return;
            default:
                ((m4.k1) obj).D0(this.f1218b);
                return;
        }
    }
}

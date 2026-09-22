package ai;

import android.view.View;
public final class m implements e2.h {
    public final int f1219a;
    public final int f1220b;

    public m(int i10, int i11) {
        this.f1219a = i11;
        this.f1220b = i10;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f1219a) {
            case 0:
                a0 a0Var = (a0) ((View) obj);
                a0Var.invalidate();
                a0Var.f503y.setTextColor(this.f1220b);
                return;
            case 1:
                ((m4.j1) obj).f0(this.f1220b);
                return;
            case 2:
                ((m4.j1) obj).N(this.f1220b);
                return;
            case 3:
                ((m4.j1) obj).j(this.f1220b);
                return;
            default:
                ((m4.j1) obj).D0(this.f1220b);
                return;
        }
    }
}

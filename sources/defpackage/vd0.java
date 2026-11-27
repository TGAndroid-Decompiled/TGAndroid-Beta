package defpackage;

import android.view.ViewGroup;
public final class vd0 extends ksd {
    public final ViewGroup a;
    public final yd0 b;

    public vd0(yd0 yd0Var, ViewGroup viewGroup) {
        this.b = yd0Var;
        this.a = viewGroup;
    }

    @Override
    public final void a() {
        this.a.invalidate();
    }
}

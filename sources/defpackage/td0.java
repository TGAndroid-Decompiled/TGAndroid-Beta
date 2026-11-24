package defpackage;

import android.view.ViewGroup;
public final class td0 extends tnd {
    public final ViewGroup a;
    public final wd0 b;

    public td0(wd0 wd0Var, ViewGroup viewGroup) {
        this.b = wd0Var;
        this.a = viewGroup;
    }

    @Override
    public final void a() {
        this.a.invalidate();
    }
}

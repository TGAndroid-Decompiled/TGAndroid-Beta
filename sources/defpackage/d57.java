package defpackage;

import android.content.Context;
public final class d57 extends rc2 {
    public final js Ld;

    public d57(js jsVar, Context context, int i, mx6 mx6Var, ylb ylbVar) {
        super(context, i, false, mx6Var, ylbVar);
        this.Ld = jsVar;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        ((f57) this.Ld.d).f.invalidate();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = f57.e0;
        ((f57) this.Ld.d).h(this);
    }

    @Override
    public final void z3(k47 k47Var, f47 f47Var, boolean z, boolean z2, boolean z3, boolean z4) {
        super.z3(k47Var, f47Var, z, z2, z3, z4);
        int i = f57.e0;
        ((f57) this.Ld.d).h(this);
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        super.invalidate(i, i2, i3, i4);
        ((f57) this.Ld.d).f.invalidate();
    }
}

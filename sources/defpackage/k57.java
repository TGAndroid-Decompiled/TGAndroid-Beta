package defpackage;

import android.content.Context;
public final class k57 extends wb2 {
    public final kr Ld;

    public k57(kr krVar, Context context, int i, rx6 rx6Var, vnb vnbVar) {
        super(context, i, false, rx6Var, vnbVar);
        this.Ld = krVar;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        ((m57) this.Ld.d).f.invalidate();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = m57.e0;
        ((m57) this.Ld.d).h(this);
    }

    @Override
    public final void z3(r47 r47Var, m47 m47Var, boolean z, boolean z2, boolean z3, boolean z4) {
        super.z3(r47Var, m47Var, z, z2, z3, z4);
        int i = m57.e0;
        ((m57) this.Ld.d).h(this);
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        super.invalidate(i, i2, i3, i4);
        ((m57) this.Ld.d).f.invalidate();
    }
}

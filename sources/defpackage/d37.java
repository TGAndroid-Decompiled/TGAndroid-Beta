package defpackage;

import android.content.Context;
public final class d37 extends gb2 {
    public final jr Ld;

    public d37(jr jrVar, Context context, int i, mv6 mv6Var, wjb wjbVar) {
        super(context, i, false, mv6Var, wjbVar);
        this.Ld = jrVar;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        ((f37) this.Ld.d).f.invalidate();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = f37.e0;
        ((f37) this.Ld.d).h(this);
    }

    @Override
    public final void z3(k27 k27Var, f27 f27Var, boolean z, boolean z2, boolean z3, boolean z4) {
        super.z3(k27Var, f27Var, z, z2, z3, z4);
        int i = f37.e0;
        ((f37) this.Ld.d).h(this);
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        super.invalidate(i, i2, i3, i4);
        ((f37) this.Ld.d).f.invalidate();
    }
}

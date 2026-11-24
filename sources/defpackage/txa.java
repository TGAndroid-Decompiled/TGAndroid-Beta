package defpackage;

import android.content.Context;
public final class txa extends bya {
    public final boolean n0;
    public final int o0;
    public final eya p0;

    public txa(eya eyaVar, Context context, ylb ylbVar, boolean z, int i) {
        super(context, ylbVar);
        this.p0 = eyaVar;
        this.n0 = z;
        this.o0 = i;
    }

    @Override
    public final void e(int i) {
        long j = i;
        eya eyaVar = this.p0;
        eyaVar.I0(j);
        b61 b61Var = eyaVar.w1;
        if (b61Var != null) {
            b61Var.i(nxa.Z0(false, jb6.a0(null, null, 2131744736, jb6.E(j, ',')), eyaVar.M1), true, true);
        }
        if (this.n0) {
            i96 i96Var = eyaVar.A1;
            i96Var.g = j;
            eyaVar.B1.set(i96Var);
            int i2 = this.o0;
            f(bg5.b(i2, i, 3), bg5.b(i2, i, 4), true);
        }
    }

    @Override
    public final void setValue(int i) {
        super.setValue(i);
        if (this.n0) {
            int i2 = this.o0;
            f(bg5.b(i2, i, 3), bg5.b(i2, i, 4), true);
        }
    }
}

package defpackage;

import android.content.Context;
public final class tza extends b0b {
    public final boolean n0;
    public final int o0;
    public final e0b p0;

    public tza(e0b e0bVar, Context context, vnb vnbVar, boolean z, int i) {
        super(context, vnbVar);
        this.p0 = e0bVar;
        this.n0 = z;
        this.o0 = i;
    }

    @Override
    public final void e(int i) {
        long j = i;
        e0b e0bVar = this.p0;
        e0bVar.J0(j);
        c51 c51Var = e0bVar.w1;
        if (c51Var != null) {
            c51Var.i(nza.Z0(false, ob6.a0(null, null, 2131744704, ob6.E(j, ',')), e0bVar.M1), true, true);
        }
        if (this.n0) {
            m96 m96Var = e0bVar.A1;
            m96Var.g = j;
            e0bVar.B1.set(m96Var);
            int i2 = this.o0;
            f(eg5.b(i2, i, 3), eg5.b(i2, i, 4), true);
        }
    }

    @Override
    public final void setValue(int i) {
        super.setValue(i);
        if (this.n0) {
            int i2 = this.o0;
            f(eg5.b(i2, i, 3), eg5.b(i2, i, 4), true);
        }
    }
}

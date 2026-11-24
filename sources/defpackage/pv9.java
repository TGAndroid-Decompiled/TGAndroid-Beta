package defpackage;

import java.util.ArrayList;
public final class pv9 extends ov9 {
    public final ArrayList j;

    public pv9(az8 az8Var, long j, long j2, long j3, long j4, ArrayList arrayList, long j5, ArrayList arrayList2, long j6, long j7) {
        super(az8Var, j, j2, j3, j4, arrayList, j5, j6, j7);
        this.j = arrayList2;
    }

    @Override
    public final tv9 a() {
        return new pv9(this.a, this.b, 0L, this.d, this.e, this.f, this.i, this.j, this.g, this.h);
    }

    @Override
    public final long e(long j) {
        return this.j.size();
    }

    @Override
    public final az8 i(g89 g89Var, long j) {
        return (az8) this.j.get((int) (j - this.d));
    }

    @Override
    public final boolean j() {
        return true;
    }
}

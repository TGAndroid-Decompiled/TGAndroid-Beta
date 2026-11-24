package defpackage;

import java.util.ArrayList;
public final class sx9 extends rx9 {
    public final ArrayList j;

    public sx9(b19 b19Var, long j, long j2, long j3, long j4, ArrayList arrayList, long j5, ArrayList arrayList2, long j6, long j7) {
        super(b19Var, j, j2, j3, j4, arrayList, j5, j6, j7);
        this.j = arrayList2;
    }

    @Override
    public final wx9 a() {
        return new sx9(this.a, this.b, 0L, this.d, this.e, this.f, this.i, this.j, this.g, this.h);
    }

    @Override
    public final long e(long j) {
        return this.j.size();
    }

    @Override
    public final b19 i(ia9 ia9Var, long j) {
        return (b19) this.j.get((int) (j - this.d));
    }

    @Override
    public final boolean j() {
        return true;
    }
}

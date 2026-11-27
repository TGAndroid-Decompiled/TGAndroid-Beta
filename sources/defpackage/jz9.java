package defpackage;

import java.util.ArrayList;
public final class jz9 extends iz9 {
    public final ArrayList j;

    public jz9(n29 n29Var, long j, long j2, long j3, long j4, ArrayList arrayList, long j5, ArrayList arrayList2, long j6, long j7) {
        super(n29Var, j, j2, j3, j4, arrayList, j5, j6, j7);
        this.j = arrayList2;
    }

    @Override
    public final nz9 a() {
        return new jz9(this.a, this.b, 0L, this.d, this.e, this.f, this.i, this.j, this.g, this.h);
    }

    @Override
    public final long e(long j) {
        return this.j.size();
    }

    @Override
    public final n29 i(sb9 sb9Var, long j) {
        return (n29) this.j.get((int) (j - this.d));
    }

    @Override
    public final boolean j() {
        return true;
    }
}

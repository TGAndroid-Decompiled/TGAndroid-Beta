package bd;

import java.util.RandomAccess;
import v7.f0;
public final class d extends e implements RandomAccess {
    public final e f2651a;
    public final int f2652b;
    public final int f2653c;

    public d(e eVar, int i10, int i11) {
        this.f2651a = eVar;
        this.f2652b = i10;
        f0.a(i10, i11, eVar.l());
        this.f2653c = i11 - i10;
    }

    @Override
    public final Object get(int i10) {
        int i11 = this.f2653c;
        if (i10 >= 0 && i10 < i11) {
            return this.f2651a.get(this.f2652b + i10);
        }
        throw new IndexOutOfBoundsException(a1.g.j(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int l() {
        return this.f2653c;
    }
}

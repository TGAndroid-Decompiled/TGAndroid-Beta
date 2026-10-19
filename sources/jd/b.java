package jd;

import java.util.RandomAccess;
import v7.s8;
public final class b extends c implements RandomAccess {
    public final c f14383a;
    public final int f14384b;
    public final int f14385c;

    public b(c cVar, int i10, int i11) {
        this.f14383a = cVar;
        this.f14384b = i10;
        s8.a(i10, i11, cVar.h());
        this.f14385c = i11 - i10;
    }

    @Override
    public final Object get(int i10) {
        int i11 = this.f14385c;
        if (i10 >= 0 && i10 < i11) {
            return this.f14383a.get(this.f14384b + i10);
        }
        throw new IndexOutOfBoundsException(a1.g.l(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int h() {
        return this.f14385c;
    }
}

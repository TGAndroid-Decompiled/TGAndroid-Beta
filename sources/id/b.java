package id;

import java.util.RandomAccess;
import v7.l8;
public final class b extends c implements RandomAccess {
    public final c f12104a;
    public final int f12105b;
    public final int f12106c;

    public b(c cVar, int i10, int i11) {
        this.f12104a = cVar;
        this.f12105b = i10;
        l8.a(i10, i11, cVar.i());
        this.f12106c = i11 - i10;
    }

    @Override
    public final Object get(int i10) {
        int i11 = this.f12106c;
        if (i10 >= 0 && i10 < i11) {
            return this.f12104a.get(this.f12105b + i10);
        }
        throw new IndexOutOfBoundsException(a1.g.m(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int i() {
        return this.f12106c;
    }
}

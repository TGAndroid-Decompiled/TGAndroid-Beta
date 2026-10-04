package hd;

import java.util.RandomAccess;
import v7.b8;
public final class b extends c implements RandomAccess {
    public final c f11077a;
    public final int f11078b;
    public final int f11079c;

    public b(c cVar, int i10, int i11) {
        this.f11077a = cVar;
        this.f11078b = i10;
        b8.a(i10, i11, cVar.i());
        this.f11079c = i11 - i10;
    }

    @Override
    public final Object get(int i10) {
        int i11 = this.f11079c;
        if (i10 >= 0 && i10 < i11) {
            return this.f11077a.get(this.f11078b + i10);
        }
        throw new IndexOutOfBoundsException(a4.a.m(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int i() {
        return this.f11079c;
    }
}

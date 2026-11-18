package hd;

import a8.p0;
import c8.d0;
import java.util.RandomAccess;
public final class b extends c implements RandomAccess {
    public final c f14141a;
    public final int f14142b;
    public final int f14143c;

    public b(c cVar, int i7, int i10) {
        this.f14141a = cVar;
        this.f14142b = i7;
        d0.a(i7, i10, cVar.f());
        this.f14143c = i10 - i7;
    }

    @Override
    public final int f() {
        return this.f14143c;
    }

    @Override
    public final Object get(int i7) {
        int i10 = this.f14143c;
        if (i7 >= 0 && i7 < i10) {
            return this.f14141a.get(this.f14142b + i7);
        }
        throw new IndexOutOfBoundsException(p0.m(i7, i10, "index: ", ", size: "));
    }
}

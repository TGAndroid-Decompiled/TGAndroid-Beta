package hd;

import a8.p0;
import c8.d0;
import java.util.RandomAccess;
public final class b extends c implements RandomAccess {
    public final c f14167a;
    public final int f14168b;
    public final int f14169c;

    public b(c cVar, int i7, int i10) {
        this.f14167a = cVar;
        this.f14168b = i7;
        d0.a(i7, i10, cVar.f());
        this.f14169c = i10 - i7;
    }

    @Override
    public final int f() {
        return this.f14169c;
    }

    @Override
    public final Object get(int i7) {
        int i10 = this.f14169c;
        if (i7 >= 0 && i7 < i10) {
            return this.f14167a.get(this.f14168b + i7);
        }
        throw new IndexOutOfBoundsException(p0.m(i7, i10, "index: ", ", size: "));
    }
}

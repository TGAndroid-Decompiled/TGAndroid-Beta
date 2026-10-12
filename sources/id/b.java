package id;

import java.util.RandomAccess;
import v7.l8;
public final class b extends c implements RandomAccess {
    public final c f12103a;
    public final int f12104b;
    public final int f12105c;

    public b(c cVar, int i10, int i11) {
        this.f12103a = cVar;
        this.f12104b = i10;
        l8.a(i10, i11, cVar.i());
        this.f12105c = i11 - i10;
    }

    @Override
    public final Object get(int i10) {
        int i11 = this.f12105c;
        if (i10 >= 0 && i10 < i11) {
            return this.f12103a.get(this.f12104b + i10);
        }
        throw new IndexOutOfBoundsException(a1.g.m(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int i() {
        return this.f12105c;
    }
}

package hd;

import java.util.RandomAccess;
import v7.c8;
public final class b extends c implements RandomAccess {
    public final c f10167a;
    public final int f10168b;
    public final int f10169c;

    public b(c cVar, int i10, int i11) {
        this.f10167a = cVar;
        this.f10168b = i10;
        c8.a(i10, i11, cVar.i());
        this.f10169c = i11 - i10;
    }

    @Override
    public final Object get(int i10) {
        int i11 = this.f10169c;
        if (i10 >= 0 && i10 < i11) {
            return this.f10167a.get(this.f10168b + i10);
        }
        throw new IndexOutOfBoundsException(a4.a.m(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int i() {
        return this.f10169c;
    }
}

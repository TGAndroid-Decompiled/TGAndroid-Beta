package hd;

import java.util.RandomAccess;
import v7.b8;
public final class b extends c implements RandomAccess {
    public final c f10168a;
    public final int f10169b;
    public final int f10170c;

    public b(c cVar, int i10, int i11) {
        this.f10168a = cVar;
        this.f10169b = i10;
        b8.a(i10, i11, cVar.i());
        this.f10170c = i11 - i10;
    }

    @Override
    public final Object get(int i10) {
        int i11 = this.f10170c;
        if (i10 >= 0 && i10 < i11) {
            return this.f10168a.get(this.f10169b + i10);
        }
        throw new IndexOutOfBoundsException(a4.a.m(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int i() {
        return this.f10170c;
    }
}

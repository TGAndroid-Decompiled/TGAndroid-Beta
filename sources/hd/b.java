package hd;

import java.util.RandomAccess;
import v7.b8;
public final class b extends c implements RandomAccess {
    public final c f10182a;
    public final int f10183b;
    public final int f10184c;

    public b(c cVar, int i10, int i11) {
        this.f10182a = cVar;
        this.f10183b = i10;
        b8.a(i10, i11, cVar.i());
        this.f10184c = i11 - i10;
    }

    @Override
    public final Object get(int i10) {
        int i11 = this.f10184c;
        if (i10 >= 0 && i10 < i11) {
            return this.f10182a.get(this.f10183b + i10);
        }
        throw new IndexOutOfBoundsException(a4.a.m(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int i() {
        return this.f10184c;
    }
}

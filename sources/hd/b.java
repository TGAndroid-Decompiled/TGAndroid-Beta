package hd;

import java.util.RandomAccess;
import v7.b8;
public final class b extends c implements RandomAccess {
    public final c f9299a;
    public final int f9300b;
    public final int f9301c;

    public b(c cVar, int i10, int i11) {
        this.f9299a = cVar;
        this.f9300b = i10;
        b8.a(i10, i11, cVar.i());
        this.f9301c = i11 - i10;
    }

    @Override
    public final Object get(int i10) {
        int i11 = this.f9301c;
        if (i10 >= 0 && i10 < i11) {
            return this.f9299a.get(this.f9300b + i10);
        }
        throw new IndexOutOfBoundsException(a4.a.l(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int i() {
        return this.f9301c;
    }
}

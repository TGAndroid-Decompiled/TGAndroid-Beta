package hd;

import java.util.RandomAccess;
import v7.b8;
public final class b extends c implements RandomAccess {
    public final c f11076a;
    public final int f11077b;
    public final int f11078c;

    public b(c cVar, int i10, int i11) {
        this.f11076a = cVar;
        this.f11077b = i10;
        b8.a(i10, i11, cVar.i());
        this.f11078c = i11 - i10;
    }

    @Override
    public final Object get(int i10) {
        int i11 = this.f11078c;
        if (i10 >= 0 && i10 < i11) {
            return this.f11076a.get(this.f11077b + i10);
        }
        throw new IndexOutOfBoundsException(a4.a.l(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int i() {
        return this.f11078c;
    }
}

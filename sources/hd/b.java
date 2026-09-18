package hd;

import java.util.RandomAccess;
import v7.b8;
public final class b extends c implements RandomAccess {
    public final c f10185a;
    public final int f10186b;
    public final int f10187c;

    public b(c cVar, int i10, int i11) {
        this.f10185a = cVar;
        this.f10186b = i10;
        b8.a(i10, i11, cVar.i());
        this.f10187c = i11 - i10;
    }

    @Override
    public final Object get(int i10) {
        int i11 = this.f10187c;
        if (i10 >= 0 && i10 < i11) {
            return this.f10185a.get(this.f10186b + i10);
        }
        throw new IndexOutOfBoundsException(a4.a.l(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int i() {
        return this.f10187c;
    }
}

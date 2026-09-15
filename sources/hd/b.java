package hd;

import java.util.RandomAccess;
import v7.b8;
public final class b extends c implements RandomAccess {
    public final c f10181a;
    public final int f10182b;
    public final int f10183c;

    public b(c cVar, int i10, int i11) {
        this.f10181a = cVar;
        this.f10182b = i10;
        b8.a(i10, i11, cVar.i());
        this.f10183c = i11 - i10;
    }

    @Override
    public final Object get(int i10) {
        int i11 = this.f10183c;
        if (i10 >= 0 && i10 < i11) {
            return this.f10181a.get(this.f10182b + i10);
        }
        throw new IndexOutOfBoundsException(a4.a.l(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int i() {
        return this.f10183c;
    }
}

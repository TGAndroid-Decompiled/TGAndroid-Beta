package hd;

import java.util.RandomAccess;
import v7.a8;
public final class b extends c implements RandomAccess {
    public final c f10973a;
    public final int f10974b;
    public final int f10975c;

    public b(c cVar, int i10, int i11) {
        this.f10973a = cVar;
        this.f10974b = i10;
        a8.a(i10, i11, cVar.i());
        this.f10975c = i11 - i10;
    }

    @Override
    public final Object get(int i10) {
        int i11 = this.f10975c;
        if (i10 >= 0 && i10 < i11) {
            return this.f10973a.get(this.f10974b + i10);
        }
        throw new IndexOutOfBoundsException(a4.a.l(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int i() {
        return this.f10975c;
    }
}

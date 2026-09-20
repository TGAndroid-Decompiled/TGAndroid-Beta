package hd;

import java.util.RandomAccess;
import v7.c8;
public final class b extends c implements RandomAccess {
    public final c f10186a;
    public final int f10187b;
    public final int f10188c;

    public b(c cVar, int i10, int i11) {
        this.f10186a = cVar;
        this.f10187b = i10;
        c8.a(i10, i11, cVar.i());
        this.f10188c = i11 - i10;
    }

    @Override
    public final Object get(int i10) {
        int i11 = this.f10188c;
        if (i10 >= 0 && i10 < i11) {
            return this.f10186a.get(this.f10187b + i10);
        }
        throw new IndexOutOfBoundsException(a4.a.l(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int i() {
        return this.f10188c;
    }
}

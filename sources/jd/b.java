package jd;

import java.util.RandomAccess;
import v7.s8;
public final class b extends c implements RandomAccess {
    public final c f14376a;
    public final int f14377b;
    public final int f14378c;

    public b(c cVar, int i10, int i11) {
        this.f14376a = cVar;
        this.f14377b = i10;
        s8.a(i10, i11, cVar.h());
        this.f14378c = i11 - i10;
    }

    @Override
    public final Object get(int i10) {
        int i11 = this.f14378c;
        if (i10 >= 0 && i10 < i11) {
            return this.f14376a.get(this.f14377b + i10);
        }
        throw new IndexOutOfBoundsException(a1.g.l(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int h() {
        return this.f14378c;
    }
}

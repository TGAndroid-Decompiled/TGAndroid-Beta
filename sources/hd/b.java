package hd;

import a8.p0;
import c8.b0;
import java.util.RandomAccess;
public final class b extends c implements RandomAccess {
    public final c f14467a;
    public final int f14468b;
    public final int f14469c;

    public b(c cVar, int i7, int i10) {
        this.f14467a = cVar;
        this.f14468b = i7;
        b0.a(i7, i10, cVar.f());
        this.f14469c = i10 - i7;
    }

    @Override
    public final int f() {
        return this.f14469c;
    }

    @Override
    public final Object get(int i7) {
        int i10 = this.f14469c;
        if (i7 >= 0 && i7 < i10) {
            return this.f14467a.get(this.f14468b + i7);
        }
        throw new IndexOutOfBoundsException(p0.m(i7, i10, "index: ", ", size: "));
    }
}

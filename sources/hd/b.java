package hd;

import a8.p0;
import c8.e0;
import java.util.RandomAccess;
public final class b extends c implements RandomAccess {
    public final c f14133a;
    public final int f14134b;
    public final int f14135c;

    public b(c cVar, int i7, int i10) {
        this.f14133a = cVar;
        this.f14134b = i7;
        e0.a(i7, i10, cVar.f());
        this.f14135c = i10 - i7;
    }

    @Override
    public final int f() {
        return this.f14135c;
    }

    @Override
    public final Object get(int i7) {
        int i10 = this.f14135c;
        if (i7 >= 0 && i7 < i10) {
            return this.f14133a.get(this.f14134b + i7);
        }
        throw new IndexOutOfBoundsException(p0.m(i7, i10, "index: ", ", size: "));
    }
}

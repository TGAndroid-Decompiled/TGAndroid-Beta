package ed;

import b8.rb;
import java.util.RandomAccess;
public final class c extends d implements RandomAccess {
    public final d f9946a;
    public final int f9947b;
    public final int f9948c;

    public c(d dVar, int i3, int i10) {
        this.f9946a = dVar;
        this.f9947b = i3;
        rb.a(i3, i10, dVar.h());
        this.f9948c = i10 - i3;
    }

    @Override
    public final Object get(int i3) {
        int i10 = this.f9948c;
        if (i3 >= 0 && i3 < i10) {
            return this.f9946a.get(this.f9947b + i3);
        }
        throw new IndexOutOfBoundsException(a1.g.n(i3, i10, "index: ", ", size: "));
    }

    @Override
    public final int h() {
        return this.f9948c;
    }
}

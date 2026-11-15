package hd;

import a8.p0;
import c8.b0;
import java.util.RandomAccess;
public final class b extends c implements RandomAccess {
    public final c f13824a;
    public final int f13825b;
    public final int f13826c;

    public b(c cVar, int i7, int i10) {
        this.f13824a = cVar;
        this.f13825b = i7;
        b0.a(i7, i10, cVar.f());
        this.f13826c = i10 - i7;
    }

    @Override
    public final int f() {
        return this.f13826c;
    }

    @Override
    public final Object get(int i7) {
        int i10 = this.f13826c;
        if (i7 >= 0 && i7 < i10) {
            return this.f13824a.get(this.f13825b + i7);
        }
        throw new IndexOutOfBoundsException(p0.m(i7, i10, "index: ", ", size: "));
    }
}

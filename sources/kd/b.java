package kd;

import a8.sd;
import java.util.RandomAccess;
public final class b extends c implements RandomAccess {
    public final c f16515a;
    public final int f16516b;
    public final int f16517c;

    public b(c cVar, int i10, int i11) {
        this.f16515a = cVar;
        this.f16516b = i10;
        sd.a(i10, i11, cVar.h());
        this.f16517c = i11 - i10;
    }

    @Override
    public final Object get(int i10) {
        int i11 = this.f16517c;
        if (i10 >= 0 && i10 < i11) {
            return this.f16515a.get(this.f16516b + i10);
        }
        throw new IndexOutOfBoundsException(a1.g.l(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int h() {
        return this.f16517c;
    }
}

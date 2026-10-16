package jd;

import java.util.RandomAccess;
import v7.s8;
public final class b extends c implements RandomAccess {
    public final c f12969a;
    public final int f12970b;
    public final int f12971c;

    public b(c cVar, int i10, int i11) {
        this.f12969a = cVar;
        this.f12970b = i10;
        s8.a(i10, i11, cVar.h());
        this.f12971c = i11 - i10;
    }

    @Override
    public final Object get(int i10) {
        int i11 = this.f12971c;
        if (i10 >= 0 && i10 < i11) {
            return this.f12969a.get(this.f12970b + i10);
        }
        throw new IndexOutOfBoundsException(a1.g.l(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int h() {
        return this.f12971c;
    }
}

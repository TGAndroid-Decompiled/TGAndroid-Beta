package hd;

import java.util.RandomAccess;
import v7.a8;
public final class b extends c implements RandomAccess {
    public final c f10947a;
    public final int f10948b;
    public final int f10949c;

    public b(c cVar, int i10, int i11) {
        this.f10947a = cVar;
        this.f10948b = i10;
        a8.a(i10, i11, cVar.i());
        this.f10949c = i11 - i10;
    }

    @Override
    public final Object get(int i10) {
        int i11 = this.f10949c;
        if (i10 >= 0 && i10 < i11) {
            return this.f10947a.get(this.f10948b + i10);
        }
        throw new IndexOutOfBoundsException(a4.a.l(i10, i11, "index: ", ", size: "));
    }

    @Override
    public final int i() {
        return this.f10949c;
    }
}

package f7;

import h7.i7;
import j$.util.Objects;
public final class k extends d {
    public final transient Object[] f6667c;
    public final transient int d;
    public final transient int f6668e;

    public k(int i10, int i11, Object[] objArr) {
        this.f6667c = objArr;
        this.d = i10;
        this.f6668e = i11;
    }

    @Override
    public final Object get(int i10) {
        i7.a(i10, this.f6668e);
        Object obj = this.f6667c[i10 + i10 + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int size() {
        return this.f6668e;
    }
}

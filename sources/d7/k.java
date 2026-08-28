package d7;

import f7.r6;
import j$.util.Objects;
public final class k extends d {
    public final transient Object[] f4435c;
    public final transient int d;
    public final transient int f4436e;

    public k(int i9, int i10, Object[] objArr) {
        this.f4435c = objArr;
        this.d = i9;
        this.f4436e = i10;
    }

    @Override
    public final Object get(int i9) {
        r6.a(i9, this.f4436e);
        Object obj = this.f4435c[i9 + i9 + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int size() {
        return this.f4436e;
    }
}

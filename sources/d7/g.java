package d7;

import f7.r6;
import j$.util.Objects;
public final class g extends d {
    public static final g f4429e = new g(0, new Object[0]);
    public final transient Object[] f4430c;
    public final transient int d;

    public g(int i9, Object[] objArr) {
        this.f4430c = objArr;
        this.d = i9;
    }

    @Override
    public final Object get(int i9) {
        r6.a(i9, this.d);
        Object obj = this.f4430c[i9];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f4430c;
        int i9 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i9);
        return i9;
    }

    @Override
    public final int n() {
        return this.d;
    }

    @Override
    public final int o() {
        return 0;
    }

    @Override
    public final Object[] p() {
        return this.f4430c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

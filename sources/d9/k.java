package d9;

import a8.s9;
import j$.util.Objects;
public final class k extends i {
    public static final k d = new k(new Object[0]);
    public final transient Object[] f7911c;

    public k(Object[] objArr) {
        this.f7911c = objArr;
    }

    @Override
    public final int f(Object[] objArr) {
        System.arraycopy(this.f7911c, 0, objArr, 0, 0);
        return 0;
    }

    @Override
    public final Object get(int i7) {
        s9.a(i7, 0);
        Object obj = this.f7911c[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int i() {
        return 0;
    }

    @Override
    public final int j() {
        return 0;
    }

    @Override
    public final Object[] k() {
        return this.f7911c;
    }

    @Override
    public final int size() {
        return 0;
    }
}

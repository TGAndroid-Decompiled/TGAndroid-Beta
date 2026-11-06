package d9;

import a8.o9;
import j$.util.Objects;
public final class k extends i {
    public static final k d = new k(new Object[0]);
    public final transient Object[] f8247c;

    public k(Object[] objArr) {
        this.f8247c = objArr;
    }

    @Override
    public final int f(Object[] objArr) {
        System.arraycopy(this.f8247c, 0, objArr, 0, 0);
        return 0;
    }

    @Override
    public final Object get(int i7) {
        o9.a(i7, 0);
        Object obj = this.f8247c[i7];
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
        return this.f8247c;
    }

    @Override
    public final int size() {
        return 0;
    }
}

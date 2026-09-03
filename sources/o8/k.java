package o8;

import j$.util.Objects;
public final class k extends i {
    public static final k d = new k(new Object[0]);
    public final transient Object[] f16474c;

    public k(Object[] objArr) {
        this.f16474c = objArr;
    }

    @Override
    public final Object get(int i10) {
        k7.i0.a(i10, 0);
        Object obj = this.f16474c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        System.arraycopy(this.f16474c, 0, objArr, 0, 0);
        return 0;
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final int o() {
        return 0;
    }

    @Override
    public final Object[] p() {
        return this.f16474c;
    }

    @Override
    public final int size() {
        return 0;
    }
}

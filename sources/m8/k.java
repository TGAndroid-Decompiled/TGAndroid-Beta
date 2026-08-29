package m8;

import j$.util.Objects;
public final class k extends i {
    public static final k d = new k(new Object[0]);
    public final transient Object[] f16918c;

    public k(Object[] objArr) {
        this.f16918c = objArr;
    }

    @Override
    public final Object get(int i10) {
        i7.y.a(i10, 0);
        Object obj = this.f16918c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        System.arraycopy(this.f16918c, 0, objArr, 0, 0);
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
        return this.f16918c;
    }

    @Override
    public final int size() {
        return 0;
    }
}

package c9;

import b8.q9;
import j$.util.Objects;
public final class k extends i {
    public static final k d = new k(new Object[0]);
    public final transient Object[] f4273c;

    public k(Object[] objArr) {
        this.f4273c = objArr;
    }

    @Override
    public final Object get(int i3) {
        q9.a(i3, 0);
        Object obj = this.f4273c[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        System.arraycopy(this.f4273c, 0, objArr, 0, 0);
        return 0;
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
        return this.f4273c;
    }

    @Override
    public final int size() {
        return 0;
    }
}

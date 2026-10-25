package b9;

import a8.w1;
import j$.util.Objects;
public final class l extends j {
    public static final l d = new l(new Object[0]);
    public final transient Object[] f3709c;

    public l(Object[] objArr) {
        this.f3709c = objArr;
    }

    @Override
    public final Object get(int i10) {
        w1.a(i10, 0);
        Object obj = this.f3709c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        System.arraycopy(this.f3709c, 0, objArr, 0, 0);
        return 0;
    }

    @Override
    public final int m() {
        return 0;
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final Object[] o() {
        return this.f3709c;
    }

    @Override
    public final int size() {
        return 0;
    }
}

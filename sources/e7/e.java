package e7;

import f7.x6;
import j$.util.Objects;
public final class e extends d {
    public static final e f4976e = new e(0, new Object[0]);
    public final transient Object[] f4977c;
    public final transient int d;

    public e(int i9, Object[] objArr) {
        this.f4977c = objArr;
        this.d = i9;
    }

    @Override
    public final Object get(int i9) {
        x6.a(i9, this.d);
        Object obj = this.f4977c[i9];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        Object[] objArr2 = this.f4977c;
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
        return this.f4977c;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

package o7;

import b8.bf;
import j$.util.Objects;
public final class f extends e {
    public static final f f20924e = new f(0, new Object[0]);
    public final transient Object[] f20925c;
    public final transient int d;

    public f(int i3, Object[] objArr) {
        this.f20925c = objArr;
        this.d = i3;
    }

    @Override
    public final Object get(int i3) {
        bf.a(i3, this.d);
        Object obj = this.f20925c[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final Object[] h() {
        return this.f20925c;
    }

    @Override
    public final int i() {
        return 0;
    }

    @Override
    public final int j() {
        return this.d;
    }

    @Override
    public final int k(Object[] objArr) {
        Object[] objArr2 = this.f20925c;
        int i3 = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

package g9;

import b8.zb;
import j$.util.Objects;
public final class s1 extends i0 {
    public static final s1 f12146e = new s1(0, new Object[0]);
    public final transient Object[] f12147c;
    public final transient int d;

    public s1(int i3, Object[] objArr) {
        this.f12147c = objArr;
        this.d = i3;
    }

    @Override
    public final Object get(int i3) {
        zb.j(i3, this.d);
        Object obj = this.f12147c[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int i(int i3, Object[] objArr) {
        Object[] objArr2 = this.f12147c;
        int i10 = this.d;
        System.arraycopy(objArr2, 0, objArr, i3, i10);
        return i3 + i10;
    }

    @Override
    public final Object[] j() {
        return this.f12147c;
    }

    @Override
    public final int k() {
        return this.d;
    }

    @Override
    public final int l() {
        return 0;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

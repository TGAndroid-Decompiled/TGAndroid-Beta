package e9;
public final class e2 extends y0 {
    public static final Object[] f8440r;
    public static final e2 f8441s;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f8442f;
    public final transient int h;
    public final transient int f8443n;

    static {
        Object[] objArr = new Object[0];
        f8440r = objArr;
        f8441s = new e2(0, 0, 0, objArr, objArr);
    }

    public e2(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i10;
        this.f8442f = objArr2;
        this.h = i11;
        this.f8443n = i12;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f8442f;
            if (objArr.length != 0) {
                int u10 = s.u(obj);
                while (true) {
                    int i10 = u10 & this.h;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    u10 = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.e;
    }

    @Override
    public final int m(int i10, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i11 = this.f8443n;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override
    public final Object[] n() {
        return this.d;
    }

    @Override
    public final int o() {
        return this.f8443n;
    }

    @Override
    public final int p() {
        return 0;
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final m2 r() {
        return h().listIterator(0);
    }

    @Override
    public final int size() {
        return this.f8443n;
    }

    @Override
    public final n0 v() {
        return n0.s(this.f8443n, this.d);
    }
}

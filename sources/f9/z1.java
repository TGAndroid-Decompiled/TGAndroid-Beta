package f9;
public final class z1 extends t0 {
    public static final Object[] f10366r;
    public static final z1 f10367s;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f10368f;
    public final transient int h;
    public final transient int f10369n;

    static {
        Object[] objArr = new Object[0];
        f10366r = objArr;
        f10367s = new z1(0, 0, 0, objArr, objArr);
    }

    public z1(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i10;
        this.f10368f = objArr2;
        this.h = i11;
        this.f10369n = i12;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f10368f;
            if (objArr.length != 0) {
                int u10 = o.u(obj);
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
        int i11 = this.f10369n;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override
    public final Object[] n() {
        return this.d;
    }

    @Override
    public final int o() {
        return this.f10369n;
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
    public final g2 r() {
        return h().listIterator(0);
    }

    @Override
    public final int size() {
        return this.f10369n;
    }

    @Override
    public final i0 v() {
        return i0.s(this.f10369n, this.d);
    }
}

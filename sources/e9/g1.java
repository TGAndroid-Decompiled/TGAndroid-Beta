package e9;
public final class g1 extends m0 {
    public static final Object[] f8076r;
    public static final g1 f8077s;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f8078f;
    public final transient int h;
    public final transient int f8079n;

    static {
        Object[] objArr = new Object[0];
        f8076r = objArr;
        f8077s = new g1(0, 0, 0, objArr, objArr);
    }

    public g1(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i10;
        this.f8078f = objArr2;
        this.h = i11;
        this.f8079n = i12;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f8078f;
            if (objArr.length != 0) {
                int t10 = q.t(obj);
                while (true) {
                    int i10 = t10 & this.h;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    t10 = i10 + 1;
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
    public final int n(int i10, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i11 = this.f8079n;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override
    public final Object[] o() {
        return this.d;
    }

    @Override
    public final int p() {
        return this.f8079n;
    }

    @Override
    public final int q() {
        return 0;
    }

    @Override
    public final boolean r() {
        return false;
    }

    @Override
    public final o1 s() {
        return i().listIterator(0);
    }

    @Override
    public final int size() {
        return this.f8079n;
    }

    @Override
    public final i0 w() {
        return i0.t(this.f8079n, this.d);
    }
}

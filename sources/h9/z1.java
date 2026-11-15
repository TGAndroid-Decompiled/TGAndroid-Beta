package h9;
public final class z1 extends t0 {
    public static final Object[] f13780r;
    public static final z1 f13781s;
    public final transient Object[] d;
    public final transient int f13782e;
    public final transient Object[] f13783f;
    public final transient int h;
    public final transient int f13784n;

    static {
        Object[] objArr = new Object[0];
        f13780r = objArr;
        f13781s = new z1(0, 0, 0, objArr, objArr);
    }

    public z1(int i7, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.f13782e = i7;
        this.f13783f = objArr2;
        this.h = i10;
        this.f13784n = i11;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f13783f;
            if (objArr.length != 0) {
                int v = o.v(obj);
                while (true) {
                    int i7 = v & this.h;
                    Object obj2 = objArr[i7];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    v = i7 + 1;
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.f13782e;
    }

    @Override
    public final int i(int i7, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i10 = this.f13784n;
        System.arraycopy(objArr2, 0, objArr, i7, i10);
        return i7 + i10;
    }

    @Override
    public final Object[] j() {
        return this.d;
    }

    @Override
    public final int k() {
        return this.f13784n;
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
    public final g2 n() {
        return f().listIterator(0);
    }

    @Override
    public final i0 r() {
        return i0.o(this.f13784n, this.d);
    }

    @Override
    public final int size() {
        return this.f13784n;
    }
}

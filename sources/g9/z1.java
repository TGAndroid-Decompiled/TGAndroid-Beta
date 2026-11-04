package g9;
public final class z1 extends t0 {
    public static final Object[] f12177r;
    public static final z1 f12178s;
    public final transient Object[] d;
    public final transient int f12179e;
    public final transient Object[] f12180f;
    public final transient int h;
    public final transient int f12181n;

    static {
        Object[] objArr = new Object[0];
        f12177r = objArr;
        f12178s = new z1(0, 0, 0, objArr, objArr);
    }

    public z1(int i3, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.f12179e = i3;
        this.f12180f = objArr2;
        this.h = i10;
        this.f12181n = i11;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f12180f;
            if (objArr.length != 0) {
                int v = o.v(obj);
                while (true) {
                    int i3 = v & this.h;
                    Object obj2 = objArr[i3];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    v = i3 + 1;
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.f12179e;
    }

    @Override
    public final int i(int i3, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i10 = this.f12181n;
        System.arraycopy(objArr2, 0, objArr, i3, i10);
        return i3 + i10;
    }

    @Override
    public final Object[] j() {
        return this.d;
    }

    @Override
    public final int k() {
        return this.f12181n;
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
        return h().listIterator(0);
    }

    @Override
    public final i0 r() {
        return i0.o(this.f12181n, this.d);
    }

    @Override
    public final int size() {
        return this.f12181n;
    }
}

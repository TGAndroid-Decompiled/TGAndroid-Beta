package h9;
public final class z1 extends t0 {
    public static final Object[] f14089r;
    public static final z1 f14090s;
    public final transient Object[] d;
    public final transient int f14091e;
    public final transient Object[] f14092f;
    public final transient int h;
    public final transient int f14093n;

    static {
        Object[] objArr = new Object[0];
        f14089r = objArr;
        f14090s = new z1(0, 0, 0, objArr, objArr);
    }

    public z1(int i7, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.f14091e = i7;
        this.f14092f = objArr2;
        this.h = i10;
        this.f14093n = i11;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f14092f;
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
        return this.f14091e;
    }

    @Override
    public final int i(int i7, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i10 = this.f14093n;
        System.arraycopy(objArr2, 0, objArr, i7, i10);
        return i7 + i10;
    }

    @Override
    public final Object[] j() {
        return this.d;
    }

    @Override
    public final int k() {
        return this.f14093n;
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
        return i0.o(this.f14093n, this.d);
    }

    @Override
    public final int size() {
        return this.f14093n;
    }
}

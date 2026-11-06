package h9;
public final class a2 extends t0 {
    public static final Object[] f14287r;
    public static final a2 f14288s;
    public final transient Object[] d;
    public final transient int f14289e;
    public final transient Object[] f14290f;
    public final transient int h;
    public final transient int f14291n;

    static {
        Object[] objArr = new Object[0];
        f14287r = objArr;
        f14288s = new a2(0, 0, 0, objArr, objArr);
    }

    public a2(int i7, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.f14289e = i7;
        this.f14290f = objArr2;
        this.h = i10;
        this.f14291n = i11;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f14290f;
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
        return this.f14289e;
    }

    @Override
    public final int i(int i7, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i10 = this.f14291n;
        System.arraycopy(objArr2, 0, objArr, i7, i10);
        return i7 + i10;
    }

    @Override
    public final Object[] j() {
        return this.d;
    }

    @Override
    public final int k() {
        return this.f14291n;
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
    public final h2 n() {
        return f().listIterator(0);
    }

    @Override
    public final i0 r() {
        return i0.o(this.f14291n, this.d);
    }

    @Override
    public final int size() {
        return this.f14291n;
    }
}

package o8;
public final class r0 extends c0 {
    public static final Object[] f19081r;
    public static final r0 f19082s;
    public final transient Object[] d;
    public final transient int f19083e;
    public final transient Object[] f19084f;
    public final transient int h;
    public final transient int f19085n;

    static {
        Object[] objArr = new Object[0];
        f19081r = objArr;
        f19082s = new r0(0, 0, 0, objArr, objArr);
    }

    public r0(int i9, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.f19083e = i9;
        this.f19084f = objArr2;
        this.h = i10;
        this.f19085n = i11;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f19084f;
            if (objArr.length != 0) {
                int p6 = l.p(obj);
                while (true) {
                    int i9 = p6 & this.h;
                    Object obj2 = objArr[i9];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    p6 = i9 + 1;
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.f19083e;
    }

    @Override
    public final int n(int i9, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i10 = this.f19085n;
        System.arraycopy(objArr2, 0, objArr, i9, i10);
        return i9 + i10;
    }

    @Override
    public final Object[] o() {
        return this.d;
    }

    @Override
    public final int p() {
        return this.f19085n;
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
    public final int size() {
        return this.f19085n;
    }

    @Override
    public final z v() {
        return z.s(this.f19085n, this.d);
    }

    @Override
    public final x0 w() {
        return i().listIterator(0);
    }
}

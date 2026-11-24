package defpackage;
public final class f89 extends yo5 {
    public static final Object[] r;
    public static final f89 s;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int h;
    public final transient int n;

    static {
        Object[] objArr = new Object[0];
        r = objArr;
        s = new f89(0, 0, 0, objArr, objArr);
    }

    public f89(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = i;
        this.f = objArr2;
        this.h = i2;
        this.n = i3;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int b = dle.b(obj);
                while (true) {
                    int i = b & this.h;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    b = i + 1;
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
    public final int i(int i, Object[] objArr) {
        Object[] objArr2 = this.d;
        int i2 = this.n;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override
    public final Object[] j() {
        return this.d;
    }

    @Override
    public final int k() {
        return this.n;
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
    public final v7c iterator() {
        return h().listIterator(0);
    }

    @Override
    public final mo5 r() {
        return mo5.o(this.n, this.d);
    }

    @Override
    public final int size() {
        return this.n;
    }
}

package d9;

import java.util.Iterator;
public final class l extends j {
    public static final Object[] f8251f;
    public static final l h;
    public final transient Object[] d;
    public final transient Object[] f8252e;

    static {
        Object[] objArr = new Object[0];
        f8251f = objArr;
        h = new l(objArr, objArr);
    }

    public l(Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.f8252e = objArr2;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            int length = this.f8252e.length;
            return false;
        }
        return false;
    }

    @Override
    public final int f(Object[] objArr) {
        System.arraycopy(this.d, 0, objArr, 0, 0);
        return 0;
    }

    @Override
    public final int hashCode() {
        return 0;
    }

    @Override
    public final int i() {
        return 0;
    }

    @Override
    public final Iterator iterator() {
        k kVar = this.f8247b;
        if (kVar == null) {
            g gVar = i.f8244b;
            kVar = k.d;
            this.f8247b = kVar;
        }
        return kVar.listIterator(0);
    }

    @Override
    public final int j() {
        return 0;
    }

    @Override
    public final Object[] k() {
        return this.d;
    }

    @Override
    public final int size() {
        return 0;
    }
}

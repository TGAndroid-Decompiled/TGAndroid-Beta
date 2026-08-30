package o8;

import java.util.Iterator;
public final class l extends j {
    public static final Object[] f16493f;
    public static final l h;
    public final transient Object[] d;
    public final transient Object[] e;

    static {
        Object[] objArr = new Object[0];
        f16493f = objArr;
        h = new l(objArr, objArr);
    }

    public l(Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = objArr2;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            int length = this.e.length;
            return false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return 0;
    }

    @Override
    public final int i(Object[] objArr) {
        System.arraycopy(this.d, 0, objArr, 0, 0);
        return 0;
    }

    @Override
    public final Iterator iterator() {
        k kVar = this.f16491b;
        if (kVar == null) {
            g gVar = i.f16487b;
            kVar = k.d;
            this.f16491b = kVar;
        }
        return kVar.listIterator(0);
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final int o() {
        return 0;
    }

    @Override
    public final Object[] p() {
        return this.d;
    }

    @Override
    public final int size() {
        return 0;
    }
}

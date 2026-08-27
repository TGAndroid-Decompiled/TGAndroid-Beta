package l8;

import java.util.Iterator;

public final class l extends j {

    public static final Object[] f15479f;
    public static final l h;
    public final transient Object[] d;

    public final transient Object[] f15480e;

    static {
        Object[] objArr = new Object[0];
        f15479f = objArr;
        h = new l(objArr, objArr);
    }

    public l(Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.f15480e = objArr2;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f15480e.length;
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
        k kVar = this.f15477b;
        if (kVar == null) {
            g gVar = i.f15473b;
            kVar = k.d;
            this.f15477b = kVar;
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

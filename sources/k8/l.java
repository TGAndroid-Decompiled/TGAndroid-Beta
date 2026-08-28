package k8;

import java.util.Iterator;
public final class l extends j {
    public static final Object[] f14698f;
    public static final l h;
    public final transient Object[] d;
    public final transient Object[] f14699e;

    static {
        Object[] objArr = new Object[0];
        f14698f = objArr;
        h = new l(objArr, objArr);
    }

    public l(Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.f14699e = objArr2;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            int length = this.f14699e.length;
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
        k kVar = this.f14694b;
        if (kVar == null) {
            g gVar = i.f14691b;
            kVar = k.d;
            this.f14694b = kVar;
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

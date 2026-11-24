package defpackage;

import java.util.Iterator;
import java.util.Set;
public final class pzc extends kzc implements Set, j$.util.Set {
    public static final Object[] w;
    public static final pzc x;
    public transient ozc n;
    public final transient Object[] r;
    public final transient Object[] s;

    static {
        Object[] objArr = new Object[0];
        w = objArr;
        x = new pzc(objArr, objArr);
    }

    public pzc(Object[] objArr, Object[] objArr2) {
        super((byte) 0);
        this.r = objArr;
        this.s = objArr2;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj != null) {
            int length = this.s.length;
            return false;
        }
        return false;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (set.size() == 0) {
                    if (containsAll(set)) {
                        return true;
                    }
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override
    public final int h(Object[] objArr) {
        System.arraycopy(this.r, 0, objArr, 0, 0);
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
        ozc ozcVar = this.n;
        if (ozcVar == null) {
            lzc lzcVar = nzc.n;
            ozcVar = ozc.s;
            this.n = ozcVar;
        }
        return ozcVar.listIterator(0);
    }

    @Override
    public final int j() {
        return 0;
    }

    @Override
    public final Object[] k() {
        return this.r;
    }

    @Override
    public final int size() {
        return 0;
    }
}

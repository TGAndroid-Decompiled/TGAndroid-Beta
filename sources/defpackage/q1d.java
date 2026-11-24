package defpackage;

import java.util.Iterator;
import java.util.Set;
public final class q1d extends l1d implements Set, j$.util.Set {
    public static final Object[] w;
    public static final q1d x;
    public transient p1d n;
    public final transient Object[] r;
    public final transient Object[] s;

    static {
        Object[] objArr = new Object[0];
        w = objArr;
        x = new q1d(objArr, objArr);
    }

    public q1d(Object[] objArr, Object[] objArr2) {
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
        p1d p1dVar = this.n;
        if (p1dVar == null) {
            m1d m1dVar = o1d.n;
            p1dVar = p1d.s;
            this.n = p1dVar;
        }
        return p1dVar.listIterator(0);
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

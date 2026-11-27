package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public final class os implements Set {
    public final qs a;

    public os(qs qsVar) {
        this.a = qsVar;
    }

    @Override
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.a.j(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        qs qsVar = this.a;
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (qsVar.c == set.size()) {
                        if (qsVar.j(set)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        int hashCode;
        qs qsVar = this.a;
        int i = 0;
        for (int i2 = qsVar.c - 1; i2 >= 0; i2--) {
            Object f = qsVar.f(i2);
            if (f == null) {
                hashCode = 0;
            } else {
                hashCode = f.hashCode();
            }
            i += hashCode;
        }
        return i;
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new ns(this.a, (byte) 0);
    }

    @Override
    public final boolean remove(Object obj) {
        qs qsVar = this.a;
        int d = qsVar.d(obj);
        if (d >= 0) {
            qsVar.g(d);
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        return this.a.k(collection);
    }

    @Override
    public final boolean retainAll(Collection collection) {
        qs qsVar = this.a;
        int i = qsVar.c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(qsVar.f(i2))) {
                qsVar.g(i2);
            }
        }
        if (i != qsVar.c) {
            return true;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.a.c;
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        qs qsVar = this.a;
        int i = qsVar.c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = qsVar.f(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override
    public final Object[] toArray() {
        qs qsVar = this.a;
        int i = qsVar.c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = qsVar.f(i2);
        }
        return objArr;
    }
}

package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public final class ns implements Set {
    public final ps a;

    public ns(ps psVar) {
        this.a = psVar;
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
        ps psVar = this.a;
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (psVar.c == set.size()) {
                        if (psVar.j(set)) {
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
        ps psVar = this.a;
        int i = 0;
        for (int i2 = psVar.c - 1; i2 >= 0; i2--) {
            Object f = psVar.f(i2);
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
        return new ms(this.a, (byte) 0);
    }

    @Override
    public final boolean remove(Object obj) {
        ps psVar = this.a;
        int d = psVar.d(obj);
        if (d >= 0) {
            psVar.g(d);
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
        ps psVar = this.a;
        int i = psVar.c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(psVar.f(i2))) {
                psVar.g(i2);
            }
        }
        if (i != psVar.c) {
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
        ps psVar = this.a;
        int i = psVar.c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = psVar.f(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override
    public final Object[] toArray() {
        ps psVar = this.a;
        int i = psVar.c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = psVar.f(i2);
        }
        return objArr;
    }
}

package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public final class ot implements Set {
    public final qt a;

    public ot(qt qtVar) {
        this.a = qtVar;
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
        qt qtVar = this.a;
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (qtVar.c == set.size()) {
                        if (qtVar.j(set)) {
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
        qt qtVar = this.a;
        int i = 0;
        for (int i2 = qtVar.c - 1; i2 >= 0; i2--) {
            Object f = qtVar.f(i2);
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
        return new nt(this.a, (byte) 0);
    }

    @Override
    public final boolean remove(Object obj) {
        qt qtVar = this.a;
        int d = qtVar.d(obj);
        if (d >= 0) {
            qtVar.g(d);
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
        qt qtVar = this.a;
        int i = qtVar.c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(qtVar.f(i2))) {
                qtVar.g(i2);
            }
        }
        if (i != qtVar.c) {
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
        qt qtVar = this.a;
        int i = qtVar.c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = qtVar.f(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override
    public final Object[] toArray() {
        qt qtVar = this.a;
        int i = qtVar.c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = qtVar.f(i2);
        }
        return objArr;
    }
}

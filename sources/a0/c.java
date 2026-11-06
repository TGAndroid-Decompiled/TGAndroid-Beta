package a0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public final class c implements Set {
    public final f f6a;

    public c(f fVar) {
        this.f6a = fVar;
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
        this.f6a.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f6a.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f6a.j(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        f fVar = this.f6a;
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (fVar.f31c == set.size()) {
                        if (fVar.j(set)) {
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
        f fVar = this.f6a;
        int i7 = 0;
        for (int i10 = fVar.f31c - 1; i10 >= 0; i10--) {
            Object f10 = fVar.f(i10);
            if (f10 == null) {
                hashCode = 0;
            } else {
                hashCode = f10.hashCode();
            }
            i7 += hashCode;
        }
        return i7;
    }

    @Override
    public final boolean isEmpty() {
        return this.f6a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f6a, 0);
    }

    @Override
    public final boolean remove(Object obj) {
        f fVar = this.f6a;
        int d = fVar.d(obj);
        if (d >= 0) {
            fVar.g(d);
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        return this.f6a.k(collection);
    }

    @Override
    public final boolean retainAll(Collection collection) {
        f fVar = this.f6a;
        int i7 = fVar.f31c;
        for (int i10 = i7 - 1; i10 >= 0; i10--) {
            if (!collection.contains(fVar.f(i10))) {
                fVar.g(i10);
            }
        }
        if (i7 != fVar.f31c) {
            return true;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.f6a.f31c;
    }

    @Override
    public final Object[] toArray() {
        f fVar = this.f6a;
        int i7 = fVar.f31c;
        Object[] objArr = new Object[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            objArr[i10] = fVar.f(i10);
        }
        return objArr;
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        f fVar = this.f6a;
        int i7 = fVar.f31c;
        if (objArr.length < i7) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        }
        for (int i10 = 0; i10 < i7; i10++) {
            objArr[i10] = fVar.f(i10);
        }
        if (objArr.length > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }
}

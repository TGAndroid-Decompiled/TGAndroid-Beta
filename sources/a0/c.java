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
        return this.f6a.i(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        f fVar = this.f6a;
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (fVar.f28c == set.size()) {
                        if (fVar.i(set)) {
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
        int i9 = 0;
        for (int i10 = fVar.f28c - 1; i10 >= 0; i10--) {
            Object e10 = fVar.e(i10);
            if (e10 == null) {
                hashCode = 0;
            } else {
                hashCode = e10.hashCode();
            }
            i9 += hashCode;
        }
        return i9;
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
        int c10 = fVar.c(obj);
        if (c10 >= 0) {
            fVar.f(c10);
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        return this.f6a.j(collection);
    }

    @Override
    public final boolean retainAll(Collection collection) {
        f fVar = this.f6a;
        int i9 = fVar.f28c;
        for (int i10 = i9 - 1; i10 >= 0; i10--) {
            if (!collection.contains(fVar.e(i10))) {
                fVar.f(i10);
            }
        }
        if (i9 != fVar.f28c) {
            return true;
        }
        return false;
    }

    @Override
    public final int size() {
        return this.f6a.f28c;
    }

    @Override
    public final Object[] toArray() {
        f fVar = this.f6a;
        int i9 = fVar.f28c;
        Object[] objArr = new Object[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = fVar.e(i10);
        }
        return objArr;
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        f fVar = this.f6a;
        int i9 = fVar.f28c;
        if (objArr.length < i9) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i9);
        }
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = fVar.e(i10);
        }
        if (objArr.length > i9) {
            objArr[i9] = null;
        }
        return objArr;
    }
}

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
                    if (fVar.f31c == set.size()) {
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
        int i10 = 0;
        for (int i11 = fVar.f31c - 1; i11 >= 0; i11--) {
            Object e7 = fVar.e(i11);
            if (e7 == null) {
                hashCode = 0;
            } else {
                hashCode = e7.hashCode();
            }
            i10 += hashCode;
        }
        return i10;
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
        int i10 = fVar.f31c;
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (!collection.contains(fVar.e(i11))) {
                fVar.f(i11);
            }
        }
        if (i10 != fVar.f31c) {
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
        int i10 = fVar.f31c;
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = fVar.e(i11);
        }
        return objArr;
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        f fVar = this.f6a;
        int i10 = fVar.f31c;
        if (objArr.length < i10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        }
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = fVar.e(i11);
        }
        if (objArr.length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }
}

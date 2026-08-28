package a0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
public final class e implements Collection {
    public final f f10a;

    public e(f fVar) {
        this.f10a = fVar;
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
        this.f10a.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f10a.a(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean isEmpty() {
        return this.f10a.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f10a, 1);
    }

    @Override
    public final boolean remove(Object obj) {
        f fVar = this.f10a;
        int a2 = fVar.a(obj);
        if (a2 >= 0) {
            fVar.f(a2);
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        f fVar = this.f10a;
        int i9 = fVar.f28c;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < i9) {
            if (collection.contains(fVar.h(i10))) {
                fVar.f(i10);
                i10--;
                i9--;
                z10 = true;
            }
            i10++;
        }
        return z10;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        f fVar = this.f10a;
        int i9 = fVar.f28c;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < i9) {
            if (!collection.contains(fVar.h(i10))) {
                fVar.f(i10);
                i10--;
                i9--;
                z10 = true;
            }
            i10++;
        }
        return z10;
    }

    @Override
    public final int size() {
        return this.f10a.f28c;
    }

    @Override
    public final Object[] toArray() {
        f fVar = this.f10a;
        int i9 = fVar.f28c;
        Object[] objArr = new Object[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = fVar.h(i10);
        }
        return objArr;
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        f fVar = this.f10a;
        int i9 = fVar.f28c;
        if (objArr.length < i9) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i9);
        }
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = fVar.h(i10);
        }
        if (objArr.length > i9) {
            objArr[i9] = null;
        }
        return objArr;
    }
}

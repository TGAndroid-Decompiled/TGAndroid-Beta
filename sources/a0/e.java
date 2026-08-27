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
        return this.f10a.a(obj) >= 0;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
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
        int iA = fVar.a(obj);
        if (iA < 0) {
            return false;
        }
        fVar.f(iA);
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        f fVar = this.f10a;
        int i10 = fVar.f28c;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < i10) {
            if (collection.contains(fVar.h(i11))) {
                fVar.f(i11);
                i11--;
                i10--;
                z10 = true;
            }
            i11++;
        }
        return z10;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        f fVar = this.f10a;
        int i10 = fVar.f28c;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < i10) {
            if (!collection.contains(fVar.h(i11))) {
                fVar.f(i11);
                i11--;
                i10--;
                z10 = true;
            }
            i11++;
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
        int i10 = fVar.f28c;
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = fVar.h(i11);
        }
        return objArr;
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        f fVar = this.f10a;
        int i10 = fVar.f28c;
        if (objArr.length < i10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        }
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = fVar.h(i11);
        }
        if (objArr.length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }
}

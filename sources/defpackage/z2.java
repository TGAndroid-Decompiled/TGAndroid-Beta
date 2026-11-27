package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public abstract class z2 implements List, Collection {
    @Override
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (Object obj2 : this) {
            if (ur5.a(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Collection<Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        if (size() != collection.size()) {
            return false;
        }
        Iterator it = collection.iterator();
        for (Object obj2 : this) {
            if (!ur5.a(obj2, it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract int h();

    @Override
    public final int hashCode() {
        int i;
        int i2 = 1;
        for (Object obj : this) {
            int i3 = i2 * 31;
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return i2;
    }

    @Override
    public int indexOf(Object obj) {
        int i = 0;
        for (Object obj2 : this) {
            if (ur5.a(obj2, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        if (h() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new w2(this);
    }

    @Override
    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (ur5.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return new x2(this, 0);
    }

    @Override
    public final Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return h();
    }

    @Override
    public List subList(int i, int i2) {
        return new y2(this, i, i2);
    }

    @Override
    public Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return l93.c(this, objArr);
    }

    public final String toString() {
        return sl2.f(this, ", ", "[", "]", new a2(this, (byte) 0), 24);
    }

    @Override
    public final ListIterator listIterator(int i) {
        return new x2(this, i);
    }

    @Override
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object[] toArray() {
        return l93.b(this);
    }
}

package hd;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public abstract class c implements List, Collection {
    @Override
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(int i7, Collection collection) {
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
            if (kotlin.jvm.internal.j.a(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        Collection<Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
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
            if (!kotlin.jvm.internal.j.a(obj2, it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract int f();

    @Override
    public final int hashCode() {
        int i7;
        int i10 = 1;
        for (Object obj : this) {
            int i11 = i10 * 31;
            if (obj != null) {
                i7 = obj.hashCode();
            } else {
                i7 = 0;
            }
            i10 = i11 + i7;
        }
        return i10;
    }

    @Override
    public int indexOf(Object obj) {
        int i7 = 0;
        for (Object obj2 : this) {
            if (kotlin.jvm.internal.j.a(obj2, obj)) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        if (f() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new cd.b(this);
    }

    @Override
    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.j.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return new a(this, 0);
    }

    @Override
    public final Object remove(int i7) {
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
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return f();
    }

    @Override
    public final List subList(int i7, int i10) {
        return new b(this, i7, i10);
    }

    @Override
    public Object[] toArray() {
        return kotlin.jvm.internal.j.i(this);
    }

    public final String toString() {
        return f.g(this, ", ", "[", "]", new c1.b(this, 4), 24);
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
    public final ListIterator listIterator(int i7) {
        return new a(this, i7);
    }

    @Override
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.j.e(array, "array");
        return kotlin.jvm.internal.j.j(this, array);
    }
}

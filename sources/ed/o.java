package ed;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import k2.p1;
public final class o implements List, Serializable, RandomAccess {
    public static final o f9953a = new Object();

    @Override
    public final void add(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean contains(Object obj) {
        return false;
    }

    @Override
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        return elements.isEmpty();
    }

    @Override
    public final boolean equals(Object obj) {
        if ((obj instanceof List) && ((List) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final Object get(int i3) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i3 + '.');
    }

    @Override
    public final int hashCode() {
        return 1;
    }

    @Override
    public final int indexOf(Object obj) {
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return true;
    }

    @Override
    public final Iterator iterator() {
        return n.f9952a;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return n.f9952a;
    }

    @Override
    public final Object remove(int i3) {
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
    public final Object set(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return 0;
    }

    @Override
    public final List subList(int i3, int i10) {
        if (i3 == 0 && i10 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException(a1.g.n(i3, i10, "fromIndex: ", ", toIndex: "));
    }

    @Override
    public final Object[] toArray() {
        return kotlin.jvm.internal.j.i(this);
    }

    public final String toString() {
        return "[]";
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
    public final ListIterator listIterator(int i3) {
        if (i3 == 0) {
            return n.f9952a;
        }
        throw new IndexOutOfBoundsException(p1.i(i3, "Index: "));
    }

    @Override
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.j.e(array, "array");
        return kotlin.jvm.internal.j.j(this, array);
    }
}

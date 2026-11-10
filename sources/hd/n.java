package hd;

import a8.p0;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public final class n implements List, Serializable, RandomAccess {
    public static final n f14476a = new Object();

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
    public final Object get(int i7) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i7 + '.');
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
        return m.f14475a;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return m.f14475a;
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
        return 0;
    }

    @Override
    public final List subList(int i7, int i10) {
        if (i7 == 0 && i10 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException(p0.m(i7, i10, "fromIndex: ", ", toIndex: "));
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
    public final ListIterator listIterator(int i7) {
        if (i7 == 0) {
            return m.f14475a;
        }
        throw new IndexOutOfBoundsException(jg.g.j(i7, "Index: "));
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

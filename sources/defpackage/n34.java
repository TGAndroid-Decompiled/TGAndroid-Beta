package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
public final class n34 implements List, Serializable, RandomAccess {
    public static final n34 a = new Object();

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
    public final boolean contains(Object obj) {
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return collection.isEmpty();
    }

    @Override
    public final boolean equals(Object obj) {
        if ((obj instanceof List) && ((List) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final Object get(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
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
        return m34.a;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        return -1;
    }

    @Override
    public final ListIterator listIterator(int i) {
        if (i == 0) {
            return m34.a;
        }
        wa3.i(hg9.j(i, "Index: "));
        return null;
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
        return 0;
    }

    @Override
    public final List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        wa3.i(b10.g(i, i2, "fromIndex: ", ", toIndex: "));
        return null;
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return ea3.c(this, objArr);
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
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object[] toArray() {
        return ea3.b(this);
    }

    @Override
    public final ListIterator listIterator() {
        return m34.a;
    }
}

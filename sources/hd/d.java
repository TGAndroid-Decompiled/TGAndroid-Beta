package hd;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
public final class d implements Collection {
    public final Object[] f9302a;
    public final boolean f9303b;

    public d(Object[] values, boolean z10) {
        kotlin.jvm.internal.i.e(values, "values");
        this.f9302a = values;
        this.f9303b = z10;
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
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean contains(Object obj) {
        return f.a(this.f9302a, obj);
    }

    @Override
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        Collection<Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!f.a(this.f9302a, obj)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean isEmpty() {
        if (this.f9302a.length == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        Object[] array = this.f9302a;
        kotlin.jvm.internal.i.e(array, "array");
        return new cd.b(array);
    }

    @Override
    public final boolean remove(Object obj) {
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
    public final int size() {
        return this.f9302a.length;
    }

    @Override
    public final Object[] toArray() {
        Object[] objArr = this.f9302a;
        kotlin.jvm.internal.i.e(objArr, "<this>");
        if (this.f9303b && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        return kotlin.jvm.internal.i.j(this, array);
    }
}

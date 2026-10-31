package bd;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class p implements ListIterator {
    public static final p f2659a = new Object();

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean hasNext() {
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        return false;
    }

    @Override
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return 0;
    }

    @Override
    public final Object previous() {
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return -1;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

package kotlin.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class EmptyIterator implements ListIterator {
    public static final EmptyIterator INSTANCE = new EmptyIterator();

    @Override
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return -1;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private EmptyIterator() {
    }

    @Override
    public Void next() {
        throw new NoSuchElementException();
    }

    @Override
    public Void previous() {
        throw new NoSuchElementException();
    }
}

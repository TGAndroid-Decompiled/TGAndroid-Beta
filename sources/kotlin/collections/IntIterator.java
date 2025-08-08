package kotlin.collections;

import java.util.Iterator;

public abstract class IntIterator implements Iterator {
    public abstract int nextInt();

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object next() {
        return Integer.valueOf(nextInt());
    }
}

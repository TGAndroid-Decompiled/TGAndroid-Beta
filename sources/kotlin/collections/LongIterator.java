package kotlin.collections;

import java.util.Iterator;

public abstract class LongIterator implements Iterator {
    @Override
    public Object next() {
        return Long.valueOf(nextLong());
    }

    public abstract long nextLong();

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

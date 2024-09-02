package kotlin.collections;

import java.util.Iterator;

public abstract class IntIterator implements Iterator<Integer> {
    public abstract int nextInt();

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Integer next() {
        return Integer.valueOf(nextInt());
    }
}

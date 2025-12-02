package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class AbstractIterator implements Iterator {
    private Object nextValue;
    private int state;

    protected abstract void computeNext();

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean hasNext() {
        int i = this.state;
        if (i == 0) {
            return tryToComputeNext();
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override
    public Object next() {
        int i = this.state;
        if (i == 1) {
            this.state = 0;
            return this.nextValue;
        }
        if (i == 2 || !tryToComputeNext()) {
            throw new NoSuchElementException();
        }
        this.state = 0;
        return this.nextValue;
    }

    private final boolean tryToComputeNext() {
        this.state = 3;
        computeNext();
        return this.state == 1;
    }

    public final void setNext(Object obj) {
        this.nextValue = obj;
        this.state = 1;
    }

    public final void done() {
        this.state = 2;
    }
}

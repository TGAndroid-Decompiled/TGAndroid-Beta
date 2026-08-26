package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class CharProgressionIterator implements Iterator {
    public final int finalElement;
    public boolean hasNext;
    public int next;
    public final int step;

    public CharProgressionIterator(char c, char c2, int i) {
        this.step = i;
        this.finalElement = c2;
        boolean z = false;
        if (i <= 0 ? c >= c2 : c < c2 || c == c2) {
            z = true;
        }
        this.hasNext = z;
        this.next = z ? c : c2;
    }

    @Override
    public final boolean hasNext() {
        return this.hasNext;
    }

    @Override
    public final Object next() {
        int i = this.next;
        if (i != this.finalElement) {
            this.next = this.step + i;
        } else {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        }
        return Character.valueOf((char) i);
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

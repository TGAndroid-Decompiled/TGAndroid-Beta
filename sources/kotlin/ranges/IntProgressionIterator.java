package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.IntIterator;

public final class IntProgressionIterator extends IntIterator {
    private final int finalElement;
    private boolean hasNext;
    private int next;
    private final int step;

    public IntProgressionIterator(int i, int i2, int i3) {
        this.step = i3;
        this.finalElement = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.hasNext = z;
        this.next = z ? i : i2;
    }

    @Override
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override
    public int nextInt() {
        int i = this.next;
        if (i == this.finalElement) {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        } else {
            this.next = this.step + i;
        }
        return i;
    }
}

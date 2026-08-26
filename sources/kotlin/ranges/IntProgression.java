package kotlin.ranges;

import java.util.Iterator;
import kotlin.internal.ProgressionUtilKt;

public abstract class IntProgression implements Iterable {
    public final int first;
    public final int last;
    public final int step;

    public IntProgression(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = i;
        this.last = ProgressionUtilKt.getProgressionLastElement(i, i2, i3);
        this.step = i3;
    }

    @Override
    public final Iterator iterator() {
        return new IntProgressionIterator(this.first, this.last, this.step);
    }
}

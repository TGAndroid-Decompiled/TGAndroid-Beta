package kotlin.ranges;

import java.util.Iterator;
import kotlin.internal.ProgressionUtilKt;

public abstract class CharProgression implements Iterable {
    public final char first;
    public final char last;
    public final int step = 1;

    public CharProgression(char c, char c2) {
        this.first = c;
        this.last = (char) ProgressionUtilKt.getProgressionLastElement(c, c2, 1);
    }

    @Override
    public final Iterator iterator() {
        return new CharProgressionIterator(this.first, this.last, this.step);
    }
}

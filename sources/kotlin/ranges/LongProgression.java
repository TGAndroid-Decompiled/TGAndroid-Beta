package kotlin.ranges;

import kotlin.collections.LongIterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class LongProgression implements Iterable {
    public static final Companion Companion = new Companion(null);
    private final long first;
    private final long last;
    private final long step;

    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LongProgression(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = j;
        this.last = ProgressionUtilKt.getProgressionLastElement(j, j2, j3);
        this.step = j3;
    }

    public final long getFirst() {
        return this.first;
    }

    public final long getLast() {
        return this.last;
    }

    @Override
    public LongIterator iterator() {
        return new LongProgressionIterator(this.first, this.last, this.step);
    }
}

package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

public final class ConstrainedOnceSequence<T> implements Sequence<T> {
    private final AtomicReference<Sequence<T>> sequenceRef;

    public ConstrainedOnceSequence(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.sequenceRef = new AtomicReference<>(sequence);
    }

    @Override
    public Iterator<T> iterator() {
        Sequence<T> andSet = this.sequenceRef.getAndSet(null);
        if (andSet == null) {
            throw new IllegalStateException("This sequence can be consumed only once.");
        }
        return andSet.iterator();
    }
}

package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class TransformingSequence implements Sequence {
    private final Sequence sequence;
    private final Function1 transformer;

    public TransformingSequence(Sequence sequence, Function1 transformer) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.sequence = sequence;
        this.transformer = transformer;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private final Iterator iterator;

            {
                Sequence sequence;
                sequence = TransformingSequence.this.sequence;
                this.iterator = sequence.iterator();
            }

            @Override
            public boolean hasNext() {
                return this.iterator.hasNext();
            }

            @Override
            public Object next() {
                Function1 function1;
                function1 = TransformingSequence.this.transformer;
                return function1.invoke(this.iterator.next());
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}

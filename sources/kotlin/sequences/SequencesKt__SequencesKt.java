package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public abstract class SequencesKt__SequencesKt extends SequencesKt__SequencesJVMKt {
    public static Sequence asSequence(final Iterator it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return constrainOnce(new Sequence() {
            @Override
            public Iterator iterator() {
                return it;
            }
        });
    }

    public static final Sequence constrainOnce(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return sequence instanceof ConstrainedOnceSequence ? sequence : new ConstrainedOnceSequence(sequence);
    }
}

package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public class SequencesKt__SequencesKt extends SequencesKt__SequencesJVMKt {
    public static <T> Sequence<T> asSequence(final Iterator<? extends T> it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return constrainOnce(new Sequence<T>() {
            @Override
            public Iterator<T> iterator() {
                return it;
            }
        });
    }

    public static final <T> Sequence<T> constrainOnce(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return sequence instanceof ConstrainedOnceSequence ? sequence : new ConstrainedOnceSequence(sequence);
    }
}

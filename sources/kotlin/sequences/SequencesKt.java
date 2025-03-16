package kotlin.sequences;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public abstract class SequencesKt extends SequencesKt___SequencesKt {
    public static Iterable asIterable(Sequence sequence) {
        return SequencesKt___SequencesKt.asIterable(sequence);
    }

    public static Iterator iterator(Function2 function2) {
        return SequencesKt__SequenceBuilderKt.iterator(function2);
    }

    public static Sequence map(Sequence sequence, Function1 function1) {
        return SequencesKt___SequencesKt.map(sequence, function1);
    }

    public static List toList(Sequence sequence) {
        return SequencesKt___SequencesKt.toList(sequence);
    }
}

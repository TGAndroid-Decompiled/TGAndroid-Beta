package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;

public final class ConstrainedOnceSequence implements Sequence {
    public final AtomicReference sequenceRef;

    public ConstrainedOnceSequence(StringsKt__StringsKt$lineSequence$$inlined$Sequence$1 stringsKt__StringsKt$lineSequence$$inlined$Sequence$1) {
        this.sequenceRef = new AtomicReference(stringsKt__StringsKt$lineSequence$$inlined$Sequence$1);
    }

    @Override
    public final Iterator iterator() {
        Sequence sequence = (Sequence) this.sequenceRef.getAndSet(null);
        if (sequence != null) {
            return sequence.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}

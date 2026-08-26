package kotlin.text;

import com.google.android.gms.internal.mlkit_vision_common.zzjf;
import java.util.Iterator;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceBuilderIterator;
import kotlinx.coroutines.JobSupport$children$1;

public final class StringsKt__StringsKt$lineSequence$$inlined$Sequence$1 implements Sequence {
    public final int $r8$classId;
    public final Object $this_lineSequence$inlined;

    public StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(Object obj, int i) {
        this.$r8$classId = i;
        this.$this_lineSequence$inlined = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.$r8$classId) {
            case 0:
                return new LinesIterator((String) this.$this_lineSequence$inlined);
            case 1:
                JobSupport$children$1 jobSupport$children$1 = (JobSupport$children$1) this.$this_lineSequence$inlined;
                SequenceBuilderIterator sequenceBuilderIterator = new SequenceBuilderIterator();
                sequenceBuilderIterator.nextStep = zzjf.createCoroutineUnintercepted(sequenceBuilderIterator, sequenceBuilderIterator, jobSupport$children$1);
                return sequenceBuilderIterator;
            default:
                return (Iterator) this.$this_lineSequence$inlined;
        }
    }
}

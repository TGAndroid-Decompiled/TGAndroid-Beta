package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class CoroutineContextKt$foldCopies$1 extends Lambda implements Function2 {
    public static final CoroutineContextKt$foldCopies$1 INSTANCE = new CoroutineContextKt$foldCopies$1(2, 0);
    public static final CoroutineContextKt$foldCopies$1 INSTANCE$1 = new CoroutineContextKt$foldCopies$1(2, 1);
    public final int $r8$classId;

    public CoroutineContextKt$foldCopies$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((CoroutineContext) obj).plus((CoroutineContext.Element) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((CoroutineContext) obj).plus((CoroutineContext.Element) obj2);
        }
    }
}

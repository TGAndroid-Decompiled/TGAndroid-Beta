package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.ThreadContextElement;

public final class ThreadContextKt$findOne$1 extends Lambda implements Function2 {
    public final int $r8$classId;
    public static final ThreadContextKt$findOne$1 INSTANCE$1 = new ThreadContextKt$findOne$1(2, 1);
    public static final ThreadContextKt$findOne$1 INSTANCE = new ThreadContextKt$findOne$1(2, 0);
    public static final ThreadContextKt$findOne$1 INSTANCE$2 = new ThreadContextKt$findOne$1(2, 2);

    public ThreadContextKt$findOne$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ThreadContextElement threadContextElement = (ThreadContextElement) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (threadContextElement != null) {
                    return threadContextElement;
                }
                if (element instanceof ThreadContextElement) {
                    return (ThreadContextElement) element;
                }
                return null;
            case 1:
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                if (!(element2 instanceof ThreadContextElement)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? element2 : Integer.valueOf(iIntValue + 1);
            default:
                return (ThreadState) obj;
        }
    }
}

package kotlinx.coroutines;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class AwaitKt$joinAll$3 extends ContinuationImpl {
    public Iterator L$0;
    public int label;
    public Object result;

    @Override
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return JobKt.joinAll((Collection) null, this);
    }
}

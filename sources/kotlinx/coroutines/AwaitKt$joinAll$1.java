package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class AwaitKt$joinAll$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public Object[] L$0;
    public int label;
    public Object result;

    @Override
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return JobKt.joinAll((Job[]) null, this);
    }
}

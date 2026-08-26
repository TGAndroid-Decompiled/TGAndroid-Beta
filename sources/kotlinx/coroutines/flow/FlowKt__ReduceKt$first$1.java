package kotlinx.coroutines.flow;

import com.google.firebase.sessions.SessionDatastoreImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class FlowKt__ReduceKt$first$1 extends ContinuationImpl {
    public Ref$ObjectRef L$0;
    public SessionDatastoreImpl.AnonymousClass1.C00001 L$1;
    public int label;
    public Object result;

    @Override
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowKt.first(null, this);
    }
}

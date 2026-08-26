package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceBuilderIterator;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

public final class JobSupport$children$1 extends RestrictedSuspendLambda implements Function2 {
    public Object L$0;
    public NodeList L$1;
    public LockFreeLinkedListNode L$2;
    public int label;
    public final JobSupport this$0;

    public JobSupport$children$1(Continuation continuation, JobSupport jobSupport) {
        super(continuation);
        this.this$0 = jobSupport;
    }

    @Override
    public final Continuation create(Object obj, Continuation continuation) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(continuation, this.this$0);
        jobSupport$children$1.L$0 = obj;
        return jobSupport$children$1;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((JobSupport$children$1) create((SequenceBuilderIterator) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

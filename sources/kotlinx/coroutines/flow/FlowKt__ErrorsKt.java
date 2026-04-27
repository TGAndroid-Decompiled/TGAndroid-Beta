package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.Job;

abstract class FlowKt__ErrorsKt {

    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.catchImpl(null, null, this);
        }
    }

    public static final Flow m330catch(Flow flow, Function3 function3) {
        return new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(flow, function3);
    }

    public static final java.lang.Object catchImpl(kotlinx.coroutines.flow.Flow r4, kotlinx.coroutines.flow.FlowCollector r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt.catchImpl(kotlinx.coroutines.flow.Flow, kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static final class AnonymousClass2 implements FlowCollector {
        final FlowCollector $collector;
        final Ref$ObjectRef $fromDownstream;

        AnonymousClass2(FlowCollector flowCollector, Ref$ObjectRef ref$ObjectRef) {
            this.$collector = flowCollector;
            this.$fromDownstream = ref$ObjectRef;
        }

        @Override
        public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    private static final boolean isSameExceptionAs$FlowKt__ErrorsKt(Throwable th, Throwable th2) {
        return th2 != null && Intrinsics.areEqual(th2, th);
    }

    private static final boolean isCancellationCause$FlowKt__ErrorsKt(Throwable th, CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.get(Job.Key);
        if (job == null || !job.isCancelled()) {
            return false;
        }
        return isSameExceptionAs$FlowKt__ErrorsKt(th, job.getCancellationException());
    }
}

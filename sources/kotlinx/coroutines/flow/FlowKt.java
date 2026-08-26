package kotlinx.coroutines.flow;

import com.google.firebase.sessions.SessionDatastoreImpl;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

public abstract class FlowKt {
    public static final Symbol NONE = new Symbol("NONE", 0);
    public static final Symbol PENDING = new Symbol("PENDING", 0);

    public static final Serializable catchImpl(Flow flow, FlowCollector flowCollector, ContinuationImpl continuationImpl) {
        FlowKt__ErrorsKt$catchImpl$1 flowKt__ErrorsKt$catchImpl$1;
        Ref$ObjectRef ref$ObjectRef;
        Job job;
        CancellationException cancellationException;
        if (continuationImpl instanceof FlowKt__ErrorsKt$catchImpl$1) {
            flowKt__ErrorsKt$catchImpl$1 = (FlowKt__ErrorsKt$catchImpl$1) continuationImpl;
            int i = flowKt__ErrorsKt$catchImpl$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$catchImpl$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(continuationImpl);
            }
        } else {
            flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(continuationImpl);
        }
        Object obj = flowKt__ErrorsKt$catchImpl$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__ErrorsKt$catchImpl$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            try {
                FlowCollector flowKt__ErrorsKt$catchImpl$2 = new FlowKt__ErrorsKt$catchImpl$2(flowCollector, ref$ObjectRef2, 0);
                flowKt__ErrorsKt$catchImpl$1.L$0 = ref$ObjectRef2;
                flowKt__ErrorsKt$catchImpl$1.label = 1;
                if (flow.collect(flowKt__ErrorsKt$catchImpl$2, flowKt__ErrorsKt$catchImpl$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return null;
            } catch (Throwable th) {
                th = th;
                ref$ObjectRef = ref$ObjectRef2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = flowKt__ErrorsKt$catchImpl$1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Throwable th3 = (Throwable) ref$ObjectRef.element;
        if ((th3 != null && th3.equals(th)) || ((job = (Job) flowKt__ErrorsKt$catchImpl$1.getContext().get(Job.Key.$$INSTANCE)) != null && job.isCancelled() && (cancellationException = job.getCancellationException()) != null && cancellationException.equals(th))) {
            throw th;
        }
        if (th3 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            ExceptionsKt.addSuppressed(th3, th);
            throw th3;
        }
        ExceptionsKt.addSuppressed(th, th3);
        throw th;
    }

    public static final Object first(Flow flow, ContinuationImpl continuationImpl) {
        FlowKt__ReduceKt$first$1 flowKt__ReduceKt$first$1;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        SessionDatastoreImpl.AnonymousClass1.C00001 c00001;
        if (continuationImpl instanceof FlowKt__ReduceKt$first$1) {
            flowKt__ReduceKt$first$1 = (FlowKt__ReduceKt$first$1) continuationImpl;
            int i = flowKt__ReduceKt$first$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(continuationImpl);
            }
        } else {
            flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(continuationImpl);
        }
        Object obj = flowKt__ReduceKt$first$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__ReduceKt$first$1.label;
        Symbol symbol = NullSurrogateKt.NULL;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.element = symbol;
            SessionDatastoreImpl.AnonymousClass1.C00001 c00002 = new SessionDatastoreImpl.AnonymousClass1.C00001(ref$ObjectRef2, 2);
            try {
                flowKt__ReduceKt$first$1.L$0 = ref$ObjectRef2;
                flowKt__ReduceKt$first$1.L$1 = c00002;
                flowKt__ReduceKt$first$1.label = 1;
                if (flow.collect(c00002, flowKt__ReduceKt$first$1) == obj2) {
                    return obj2;
                }
                ref$ObjectRef = ref$ObjectRef2;
            } catch (AbortFlowException e2) {
                ref$ObjectRef = ref$ObjectRef2;
                e = e2;
                c00001 = c00002;
                if (e.owner != c00001) {
                    throw e;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c00001 = flowKt__ReduceKt$first$1.L$1;
            ref$ObjectRef = flowKt__ReduceKt$first$1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                if (e.owner != c00001) {
                    throw e;
                }
            }
        }
        Object obj3 = ref$ObjectRef.element;
        if (obj3 != symbol) {
            return obj3;
        }
        throw new NoSuchElementException("Expected at least one element");
    }
}

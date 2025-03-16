package kotlinx.coroutines.flow.internal;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;

public final class SafeCollector extends ContinuationImpl implements FlowCollector, CoroutineStackFrame {
    public final CoroutineContext collectContext;
    public final int collectContextSize;
    public final FlowCollector collector;
    private Continuation completion;
    private CoroutineContext lastEmissionContext;

    public SafeCollector(FlowCollector flowCollector, CoroutineContext coroutineContext) {
        super(NoOpContinuation.INSTANCE, EmptyCoroutineContext.INSTANCE);
        this.collector = flowCollector;
        this.collectContext = coroutineContext;
        this.collectContextSize = ((Number) coroutineContext.fold(0, new Function2() {
            public final Integer invoke(int i, CoroutineContext.Element element) {
                return Integer.valueOf(i + 1);
            }

            @Override
            public Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (CoroutineContext.Element) obj2);
            }
        })).intValue();
    }

    private final void checkContext(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, Object obj) {
        if (coroutineContext2 instanceof DownstreamExceptionContext) {
            exceptionTransparencyViolated((DownstreamExceptionContext) coroutineContext2, obj);
        }
        SafeCollector_commonKt.checkContext(this, coroutineContext);
    }

    private final Object emit(Continuation continuation, Object obj) {
        Function3 function3;
        Object coroutine_suspended;
        CoroutineContext context = continuation.getContext();
        JobKt.ensureActive(context);
        CoroutineContext coroutineContext = this.lastEmissionContext;
        if (coroutineContext != context) {
            checkContext(context, coroutineContext, obj);
            this.lastEmissionContext = context;
        }
        this.completion = continuation;
        function3 = SafeCollectorKt.emitFun;
        FlowCollector flowCollector = this.collector;
        Intrinsics.checkNotNull(flowCollector, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object invoke = function3.invoke(flowCollector, obj, this);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (!Intrinsics.areEqual(invoke, coroutine_suspended)) {
            this.completion = null;
        }
        return invoke;
    }

    private final void exceptionTransparencyViolated(DownstreamExceptionContext downstreamExceptionContext, Object obj) {
        String trimIndent;
        trimIndent = StringsKt__IndentKt.trimIndent("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + downstreamExceptionContext.e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(trimIndent.toString());
    }

    @Override
    public Object emit(Object obj, Continuation continuation) {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        try {
            Object emit = emit(continuation, obj);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (emit == coroutine_suspended) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return emit == coroutine_suspended2 ? emit : Unit.INSTANCE;
        } catch (Throwable th) {
            this.lastEmissionContext = new DownstreamExceptionContext(th, continuation.getContext());
            throw th;
        }
    }

    @Override
    public CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.completion;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.lastEmissionContext;
        return coroutineContext == null ? EmptyCoroutineContext.INSTANCE : coroutineContext;
    }

    @Override
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override
    public Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Throwable m211exceptionOrNullimpl = Result.m211exceptionOrNullimpl(obj);
        if (m211exceptionOrNullimpl != null) {
            this.lastEmissionContext = new DownstreamExceptionContext(m211exceptionOrNullimpl, getContext());
        }
        Continuation continuation = this.completion;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return coroutine_suspended;
    }

    @Override
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}

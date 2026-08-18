package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

public abstract class BaseContinuationImpl implements Continuation, CoroutineStackFrame, Serializable {
    private final Continuation completion;

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    public BaseContinuationImpl(Continuation continuation) {
        this.completion = continuation;
    }

    public final Continuation getCompletion() {
        return this.completion;
    }

    @Override
    public final void resumeWith(Object obj) {
        Continuation continuation = this;
        while (true) {
            DebugProbesKt.probeCoroutineResumed(continuation);
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) continuation;
            Continuation continuation2 = baseContinuationImpl.completion;
            Intrinsics.checkNotNull(continuation2);
            try {
                Object objInvokeSuspend = baseContinuationImpl.invokeSuspend(obj);
                if (objInvokeSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return;
                } else {
                    obj = Result.m283constructorimpl(objInvokeSuspend);
                }
            } catch (Throwable th) {
                Result.Companion companion = Result.Companion;
                obj = Result.m283constructorimpl(ResultKt.createFailure(th));
            }
            baseContinuationImpl.releaseIntercepted();
            if (!(continuation2 instanceof BaseContinuationImpl)) {
                continuation2.resumeWith(obj);
                return;
            }
            continuation = continuation2;
        }
    }

    public Continuation create(Continuation completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public Continuation create(Object obj, Continuation completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    @Override
    public CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.completion;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    public StackTraceElement getStackTraceElement() {
        return DebugMetadataKt.getStackTraceElement(this);
    }
}

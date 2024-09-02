package kotlinx.coroutines.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CompletionStateKt;

public class ScopeCoroutine<T> extends AbstractCoroutine<T> implements CoroutineStackFrame {
    public final Continuation<T> uCont;

    @Override
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override
    protected final boolean isScopedCoroutine() {
        return true;
    }

    @Override
    public final CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.uCont;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override
    public void afterCompletion(Object obj) {
        Continuation intercepted;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(this.uCont);
        DispatchedContinuationKt.resumeCancellableWith$default(intercepted, CompletionStateKt.recoverResult(obj, this.uCont), null, 2, null);
    }

    @Override
    protected void afterResume(Object obj) {
        Continuation<T> continuation = this.uCont;
        continuation.resumeWith(CompletionStateKt.recoverResult(obj, continuation));
    }
}

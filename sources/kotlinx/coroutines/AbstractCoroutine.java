package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

public abstract class AbstractCoroutine<T> extends JobSupport implements Job, Continuation<T> {
    private final CoroutineContext context;

    protected void onCancelled(Throwable th, boolean z) {
    }

    protected void onCompleted(T t) {
    }

    @Override
    public final CoroutineContext getContext() {
        return this.context;
    }

    @Override
    public boolean isActive() {
        return super.isActive();
    }

    @Override
    public String cancellationExceptionMessage() {
        return Intrinsics.stringPlus(DebugStringsKt.getClassSimpleName(this), " was cancelled");
    }

    @Override
    protected final void onCompletionInternal(Object obj) {
        if (obj instanceof CompletedExceptionally) {
            CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
            onCancelled(completedExceptionally.cause, completedExceptionally.getHandled());
        } else {
            onCompleted(obj);
        }
    }

    @Override
    public final void resumeWith(Object obj) {
        Object makeCompletingOnce$kotlinx_coroutines_core = makeCompletingOnce$kotlinx_coroutines_core(CompletionStateKt.toState$default(obj, null, 1, null));
        if (makeCompletingOnce$kotlinx_coroutines_core == JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            return;
        }
        afterResume(makeCompletingOnce$kotlinx_coroutines_core);
    }

    protected void afterResume(Object obj) {
        afterCompletion(obj);
    }

    @Override
    public final void handleOnCompletionException$kotlinx_coroutines_core(Throwable th) {
        CoroutineExceptionHandlerKt.handleCoroutineException(this.context, th);
    }

    @Override
    public String nameString$kotlinx_coroutines_core() {
        String coroutineName = CoroutineContextKt.getCoroutineName(this.context);
        if (coroutineName == null) {
            return super.nameString$kotlinx_coroutines_core();
        }
        return '\"' + coroutineName + "\":" + super.nameString$kotlinx_coroutines_core();
    }
}

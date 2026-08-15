package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.scheduling.Task;
import kotlinx.coroutines.scheduling.TaskContext;

public abstract class DispatchedTask extends Task {
    public int resumeMode;

    public abstract void cancelCompletedResult$kotlinx_coroutines_core(Object obj, Throwable th);

    public abstract Continuation getDelegate$kotlinx_coroutines_core();

    public Object getSuccessfulResult$kotlinx_coroutines_core(Object obj) {
        return obj;
    }

    public abstract Object takeState$kotlinx_coroutines_core();

    public DispatchedTask(int i) {
        this.resumeMode = i;
    }

    public Throwable getExceptionalResult$kotlinx_coroutines_core(Object obj) {
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        if (completedExceptionally != null) {
            return completedExceptionally.cause;
        }
        return null;
    }

    @Override
    public final void run() {
        Object objM283constructorimpl;
        Object objM283constructorimpl2;
        TaskContext taskContext = this.taskContext;
        try {
            Continuation delegate$kotlinx_coroutines_core = getDelegate$kotlinx_coroutines_core();
            Intrinsics.checkNotNull(delegate$kotlinx_coroutines_core, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) delegate$kotlinx_coroutines_core;
            Continuation continuation = dispatchedContinuation.continuation;
            Object obj = dispatchedContinuation.countOrElement;
            CoroutineContext context = continuation.getContext();
            Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, obj);
            UndispatchedCoroutine undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? CoroutineContextKt.updateUndispatchedCompletion(continuation, context, objUpdateThreadContext) : null;
            try {
                CoroutineContext context2 = continuation.getContext();
                Object objTakeState$kotlinx_coroutines_core = takeState$kotlinx_coroutines_core();
                Throwable exceptionalResult$kotlinx_coroutines_core = getExceptionalResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core);
                Job job = (exceptionalResult$kotlinx_coroutines_core == null && DispatchedTaskKt.isCancellableMode(this.resumeMode)) ? (Job) context2.get(Job.Key) : null;
                if (job != null && !job.isActive()) {
                    CancellationException cancellationException = job.getCancellationException();
                    cancelCompletedResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core, cancellationException);
                    Result.Companion companion = Result.Companion;
                    continuation.resumeWith(Result.m283constructorimpl(ResultKt.createFailure(cancellationException)));
                } else if (exceptionalResult$kotlinx_coroutines_core != null) {
                    Result.Companion companion2 = Result.Companion;
                    continuation.resumeWith(Result.m283constructorimpl(ResultKt.createFailure(exceptionalResult$kotlinx_coroutines_core)));
                } else {
                    Result.Companion companion3 = Result.Companion;
                    continuation.resumeWith(Result.m283constructorimpl(getSuccessfulResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core)));
                }
                Unit unit = Unit.INSTANCE;
                if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                    ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                }
                try {
                    taskContext.afterTask();
                    objM283constructorimpl2 = Result.m283constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion4 = Result.Companion;
                    objM283constructorimpl2 = Result.m283constructorimpl(ResultKt.createFailure(th));
                }
                handleFatalException$kotlinx_coroutines_core(null, Result.m285exceptionOrNullimpl(objM283constructorimpl2));
            } catch (Throwable th2) {
                if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                    ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                Result.Companion companion5 = Result.Companion;
                taskContext.afterTask();
                objM283constructorimpl = Result.m283constructorimpl(Unit.INSTANCE);
            } catch (Throwable th4) {
                Result.Companion companion6 = Result.Companion;
                objM283constructorimpl = Result.m283constructorimpl(ResultKt.createFailure(th4));
            }
            handleFatalException$kotlinx_coroutines_core(th3, Result.m285exceptionOrNullimpl(objM283constructorimpl));
        }
    }

    public final void handleFatalException$kotlinx_coroutines_core(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            kotlin.ExceptionsKt.addSuppressed(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        Intrinsics.checkNotNull(th);
        CoroutineExceptionHandlerKt.handleCoroutineException(getDelegate$kotlinx_coroutines_core().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }
}

package kotlinx.coroutines;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.AtomicKt;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.scheduling.Task;
import kotlinx.coroutines.scheduling.TasksKt;
import org.telegram.ui.CastSync;

public abstract class DispatchedTask extends Task {
    public int resumeMode;

    public DispatchedTask(int i) {
        super(0L, TasksKt.NonBlockingContext);
        this.resumeMode = i;
    }

    public abstract void cancelCompletedResult$kotlinx_coroutines_core(Object obj, CancellationException cancellationException);

    public abstract Continuation getDelegate$kotlinx_coroutines_core();

    public Throwable getExceptionalResult$kotlinx_coroutines_core(Object obj) {
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        if (completedExceptionally != null) {
            return completedExceptionally.cause;
        }
        return null;
    }

    public Object getSuccessfulResult$kotlinx_coroutines_core(Object obj) {
        return obj;
    }

    public final void handleFatalException$kotlinx_coroutines_core(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            ExceptionsKt.addSuppressed(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        Intrinsics.checkNotNull(th);
        JobKt.handleCoroutineException(new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), getDelegate$kotlinx_coroutines_core().getContext());
    }

    @Override
    public final void run() throws IllegalAccessException, InvocationTargetException {
        Job job;
        Object objCreateFailure = Unit.INSTANCE;
        CastSync.AnonymousClass1 anonymousClass1 = this.taskContext;
        try {
            Continuation delegate$kotlinx_coroutines_core = getDelegate$kotlinx_coroutines_core();
            Intrinsics.checkNotNull(delegate$kotlinx_coroutines_core, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) delegate$kotlinx_coroutines_core;
            ContinuationImpl continuationImpl = dispatchedContinuation.continuation;
            Object obj = dispatchedContinuation.countOrElement;
            CoroutineContext context = continuationImpl.getContext();
            Object objUpdateThreadContext = AtomicKt.updateThreadContext(context, obj);
            UndispatchedCoroutine undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != AtomicKt.NO_THREAD_ELEMENTS ? JobKt.updateUndispatchedCompletion(continuationImpl, context, objUpdateThreadContext) : null;
            try {
                CoroutineContext context2 = continuationImpl.getContext();
                Object objTakeState$kotlinx_coroutines_core = takeState$kotlinx_coroutines_core();
                Throwable exceptionalResult$kotlinx_coroutines_core = getExceptionalResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core);
                if (exceptionalResult$kotlinx_coroutines_core == null) {
                    int i = this.resumeMode;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        job = (Job) context2.get(Job.Key.$$INSTANCE);
                    } else {
                        job = null;
                    }
                } else {
                    job = null;
                }
                if (job != null && !job.isActive()) {
                    CancellationException cancellationException = job.getCancellationException();
                    cancelCompletedResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core, cancellationException);
                    continuationImpl.resumeWith(ResultKt.createFailure(cancellationException));
                } else if (exceptionalResult$kotlinx_coroutines_core != null) {
                    continuationImpl.resumeWith(ResultKt.createFailure(exceptionalResult$kotlinx_coroutines_core));
                } else {
                    continuationImpl.resumeWith(getSuccessfulResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core));
                }
                if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                    AtomicKt.restoreThreadContext(context, objUpdateThreadContext);
                }
                try {
                    anonymousClass1.getClass();
                } catch (Throwable th) {
                    objCreateFailure = ResultKt.createFailure(th);
                }
                handleFatalException$kotlinx_coroutines_core(null, Result.m139exceptionOrNullimpl(objCreateFailure));
            } catch (Throwable th2) {
                if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                    AtomicKt.restoreThreadContext(context, objUpdateThreadContext);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                anonymousClass1.getClass();
            } catch (Throwable th4) {
                objCreateFailure = ResultKt.createFailure(th4);
            }
            handleFatalException$kotlinx_coroutines_core(th3, Result.m139exceptionOrNullimpl(objCreateFailure));
        }
    }

    public abstract Object takeState$kotlinx_coroutines_core();
}

package kotlinx.coroutines;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
public final class CompletionStateKt {
    public static Object toState$default(Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return toState(obj, function1);
    }

    public static final <T> Object toState(Object obj, Function1<? super Throwable, Unit> function1) {
        Throwable m157exceptionOrNullimpl = Result.m157exceptionOrNullimpl(obj);
        if (m157exceptionOrNullimpl == null) {
            return function1 != null ? new CompletedWithCancellation(obj, function1) : obj;
        }
        return new CompletedExceptionally(m157exceptionOrNullimpl, false, 2, null);
    }

    public static final <T> Object toState(Object obj, CancellableContinuation<?> cancellableContinuation) {
        Throwable m157exceptionOrNullimpl = Result.m157exceptionOrNullimpl(obj);
        if (m157exceptionOrNullimpl != null) {
            if (DebugKt.getRECOVER_STACK_TRACES() && (cancellableContinuation instanceof CoroutineStackFrame)) {
                m157exceptionOrNullimpl = StackTraceRecoveryKt.recoverFromStackFrame(m157exceptionOrNullimpl, (CoroutineStackFrame) cancellableContinuation);
            }
            obj = new CompletedExceptionally(m157exceptionOrNullimpl, false, 2, null);
        }
        return obj;
    }

    public static final <T> Object recoverResult(Object obj, Continuation<? super T> continuation) {
        if (obj instanceof CompletedExceptionally) {
            Result.Companion companion = Result.Companion;
            Throwable th = ((CompletedExceptionally) obj).cause;
            if (DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof CoroutineStackFrame)) {
                th = StackTraceRecoveryKt.recoverFromStackFrame(th, (CoroutineStackFrame) continuation);
            }
            return Result.m156constructorimpl(ResultKt.createFailure(th));
        }
        Result.Companion companion2 = Result.Companion;
        return Result.m156constructorimpl(obj);
    }
}

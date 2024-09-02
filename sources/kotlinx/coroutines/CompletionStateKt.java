package kotlinx.coroutines;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

public final class CompletionStateKt {
    public static Object toState$default(Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return toState(obj, (Function1<? super Throwable, Unit>) function1);
    }

    public static final <T> Object toState(Object obj, Function1<? super Throwable, Unit> function1) {
        Throwable m158exceptionOrNullimpl = Result.m158exceptionOrNullimpl(obj);
        if (m158exceptionOrNullimpl == null) {
            return function1 != null ? new CompletedWithCancellation(obj, function1) : obj;
        }
        return new CompletedExceptionally(m158exceptionOrNullimpl, false, 2, null);
    }

    public static final <T> Object toState(Object obj, CancellableContinuation<?> cancellableContinuation) {
        Throwable m158exceptionOrNullimpl = Result.m158exceptionOrNullimpl(obj);
        return m158exceptionOrNullimpl == null ? obj : new CompletedExceptionally(m158exceptionOrNullimpl, false, 2, null);
    }

    public static final <T> Object recoverResult(Object obj, Continuation<? super T> continuation) {
        if (obj instanceof CompletedExceptionally) {
            Result.Companion companion = Result.Companion;
            return Result.m157constructorimpl(ResultKt.createFailure(((CompletedExceptionally) obj).cause));
        }
        return Result.m157constructorimpl(obj);
    }
}

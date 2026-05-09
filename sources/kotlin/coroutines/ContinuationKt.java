package kotlin.coroutines;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public abstract class ContinuationKt {
    public static final void startCoroutine(Function2 function2, Object obj, Continuation completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Continuation continuationIntercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(function2, obj, completion));
        Result.Companion companion = Result.Companion;
        continuationIntercepted.resumeWith(Result.m307constructorimpl(Unit.INSTANCE));
    }
}

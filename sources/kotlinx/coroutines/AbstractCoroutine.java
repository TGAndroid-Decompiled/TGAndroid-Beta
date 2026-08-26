package kotlinx.coroutines;

import androidx.car.app.HostException;
import com.google.android.gms.internal.mlkit_vision_common.zzjj;
import java.lang.reflect.InvocationTargetException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.internal.AtomicKt;
import kotlinx.coroutines.intrinsics.CancellableKt;

public abstract class AbstractCoroutine extends JobSupport implements Continuation, CoroutineScope {
    public final CoroutineContext context;

    public AbstractCoroutine(CoroutineContext coroutineContext, boolean z) {
        super(z);
        initParentJob((Job) coroutineContext.get(Job.Key.$$INSTANCE));
        this.context = coroutineContext.plus(this);
    }

    @Override
    public final String cancellationExceptionMessage() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override
    public final CoroutineContext getContext() {
        return this.context;
    }

    @Override
    public final CoroutineContext getCoroutineContext() {
        return this.context;
    }

    @Override
    public final void handleOnCompletionException$kotlinx_coroutines_core(HostException hostException) throws IllegalAccessException, InvocationTargetException {
        JobKt.handleCoroutineException(hostException, this.context);
    }

    @Override
    public final void onCompletionInternal(Object obj) {
        if (obj instanceof CompletedExceptionally) {
            CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
            Throwable th = completedExceptionally.cause;
            completedExceptionally.getClass();
            CompletedExceptionally._handled$volatile$FU.get(completedExceptionally);
        }
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable thM139exceptionOrNullimpl = Result.m139exceptionOrNullimpl(obj);
        if (thM139exceptionOrNullimpl != null) {
            obj = new CompletedExceptionally(thM139exceptionOrNullimpl, false);
        }
        Object objMakeCompletingOnce$kotlinx_coroutines_core = makeCompletingOnce$kotlinx_coroutines_core(obj);
        if (objMakeCompletingOnce$kotlinx_coroutines_core == JobKt.COMPLETING_WAITING_CHILDREN) {
            return;
        }
        afterResume(objMakeCompletingOnce$kotlinx_coroutines_core);
    }

    public final void start(CoroutineStart coroutineStart, AbstractCoroutine abstractCoroutine, Function2 function2) {
        Object objInvoke;
        int iOrdinal = coroutineStart.ordinal();
        if (iOrdinal == 0) {
            CancellableKt.startCoroutineCancellable$default(function2, abstractCoroutine, this);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                Intrinsics.checkNotNullParameter(function2, "<this>");
                zzjj.intercepted(zzjj.createCoroutineUnintercepted(abstractCoroutine, this, function2)).resumeWith(Unit.INSTANCE);
                return;
            }
            if (iOrdinal != 3) {
                throw new HostException();
            }
            try {
                CoroutineContext coroutineContext = this.context;
                Object objUpdateThreadContext = AtomicKt.updateThreadContext(coroutineContext, null);
                try {
                    if (function2 instanceof BaseContinuationImpl) {
                        TypeIntrinsics.beforeCheckcastToFunctionOfArity(2, function2);
                        objInvoke = function2.invoke(abstractCoroutine, this);
                    } else {
                        Intrinsics.checkNotNullParameter(function2, "<this>");
                        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                        CoroutineContext coroutineContext2 = this.context;
                        Object intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1 = coroutineContext2 == emptyCoroutineContext ? new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1(this) : new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2(this, coroutineContext2);
                        TypeIntrinsics.beforeCheckcastToFunctionOfArity(2, function2);
                        objInvoke = function2.invoke(abstractCoroutine, intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1);
                    }
                    AtomicKt.restoreThreadContext(coroutineContext, objUpdateThreadContext);
                    if (objInvoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    AtomicKt.restoreThreadContext(coroutineContext, objUpdateThreadContext);
                    throw th;
                }
            } catch (Throwable th2) {
                resumeWith(ResultKt.createFailure(th2));
            }
        }
    }
}

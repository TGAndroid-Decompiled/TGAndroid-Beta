package kotlinx.coroutines.intrinsics;

import com.google.android.gms.internal.mlkit_vision_common.zzjf;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.internal.AtomicKt;

public abstract class CancellableKt {
    public static void startCoroutineCancellable$default(Function2 function2, AbstractCoroutine abstractCoroutine, AbstractCoroutine abstractCoroutine2) {
        try {
            AtomicKt.resumeCancellableWith(Unit.INSTANCE, zzjf.intercepted(zzjf.createCoroutineUnintercepted(abstractCoroutine, abstractCoroutine2, function2)));
        } catch (Throwable th) {
            abstractCoroutine2.resumeWith(ResultKt.createFailure(th));
            throw th;
        }
    }
}

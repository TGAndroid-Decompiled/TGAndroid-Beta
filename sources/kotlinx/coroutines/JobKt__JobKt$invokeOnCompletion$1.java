package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class JobKt__JobKt$invokeOnCompletion$1 extends FunctionReferenceImpl implements Function1 {
    @Override
    public final Object invoke(Object obj) {
        ((InternalCompletionHandler) this.receiver).invoke((Throwable) obj);
        return Unit.INSTANCE;
    }
}

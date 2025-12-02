package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

class JobKt__JobKt$invokeOnCompletion$1 extends FunctionReferenceImpl implements Function1 {
    public JobKt__JobKt$invokeOnCompletion$1(Object obj) {
        super(1, obj, InternalCompletionHandler.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
    }

    @Override
    public Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Throwable th) {
        ((InternalCompletionHandler) this.receiver).invoke(th);
    }
}

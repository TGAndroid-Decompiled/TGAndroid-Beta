package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
final class InvokeOnCancelling extends JobCancellingNode {
    private static final AtomicIntegerFieldUpdater _invoked$FU = AtomicIntegerFieldUpdater.newUpdater(InvokeOnCancelling.class, "_invoked");
    private volatile int _invoked = 0;
    private final Function1<Throwable, Unit> handler;

    @Override
    public Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    public InvokeOnCancelling(Function1<? super Throwable, Unit> function1) {
        this.handler = function1;
    }

    @Override
    public void invoke2(Throwable th) {
        if (_invoked$FU.compareAndSet(this, 0, 1)) {
            this.handler.invoke(th);
        }
    }
}

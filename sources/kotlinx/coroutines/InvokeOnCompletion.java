package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
public final class InvokeOnCompletion extends JobNode {
    private final Function1<Throwable, Unit> handler;

    @Override
    public Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    public InvokeOnCompletion(Function1<? super Throwable, Unit> function1) {
        this.handler = function1;
    }

    @Override
    public void invoke2(Throwable th) {
        this.handler.invoke(th);
    }
}

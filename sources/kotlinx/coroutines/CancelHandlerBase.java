package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
public abstract class CancelHandlerBase implements Function1<Throwable, Unit> {
    public abstract void invoke(Throwable th);
}

package kotlinx.coroutines;

import java.lang.reflect.InvocationTargetException;

public class StandaloneCoroutine extends AbstractCoroutine {
    @Override
    public final boolean handleJobException(Throwable th) throws IllegalAccessException, InvocationTargetException {
        JobKt.handleCoroutineException(th, this.context);
        return true;
    }
}

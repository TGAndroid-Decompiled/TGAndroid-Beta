package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

public final class TimeoutCancellationException extends CancellationException {
    public final transient TimeoutCoroutine coroutine;

    public TimeoutCancellationException(String str, TimeoutCoroutine timeoutCoroutine) {
        super(str);
        this.coroutine = timeoutCoroutine;
    }
}

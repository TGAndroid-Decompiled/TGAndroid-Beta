package kotlinx.coroutines;

import java.util.concurrent.Future;

final class CancelFutureOnCancel implements CancelHandler {
    private final Future future;

    public CancelFutureOnCancel(Future future) {
        this.future = future;
    }

    @Override
    public void invoke(Throwable th) {
        if (th != null) {
            this.future.cancel(false);
        }
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.future + ']';
    }
}

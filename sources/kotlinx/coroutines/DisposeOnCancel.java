package kotlinx.coroutines;

import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function1;

public final class DisposeOnCancel implements CancelHandler {
    public final int $r8$classId;
    public final Object handle;

    public DisposeOnCancel(Object obj, int i) {
        this.$r8$classId = i;
        this.handle = obj;
    }

    @Override
    public final void invoke(Throwable th) {
        switch (this.$r8$classId) {
            case 0:
                ((DisposableHandle) this.handle).dispose();
                break;
            case 1:
                if (th != null) {
                    ((ScheduledFuture) this.handle).cancel(false);
                }
                break;
            default:
                ((Function1) this.handle).invoke(th);
                break;
        }
    }

    public final String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "DisposeOnCancel[" + ((DisposableHandle) this.handle) + ']';
            case 1:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.handle) + ']';
            default:
                return "CancelHandler.UserSupplied[" + ((Function1) this.handle).getClass().getSimpleName() + '@' + JobKt.getHexAddress(this) + ']';
        }
    }
}

package ce;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f6237a;
    public final Object f6238b;

    public j(Object obj, int i10) {
        this.f6237a = i10;
        this.f6238b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f6237a) {
            case 0:
                if (th2 != null) {
                    ((ScheduledFuture) this.f6238b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((ud.l) this.f6238b).invoke(th2);
                return;
            default:
                ((p0) this.f6238b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f6237a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f6238b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((ud.l) this.f6238b).getClass().getSimpleName() + '@' + f0.k(this) + ']';
            default:
                return "DisposeOnCancel[" + ((p0) this.f6238b) + ']';
        }
    }
}

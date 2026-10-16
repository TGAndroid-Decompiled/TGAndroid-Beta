package be;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f2685a;
    public final Object f2686b;

    public j(Object obj, int i10) {
        this.f2685a = i10;
        this.f2686b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f2685a) {
            case 0:
                if (th2 != null) {
                    ((ScheduledFuture) this.f2686b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((td.l) this.f2686b).invoke(th2);
                return;
            default:
                ((p0) this.f2686b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f2685a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f2686b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((td.l) this.f2686b).getClass().getSimpleName() + '@' + f0.k(this) + ']';
            default:
                return "DisposeOnCancel[" + ((p0) this.f2686b) + ']';
        }
    }
}

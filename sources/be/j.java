package be;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f4298a;
    public final Object f4299b;

    public j(Object obj, int i10) {
        this.f4298a = i10;
        this.f4299b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f4298a) {
            case 0:
                if (th2 != null) {
                    ((ScheduledFuture) this.f4299b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((td.l) this.f4299b).invoke(th2);
                return;
            default:
                ((p0) this.f4299b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f4298a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f4299b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((td.l) this.f4299b).getClass().getSimpleName() + '@' + f0.k(this) + ']';
            default:
                return "DisposeOnCancel[" + ((p0) this.f4299b) + ']';
        }
    }
}

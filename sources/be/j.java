package be;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f2681a;
    public final Object f2682b;

    public j(Object obj, int i10) {
        this.f2681a = i10;
        this.f2682b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f2681a) {
            case 0:
                if (th2 != null) {
                    ((ScheduledFuture) this.f2682b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((td.l) this.f2682b).invoke(th2);
                return;
            default:
                ((p0) this.f2682b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f2681a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f2682b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((td.l) this.f2682b).getClass().getSimpleName() + '@' + f0.k(this) + ']';
            default:
                return "DisposeOnCancel[" + ((p0) this.f2682b) + ']';
        }
    }
}

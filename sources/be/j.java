package be;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f4301a;
    public final Object f4302b;

    public j(Object obj, int i10) {
        this.f4301a = i10;
        this.f4302b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f4301a) {
            case 0:
                if (th2 != null) {
                    ((ScheduledFuture) this.f4302b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((td.l) this.f4302b).invoke(th2);
                return;
            default:
                ((p0) this.f4302b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f4301a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f4302b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((td.l) this.f4302b).getClass().getSimpleName() + '@' + f0.k(this) + ']';
            default:
                return "DisposeOnCancel[" + ((p0) this.f4302b) + ']';
        }
    }
}

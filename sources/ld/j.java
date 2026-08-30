package ld;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f11894a;
    public final Object f11895b;

    public j(Object obj, int i10) {
        this.f11894a = i10;
        this.f11895b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f11894a) {
            case 0:
                if (th2 != null) {
                    ((ScheduledFuture) this.f11895b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((dd.l) this.f11895b).invoke(th2);
                return;
            default:
                ((o0) this.f11895b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f11894a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f11895b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((dd.l) this.f11895b).getClass().getSimpleName() + '@' + e0.k(this) + ']';
            default:
                return "DisposeOnCancel[" + ((o0) this.f11895b) + ']';
        }
    }
}

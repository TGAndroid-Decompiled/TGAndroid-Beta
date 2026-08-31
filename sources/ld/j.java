package ld;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f12323a;
    public final Object f12324b;

    public j(Object obj, int i10) {
        this.f12323a = i10;
        this.f12324b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f12323a) {
            case 0:
                if (th2 != null) {
                    ((ScheduledFuture) this.f12324b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((dd.l) this.f12324b).invoke(th2);
                return;
            default:
                ((o0) this.f12324b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f12323a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f12324b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((dd.l) this.f12324b).getClass().getSimpleName() + '@' + e0.k(this) + ']';
            default:
                return "DisposeOnCancel[" + ((o0) this.f12324b) + ']';
        }
    }
}

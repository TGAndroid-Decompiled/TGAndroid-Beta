package be;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f4296a;
    public final Object f4297b;

    public j(Object obj, int i10) {
        this.f4296a = i10;
        this.f4297b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f4296a) {
            case 0:
                if (th2 != null) {
                    ((ScheduledFuture) this.f4297b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((td.l) this.f4297b).invoke(th2);
                return;
            default:
                ((p0) this.f4297b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f4296a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f4297b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((td.l) this.f4297b).getClass().getSimpleName() + '@' + f0.k(this) + ']';
            default:
                return "DisposeOnCancel[" + ((p0) this.f4297b) + ']';
        }
    }
}

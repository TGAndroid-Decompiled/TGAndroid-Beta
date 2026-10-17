package be;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f4297a;
    public final Object f4298b;

    public j(Object obj, int i10) {
        this.f4297a = i10;
        this.f4298b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f4297a) {
            case 0:
                if (th2 != null) {
                    ((ScheduledFuture) this.f4298b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((td.l) this.f4298b).invoke(th2);
                return;
            default:
                ((p0) this.f4298b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f4297a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f4298b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((td.l) this.f4298b).getClass().getSimpleName() + '@' + f0.k(this) + ']';
            default:
                return "DisposeOnCancel[" + ((p0) this.f4298b) + ']';
        }
    }
}

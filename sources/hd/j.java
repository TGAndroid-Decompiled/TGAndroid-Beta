package hd;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f10452a;
    public final Object f10453b;

    public j(Object obj, int i9) {
        this.f10452a = i9;
        this.f10453b = obj;
    }

    @Override
    public final void a(Throwable th) {
        switch (this.f10452a) {
            case 0:
                if (th != null) {
                    ((ScheduledFuture) this.f10453b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((zc.l) this.f10453b).invoke(th);
                return;
            default:
                ((p0) this.f10453b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f10452a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f10453b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((zc.l) this.f10453b).getClass().getSimpleName() + '@' + f0.k(this) + ']';
            default:
                return "DisposeOnCancel[" + ((p0) this.f10453b) + ']';
        }
    }
}

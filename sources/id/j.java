package id;

import java.util.concurrent.ScheduledFuture;

public final class j implements k {

    public final int f11161a;

    public final Object f11162b;

    public j(Object obj, int i10) {
        this.f11161a = i10;
        this.f11162b = obj;
    }

    @Override
    public final void a(Throwable th) {
        switch (this.f11161a) {
            case 0:
                if (th != null) {
                    ((ScheduledFuture) this.f11162b).cancel(false);
                }
                break;
            case 1:
                ((ad.l) this.f11162b).invoke(th);
                break;
            default:
                ((p0) this.f11162b).dispose();
                break;
        }
    }

    public final String toString() {
        switch (this.f11161a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f11162b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((ad.l) this.f11162b).getClass().getSimpleName() + '@' + f0.k(this) + ']';
            default:
                return "DisposeOnCancel[" + ((p0) this.f11162b) + ']';
        }
    }
}

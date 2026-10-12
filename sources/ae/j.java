package ae;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f470a;
    public final Object f471b;

    public j(Object obj, int i10) {
        this.f470a = i10;
        this.f471b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f470a) {
            case 0:
                if (th2 != null) {
                    ((ScheduledFuture) this.f471b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((sd.l) this.f471b).invoke(th2);
                return;
            default:
                ((q0) this.f471b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f470a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f471b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((sd.l) this.f471b).getClass().getSimpleName() + '@' + g0.k(this) + ']';
            default:
                return "DisposeOnCancel[" + ((q0) this.f471b) + ']';
        }
    }
}

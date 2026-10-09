package ae;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f468a;
    public final Object f469b;

    public j(Object obj, int i10) {
        this.f468a = i10;
        this.f469b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f468a) {
            case 0:
                if (th2 != null) {
                    ((ScheduledFuture) this.f469b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((sd.l) this.f469b).invoke(th2);
                return;
            default:
                ((q0) this.f469b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f468a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f469b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((sd.l) this.f469b).getClass().getSimpleName() + '@' + g0.k(this) + ']';
            default:
                return "DisposeOnCancel[" + ((q0) this.f469b) + ']';
        }
    }
}

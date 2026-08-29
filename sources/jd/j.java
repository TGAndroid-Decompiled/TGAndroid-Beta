package jd;

import java.util.concurrent.ScheduledFuture;
public final class j implements k {
    public final int f11487a;
    public final Object f11488b;

    public j(Object obj, int i10) {
        this.f11487a = i10;
        this.f11488b = obj;
    }

    @Override
    public final void a(Throwable th2) {
        switch (this.f11487a) {
            case 0:
                if (th2 != null) {
                    ((ScheduledFuture) this.f11488b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((bd.l) this.f11488b).invoke(th2);
                return;
            default:
                ((o0) this.f11488b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.f11487a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f11488b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((bd.l) this.f11488b).getClass().getSimpleName() + '@' + e0.k(this) + ']';
            default:
                return "DisposeOnCancel[" + ((o0) this.f11488b) + ']';
        }
    }
}

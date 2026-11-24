package defpackage;

import java.util.concurrent.ScheduledFuture;
public final class qb1 implements rb1 {
    public final byte a;
    public final Object b;

    public qb1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(Throwable th) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ScheduledFuture) obj).cancel(false);
                return;
            case 1:
                ((rr4) obj).invoke(th);
                return;
            default:
                ((xp3) obj).dispose();
                return;
        }
    }

    public final String toString() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((rr4) obj).getClass().getSimpleName() + '@' + ea3.a(this) + ']';
            default:
                return "DisposeOnCancel[" + ((xp3) obj) + ']';
        }
    }
}

package defpackage;

import java.util.concurrent.ScheduledFuture;
public final class qa1 implements ra1 {
    public final byte a;
    public final Object b;

    public qa1(Object obj, byte b) {
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
                ((ur4) obj).invoke(th);
                return;
            default:
                ((ep3) obj).dispose();
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
                return "CancelHandler.UserSupplied[" + ((ur4) obj).getClass().getSimpleName() + '@' + l93.a(this) + ']';
            default:
                return "DisposeOnCancel[" + ((ep3) obj) + ']';
        }
    }
}

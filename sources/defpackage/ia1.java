package defpackage;

import java.util.concurrent.ScheduledFuture;
public final class ia1 implements ja1 {
    public final byte a;
    public final Object b;

    public ia1(Object obj, byte b) {
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
                ((qp4) obj).invoke(th);
                return;
            default:
                ((no3) obj).dispose();
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
                return "CancelHandler.UserSupplied[" + ((qp4) obj).getClass().getSimpleName() + '@' + s83.a(this) + ']';
            default:
                return "DisposeOnCancel[" + ((no3) obj) + ']';
        }
    }
}

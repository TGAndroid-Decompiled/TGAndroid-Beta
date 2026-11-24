package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class mc5 implements Executor {
    public final byte a;
    public final Object b;

    public mc5(Looper looper) {
        this.a = (byte) 0;
        this.b = new o59(looper, (byte) 4);
    }

    @Override
    public final void execute(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((o59) obj).post(runnable);
                return;
            case 1:
                ((ExecutorService) obj).execute(new xo9(runnable, (byte) 0));
                return;
            default:
                ((o59) obj).post(runnable);
                return;
        }
    }

    public mc5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}

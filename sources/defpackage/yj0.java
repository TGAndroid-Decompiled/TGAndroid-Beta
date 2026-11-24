package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
public final class yj0 implements Executor {
    public final byte a;
    public final Handler b;

    public yj0(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new Handler(Looper.getMainLooper());
                return;
            default:
                this.b = new Handler(Looper.getMainLooper());
                return;
        }
    }

    @Override
    public final void execute(Runnable runnable) {
        byte b = this.a;
        Handler handler = this.b;
        switch (b) {
            case 0:
                handler.post(runnable);
                return;
            case 1:
                handler.post(runnable);
                return;
            case 2:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public yj0(Handler handler, byte b) {
        this.a = b;
        this.b = handler;
    }
}

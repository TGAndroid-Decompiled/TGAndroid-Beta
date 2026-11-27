package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class ne5 implements Executor {
    public final byte a;
    public final Object b;

    public ne5(Looper looper) {
        this.a = (byte) 0;
        this.b = new b99(looper, (byte) 4);
    }

    @Override
    public final void execute(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((b99) obj).post(runnable);
                return;
            case 1:
                ((ExecutorService) obj).execute(new ps9(runnable, (byte) 0));
                return;
            default:
                ((b99) obj).post(runnable);
                return;
        }
    }

    public ne5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}

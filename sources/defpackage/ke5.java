package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
public final class ke5 implements Executor {
    public final byte a;
    public final Object b;

    public ke5(Looper looper) {
        this.a = (byte) 0;
        this.b = new q79(looper, (byte) 4);
    }

    @Override
    public final void execute(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((q79) obj).post(runnable);
                return;
            case 1:
                ((ExecutorService) obj).execute(new yq9(runnable, (byte) 0));
                return;
            default:
                ((q79) obj).post(runnable);
                return;
        }
    }

    public ke5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}

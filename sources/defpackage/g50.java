package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class g50 implements Executor {
    public final byte a;
    public final Handler b;

    public g50(Handler handler, byte b) {
        this.a = b;
        this.b = handler;
    }

    @Override
    public final void execute(Runnable runnable) {
        byte b = this.a;
        this.b.post(runnable);
    }
}

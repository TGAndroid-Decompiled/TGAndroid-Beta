package c2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class f implements Executor {
    public final int f1936a;
    public final Handler f1937b;

    public f(Handler handler, int i10) {
        this.f1936a = i10;
        this.f1937b = handler;
    }

    @Override
    public final void execute(Runnable runnable) {
        Handler handler;
        switch (this.f1936a) {
            case 0:
                handler = this.f1937b;
                break;
            default:
                handler = (b) this.f1937b;
                break;
        }
        handler.post(runnable);
    }
}

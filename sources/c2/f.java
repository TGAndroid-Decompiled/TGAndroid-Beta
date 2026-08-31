package c2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class f implements Executor {
    public final int f2103a;
    public final Handler f2104b;

    public f(Handler handler, int i10) {
        this.f2103a = i10;
        this.f2104b = handler;
    }

    @Override
    public final void execute(Runnable runnable) {
        Handler handler;
        switch (this.f2103a) {
            case 0:
                handler = this.f2104b;
                break;
            default:
                handler = (b) this.f2104b;
                break;
        }
        handler.post(runnable);
    }
}

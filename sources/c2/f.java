package c2;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class f implements Executor {

    public final int f2278a;

    public final Handler f2279b;

    public f(Handler handler, int i10) {
        this.f2278a = i10;
        this.f2279b = handler;
    }

    @Override
    public final void execute(Runnable runnable) {
        Handler handler;
        switch (this.f2278a) {
            case 0:
                handler = this.f2279b;
                break;
            default:
                handler = (b) this.f2279b;
                break;
        }
        handler.post(runnable);
    }
}

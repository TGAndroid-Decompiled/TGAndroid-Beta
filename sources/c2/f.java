package c2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class f implements Executor {
    public final int f2831a;
    public final Handler f2832b;

    public f(Handler handler, int i10) {
        this.f2831a = i10;
        this.f2832b = handler;
    }

    @Override
    public final void execute(Runnable runnable) {
        Handler handler;
        switch (this.f2831a) {
            case 0:
                handler = this.f2832b;
                break;
            default:
                handler = (b) this.f2832b;
                break;
        }
        handler.post(runnable);
    }
}

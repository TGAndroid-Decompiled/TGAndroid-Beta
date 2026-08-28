package c2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class f implements Executor {
    public final int f2161a;
    public final Handler f2162b;

    public f(Handler handler, int i9) {
        this.f2161a = i9;
        this.f2162b = handler;
    }

    @Override
    public final void execute(Runnable runnable) {
        Handler handler;
        switch (this.f2161a) {
            case 0:
                handler = this.f2162b;
                break;
            default:
                handler = (b) this.f2162b;
                break;
        }
        handler.post(runnable);
    }
}

package c2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class f implements Executor {
    public final int f1963a;
    public final Handler f1964b;

    public f(Handler handler, int i10) {
        this.f1963a = i10;
        this.f1964b = handler;
    }

    @Override
    public final void execute(Runnable runnable) {
        Handler handler;
        switch (this.f1963a) {
            case 0:
                handler = this.f1964b;
                break;
            default:
                handler = (b) this.f1964b;
                break;
        }
        handler.post(runnable);
    }
}

package k2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class b0 implements Executor {
    public final int f13221a;
    public final Object f13222b;

    public b0(Object obj, int i10) {
        this.f13221a = i10;
        this.f13222b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f13221a) {
            case 0:
                ((Handler) this.f13222b).post(runnable);
                return;
            case 1:
                e2.d0.U(((m4.a0) this.f13222b).f14684l, runnable);
                return;
            default:
                ((p4.b) this.f13222b).post(runnable);
                return;
        }
    }
}

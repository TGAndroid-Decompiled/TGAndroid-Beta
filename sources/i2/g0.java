package i2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class g0 implements Executor {
    public final int f7865a;
    public final Object f7866b;

    public g0(Object obj, int i10) {
        this.f7865a = i10;
        this.f7866b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f7865a) {
            case 0:
                ((e2.i0) this.f7866b).d(runnable);
                return;
            case 1:
                ((Handler) this.f7866b).post(runnable);
                return;
            case 2:
                e2.l0.W(((m4.f0) this.f7866b).f12747l, runnable);
                return;
            default:
                ((p4.b) this.f7866b).post(runnable);
                return;
        }
    }
}

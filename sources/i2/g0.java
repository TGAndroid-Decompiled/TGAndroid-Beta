package i2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class g0 implements Executor {
    public final int f12359a;
    public final Object f12360b;

    public g0(Object obj, int i10) {
        this.f12359a = i10;
        this.f12360b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f12359a) {
            case 0:
                ((e2.i0) this.f12360b).d(runnable);
                return;
            case 1:
                ((Handler) this.f12360b).post(runnable);
                return;
            case 2:
                e2.m0.W(((m4.f0) this.f12360b).f16528l, runnable);
                return;
            default:
                ((p4.b) this.f12360b).post(runnable);
                return;
        }
    }
}

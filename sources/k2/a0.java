package k2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class a0 implements Executor {
    public final int f14407a;
    public final Object f14408b;

    public a0(Object obj, int i10) {
        this.f14407a = i10;
        this.f14408b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f14407a) {
            case 0:
                ((Handler) this.f14408b).post(runnable);
                return;
            case 1:
                e2.d0.T(((m4.b0) this.f14408b).f15993l, runnable);
                return;
            default:
                ((p4.b) this.f14408b).post(runnable);
                return;
        }
    }
}

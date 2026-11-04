package k2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class g0 implements Executor {
    public final int f16507a;
    public final Object f16508b;

    public g0(Object obj, int i3) {
        this.f16507a = i3;
        this.f16508b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f16507a) {
            case 0:
                ((g2.j0) this.f16508b).d(runnable);
                return;
            case 1:
                ((Handler) this.f16508b).post(runnable);
                return;
            case 2:
                g2.n0.W(((o4.e0) this.f16508b).f20628l, runnable);
                return;
            default:
                ((r4.b) this.f16508b).post(runnable);
                return;
        }
    }
}

package l2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class e0 implements Executor {
    public final int f19385a;
    public final Object f19386b;

    public e0(Object obj, int i7) {
        this.f19385a = i7;
        this.f19386b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f19385a) {
            case 0:
                ((h2.i0) this.f19386b).d(runnable);
                return;
            case 1:
                ((Handler) this.f19386b).post(runnable);
                return;
            case 2:
                h2.l0.W(((p4.d0) this.f19386b).f55316l, runnable);
                return;
            default:
                ((s4.b) this.f19386b).post(runnable);
                return;
        }
    }
}

package l2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class d0 implements Executor {
    public final int f19315a;
    public final Object f19316b;

    public d0(Object obj, int i7) {
        this.f19315a = i7;
        this.f19316b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f19315a) {
            case 0:
                ((h2.i0) this.f19316b).d(runnable);
                return;
            case 1:
                ((Handler) this.f19316b).post(runnable);
                return;
            case 2:
                h2.l0.W(((p4.e0) this.f19316b).f55241l, runnable);
                return;
            default:
                ((s4.b) this.f19316b).post(runnable);
                return;
        }
    }
}

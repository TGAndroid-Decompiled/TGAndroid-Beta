package l2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class d0 implements Executor {
    public final int f19287a;
    public final Object f19288b;

    public d0(Object obj, int i7) {
        this.f19287a = i7;
        this.f19288b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f19287a) {
            case 0:
                ((h2.i0) this.f19288b).d(runnable);
                return;
            case 1:
                ((Handler) this.f19288b).post(runnable);
                return;
            case 2:
                h2.l0.W(((p4.d0) this.f19288b).f55187l, runnable);
                return;
            default:
                ((s4.b) this.f19288b).post(runnable);
                return;
        }
    }
}

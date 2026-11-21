package l2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class d0 implements Executor {
    public final int f19312a;
    public final Object f19313b;

    public d0(Object obj, int i7) {
        this.f19312a = i7;
        this.f19313b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f19312a) {
            case 0:
                ((h2.i0) this.f19313b).d(runnable);
                return;
            case 1:
                ((Handler) this.f19313b).post(runnable);
                return;
            case 2:
                h2.l0.W(((p4.e0) this.f19313b).f55237l, runnable);
                return;
            default:
                ((s4.b) this.f19313b).post(runnable);
                return;
        }
    }
}

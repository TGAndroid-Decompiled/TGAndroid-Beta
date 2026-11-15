package l2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class d0 implements Executor {
    public final int f18920a;
    public final Object f18921b;

    public d0(Object obj, int i7) {
        this.f18920a = i7;
        this.f18921b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f18920a) {
            case 0:
                ((h2.i0) this.f18921b).d(runnable);
                return;
            case 1:
                ((Handler) this.f18921b).post(runnable);
                return;
            case 2:
                h2.l0.W(((p4.d0) this.f18921b).f54627l, runnable);
                return;
            default:
                ((s4.b) this.f18921b).post(runnable);
                return;
        }
    }
}

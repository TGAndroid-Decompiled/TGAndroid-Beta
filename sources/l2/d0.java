package l2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class d0 implements Executor {
    public final int f19281a;
    public final Object f19282b;

    public d0(Object obj, int i7) {
        this.f19281a = i7;
        this.f19282b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f19281a) {
            case 0:
                ((h2.i0) this.f19282b).d(runnable);
                return;
            case 1:
                ((Handler) this.f19282b).post(runnable);
                return;
            case 2:
                h2.l0.W(((p4.d0) this.f19282b).f55197l, runnable);
                return;
            default:
                ((s4.b) this.f19282b).post(runnable);
                return;
        }
    }
}

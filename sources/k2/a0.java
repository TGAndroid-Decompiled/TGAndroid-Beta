package k2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class a0 implements Executor {
    public final int f14540a;
    public final Object f14541b;

    public a0(Object obj, int i10) {
        this.f14540a = i10;
        this.f14541b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f14540a) {
            case 0:
                ((Handler) this.f14541b).post(runnable);
                return;
            case 1:
                e2.d0.U(((m4.a0) this.f14541b).f15862l, runnable);
                return;
            default:
                ((p4.b) this.f14541b).post(runnable);
                return;
        }
    }
}

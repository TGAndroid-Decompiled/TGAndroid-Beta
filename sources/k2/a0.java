package k2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class a0 implements Executor {
    public final int f14406a;
    public final Object f14407b;

    public a0(Object obj, int i10) {
        this.f14406a = i10;
        this.f14407b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f14406a) {
            case 0:
                ((Handler) this.f14407b).post(runnable);
                return;
            case 1:
                e2.d0.T(((m4.b0) this.f14407b).f16050l, runnable);
                return;
            default:
                ((p4.b) this.f14407b).post(runnable);
                return;
        }
    }
}

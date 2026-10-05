package k2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class c0 implements Executor {
    public final int f14382a;
    public final Object f14383b;

    public c0(Object obj, int i10) {
        this.f14382a = i10;
        this.f14383b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f14382a) {
            case 0:
                ((Handler) this.f14383b).post(runnable);
                return;
            case 1:
                e2.d0.U(((m4.a0) this.f14383b).f16054l, runnable);
                return;
            default:
                ((p4.b) this.f14383b).post(runnable);
                return;
        }
    }
}

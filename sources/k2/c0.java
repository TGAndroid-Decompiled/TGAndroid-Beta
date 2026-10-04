package k2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class c0 implements Executor {
    public final int f14381a;
    public final Object f14382b;

    public c0(Object obj, int i10) {
        this.f14381a = i10;
        this.f14382b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f14381a) {
            case 0:
                ((Handler) this.f14382b).post(runnable);
                return;
            case 1:
                e2.d0.U(((m4.a0) this.f14382b).f16045l, runnable);
                return;
            default:
                ((p4.b) this.f14382b).post(runnable);
                return;
        }
    }
}

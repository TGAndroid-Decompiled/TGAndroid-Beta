package k2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class c0 implements Executor {
    public final int f13237a;
    public final Object f13238b;

    public c0(Object obj, int i10) {
        this.f13237a = i10;
        this.f13238b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f13237a) {
            case 0:
                ((Handler) this.f13238b).post(runnable);
                return;
            case 1:
                e2.d0.U(((m4.a0) this.f13238b).f14679l, runnable);
                return;
            default:
                ((p4.b) this.f13238b).post(runnable);
                return;
        }
    }
}

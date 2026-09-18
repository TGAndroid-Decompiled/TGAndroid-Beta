package k2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class c0 implements Executor {
    public final int f13236a;
    public final Object f13237b;

    public c0(Object obj, int i10) {
        this.f13236a = i10;
        this.f13237b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f13236a) {
            case 0:
                ((Handler) this.f13237b).post(runnable);
                return;
            case 1:
                e2.d0.U(((m4.a0) this.f13237b).f14643l, runnable);
                return;
            default:
                ((p4.b) this.f13237b).post(runnable);
                return;
        }
    }
}

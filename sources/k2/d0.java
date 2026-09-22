package k2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class d0 implements Executor {
    public final int f13240a;
    public final Object f13241b;

    public d0(Object obj, int i10) {
        this.f13240a = i10;
        this.f13241b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f13240a) {
            case 0:
                ((Handler) this.f13241b).post(runnable);
                return;
            case 1:
                e2.d0.U(((m4.a0) this.f13241b).f14456l, runnable);
                return;
            default:
                ((p4.b) this.f13241b).post(runnable);
                return;
        }
    }
}

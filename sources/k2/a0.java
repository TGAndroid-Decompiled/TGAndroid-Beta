package k2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class a0 implements Executor {
    public final int f14404a;
    public final Object f14405b;

    public a0(Object obj, int i10) {
        this.f14404a = i10;
        this.f14405b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f14404a) {
            case 0:
                ((Handler) this.f14405b).post(runnable);
                return;
            case 1:
                e2.d0.T(((m4.c0) this.f14405b).f15741l, runnable);
                return;
            default:
                ((p4.b) this.f14405b).post(runnable);
                return;
        }
    }
}

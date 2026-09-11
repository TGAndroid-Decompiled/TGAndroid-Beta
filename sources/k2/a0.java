package k2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class a0 implements Executor {
    public final int f14514a;
    public final Object f14515b;

    public a0(Object obj, int i10) {
        this.f14514a = i10;
        this.f14515b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f14514a) {
            case 0:
                ((Handler) this.f14515b).post(runnable);
                return;
            case 1:
                e2.d0.U(((m4.a0) this.f14515b).f15835l, runnable);
                return;
            default:
                ((p4.b) this.f14515b).post(runnable);
                return;
        }
    }
}

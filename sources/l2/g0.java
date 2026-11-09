package l2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class g0 implements Executor {
    public final int f17819a;
    public final Object f17820b;

    public g0(Object obj, int i7) {
        this.f17819a = i7;
        this.f17820b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f17819a) {
            case 0:
                ((h2.i0) this.f17820b).d(runnable);
                return;
            case 1:
                ((Handler) this.f17820b).post(runnable);
                return;
            case 2:
                h2.m0.W(((p4.d0) this.f17820b).f53222l, runnable);
                return;
            default:
                ((s4.b) this.f17820b).post(runnable);
                return;
        }
    }
}

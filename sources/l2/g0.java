package l2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class g0 implements Executor {
    public final int f17821a;
    public final Object f17822b;

    public g0(Object obj, int i7) {
        this.f17821a = i7;
        this.f17822b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f17821a) {
            case 0:
                ((h2.i0) this.f17822b).d(runnable);
                return;
            case 1:
                ((Handler) this.f17822b).post(runnable);
                return;
            case 2:
                h2.m0.W(((p4.d0) this.f17822b).f53209l, runnable);
                return;
            default:
                ((s4.b) this.f17822b).post(runnable);
                return;
        }
    }
}

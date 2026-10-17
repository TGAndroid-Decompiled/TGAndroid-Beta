package i2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class e0 implements Executor {
    public final int f12353a;
    public final Object f12354b;

    public e0(Object obj, int i10) {
        this.f12353a = i10;
        this.f12354b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f12353a) {
            case 0:
                ((e2.i0) this.f12354b).d(runnable);
                return;
            case 1:
                ((Handler) this.f12354b).post(runnable);
                return;
            case 2:
                e2.m0.W(((m4.f0) this.f12354b).f16520l, runnable);
                return;
            default:
                ((p4.b) this.f12354b).post(runnable);
                return;
        }
    }
}

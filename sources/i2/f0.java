package i2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class f0 implements Executor {
    public final int f12354a;
    public final Object f12355b;

    public f0(Object obj, int i10) {
        this.f12354a = i10;
        this.f12355b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f12354a) {
            case 0:
                ((e2.i0) this.f12355b).d(runnable);
                return;
            case 1:
                ((Handler) this.f12355b).post(runnable);
                return;
            case 2:
                e2.m0.W(((m4.f0) this.f12355b).f16525l, runnable);
                return;
            default:
                ((p4.b) this.f12355b).post(runnable);
                return;
        }
    }
}

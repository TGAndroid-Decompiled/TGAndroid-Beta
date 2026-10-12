package i2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class f0 implements Executor {
    public final int f10956a;
    public final Object f10957b;

    public f0(Object obj, int i10) {
        this.f10956a = i10;
        this.f10957b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f10956a) {
            case 0:
                ((e2.i0) this.f10957b).d(runnable);
                return;
            case 1:
                ((Handler) this.f10957b).post(runnable);
                return;
            case 2:
                e2.m0.W(((m4.f0) this.f10957b).f15432l, runnable);
                return;
            default:
                ((p4.b) this.f10957b).post(runnable);
                return;
        }
    }
}

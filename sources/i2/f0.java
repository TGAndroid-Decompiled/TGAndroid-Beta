package i2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class f0 implements Executor {
    public final int f12356a;
    public final Object f12357b;

    public f0(Object obj, int i10) {
        this.f12356a = i10;
        this.f12357b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f12356a) {
            case 0:
                ((e2.i0) this.f12357b).d(runnable);
                return;
            case 1:
                ((Handler) this.f12357b).post(runnable);
                return;
            case 2:
                e2.m0.W(((m4.f0) this.f12357b).f16527l, runnable);
                return;
            default:
                ((p4.b) this.f12357b).post(runnable);
                return;
        }
    }
}

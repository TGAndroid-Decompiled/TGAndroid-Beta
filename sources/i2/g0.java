package i2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class g0 implements Executor {
    public final int f12357a;
    public final Object f12358b;

    public g0(Object obj, int i10) {
        this.f12357a = i10;
        this.f12358b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f12357a) {
            case 0:
                ((e2.i0) this.f12358b).d(runnable);
                return;
            case 1:
                ((Handler) this.f12358b).post(runnable);
                return;
            case 2:
                e2.m0.W(((m4.f0) this.f12358b).f16526l, runnable);
                return;
            default:
                ((p4.b) this.f12358b).post(runnable);
                return;
        }
    }
}

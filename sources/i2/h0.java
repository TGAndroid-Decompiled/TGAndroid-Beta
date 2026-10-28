package i2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class h0 implements Executor {
    public final int f13552a;
    public final Object f13553b;

    public h0(Object obj, int i10) {
        this.f13552a = i10;
        this.f13553b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f13552a) {
            case 0:
                ((e2.i0) this.f13553b).d(runnable);
                return;
            case 1:
                ((Handler) this.f13553b).post(runnable);
                return;
            case 2:
                e2.n0.W(((m4.f0) this.f13553b).f18048l, runnable);
                return;
            default:
                ((p4.b) this.f13553b).post(runnable);
                return;
        }
    }
}

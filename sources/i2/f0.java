package i2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class f0 implements Executor {
    public final int f10960a;
    public final Object f10961b;

    public f0(Object obj, int i10) {
        this.f10960a = i10;
        this.f10961b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f10960a) {
            case 0:
                ((e2.i0) this.f10961b).d(runnable);
                return;
            case 1:
                ((Handler) this.f10961b).post(runnable);
                return;
            case 2:
                e2.m0.W(((m4.e0) this.f10961b).f15162l, runnable);
                return;
            default:
                ((p4.b) this.f10961b).post(runnable);
                return;
        }
    }
}

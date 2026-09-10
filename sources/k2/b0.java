package k2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class b0 implements Executor {
    public final int f12076a;
    public final Object f12077b;

    public b0(Object obj, int i10) {
        this.f12076a = i10;
        this.f12077b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f12076a) {
            case 0:
                ((Handler) this.f12077b).post(runnable);
                return;
            case 1:
                e2.d0.U(((m4.b0) this.f12077b).f13299l, runnable);
                return;
            default:
                ((p4.b) this.f12077b).post(runnable);
                return;
        }
    }
}

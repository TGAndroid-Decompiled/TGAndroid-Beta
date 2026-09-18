package k2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class d0 implements Executor {
    public final int f13241a;
    public final Object f13242b;

    public d0(Object obj, int i10) {
        this.f13241a = i10;
        this.f13242b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f13241a) {
            case 0:
                ((Handler) this.f13242b).post(runnable);
                return;
            case 1:
                e2.d0.U(((m4.a0) this.f13242b).f14468l, runnable);
                return;
            default:
                ((p4.b) this.f13242b).post(runnable);
                return;
        }
    }
}

package k2;

import android.os.Handler;
import java.util.concurrent.Executor;
public final class d0 implements Executor {
    public final int f13238a;
    public final Object f13239b;

    public d0(Object obj, int i10) {
        this.f13238a = i10;
        this.f13239b = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f13238a) {
            case 0:
                ((Handler) this.f13239b).post(runnable);
                return;
            case 1:
                e2.d0.U(((m4.a0) this.f13239b).f14458l, runnable);
                return;
            default:
                ((p4.b) this.f13239b).post(runnable);
                return;
        }
    }
}

package lg;

import org.telegram.messenger.i0;
import org.telegram.tgnet.ConnectionsManager;
public final class b implements Runnable {
    public final int f11853a;
    public final Runnable f11854b;

    public b(int i10, Runnable runnable) {
        this.f11853a = i10;
        this.f11854b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f11853a) {
            case 0:
                this.f11854b.run();
                return;
            case 1:
                ConnectionsManager.lambda$cancelRequest$9(this.f11854b);
                return;
            case 2:
                Runnable runnable = this.f11854b;
                i0.r(runnable);
                i0.g3(runnable);
                return;
            case 3:
                Runnable runnable2 = this.f11854b;
                i0.r(runnable2);
                i0.g3(runnable2);
                return;
            default:
                Runnable runnable3 = this.f11854b;
                i0.r(runnable3);
                i0.g3(runnable3);
                return;
        }
    }
}

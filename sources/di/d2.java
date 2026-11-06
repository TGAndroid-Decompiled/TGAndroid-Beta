package di;

import org.telegram.tgnet.ConnectionsManager;
public final class d2 implements Runnable {
    public final int f8913a;
    public final Runnable f8914b;

    public d2(int i7, Runnable runnable) {
        this.f8913a = i7;
        this.f8914b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f8913a) {
            case 0:
                Runnable runnable = this.f8914b;
                org.telegram.messenger.g0.r(runnable);
                org.telegram.messenger.g0.h3(runnable);
                return;
            case 1:
                Runnable runnable2 = this.f8914b;
                org.telegram.messenger.g0.r(runnable2);
                org.telegram.messenger.g0.h3(runnable2);
                return;
            case 2:
                Runnable runnable3 = this.f8914b;
                org.telegram.messenger.g0.r(runnable3);
                org.telegram.messenger.g0.h3(runnable3);
                return;
            case 3:
                ConnectionsManager.lambda$cancelRequest$9(this.f8914b);
                return;
            default:
                this.f8914b.run();
                return;
        }
    }
}

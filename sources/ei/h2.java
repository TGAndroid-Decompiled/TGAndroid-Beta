package ei;

import org.telegram.tgnet.ConnectionsManager;
public final class h2 implements Runnable {
    public final int f10355a;
    public final Runnable f10356b;

    public h2(int i3, Runnable runnable) {
        this.f10355a = i3;
        this.f10356b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f10355a) {
            case 0:
                Runnable runnable = this.f10356b;
                org.telegram.messenger.g0.r(runnable);
                org.telegram.messenger.g0.h3(runnable);
                return;
            case 1:
                Runnable runnable2 = this.f10356b;
                org.telegram.messenger.g0.r(runnable2);
                org.telegram.messenger.g0.h3(runnable2);
                return;
            case 2:
                Runnable runnable3 = this.f10356b;
                org.telegram.messenger.g0.r(runnable3);
                org.telegram.messenger.g0.h3(runnable3);
                return;
            case 3:
                ConnectionsManager.lambda$cancelRequest$9(this.f10356b);
                return;
            default:
                this.f10356b.run();
                return;
        }
    }
}

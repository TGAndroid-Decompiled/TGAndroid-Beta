package ci;

import org.telegram.ui.Components.cz0;
public final class ma implements Runnable {
    public final int f5561a;
    public final Runnable f5562b;
    public final Runnable f5563c;

    public ma(Runnable runnable, Runnable runnable2, int i3) {
        this.f5561a = i3;
        this.f5562b = runnable;
        this.f5563c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f5561a) {
            case 0:
                this.f5562b.run();
                this.f5563c.run();
                return;
            default:
                cz0.b(this.f5562b);
                Runnable runnable = this.f5563c;
                if (runnable != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    return;
                }
                return;
        }
    }
}

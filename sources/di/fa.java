package di;

import org.telegram.ui.Components.oz0;
public final class fa implements Runnable {
    public final int f8832a;
    public final Runnable f8833b;
    public final Runnable f8834c;

    public fa(Runnable runnable, Runnable runnable2, int i7) {
        this.f8832a = i7;
        this.f8833b = runnable;
        this.f8834c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f8832a) {
            case 0:
                this.f8833b.run();
                this.f8834c.run();
                return;
            default:
                oz0.b(this.f8833b);
                Runnable runnable = this.f8834c;
                if (runnable != null) {
                    org.telegram.messenger.g0.g3(runnable);
                    return;
                }
                return;
        }
    }
}

package di;

import org.telegram.ui.Components.nz0;
public final class fa implements Runnable {
    public final int f8831a;
    public final Runnable f8832b;
    public final Runnable f8833c;

    public fa(Runnable runnable, Runnable runnable2, int i7) {
        this.f8831a = i7;
        this.f8832b = runnable;
        this.f8833c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f8831a) {
            case 0:
                this.f8832b.run();
                this.f8833c.run();
                return;
            default:
                nz0.b(this.f8832b);
                Runnable runnable = this.f8833c;
                if (runnable != null) {
                    org.telegram.messenger.g0.g3(runnable);
                    return;
                }
                return;
        }
    }
}

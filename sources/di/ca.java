package di;

import org.telegram.ui.Components.fz0;
public final class ca implements Runnable {
    public final int f8379a;
    public final Runnable f8380b;
    public final Runnable f8381c;

    public ca(Runnable runnable, Runnable runnable2, int i7) {
        this.f8379a = i7;
        this.f8380b = runnable;
        this.f8381c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f8379a) {
            case 0:
                this.f8380b.run();
                this.f8381c.run();
                return;
            default:
                fz0.b(this.f8380b);
                Runnable runnable = this.f8381c;
                if (runnable != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    return;
                }
                return;
        }
    }
}

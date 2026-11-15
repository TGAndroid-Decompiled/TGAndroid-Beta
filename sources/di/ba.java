package di;

import org.telegram.ui.Components.fz0;
public final class ba implements Runnable {
    public final int f8272a;
    public final Runnable f8273b;
    public final Runnable f8274c;

    public ba(Runnable runnable, Runnable runnable2, int i7) {
        this.f8272a = i7;
        this.f8273b = runnable;
        this.f8274c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f8272a) {
            case 0:
                this.f8273b.run();
                this.f8274c.run();
                return;
            default:
                fz0.b(this.f8273b);
                Runnable runnable = this.f8274c;
                if (runnable != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    return;
                }
                return;
        }
    }
}

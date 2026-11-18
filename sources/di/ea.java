package di;

import org.telegram.ui.Components.mz0;
public final class ea implements Runnable {
    public final int f8725a;
    public final Runnable f8726b;
    public final Runnable f8727c;

    public ea(Runnable runnable, Runnable runnable2, int i7) {
        this.f8725a = i7;
        this.f8726b = runnable;
        this.f8727c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f8725a) {
            case 0:
                this.f8726b.run();
                this.f8727c.run();
                return;
            default:
                mz0.b(this.f8726b);
                Runnable runnable = this.f8727c;
                if (runnable != null) {
                    org.telegram.messenger.g0.g3(runnable);
                    return;
                }
                return;
        }
    }
}

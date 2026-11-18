package di;

import org.telegram.ui.Components.mz0;
public final class ea implements Runnable {
    public final int f8722a;
    public final Runnable f8723b;
    public final Runnable f8724c;

    public ea(Runnable runnable, Runnable runnable2, int i7) {
        this.f8722a = i7;
        this.f8723b = runnable;
        this.f8724c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f8722a) {
            case 0:
                this.f8723b.run();
                this.f8724c.run();
                return;
            default:
                mz0.b(this.f8723b);
                Runnable runnable = this.f8724c;
                if (runnable != null) {
                    org.telegram.messenger.g0.g3(runnable);
                    return;
                }
                return;
        }
    }
}

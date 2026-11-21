package di;

import org.telegram.ui.Components.oz0;
public final class fa implements Runnable {
    public final int f8867a;
    public final Runnable f8868b;
    public final Runnable f8869c;

    public fa(Runnable runnable, Runnable runnable2, int i7) {
        this.f8867a = i7;
        this.f8868b = runnable;
        this.f8869c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f8867a) {
            case 0:
                this.f8868b.run();
                this.f8869c.run();
                return;
            default:
                oz0.b(this.f8868b);
                Runnable runnable = this.f8869c;
                if (runnable != null) {
                    org.telegram.messenger.g0.g3(runnable);
                    return;
                }
                return;
        }
    }
}

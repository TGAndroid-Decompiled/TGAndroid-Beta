package di;

import org.telegram.ui.Components.oz0;
public final class fa implements Runnable {
    public final int f8870a;
    public final Runnable f8871b;
    public final Runnable f8872c;

    public fa(Runnable runnable, Runnable runnable2, int i7) {
        this.f8870a = i7;
        this.f8871b = runnable;
        this.f8872c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f8870a) {
            case 0:
                this.f8871b.run();
                this.f8872c.run();
                return;
            default:
                oz0.b(this.f8871b);
                Runnable runnable = this.f8872c;
                if (runnable != null) {
                    org.telegram.messenger.g0.g3(runnable);
                    return;
                }
                return;
        }
    }
}

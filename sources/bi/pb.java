package bi;

import org.telegram.ui.Components.ez0;
public final class pb implements Runnable {
    public final int f4542a;
    public final Runnable f4543b;
    public final Runnable f4544c;

    public pb(Runnable runnable, Runnable runnable2, int i7) {
        this.f4542a = i7;
        this.f4543b = runnable;
        this.f4544c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f4542a) {
            case 0:
                this.f4543b.run();
                this.f4544c.run();
                return;
            default:
                ez0.b(this.f4543b);
                Runnable runnable = this.f4544c;
                if (runnable != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    return;
                }
                return;
        }
    }
}

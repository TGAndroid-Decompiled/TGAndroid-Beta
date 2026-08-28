package f6;

import android.os.Process;
public final class c implements Runnable {
    public final int f5595a;
    public final Runnable f5596b;

    public c(int i9, Runnable runnable) {
        this.f5595a = i9;
        this.f5596b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f5595a) {
            case 0:
                Process.setThreadPriority(0);
                this.f5596b.run();
                return;
            case 1:
                try {
                    this.f5596b.run();
                    return;
                } catch (Exception e10) {
                    a.a.b("Executor", "Background execution failure.", e10);
                    return;
                }
            default:
                this.f5596b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f5595a) {
            case 2:
                return this.f5596b.toString();
            default:
                return super.toString();
        }
    }
}

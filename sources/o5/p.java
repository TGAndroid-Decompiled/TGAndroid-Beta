package o5;

import android.os.Process;
import c8.hc;
public final class p implements Runnable {
    public final int f21817a;
    public final Runnable f21818b;

    public p(int i7, Runnable runnable) {
        this.f21817a = i7;
        this.f21818b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21817a) {
            case 0:
                try {
                    this.f21818b.run();
                    return;
                } catch (Exception e10) {
                    hc.b("Executor", "Background execution failure.", e10);
                    return;
                }
            case 1:
                this.f21818b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f21818b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f21817a) {
            case 1:
                return this.f21818b.toString();
            default:
                return super.toString();
        }
    }
}

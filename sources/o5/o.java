package o5;

import android.os.Process;
import c8.hc;
public final class o implements Runnable {
    public final int f21717a;
    public final Runnable f21718b;

    public o(int i7, Runnable runnable) {
        this.f21717a = i7;
        this.f21718b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21717a) {
            case 0:
                try {
                    this.f21718b.run();
                    return;
                } catch (Exception e10) {
                    hc.b("Executor", "Background execution failure.", e10);
                    return;
                }
            case 1:
                this.f21718b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f21718b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f21717a) {
            case 1:
                return this.f21718b.toString();
            default:
                return super.toString();
        }
    }
}

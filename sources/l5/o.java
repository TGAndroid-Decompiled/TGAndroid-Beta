package l5;

import android.os.Process;
import w7.g6;
public final class o implements Runnable {
    public final int f14132a;
    public final Runnable f14133b;

    public o(int i10, Runnable runnable) {
        this.f14132a = i10;
        this.f14133b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f14132a) {
            case 0:
                try {
                    this.f14133b.run();
                    return;
                } catch (Exception e) {
                    g6.b("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                this.f14133b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f14133b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f14132a) {
            case 1:
                return this.f14133b.toString();
            default:
                return super.toString();
        }
    }
}

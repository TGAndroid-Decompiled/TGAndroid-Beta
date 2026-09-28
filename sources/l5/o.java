package l5;

import android.os.Process;
import w7.g6;
public final class o implements Runnable {
    public final int f14131a;
    public final Runnable f14132b;

    public o(int i10, Runnable runnable) {
        this.f14131a = i10;
        this.f14132b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f14131a) {
            case 0:
                try {
                    this.f14132b.run();
                    return;
                } catch (Exception e) {
                    g6.b("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                this.f14132b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f14132b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f14131a) {
            case 1:
                return this.f14132b.toString();
            default:
                return super.toString();
        }
    }
}

package l5;

import android.os.Process;
import w7.g6;
public final class p implements Runnable {
    public final int f14119a;
    public final Runnable f14120b;

    public p(int i10, Runnable runnable) {
        this.f14119a = i10;
        this.f14120b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f14119a) {
            case 0:
                try {
                    this.f14120b.run();
                    return;
                } catch (Exception e) {
                    g6.b("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                this.f14120b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f14120b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f14119a) {
            case 1:
                return this.f14120b.toString();
            default:
                return super.toString();
        }
    }
}

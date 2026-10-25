package m5;

import a8.of;
import android.os.Process;
public final class p implements Runnable {
    public final int f18345a;
    public final Runnable f18346b;

    public p(int i10, Runnable runnable) {
        this.f18345a = i10;
        this.f18346b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18345a) {
            case 0:
                try {
                    this.f18346b.run();
                    return;
                } catch (Exception e) {
                    of.b("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                this.f18346b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f18346b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f18345a) {
            case 1:
                return this.f18346b.toString();
            default:
                return super.toString();
        }
    }
}

package l5;

import android.os.Process;
import w7.f6;
public final class p implements Runnable {
    public final int f13909a;
    public final Runnable f13910b;

    public p(int i10, Runnable runnable) {
        this.f13909a = i10;
        this.f13910b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f13909a) {
            case 0:
                try {
                    this.f13910b.run();
                    return;
                } catch (Exception e) {
                    f6.b("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                this.f13910b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f13910b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f13909a) {
            case 1:
                return this.f13910b.toString();
            default:
                return super.toString();
        }
    }
}

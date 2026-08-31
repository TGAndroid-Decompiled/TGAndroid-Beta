package d9;

import android.os.Process;
import j7.j0;
public final class j implements Runnable {
    public final int f4370a;
    public final Runnable f4371b;

    public j(int i10, Runnable runnable) {
        this.f4370a = i10;
        this.f4371b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f4370a) {
            case 0:
                this.f4371b.run();
                return;
            case 1:
                Process.setThreadPriority(0);
                this.f4371b.run();
                return;
            default:
                try {
                    this.f4371b.run();
                    return;
                } catch (Exception e6) {
                    j0.b("Executor", "Background execution failure.", e6);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f4370a) {
            case 0:
                return this.f4371b.toString();
            default:
                return super.toString();
        }
    }
}

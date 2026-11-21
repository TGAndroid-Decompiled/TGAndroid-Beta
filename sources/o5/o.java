package o5;

import android.os.Process;
import c8.gc;
public final class o implements Runnable {
    public final int f21748a;
    public final Runnable f21749b;

    public o(int i7, Runnable runnable) {
        this.f21748a = i7;
        this.f21749b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21748a) {
            case 0:
                try {
                    this.f21749b.run();
                    return;
                } catch (Exception e10) {
                    gc.b("Executor", "Background execution failure.", e10);
                    return;
                }
            case 1:
                this.f21749b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f21749b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f21748a) {
            case 1:
                return this.f21749b.toString();
            default:
                return super.toString();
        }
    }
}

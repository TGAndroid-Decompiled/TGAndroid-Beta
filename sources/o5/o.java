package o5;

import android.os.Process;
import c8.gc;
public final class o implements Runnable {
    public final int f21751a;
    public final Runnable f21752b;

    public o(int i7, Runnable runnable) {
        this.f21751a = i7;
        this.f21752b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21751a) {
            case 0:
                try {
                    this.f21752b.run();
                    return;
                } catch (Exception e10) {
                    gc.b("Executor", "Background execution failure.", e10);
                    return;
                }
            case 1:
                this.f21752b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f21752b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f21751a) {
            case 1:
                return this.f21752b.toString();
            default:
                return super.toString();
        }
    }
}

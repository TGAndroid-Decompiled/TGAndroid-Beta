package o5;

import android.os.Process;
import c8.gc;
public final class o implements Runnable {
    public final int f21723a;
    public final Runnable f21724b;

    public o(int i7, Runnable runnable) {
        this.f21723a = i7;
        this.f21724b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21723a) {
            case 0:
                try {
                    this.f21724b.run();
                    return;
                } catch (Exception e10) {
                    gc.b("Executor", "Background execution failure.", e10);
                    return;
                }
            case 1:
                this.f21724b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f21724b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f21723a) {
            case 1:
                return this.f21724b.toString();
            default:
                return super.toString();
        }
    }
}

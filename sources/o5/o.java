package o5;

import android.os.Process;
import c8.gc;
public final class o implements Runnable {
    public final int f21726a;
    public final Runnable f21727b;

    public o(int i7, Runnable runnable) {
        this.f21726a = i7;
        this.f21727b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21726a) {
            case 0:
                try {
                    this.f21727b.run();
                    return;
                } catch (Exception e10) {
                    gc.b("Executor", "Background execution failure.", e10);
                    return;
                }
            case 1:
                this.f21727b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f21727b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f21726a) {
            case 1:
                return this.f21727b.toString();
            default:
                return super.toString();
        }
    }
}

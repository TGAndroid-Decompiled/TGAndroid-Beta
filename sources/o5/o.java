package o5;

import android.os.Process;
import c8.cc;
public final class o implements Runnable {
    public final int f20835a;
    public final Runnable f20836b;

    public o(int i7, Runnable runnable) {
        this.f20835a = i7;
        this.f20836b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20835a) {
            case 0:
                try {
                    this.f20836b.run();
                    return;
                } catch (Exception e10) {
                    cc.b("Executor", "Background execution failure.", e10);
                    return;
                }
            case 1:
                this.f20836b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f20836b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f20835a) {
            case 1:
                return this.f20836b.toString();
            default:
                return super.toString();
        }
    }
}

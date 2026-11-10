package o5;

import android.os.Process;
import c8.cc;
public final class o implements Runnable {
    public final int f20843a;
    public final Runnable f20844b;

    public o(int i7, Runnable runnable) {
        this.f20843a = i7;
        this.f20844b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20843a) {
            case 0:
                try {
                    this.f20844b.run();
                    return;
                } catch (Exception e10) {
                    cc.b("Executor", "Background execution failure.", e10);
                    return;
                }
            case 1:
                this.f20844b.run();
                return;
            default:
                Process.setThreadPriority(0);
                this.f20844b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f20843a) {
            case 1:
                return this.f20844b.toString();
            default:
                return super.toString();
        }
    }
}
